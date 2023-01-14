package Tema_11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase representa un servidor de nuestra aplicaci�n
 * @author Francisco Jes�s Delgado Almir�n
 */
public class Servidor {
    
    public static void main(String[] args) {
        try {
            ServerSocket socketservidor = new ServerSocket(5056);
            
            System.out.println("SERVIDOR: Escuchando en localhost:5056...");
          
            // Funcionalidad del servidor
            while (true) { 
                Socket socketcliente = null; 

                try { 
                    // Espero a que se conecte un nuevo cliente 
                    socketcliente = socketservidor.accept(); 

                    System.out.println("SERVIDOR: Cliente nuevo conectado: " + socketcliente); 

                    // Obtengo los flujos de entrada y salida del socket cliente
                    DataInputStream entrada = new DataInputStream(socketcliente.getInputStream()); 
                    DataOutputStream salida = new DataOutputStream(socketcliente.getOutputStream()); 

                    System.out.println("SERVIDOR: Creando una hebra nueva para el cliente nuevo..."); 

                    // Creo una hebra para el cliente que se ha conectado
                    Thread clientehebra = new ServidorHebra(socketcliente, entrada, salida); 
                    // Lanzo la hebra del cliente
                    clientehebra.start();

                    System.out.println("SERVIDOR: Hebra del cliente nuevo creada (yo ya me despreocupo).");
                } catch (IOException e) { 
                    socketcliente.close(); 
                    System.out.println("ERROR SERVIDOR -> " + e.toString());
                } 
            } 
        } 
        catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}