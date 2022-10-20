package T_03;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Francis
 * @author Juan José Estévez González
 */
public class Lanzador_Comandos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            String comando;
            Scanner teclado = new Scanner(System.in);
            System.out.println("cmd, echo, help, dir, date, driverquery, tree, ipconfig, wmic, ...");
            System.out.print("Introduce un Comando: ");
            comando = teclado.nextLine();
            
            
            // Creamos el proceso hijo
            ProcessBuilder builder_echo = new ProcessBuilder("cmd");
            Process proceso_echo = builder_echo.start();
            
            // Indicamos cuál es la salida del proceso hijo que ejecuta el bash
            final Scanner in = new Scanner(proceso_echo.getInputStream());
            new Thread() {
                @Override
                public void run() {
                    while (in.hasNextLine()) {
                        System.out.println(in.nextLine());
                    }
                }
            }.start();
            
            // Obtenemos la salida del proceso hijo
            PrintWriter salida = new PrintWriter(proceso_echo.getOutputStream());
            
            /*
            // Hacemos 10 llamadas al proceso hijo con el comando echo
            for (int i = 0; i < 10; i++) {
                salida.println("echo Iteracion " + i);
                salida.flush();
            }
            */
            
            // Hacemos 1 llamada al proceso hijo con el comando que pasemos por teclado
            salida.println(comando);
            salida.flush();            
            
            // Cerramos los flujos
            salida.close();
        } catch (IOException ex) {
            System.err.println("Excepción de E/S!!: " + ex.toString());
        }
    }
}