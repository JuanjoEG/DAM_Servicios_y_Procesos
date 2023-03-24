package Tema_15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

/**
 * Esta clase representa un servidor seguro
 * @author Juan José Estévez González
 */
public class SSLservidor {

    private final String SERVERPASS = "servpass";
    private final SSLServerSocket serverSocket;
    private final int puerto;

    public SSLservidor(int puerto) throws FileNotFoundException,
            KeyStoreException, IOException, NoSuchAlgorithmException,
            CertificateException, UnrecoverableKeyException,
            KeyManagementException 
    {
        this.puerto = puerto;

        // Indico los certificados seguros del servidor
        KeyStore keyStore = KeyStore.getInstance("JKS");
        
        // FICHERO serverKey.jks GENERADO CON LOS COMANDOS DEL TEMA
        // keyStore.load(new FileInputStream("C:\\Program Files\\Java\\jdk-19\\bin\\serverKey.jks"), SERVERPASS.toCharArray());
        keyStore.load(new FileInputStream(
                "src" + File.separator
                + "certificados" + File.separator
                + "servidor" + File.separator
                + "serverKey.jks"), SERVERPASS.toCharArray());
        
        KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        kmf.init(keyStore, SERVERPASS.toCharArray());
        
        KeyStore trustedStore = KeyStore.getInstance("JKS");
        
        // FICHERO serverTrustedCerts.jks GENERADO CON LOS COMANDOS DEL TEMA
        // trustedStore.load(new FileInputStream("C:\\Program Files\\Java\\jdk-19\\bin\\serverTrustedCerts.jks"), SERVERPASS.toCharArray());
        trustedStore.load(new FileInputStream(
                "src" + File.separator
                + "certificados" + File.separator
                + "servidor" + File.separator
                + "serverTrustedCerts.jks"), SERVERPASS
                .toCharArray());
        TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        
        tmf.init(trustedStore);
        SSLContext sc = SSLContext.getInstance("TLS");
        TrustManager[] trustManagers = tmf.getTrustManagers();
        KeyManager[] keyManagers = kmf.getKeyManagers();
        sc.init(keyManagers, trustManagers, null);

        // Creo el socket seguro del servidor
        SSLServerSocketFactory ssf = sc.getServerSocketFactory();
        serverSocket = (SSLServerSocket) ssf.createServerSocket(puerto);
    }

    public void start() {
        System.out.println("Servidor escuchando en el puerto " + puerto);
        
        new Thread() {
            @Override
            public void run() {
                try {
                    Socket aClient = serverSocket.accept();
                    System.out.println("Cliente aceptado");
                    aClient.setSoLinger(true, 1000);
                    BufferedReader input = new BufferedReader(new InputStreamReader(aClient.getInputStream()));
                    String recibido = input.readLine();
                    System.out.println("Recibido " + recibido);
                    PrintWriter output = new PrintWriter(aClient.getOutputStream());
                    output.println("Hola, " + recibido);
                    output.flush();
                    aClient.close();
                } 
                catch (IOException e) {
                    System.out.println("Error servidor -> " + e.toString());
                }
            }
        }.start();
    }
}