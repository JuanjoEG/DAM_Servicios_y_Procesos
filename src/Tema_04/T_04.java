package Tema_04;

import Tema_03.*;
import static Principal_Main.Main.esperar;
import static Principal_Main.Main.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class T_04 {
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            meterEspacios(25);
            System.out.println("""                          
                               
        ****************************************************************************************************
        *   PROGRAMACIÓN DE SERVICIOS Y PROCESOS.                                                          *
        ****************************************************************************************************
        *   TEMA 4:         INTRODUCCIÓN A LA PROGRAMACIÓN PARALELA O MULTIHILO.                           *
        ****************************************************************************************************
        *                                                                                                  *
        *  1. HILOS DE EJECUCIÓN EN UN PROCESO I.                                                          *
        *  2. HILOS DE EJECUCIÓN EN UN PROCESO II.                                                         *
        *  3. VENTAJAS Y DESVENTAJAS DEL USO DE HILOS.                                                     *
        *  4. RECURSOS COMPARTIDOS POR LOS HILOS. ELEMENTOS PROPIOS DE UN HILO Y RECURSOS COMPARTIDOS.     *
        *  5. RECURSOS COMPARTIDOS POR LOS HILOS. RIESGOS POR LA COMPARTICIÓN DE RECURSOS EN LOS HILOS.    *
        *  6. ESTADOS DE UN HILO.                                                                          *                               
        *  7. CLASES PARA HILOS EN JAVA. PAQUETE java.lang.                                                *
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
                    
                    case "1", "2", "3", "4", "5", "6", "7" -> Recursos_04.recurso(menu);
                   
                   
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
