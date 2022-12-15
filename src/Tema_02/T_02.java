package Tema_02;

import static Principal_Main.Main.esperar;
import static Principal_Main.Main.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class T_02 {
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            meterEspacios(25);
            System.out.println("""                          
                               
        *******************************************************************************************
        *   PROGRAMACI�N DE SERVICIOS Y PROCESOS.                                                 *
        *******************************************************************************************
        *   TEMA 2:                        PROCESOS.                                              *
        *******************************************************************************************
        *                                                                                         *
        *  1. INTRODUCCI�N A LOS PROCESOS.                                                        *
        *  2. TIPOS DE PROCESO SEG�N EL MODO Y ORIGEN DE EJECUCI�N.                               *
        *  3. ESTADOS DE UN PROCESO.                                                              *
        *  4. GESTI�N DE PROCESOS. EL SISTEMA OPERATIVO, RESPONSABLE PRINCIPAL.                   *
        *  5. GESTI�N DE PROCESOS. GESTI�N DE LA EJECUCI�N CONCURRENTE MEDIANTE 'COLAS'.          *                               
        *  6. PLANIFICACI�N DE PROCESOS I:  TIPOS.                                                *
        *  7. PLANIFICACI�N DE PROCESOS II: ALGORITMOS DE PLANIFICACI�N.                          *
        *  8. CAMBIOS DE CONTEXTO.                                                                *
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
                    
                    case "1", "2", "3", "4", "5", "6", "7", "8" -> Recursos_02.recurso(menu);
                   
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
