package Tema_02;

import static Principal_Main.Main.*;

/**
 *
 * @author Juan José Estévez González
 */

public class T_02 {
    
    public static String punto_01 ="*  PUNTO  1.  INTRODUCCIÓN A LOS PROCESOS.\n";
    public static String punto_02 ="*  PUNTO  2.  TIPOS DE PROCESO SEGÚN EL MODO Y ORIGEN DE EJECUCIÓN.\n";
    public static String punto_03 ="*  PUNTO  3.  ESTADOS DE UN PROCESO.\n";
    public static String punto_04 ="*  PUNTO  4.  GESTIÓN DE PROCESOS. EL SISTEMA OPERATIVO, RESPONSABLE PRINCIPAL.\n";
    public static String punto_05 ="*  PUNTO  5.  GESTIÓN DE PROCESOS. GESTIÓN DE LA EJECUCIÓN CONCURRENTE MEDIANTE 'COLAS'.\n";
    public static String punto_06 ="*  PUNTO  6.  PLANIFICACIÓN DE PROCESOS I:  TIPOS.\n";
    public static String punto_07 ="*  PUNTO  7.  PLANIFICACIÓN DE PROCESOS II: ALGORITMOS DE PLANIFICACIÓN.\n";
    public static String punto_08 ="*  PUNTO  8.  CAMBIOS DE CONTEXTO.\n";
    public static String punto_09 ="*  PUNTO  9.  T O D O.\n";
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            meterEspacios(25);
            System.out.println("""                          
                               
        *******************************************************************************************
        """ + Principal_Main.Main.asignatura + """
        *******************************************************************************************
        """ + Principal_Main.Main.tema_02 + """
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
        *
        *******************************************************************************************
        *  0. SALIR.
        *******************************************************************************************
                               
                               """);
            try {
                menu = miTry();
                switch (menu) {
                    
                    case "1", "2", "3", "4", "5", "6", "7", "8", "9" -> Recursos_02.recurso(menu);
                   
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