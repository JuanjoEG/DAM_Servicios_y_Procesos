package Tema_01;

import Tema_09.*;
import static Principal_Main.Main.esperar;
import static Principal_Main.Main.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class T_01 {
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            meterEspacios(25);
            System.out.println("""                          
                               
        *******************************************************************************************
        *   PROGRAMACI�N DE SERVICIOS Y PROCESOS.                                                 *
        *******************************************************************************************
        *   TEMA 1:                  TIPOS DE PROGRAMACI�N.                                       *
        *******************************************************************************************
        *                                                                                         *
        *  1. CONCEPTOS B�SICOS I. PROGRAMA, PROCESO, SERVICIO.                                   *
        *  2. CONCEPTOS B�SICOS II. HILOS Y EJECUTABLE.                                           *
        *  3. PROGRAMACI�N CONCURRENTE.                                                           *
        *  4. PROGRAMACI�N PARALELA.                                                              *
        *  5. PROGRAMACI�N DISTRIBUIDA.                                                           *
        *                                                                                         *
        *******************************************************************************************
        *  0. SALIR.                                                                              *
        *******************************************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opci�n: ");
                menu = teclaStr.nextLine();
                meterEspacios(25);
                switch (menu) {
                    
                    case "1", "2", "3", "4", "5" -> Recursos_01.recurso(menu);
                   
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
