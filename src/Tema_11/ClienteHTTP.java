package Tema_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *                                    EJEMPLO DE CLIENTE HTTP SENCILLO:
 *                        LA SALIDA QUE SE OBTIENE ES EL 'CÓDIGO FUENTE' DE LA PÁGINA.
 */
public class ClienteHTTP {

    public static void main(String[] args) {

        try {                        
            URL url = new URL("http://www.google.es");                          // SE ABRE LA CONEXIÓN.
            URLConnection conexion = url.openConnection();
            conexion.connect();

            InputStream is = conexion.getInputStream();                         // LECTURA
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            char[] buffer = new char[1000];                         // ARRAY DE 1000 CARACTERES PARA GUARDAR EL CÓDIGO FUENTE DE LA PÁGINA WEB.
            int leido;

            while ((leido = br.read(buffer))>0) {                   // MOSTRAMOS POR PANTALLA
                System.out.println(new String(buffer, 0, leido));
            }            
        } catch (MalformedURLException e) {    
            e.printStackTrace();        
        } catch (IOException e) {    
            e.printStackTrace();
        }        
    }    
}