package Tema_14;

import static Principal_Main.Main.*;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class T_14 {
    
    public static String punto_01 ="*  PUNTO  1.  INTRODUCCI�N.\n";
    public static String punto_02 ="*  PUNTO  2.  CONCEPTO DE CRIPTOGRAF�A.\n";
    public static String punto_03 ="*  PUNTO  3.  TIPOS DE CRIPTOGRAF�A.\n";
    public static String punto_04 ="*  PUNTO  4.  TECNOLOG�AS DE SEGURIDAD DE LA INFORMACI�N.\n";
    public static String punto_05 ="*  PUNTO  5.  APLICACIONES DE LA CRIPTOGRAF�A. BLOCKCHAIN.\n";
    public static String punto_06 ="*  PUNTO  6.  APLICACIONES DE LA CRIPTOGRAF�A. SSL.\n";
    public static String punto_07 ="*  PUNTO  7.  SISTEMAS DE CONTROL DE ACCESO EN LAS APLICACIONES.\n";
    public static String punto_08 ="*  PUNTO  8.  ENCRIPTACI�N DE LA INFORMACI�N.\n";
    public static String punto_09 ="*  PUNTO  9.  PRINCIPIOS DE LA CRIPTOGRAF�A.\n";
    public static String punto_10 ="*  PUNTO 10.  CRIPTOGRAF�A DE CLAVE PRIVADA O SIM�TRICA.\n";
    public static String punto_11 ="*  PUNTO 11.  CRIPTOGRAF�A DE CLAVE P�BLICA O ASIM�TRICA.\n";
    public static String punto_12 ="*  PUNTO 12.  FIRMA DIGITAL Y CERTIFICADOS DIGITALES.\n";
    public static String punto_13 ="*  PUNTO 13.  USANDO CODIFICACI�N EN JAVA.\n";
    public static String punto_14 ="*  PUNTO 14.  FUNCI�N HASH.\n";
    public static String punto_15 ="*  PUNTO 15.  T O D O.\n";
    public static String punto_16 ="*  PUNTO 16.  EJEMPLO CIFRADO CON HASH.\n";
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            meterEspacios(25);
            System.out.println("""                          
                               
        *******************************************************************************************
        """ + Principal_Main.Main.asignatura + """
        *******************************************************************************************
        """ + Principal_Main.Main.tema_14 + """
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
        """ + punto_16 + """
        *******************************************************************************************
        *  0. SALIR.
        *******************************************************************************************
                               
                               """);
                               
            try {
                menu = miTry();
                switch (menu) {
                    
                    case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" -> Recursos_14.recurso(menu); 
                    case "16" -> Cifrado_con_HASH.main(args);
                    
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