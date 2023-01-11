package Tema_05;

import static Principal_Main.Main.*;

/**
 *
 * @author Juan José Estévez González
 */

public class T_05 {
    
    public static String punto_01 ="*  PUNTO  1.  CREACIÓN DE HILOS. USANDO THREAD.\n";
    public static String punto_02 ="*  PUNTO  2.  CREACIÓN DE HILOS. USANDO RUNNABLE.\n";
    public static String punto_03 ="*  PUNTO  3.  INICIALIZACIÓN Y EJECUCIÓN DE HILOS.\n";
    public static String punto_04 ="*  PUNTO  4.  SUSPENSIÓN Y FINALIZACIÓN DE HILOS.\n";
    public static String punto_05 ="*  PUNTO  5.  PLANIFICACIÓN DE HILOS. join(): ESPERAR A LA FINALIZACIÓN DE UN HILO.\n";
    public static String punto_06 ="*  PUNTO  6.  PRIORIDAD EN LOS HILOS.\n";
    public static String punto_07 ="*  PUNTO  7.  EJEMPLO CAJAS DE TIENDA Y CLIENTES. SIN HILOS.\n";
    public static String punto_08 ="*  PUNTO  8.  EJEMPLO CAJAS DE TIENDA Y CLIENTES. CON THREAD.\n";
    public static String punto_09 ="*  PUNTO  9.  EJEMPLO CAJAS DE TIENDA Y CLIENTES. CON RUNNABLE.\n";
    public static String punto_10 ="*  PUNTO 10.  EJEMPLO REUNIÓN DE ALUMNOS. SIN ORDEN.\n";
    public static String punto_11 ="*  PUNTO 11.  EJEMPLO REUNIÓN DE ALUMNOS. CON JOIN.\n";
    public static String punto_12 ="*  PUNTO 12.  EJEMPLO REUNIÓN DE ALUMNOS. CON PRIORIDAD.\n";
    public static String punto_13 ="*  PUNTO 13.  T O D O.\n";
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            meterEspacios(25);
            System.out.println("""                          
                               
        *******************************************************************************************
        """ + Principal_Main.Main.asignatura + """
        *******************************************************************************************
        """ + Principal_Main.Main.tema_05 + """
        *******************************************************************************************
        *
        """ + punto_01 + """         
        """ + punto_02 + """
        """ + punto_03 + """                        
        """ + punto_04 + """
        """ + punto_05 + """                        
        """ + punto_06 + """
        *
        """ + punto_07 + """                        
        """ + punto_08 + """
        """ + punto_09 + """
        *                
        """ + punto_10 + """
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
                    
                    case "1", "2", "3", "4", "5", "6", "13" -> Recursos_05.recurso(menu);
                    
                    case "7" -> IntroThreads.atencionColaSinThreads.main(args);
                    case "8" -> IntroThreads.atencionColaConThread.main(args);
                    case "9" -> IntroThreads.atencionColaConRunnable.main(args);
                    
                    case "10" -> ordenThreads.ReunionAlumnos.main(args);
                    case "11" -> ordenThreads.Reunion__Alumnos_Join.main(args);
                    case "12" -> ordenThreads.Reunion_Alumnos_Prioridad.main(args);
                   
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