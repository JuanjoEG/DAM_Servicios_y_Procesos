package Tema_03;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class Lanzador_BlocDeNotas {
    
    public static void main(String[] args) {        
               
        String ruta_Proceso = "notepad.exe";
        
        ProcessBuilder pb = new ProcessBuilder(ruta_Proceso);
        Scanner teclado = new Scanner(System.in);
        try {
        
            // LANZAMOS EL PROCESO
            Process process = pb.start();
            
            System.out.println("¿Terminar el proceso Bloc de Notas? (S/N) ");
            
            if (teclado.nextLine().charAt(0) == 'S') {               
                process.destroy();                        // DESTRUIMOS EL PROCESO
            }            
            
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