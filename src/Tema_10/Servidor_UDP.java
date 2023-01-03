package Tema_10;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Servidor_UDP {

    private static final int PUERTO = 6789;

    public Servidor_UDP() {
        try {
            DatagramSocket socketUDP = new DatagramSocket(PUERTO);
            byte[] bufer = new byte[1000];
            System.out.println("Escucho el puerto " + PUERTO);
                                                                            // Creo un bucle infinito para atender a todos los clientes que se conecten sin l�mite
            while (true) {
                                                                            // Construimos el DatagramPacket para recibir peticiones
                DatagramPacket peticion = new DatagramPacket(bufer,
                        bufer.length);
                                                                            // Leemos una petici�n del DatagramSocket
                socketUDP.receive(peticion);
                                                                            // Otengo el mensaje del cliente
                String mensajerecibido = new String(peticion.getData());
                System.out.print("Datagrama recibido del host: "
                        + peticion.getAddress());
                System.out.print(" desde el puerto remoto: "
                        + peticion.getPort());
                System.out.println(" con el mensaje: "
                        + mensajerecibido);
                                                                            // Construimos el DatagramPacket para enviar la respuesta
                String mensajerespuesta = "Hola cliente "
                        + mensajerecibido;
                DatagramPacket respuesta
                        = new DatagramPacket(mensajerespuesta.getBytes(),
                                mensajerespuesta.length(),
                                peticion.getAddress(), peticion.getPort());
                                                                            // Enviamos la respuesta, que es un eco
                socketUDP.send(respuesta);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
                                                                            // M�todo main del servidor
    public static void main(String[] args) {
                                                                            // Creo un servidor
        new Servidor_UDP();
    }
}