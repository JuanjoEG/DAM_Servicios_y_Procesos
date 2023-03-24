package Tema_15;

import static Principal_Main.Main.*;

/**
 *
 * @author Juan José Estévez González
 */
public class T_15 {
    
    public static String punto_01 ="*  PUNTO  1.  INTRODUCCIÓN.\n";
    public static String punto_02 ="*  PUNTO  2.  PROTOCOLOS SEGUROS DE COMUNICACIONES I.\n";
    public static String punto_03 ="*  PUNTO  3.  PROTOCOLOS SEGUROS DE COMUNICACIONES II.\n";
    public static String punto_04 ="*  PUNTO  4.  FASES EN EL PROTOCOLO SSL\n";
    public static String punto_05 ="*  PUNTO  5.  CARACTERÍSTICAS SSL/TLS.\n";
    public static String punto_06 ="*  PUNTO  6.  ALGORITMOS CRIPTOGRÁFICOS PARA SSL/TLS.\n";
    public static String punto_07 ="*  PUNTO  7.  ENCRIPTACIÓN DE DATOS CON CIPHER.\n";
    public static String punto_08 ="*  PUNTO  8.  EJEMPLO DE CÓDIGO DE CIFRADO AES.\n";
    public static String punto_09 ="*  PUNTO  9.  CLASES JAVA PARA FIRMA DIGITAL.\n";
    public static String punto_10 ="*  PUNTO 10.  EJEMPLO DE CÓDIGO DE FIRMA DIGITAL.\n";
    public static String punto_11 ="*  PUNTO 11.  CERTIFICADOS PARA SOCKETS SEGUROS.\n";
    public static String punto_12 ="*  PUNTO 12.  SOCKETS SEGUROS I. SERVIDOR.\n";
    public static String punto_13 ="*  PUNTO 13.  SOCKETS SEGUROS II. CLIENTE.\n";
    public static String punto_14 ="*  PUNTO 14.  EJEMPLOS DEL TEMA.\n";
    public static String punto_15 ="*  PUNTO 15.  T O D O.\n";
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            meterEspacios(25);
            System.out.println("""                          
                               
        *******************************************************************************************
        """ + Principal_Main.Main.asignatura + """
        *******************************************************************************************
        """ + Principal_Main.Main.tema_15 + """
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
        *
        """ + punto_15 + """
        *
        *******************************************************************************************
        *  0. SALIR.
        *******************************************************************************************
                               
                               """);
                               
            try {
                menu = miTry();
                switch (menu) {
                    
                    case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" -> Recursos_15.recurso(menu); 
                    
                    case "0" -> {}
                    default -> {
                            miDefault();
                            }
                }
            }  catch (Exception e) {
                miError(e);
            }
        } while (!"0".equals(menu));
    }
}