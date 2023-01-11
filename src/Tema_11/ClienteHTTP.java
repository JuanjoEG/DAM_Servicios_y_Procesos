package Tema_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *   EJEMPLO DE CLIENTE HTTP SENCILLO:
 *   LA SALIDA QUE SE OBTIENE ES EL 'C�DIGO FUENTE' DE LA P�GINA.
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class ClienteHTTP {
    
    public static void main(String[] args) {
        
        try {
        
            // SE ABRE LA CONEXI�N
            URL url = new URL("http://www.google.es");
            URLConnection conexion = url.openConnection();
            conexion.connect();
            
            // LECTURA
            InputStream is = conexion.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            
            // ARRAY DE 1000 CARACTERES PARA GUARDAR EL C�DIGO FUENTE DE LA P�GINA WEB.
            char[] buffer = new char[1000];
            int leido;
            
            // MOSTRAMOS POR PANTALLA
            while ((leido = br.read(buffer))>0) {            
                System.out.println(new String(buffer, 0, leido));
            }            
        } catch (MalformedURLException e) {    
            e.printStackTrace();        
        } catch (IOException e) {    
            e.printStackTrace();
        }        
    }    
}