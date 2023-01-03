package Tema_10;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Juan José Estévez González
 */

public class Servidor_TCP {
    
    private static final int PUERTO = 6000;
    private static final int MAX_CLIENTES = 3;

    public Servidor_TCP() {
        try {
                                                                        // Creo el socket servidor que escucha
                                                                        // en el puerto 6000
            ServerSocket skServidor = new ServerSocket(PUERTO);
            System.out.println("Escucho el puerto " + PUERTO);
                                                                        // Escucho a un cierto número de clientes
            for (int numCli = 0; numCli < MAX_CLIENTES; numCli++) {
                                                                        // Escucho a un cliente
                Socket skCliente = skServidor.accept();
                                                                        // Cuando escucha un cliente da un aviso
                System.out.println("Sirvo al cliente " + numCli);
                                                                        // Obtiene el flujo de salida del cliente
                                                                        // (Mensajes que envía al cliente)
                OutputStream aux = skCliente.getOutputStream();
                DataOutputStream flujo = new DataOutputStream(aux);
                                                                        // Manda un mensaje al cliente
                flujo.writeUTF("Hola cliente " + numCli);
                                                                        // Cierro el socket servidor
                skCliente.close();
            }
            System.out.println("Demasiados clientes por hoy.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

                                                                        // Método main del servidor
    public static void main(String[] args) {
                                                                        // Creo un servidor
        new Servidor_TCP();
    }
}