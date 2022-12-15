package Tema_05;

import Tema_04.*;
import Tema_03.*;
import static Principal_Main.Main.esperar;
import static Principal_Main.Main.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class T_05 {
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            meterEspacios(25);
            System.out.println("""                          
                               
        ****************************************************************************************************
        *   PROGRAMACIÓN DE SERVICIOS Y PROCESOS.                                                          *
        ****************************************************************************************************
        *   TEMA 5:                         GESTIÓN DE HILOS.                                              *
        ****************************************************************************************************
        *                                                                                                  *
        *  1. CREACIÓN DE HILOS. USANDO THREAD.                                                            *
        *  2. CREACIÓN DE HILOS. USANDO RUNNABLE.                                                          *
        *  3. INICIALIZACIÓN Y EJECUCIÓN DE HILOS.                                                         *
        *  4. SUSPENSIÓN Y FINALIZACIÓN DE HILOS.                                                          *
        *  5. PLANIFICACIÓN DE HILOS. join(): ESPERAR A LA FINALIZACIÓN DE UN HILO.                        *
        *  6. PRIORIDAD EN LOS HILOS.                                                                      * 
        *                                                                                                  *
        * 10. EJEMPLO CAJAS DE TIENDA Y CLIENTES. SIN HILOS.                                               *
        * 11. EJEMPLO CAJAS DE TIENDA Y CLIENTES. CON THREAD.                                              *
        * 12. EJEMPLO CAJAS DE TIENDA Y CLIENTES. CON RUNNABLE.                                            *
        *                                                                                                  *
        * 13. EJEMPLO REUNIÓN DE ALUMNOS. SIN ORDEN.                                                       *
        * 14. EJEMPLO REUNIÓN DE ALUMNOS. CON JOIN.                                                        *
        * 15. EJEMPLO REUNIÓN DE ALUMNOS. CON PRIORIDAD.                                                   *
        *                                                                                                  *
        ****************************************************************************************************
        *  0. SALIR.                                                                                       *
        ****************************************************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                meterEspacios(25);
                switch (menu) {
                    
                    case "1", "2", "3", "4", "5", "6" -> Recursos_05.recurso(menu);
                    
                    case "10" -> IntroThreads.atencionColaSinThreads.main(args);
                    case "11" -> IntroThreads.atencionColaConThread.main(args);
                    case "12" -> IntroThreads.atencionColaConRunnable.main(args);
                    
                    case "13" -> ordenThreads.reunionAlumnos.main(args);
                    case "14" -> ordenThreads.reunionAlumnosJoin.main(args);
                    case "15" -> ordenThreads.reunionAlumnosPrioridad.main(args);
                   
                    case "0" -> {}
                    default -> {
                            meterEspacios(25);
                            System.out.println("\n  ¡¡¡ LA OPCIÓN NO ES CORRECTA !!!");
                            meterEspacios(15);
                            esperar(1500);
                            }
                }
            }  catch (Exception e) {
                System.out.println("Error: " + e.toString());
                System.out.println("MENSAJE " + e.getMessage());
                System.out.println("La Excepción es: " + e.getClass());
            }
        } while (!"0".equals(menu));
    }
    
}
