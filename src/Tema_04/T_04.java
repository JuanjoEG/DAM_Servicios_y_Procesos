package Tema_04;

import static Principal_Main.Main.esperar;
import static Principal_Main.Main.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class T_04 {
    
    public static String punto_01 ="*  PUNTO  1.  HILOS DE EJECUCIÓN EN UN PROCESO I.\n";
    public static String punto_02 ="*  PUNTO  2.  HILOS DE EJECUCIÓN EN UN PROCESO II.\n";
    public static String punto_03 ="*  PUNTO  3.  VENTAJAS Y DESVENTAJAS DEL USO DE HILOS.\n";
    public static String punto_04 ="*  PUNTO  4.  RECURSOS COMPARTIDOS POR LOS HILOS. ELEMENTOS PROPIOS DE UN HILO Y RECURSOS COMPARTIDOS.\n";
    public static String punto_05 ="*  PUNTO  5.  RECURSOS COMPARTIDOS POR LOS HILOS. RIESGOS POR LA COMPARTICIÓN DE RECURSOS EN LOS HILOS.\n";
    public static String punto_06 ="*  PUNTO  6.  ESTADOS DE UN HILO.\n";
    public static String punto_07 ="*  PUNTO  7.  CLASES PARA HILOS EN JAVA. PAQUETE java.lang.\n";
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            meterEspacios(25);
            System.out.println("""                          
                               
        *******************************************************************************************
        """ + Principal_Main.Main.asignatura + """
        *******************************************************************************************
        """ + Principal_Main.Main.tema_04 + """
        *******************************************************************************************
        *
        """ + punto_01 + """                        
        """ + punto_02 + """
        """ + punto_03 + """                        
        """ + punto_04 + """
        """ + punto_05 + """                        
        """ + punto_06 + """
        """ + punto_07 + """
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
                    
                    case "1", "2", "3", "4", "5", "6", "7" -> Recursos_04.recurso(menu);                   
                   
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