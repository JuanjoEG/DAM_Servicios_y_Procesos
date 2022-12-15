package Principal_Main;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Main {
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            meterEspacios(25);
            System.out.println("""                          
                               
        **************************************************************
        *           PROGRAMACI�N DE SERVICIOS Y PROCESOS             *
        **************************************************************
        *                                                            *
        *  1. TIPOS DE PROGRAMACI�N.                                 *
        *  2. PROCESOS.                                              *
        *  3. GESTI�N DE PROCESOS.                                   *
        *  4. INTRODUCCI�N A LA PROGRAMACI�N PARALELA O MULTIHILO.   *
        *  5. GESTI�N DE HILOS.                                      *
        *  6. SINCRONIZACI�N DE VARIOS HILOS.                        *
        *  7. INTRODUCCI�N A LA COMUNICACI�N ENTRE APLICACIONES.     *
        *  8. MODELOS DE COMUNICACIONES.                             *
        *  9. PROTOCOLOS A NIVEL DE APLICACI�N.                      *
        * 10.                                                        *
        * 11.                                                        *
        * 12.                                                        *
        * 13.                                                        *
        * 14.                                                        *
        * 15.                                                        *
        *                                                            *
        **************************************************************
        *  0. SALIR.                                                 *
        **************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opci�n: ");
                menu = teclaStr.nextLine();
                meterEspacios(25);
                switch (menu) {
                    
                    case "1" -> Tema_01.T_01.main(args);
                    case "2" -> Tema_02.T_02.main(args);
                    case "3" -> Tema_03.T_03.main(args);
                    case "4" -> Tema_04.T_04.main(args);
                    case "5" -> Tema_05.T_05.main(args);
                    case "6" -> Tema_06.T_06.main(args);
                    case "7" -> Tema_07.T_07.main(args);
                    
                    case "9" -> Tema_09.T_09.main(args);
                   
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
        
    public static void esperar(int segundos) {
        try {            
            Thread.sleep(segundos);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void meterEspacios(int espacios) {
    
        for (int i=0; i<espacios; i++) {
                System.out.println("");
            }
    
    }
}