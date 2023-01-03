package Tema_10;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 *
 * @author Juan José Estévez González
 */

public class Cliente_TCP {

    private static final String HOST = "localhost";
    private static final int PUERTO = 6000;

    public Cliente_TCP() {
        try {
                                                                        // Creo el socket cliente que escucha en la
                                                                        // máquina localhost y en el puerto 6000
            Socket skCliente = new Socket(HOST, PUERTO);
                                                                        // Obtengo el flujo de entrada del cliente creado
                                                                        // (Mensajes que recibe el cliente del servidor)
            InputStream aux = skCliente.getInputStream();
            DataInputStream flujo = new DataInputStream(aux);
                                                                        // Saco por pantalla el mensaje recibido del servidor
            System.out.print("Mensaje recibido del servidor: ");
            System.out.println(flujo.readUTF());
                                                                        // Cierro el socket
            skCliente.close();
        } catch (IOException ex) {
            System.out.println("Error en el cliente: " + ex.toString());
        }
    }

                                                                        // Método main del cliente
    public static void main(String[] args) {
                                                                        // Creo un cliente
        new Cliente_TCP();
    }
}