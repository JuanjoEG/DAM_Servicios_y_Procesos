package Principal;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
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
        *           PROGRAMACIÓN DE SERVICIOS Y PROCESOS             *
        **************************************************************
        *                                                            *
        *  1. TIPOS DE PROGRAMACIÓN.                                 *
        *  2. PROCESOS.                                              *
        *  3. GESTIÓN DE PROCESOS.                                   *
        *  4. INTRODUCCIÓN A LA PROGRAMACIÓN PARALELA O MULTIHILO.   *
        *  5. GESTIÓN DE HILOS.                                      *
        *  6. SINCRONIZACIÓN DE VARIOS HILOS                         *
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
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                switch (menu) {
                   
                    case "0" -> {}
                    default -> System.out.println("\n  ¡¡¡ LA OPCIÓN NO ES CORRECTA !!!");
                }
            }  catch (Exception e) {
                System.out.println("Error: " + e.toString());
                System.out.println("MENSAJE " + e.getMessage());
                System.out.println("La Excepción es: " + e.getClass());
            }
        } while (!"0".equals(menu));
    }
}
