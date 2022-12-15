package Tema_01;

import Tema_09.*;
import static Principal_Main.Main.esperar;
import static Principal_Main.Main.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class T_01 {
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            meterEspacios(25);
            System.out.println("""                          
                               
        *******************************************************************************************
        *   PROGRAMACIÓN DE SERVICIOS Y PROCESOS.                                                 *
        *******************************************************************************************
        *   TEMA 1:                  TIPOS DE PROGRAMACIÓN.                                       *
        *******************************************************************************************
        *                                                                                         *
        *  1. CONCEPTOS BÁSICOS I. PROGRAMA, PROCESO, SERVICIO.                                   *
        *  2. CONCEPTOS BÁSICOS II. HILOS Y EJECUTABLE.                                           *
        *  3. PROGRAMACIÓN CONCURRENTE.                                                           *
        *  4. PROGRAMACIÓN PARALELA.                                                              *
        *  5. PROGRAMACIÓN DISTRIBUIDA.                                                           *
        *                                                                                         *
        *******************************************************************************************
        *  0. SALIR.                                                                              *
        *******************************************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                meterEspacios(25);
                switch (menu) {
                    
                    case "1", "2", "3", "4", "5" -> Recursos_01.recurso(menu);
                   
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
