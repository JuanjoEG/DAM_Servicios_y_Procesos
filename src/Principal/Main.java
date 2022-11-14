package Principal;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args)  {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in);
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
        *  6. SINCRONIZACI�N DE VARIOS HILOS                         *
        *  7.                                                        *
        *  8.                                                        *
        *  9.                                                        *
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
                switch (menu) {
                   
                    case "0" -> {}
                    default -> System.out.println("\n  ��� LA OPCI�N NO ES CORRECTA !!!");
                }
            }  catch (Exception e) {
                System.out.println("Error: " + e.toString());
                System.out.println("MENSAJE " + e.getMessage());
                System.out.println("La Excepci�n es: " + e.getClass());
            }
        } while (!"0".equals(menu));
    }
}
