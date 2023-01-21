package Tema_12;

import static Principal_Main.Main.*;

/**
 *
 * @author Juan José Estévez González
 */
public class T_12 {
    
    public static String punto_01 ="*  PUNTO  1.  ¿QUÉ ES UN SERVICIO WEB?\n";
    public static String punto_02 ="*  PUNTO  2.  CARACTERÍSTICAS DE LOS SERVICIOS WEB.\n";
    public static String punto_03 ="*  PUNTO  3.  ARQUITECTURA DE LOS SERVICIOS WEB SOAP - SIMPLE OBJECT ACCESS PROTOCOL.\n";
    public static String punto_04 ="*  PUNTO  4.  FLUJO DE LA ARQUITECTURS DE LOS SERVICIOS WEB SOAP.\n";
    public static String punto_05 ="*  PUNTO  5.  ESTÁNDARES Y ESPECIFICACIONES WEB.\n";
    public static String punto_06 ="*  PUNTO  6.  SERVICIOS WED REST - REPRESENTATIONAL STATE TRANSFER.\n";
    public static String punto_07 ="*  PUNTO  7.  ARQUITECTURA ORIENTADA A SERVICIOS SOA - SERVICES ORIENTED ARCHITECTURE.\n";
    public static String punto_08 ="*  PUNTO  8.  ARQUITECTURA ORIENTADA A OBJETOS.\n";
    public static String punto_09 ="*  PUNTO  9.  APLICACIONES DISTRIBUIDAS.\n";
    public static String punto_10 ="*  PUNTO 10.  CREACIÓN DE SERVICIOS WEB SOAP EN JAVA.\n";
    public static String punto_11 ="*  PUNTO 11.  T O D O.\n";
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            meterEspacios(25);
            System.out.println("""                          
                               
        *******************************************************************************************
        """ + Principal_Main.Main.asignatura + """
        *******************************************************************************************
        """ + Principal_Main.Main.tema_12 + """
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
        *
        """ + punto_11 + """
        *
        *******************************************************************************************
        *  0. SALIR.
        *******************************************************************************************
                               
                               """);
                               
            try {
                menu = miTry();
                switch (menu) {
                    
                    case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11" -> Recursos_12.recurso(menu); 
                    
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