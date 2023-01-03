package Tema_10;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Random;

/**
 *
 * @author Juan José Estévez González
 */

public class Cliente_UDP {

    private static final int PUERTO = 6789;
    private static final String HOST = "localhost";
    private Random aleatorio;

    public Cliente_UDP() {
        try {
                                                                            // Creo el mensaje a enviar al servidor con un número aleatorio
            aleatorio = new Random();
            int numerocliente = aleatorio.nextInt(100) + 1;
            String mensajeenviar = String.valueOf(numerocliente);
                                                                            // Creo el socket UDP
            DatagramSocket socketUDP = new DatagramSocket();
            byte[] mensaje = mensajeenviar.getBytes();
                                                                            // Obtengo la dirección del host
            InetAddress hostServidor = InetAddress.getByName(HOST);
                                                                            // Construimos un datagrama para enviar el mensaje al servidor
            DatagramPacket peticion
                    = new DatagramPacket(mensaje, mensajeenviar.length(),
                            hostServidor,
                            PUERTO);
                                                                            // Enviamos el datagrama
            socketUDP.send(peticion);
                                                                            // Construimos el DatagramPacket que contendrá la respuesta
            byte[] bufer = new byte[1000];
            DatagramPacket respuesta = new DatagramPacket(bufer,
                    bufer.length);
            socketUDP.receive(respuesta);
                                                                            // Enviamos la respuesta del servidor a la salida estandar
            System.out.println("Respuesta: " + new String(respuesta.getData()));
                                                                            // Cerramos el socket
            socketUDP.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
                                                                            // Método main del cliente
    public static void main(String[] args) {
                                                                            // Creo un cliente
        new Cliente_UDP();
    }
}