package Tema_11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase representa un cliente de nuestra aplicaci�n
 * @author Francisco Jes�s Delgado Almir�n
 */
public class Cliente {

    public static void main(String[] args) {
        try {
            String direccionIP = "localhost";
            int puerto = 5056;
            
            // Optengo la IP real
            InetAddress ip = InetAddress.getByName(direccionIP);
            
            System.out.println("CLIENTE: Conectando con " + direccionIP + ":" + puerto + "...");
            
            // Establezco la conexi�n con la IP y el puerto
            Socket socket = new Socket(ip, puerto);
            
            System.out.println("CLIENTE: Conexi�n establecida.");
            
            // Obtengo los flujos de entrada y salida
            DataInputStream entrada = new DataInputStream(socket.getInputStream());
            DataOutputStream salida = new DataOutputStream(socket.getOutputStream());
            
            // Este es el bucle que va a permitir la comunicaci�n entre el
            // cliente y el cliente hebra
            boolean salir = false;
            Scanner teclado_String = new Scanner(System.in);
            while (!salir) {
                // Imprimo el mensaje del cliente
                System.out.println(entrada.readUTF());
                // Leo la respuesta y la env�o (Si quiero n�mero aleatorio o salir)
                String textoenviar = teclado_String.nextLine(); 
                salida.writeUTF(textoenviar);
                
                // Seg�n lo que le haya enviado al servidor...
                switch(textoenviar) {                    
                    case "1": // Opci�n mostrar n�mero aleatorio
                        // Imprimo el mensaje del n�mero aleatorio del cliente 
                        String mensajerecibido = entrada.readUTF(); 
                        System.out.println(mensajerecibido); 
                        break;
                    case "2": // Opci�n salir
                        System.out.println("CLIENTE: Cerrando la conexi�n...");
                        socket.close();
                        System.out.println("CLIENTE: Conexi�n cerrada.");
                        salir = true; 
                        break;
                    default:
                        System.out.println("CLIENTE: Opci�n incorrecta.");
                        break;
                }
            }
            
            // Cierro los flujos
            try { 
                entrada.close(); 
                salida.close();              
            } catch(IOException e) { 
                System.out.println("ERROR CLIENTE 2 -> " + e.toString()); 
            }
            
        } catch (UnknownHostException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}