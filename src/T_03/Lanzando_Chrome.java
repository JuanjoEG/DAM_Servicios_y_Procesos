package T_03;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class Lanzando_Chrome {
    
    public static void main(String[] args) {
        
        // RUTA DEL EJECUTABLE DE GOOGLE CHROME
        //String ruta_Proceso = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
        String ruta_Proceso = "calc.exe";
        // CREAMOS EL PROCESO DE GOOGLE CHROME
        ProcessBuilder pb = new ProcessBuilder(ruta_Proceso);
        Scanner teclado = new Scanner(System.in);
        try {
        
            // LANZAMOS EL PROCESO
            Process process = pb.start();
            
            //System.out.println("¿Terminar el proceso? (S/N) ");
            //String opcion = teclado.nextLine();
            
            // NO HACE LO QUE SE ESPERA
            
            // ENTRETENEMOS AL SISTEMA - SI PONEMOS VALORES PEQUEÑOS SE PODRÁ CERRAR EL PROCESO
            for (int i=1 ; i<10000 ; i++) {        
                System.out.println("Hola. ");            
            }
            
            // EL PROCESO SOLO SE DESTRUYE SI SE ACTUA CON RAPIDEZ           
            process.destroy();            // DESTRUIMOS EL PROCESO
            
            
            /*
            if (teclado.nextLine().charAt(0) == 'S') {               
                process.destroy();                        // DESTRUIMOS EL PROCESO
            }
            */
            
            // OBTENEMOS SU ESTADO DE EJECUCIÓN
            int retorno = process.waitFor();
        } catch (IOException ex) {        
            System.out.println("Error: " + ex.toString());
            System.exit(-1);
        } catch (InterruptedException ex) {
            System.out.println("El proceso hijo finalizó de forma incorrecta. " + ex.toString());
            System.exit(-1);
        }    
    }    
}