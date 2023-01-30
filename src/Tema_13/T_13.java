package Tema_13;

import static Principal_Main.Main.*;

/**
 *
 * @author Juan José Estévez González
 */
public class T_13 {
    
    public static String punto_01 ="*  PUNTO  1.  INTRODUCCIÓN I.\n";
    public static String punto_02 ="*  PUNTO  2.  INTRODUCCIÓN II.\n";
    public static String punto_03 ="*  PUNTO  3.  AMENAZAS DE SEGURIDAD I.\n";
    public static String punto_04 ="*  PUNTO  4.  AMENAZAS DE SEGURIDAD II.\n";
    public static String punto_05 ="*  PUNTO  5.  TIPOS DE VIRUS.\n";
    public static String punto_06 ="*  PUNTO  6.  EVITAR EJECUCIONES NO DESEADAS.\n";
    public static String punto_07 ="*  PUNTO  7.  ATAQUES A UN SISTEMA INFORMÁTICO.\n";
    public static String punto_08 ="*  PUNTO  8.  VULNERABILIDADES EN EL SOFTWARE.\n";
    public static String punto_09 ="*  PUNTO  9.  PILARES DE LA SEGURIDAD EN LOS QUE SE BASA JAVA.\n";
    public static String punto_10 ="*  PUNTO 10.  MECANISMOS DE CONTROL DE ACCESO.\n";
    public static String punto_11 ="*  PUNTO 11.  VALIDACIÓN DE ENTRADAS. CONTROL DEL TAMAÑO DE LAS ENTRADAS.\n";
    public static String punto_12 ="*  PUNTO 12.  EJEMPLOS DE CÓDIGO.\n";
    public static String punto_13 ="*  PUNTO 13.  VALIDACIÓN DE ENTRADAS. CONTROL DE LAS EXPRESIONES REGULARES.\n";
    public static String punto_14 ="*  PUNTO 14.  T O D O.\n";
    public static String punto_15 ="*  PUNTO 15.  EJEMPLO: VALIDACIÓN DNI.\n";
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
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
        *               
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
                    
                    case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14" -> Recursos_13.recurso(menu);
                    case "15" -> ValidacionDNI.main(args);
                    
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