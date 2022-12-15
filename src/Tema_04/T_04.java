package Tema_04;

import Tema_03.*;
import static Principal_Main.Main.esperar;
import static Principal_Main.Main.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class T_04 {
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            meterEspacios(25);
            System.out.println("""                          
                               
        ****************************************************************************************************
        *   PROGRAMACI�N DE SERVICIOS Y PROCESOS.                                                          *
        ****************************************************************************************************
        *   TEMA 4:         INTRODUCCI�N A LA PROGRAMACI�N PARALELA O MULTIHILO.                           *
        ****************************************************************************************************
        *                                                                                                  *
        *  1. HILOS DE EJECUCI�N EN UN PROCESO I.                                                          *
        *  2. HILOS DE EJECUCI�N EN UN PROCESO II.                                                         *
        *  3. VENTAJAS Y DESVENTAJAS DEL USO DE HILOS.                                                     *
        *  4. RECURSOS COMPARTIDOS POR LOS HILOS. ELEMENTOS PROPIOS DE UN HILO Y RECURSOS COMPARTIDOS.     *
        *  5. RECURSOS COMPARTIDOS POR LOS HILOS. RIESGOS POR LA COMPARTICI�N DE RECURSOS EN LOS HILOS.    *
        *  6. ESTADOS DE UN HILO.                                                                          *                               
        *  7. CLASES PARA HILOS EN JAVA. PAQUETE java.lang.                                                *
        *                                                                                                  *
        ****************************************************************************************************
        *  0. SALIR.                                                                                       *
        ****************************************************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opci�n: ");
                menu = teclaStr.nextLine();
                meterEspacios(25);
                switch (menu) {
                    
                    case "1", "2", "3", "4", "5", "6", "7" -> Recursos_04.recurso(menu);
                   
                   
                    case "0" -> {}
                    default -> {
                            meterEspacios(25);
                            System.out.println("\n  ��� LA OPCI�N NO ES CORRECTA !!!");
                            meterEspacios(15);
                            esperar(1500);
                            }
                }
            }  catch (Exception e) {
                System.out.println("Error: " + e.toString());
                System.out.println("MENSAJE " + e.getMessage());
                System.out.println("La Excepci�n es: " + e.getClass());
            }
        } while (!"0".equals(menu));
    }
    
}
