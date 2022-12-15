package Tema_02;

import static Principal_Main.Main.esperar;
import static Principal_Main.Main.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class T_02 {
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            meterEspacios(25);
            System.out.println("""                          
                               
        *******************************************************************************************
        *   PROGRAMACIÓN DE SERVICIOS Y PROCESOS.                                                 *
        *******************************************************************************************
        *   TEMA 2:                        PROCESOS.                                              *
        *******************************************************************************************
        *                                                                                         *
        *  1. INTRODUCCIÓN A LOS PROCESOS.                                                        *
        *  2. TIPOS DE PROCESO SEGÚN EL MODO Y ORIGEN DE EJECUCIÓN.                               *
        *  3. ESTADOS DE UN PROCESO.                                                              *
        *  4. GESTIÓN DE PROCESOS. EL SISTEMA OPERATIVO, RESPONSABLE PRINCIPAL.                   *
        *  5. GESTIÓN DE PROCESOS. GESTIÓN DE LA EJECUCIÓN CONCURRENTE MEDIANTE 'COLAS'.          *                               
        *  6. PLANIFICACIÓN DE PROCESOS I:  TIPOS.                                                *
        *  7. PLANIFICACIÓN DE PROCESOS II: ALGORITMOS DE PLANIFICACIÓN.                          *
        *  8. CAMBIOS DE CONTEXTO.                                                                *
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
                    
                    case "1", "2", "3", "4", "5", "6", "7", "8" -> Recursos_02.recurso(menu);
                   
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
