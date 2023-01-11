package Tema_01;

import static Principal_Main.Main.*;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class T_01 {
    
    public static String punto_01 ="*  PUNTO  1.  CONCEPTOS B�SICOS I. PROGRAMA, PROCESO, SERVICIO.\n";
    public static String punto_02 ="*  PUNTO  2.  CONCEPTOS B�SICOS II. HILOS Y EJECUTABLE.\n";
    public static String punto_03 ="*  PUNTO  3.  PROGRAMACI�N CONCURRENTE.\n";
    public static String punto_04 ="*  PUNTO  4.  PROGRAMACI�N PARALELA.\n";
    public static String punto_05 ="*  PUNTO  5.  PROGRAMACI�N DISTRIBUIDA.\n";
    public static String punto_06 ="*  PUNTO  6.  T O D O.\n";
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            meterEspacios(25);
            System.out.println("""                          
                               
        *******************************************************************************************
                """ + Principal_Main.Main.asignatura + """
                *******************************************************************************************
                """ + Principal_Main.Main.tema_01 + """
                *******************************************************************************************
                *
                """ + punto_01 + """         
                """ + punto_02 + """
                """ + punto_03 + """                        
                """ + punto_04 + """
                """ + punto_05 + """
                *
                """ + punto_06 + """
                *
                *******************************************************************************************
                *  0. SALIR.
                *******************************************************************************************
                               
                               """);
            try {
                menu = miTry();
                switch (menu) {
                    
                    case "1", "2", "3", "4", "5", "6" -> Recursos_01.recurso(menu);
                   
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