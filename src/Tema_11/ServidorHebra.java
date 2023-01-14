package Tema_11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Random;

/**
 * Esta clase representa una hebra que se ejecutar� en el servidor y que dar�
 * servicio a un cliente independiente
 *
 * @author Francisco Jes�s Delgado Almir�n
 */
public class ServidorHebra extends Thread {

    private DataInputStream entrada;
    private DataOutputStream salida;
    private Socket socketcliente;

    public ServidorHebra(Socket socketcliente, DataInputStream entrada, DataOutputStream salida) {
        this.socketcliente = socketcliente;
        this.entrada = entrada;
        this.salida = salida;
    }

    @Override
    public void run() {
        boolean salir = true;
        String mensajerecibido;
        Random generador = new Random();

        while (salir) {
            try {
                // Pregunto al cliente qu� quiero hacer
                salida.writeUTF("SERVIDOR: �Qu� quieres hacer?\n\t1.- Generar n�mero aleatorio.\n\t2.- Salir.\n\t(Esperando petici�n del cliente...)");

                // Recibo la respuesta del cliente 
                mensajerecibido = entrada.readUTF();

                // Seg�n el mensaje recibido...
                switch (mensajerecibido) {
                    case "1":
                        int aleatorio = generador.nextInt(500);
                        salida.writeUTF("SERVIDOR: El n�mero aleatorio generado es " + aleatorio);
                        break;
                    case "2":
                        System.out.println("SERVIDOR: El cliente " + this.socketcliente + " env�a salir...");
                        System.out.println("SERVIDOR: Cerrando la conexi�n...");
                        this.socketcliente.close();
                        System.out.println("SERVIDOR: Conexi�n cerrada.");
                        salir = false;
                        break;
                }
            } catch (IOException e) {
                System.out.println("ERROR SERVIDOR 2 -> " + e.toString());
            }
        }

        // Cierro los flujos
        try {
            this.entrada.close();
            this.salida.close();
        } catch (IOException e) {
            System.out.println("ERROR SERVIDOR 3 -> " + e.toString());
        }
    }
}