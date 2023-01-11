package Tema_06;

import static Principal_Main.Main.*;

/**
 *
 * @author Juan José Estévez González
 */

public class T_06 {
    
    public static String punto_01 ="*  PUNTO  1.  PROBLEMAS ASOCIADOS A LA SINCRONIZACIÓN.\n";
    public static String punto_02 ="*  PUNTO  2.  HERRAMIENTAS PARA SINCRONIZACIÓN: MONITORES.\n";
    public static String punto_03 ="*  PUNTO  3.  PROBLEMA DEL PRODUCTOR-CONSUMIDOR.\n";
    public static String punto_04 ="*  PUNTO  4.  SOLUCIÓN DEL PROBLEMA DEL PRODUCTOR-CONSUMIDOR. MONITORES.\n";
    public static String punto_05 ="*  PUNTO  5.  HERRAMIENTAS PARA SINCRONIZACIÓN: SEMÁFOROS.\n";
    public static String punto_06 ="*  PUNTO  6.  EL PROBLEMA DE LOS FUMADORES.\n";
    public static String punto_07 ="*  PUNTO  7.  EL PROBLEMA DE LOS FILÓSOFOS.\n";
    public static String punto_08 ="*  PUNTO  8.  EL PROBLEMA DEL BARBERO.\n";
    public static String punto_09 ="*  PUNTO  9.  EJEMPLO 1 PRODUCTOR-CONSUMIDOR. SIN MONITORES.\n";
    public static String punto_10 ="*  PUNTO 10.  EJEMPLO 1 PRODUCTOR-CONSUMIDOR. CON MONITORES.\n";
    public static String punto_11 ="*  PUNTO 11.  EJEMPLO 2 PRODUCTOR-CONSUMIDOR. SIN MONITORES.\n";
    public static String punto_12 ="*  PUNTO 12.  EJEMPLO 2 PRODUCTOR-CONSUMIDOR. CON MONITORES.\n";
    public static String punto_13 ="*  PUNTO 13.  T O D O.\n";
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            meterEspacios(25);
            System.out.println("""                          
                               
        *******************************************************************************************
        """ + Principal_Main.Main.asignatura + """
        *******************************************************************************************
        """ + Principal_Main.Main.tema_06 + """
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
        *
        """ + punto_09 + """                        
        """ + punto_10 + """
        *
        """ + punto_11 + """
        """ + punto_12 + """
        *
        """ + punto_13 + """
        *
        *******************************************************************************************
        *  0. SALIR.
        *******************************************************************************************
                               
                               """);
            try {
                menu = miTry();
                switch (menu) {
                    
                    case "1", "2", "3", "4", "5", "6", "7", "8", "13" -> Recursos_06.recurso(menu);
                    
                    case "9" -> ProblemaProductorConsumidor_01.main(args);
                    case "10" -> ProblemaProductorConsumidor_02.main(args);
                    
                    case "11" -> ProblemaProductorConsumidor_03.main(args);
                    case "12" -> ProblemaProductorConsumidor_04.main(args);
                   
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