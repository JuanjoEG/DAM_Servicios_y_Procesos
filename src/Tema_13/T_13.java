package Tema_13;

import static Principal_Main.Main.esperar;
import static Principal_Main.Main.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class T_13 {
    
    public static String punto_01 ="*  PUNTO  1.\n";
    public static String punto_02 ="*  PUNTO  2.\n";
    public static String punto_03 ="*  PUNTO  3.\n";
    public static String punto_04 ="*  PUNTO  4.\n";
    public static String punto_05 ="*  PUNTO  5.\n";
    public static String punto_06 ="*  PUNTO  6.\n";
    public static String punto_07 ="*  PUNTO  7.\n";
    public static String punto_08 ="*  PUNTO  8.\n";
    public static String punto_09 ="*  PUNTO  9.\n";
    public static String punto_10 ="*  PUNTO 10.\n";
    public static String punto_11 ="*  PUNTO 11.\n";
    public static String punto_12 ="*  PUNTO 12.\n";
    public static String punto_13 ="*  PUNTO 13.\n";
    public static String punto_14 ="*  PUNTO 14.\n";
    public static String punto_15 ="*  PUNTO 15.\n";
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            meterEspacios(25);
            System.out.println("""                          
                               
        *******************************************************************************************
        """ + Principal_Main.Main.asignatura + """
        *******************************************************************************************
        """ + Principal_Main.Main.tema_13 + """
        *******************************************************************************************
        *
        """ + punto_01 + """                        
        """ + punto_02 + """
        """ + punto_03 + """                        
        """ + punto_04 + """
        """ + punto_05 + """                        
        """ + punto_06 + """
        """ + punto_07 + """                        
        """ + punto_08 + """
        """ + punto_09 + """                        
        """ + punto_10 + """
        """ + punto_11 + """
        """ + punto_12 + """                        
        """ + punto_13 + """
        """ + punto_14 + """                        
        """ + punto_15 + """
        *
        *******************************************************************************************
        *  0. SALIR.
        *******************************************************************************************
                               
                               """);
                               
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                meterEspacios(25);
                switch (menu) {
                    
                    case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" -> Recursos_13.recurso(menu); 
                    
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