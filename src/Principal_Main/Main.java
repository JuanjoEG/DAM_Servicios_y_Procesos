package Principal_Main;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class Main {    
        
    public static String asignatura ="*  PROGRAMACIÓN DE SERVICIOS Y PROCESOS.\n";
    public static String tema_01 ="*  TEMA  1.  TIPOS DE PROGRAMACIÓN.\n";
    public static String tema_02 ="*  TEMA  2.  PROCESOS.\n";
    public static String tema_03 ="*  TEMA  3.  GESTIÓN DE PROCESOS.\n";
    public static String tema_04 ="*  TEMA  4.  INTRODUCCIÓN A LA PROGRAMACIÓN PARALELA O MULTIHILO.\n";
    public static String tema_05 ="*  TEMA  5.  GESTIÓN DE HILOS.\n";
    public static String tema_06 ="*  TEMA  6.  SINCRONIZACIÓN DE VARIOS HILOS.\n";
    public static String tema_07 ="*  TEMA  7.  INTRODUCCIÓN A LA COMUNICACIÓN ENTRE APLICACIONES.\n";
    public static String tema_08 ="*  TEMA  8.  MODELOS DE COMUNICACIONES.\n";
    public static String tema_09 ="*  TEMA  9.  PROTOCOLOS A NIVEL DE APLICACIÓN.\n";
    public static String tema_10 ="*  TEMA 10.  LOS SERVICIOS DE RED. SOCKETS I.\n";
    public static String tema_11 ="*  TEMA 11.  \n";
    public static String tema_12 ="*  TEMA 12.  \n";
    public static String tema_13 ="*  TEMA 13.  \n";
    public static String tema_14 ="*  TEMA 14.  \n";
    public static String tema_15 ="*  TEMA 15.  \n";
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            meterEspacios(25);
            System.out.println("""                          
                               
        *******************************************************************
        """ + asignatura + """
        *******************************************************************
        *
        """ + tema_01 + """                        
        """ + tema_02 + """
        """ + tema_03 + """                        
        """ + tema_04 + """
        """ + tema_05 + """                        
        """ + tema_06 + """
        """ + tema_07 + """                        
        """ + tema_08 + """
        """ + tema_09 + """                        
        """ + tema_10 + """
        """ + tema_11 + """                        
        """ + tema_12 + """
        """ + tema_13 + """                        
        """ + tema_14 + """
        """ + tema_15 + """ 
        *
        *******************************************************************
        *  0. SALIR.
        *******************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opción: ");
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
                    case "8" -> Tema_08.T_08.main(args);
                    case "9" -> Tema_09.T_09.main(args);
                    case "10" -> Tema_10.T_10.main(args);
                    case "11" -> Tema_11.T_11.main(args);
                    case "12" -> Tema_12.T_12.main(args);
                    case "13" -> Tema_13.T_13.main(args);
                    case "14" -> Tema_14.T_14.main(args);
                    case "15" -> Tema_15.T_15.main(args);
                   
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