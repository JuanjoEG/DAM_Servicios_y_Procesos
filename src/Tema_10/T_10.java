package Tema_10;

import static Principal_Main.Main.esperar;
import static Principal_Main.Main.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class T_10 {
    
    public static String punto_01 ="*  PUNTO  1.  DEFINICIÓN DE SOCKETS.\n";
    public static String punto_02 ="*  PUNTO  2.  PROGRAMACIÓN DE UN SERVIDOR TCP.\n";
    public static String punto_03 ="*  PUNTO  3.  CÓDIGO DE UN SERVIDOR TCP SIMPLE.\n";
    public static String punto_04 ="*  PUNTO  4.  PROGRAMACIÓN DE UN CLIENTE TCP.\n";
    public static String punto_05 ="*  PUNTO  5.  CÓDIGO DE UN CLIENTE TCP SIMPLE.\n";
    public static String punto_06 ="*  PUNTO  6.  CAPTURAR EL TRÁFICO TCP CON WIRESCHARK.\n";
    public static String punto_07 ="*  PUNTO  7.  CLASES DATAGRAMPACKET Y DATAGRAMSOCKET.\n";
    public static String punto_08 ="*  PUNTO  8.  PROGRAMACIÓN DE UN SERVIDOR UDP.\n";
    public static String punto_09 ="*  PUNTO  9.  CÓDIGO DE UN SERVIDOR UDP SIMPLE.\n";
    public static String punto_10 ="*  PUNTO 10.  PROGRAMACIÓN DE UN CLIENTE UDP.\n";
    public static String punto_11 ="*  PUNTO 11.  CÓDIGO DE UN CLIENTE UDP SIMPLE.\n";
    public static String punto_12 ="*  PUNTO 12.  CAPTURAR EL TRÁFICO UDP CON WIRESCHARK.\n";
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            meterEspacios(25);
            System.out.println("""                          
                               
        *******************************************************************************************
        """ + Principal_Main.Main.asignatura + """
        *******************************************************************************************
        """ + Principal_Main.Main.tema_10 + """
        *******************************************************************************************
        *
        """ + punto_01 + """
        *
        """ + punto_02 + """
        """ + punto_03 + """                        
        """ + punto_04 + """
        """ + punto_05 + """
        *
        """ + punto_06 + """
        """ + punto_07 + """
        *
        """ + punto_08 + """
        """ + punto_09 + """                        
        """ + punto_10 + """
        """ + punto_11 + """
        *
        """ + punto_12 + """ 
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
                    
                    case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" -> Recursos_10.recurso(menu); 
                    
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