package Tema_02;

import static Principal_Main.Main.esperar;
import static Principal_Main.Main.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class T_02 {
    
    public static String punto_01 ="*  PUNTO  1.  INTRODUCCI�N A LOS PROCESOS.\n";
    public static String punto_02 ="*  PUNTO  2.  TIPOS DE PROCESO SEG�N EL MODO Y ORIGEN DE EJECUCI�N.\n";
    public static String punto_03 ="*  PUNTO  3.  ESTADOS DE UN PROCESO.\n";
    public static String punto_04 ="*  PUNTO  4.  GESTI�N DE PROCESOS. EL SISTEMA OPERATIVO, RESPONSABLE PRINCIPAL.\n";
    public static String punto_05 ="*  PUNTO  5.  GESTI�N DE PROCESOS. GESTI�N DE LA EJECUCI�N CONCURRENTE MEDIANTE 'COLAS'.\n";
    public static String punto_06 ="*  PUNTO  6.  PLANIFICACI�N DE PROCESOS I:  TIPOS.\n";
    public static String punto_07 ="*  PUNTO  7.  PLANIFICACI�N DE PROCESOS II: ALGORITMOS DE PLANIFICACI�N.\n";
    public static String punto_08 ="*  PUNTO  8.  CAMBIOS DE CONTEXTO.\n";
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
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
        *******************************************************************************************
        *  0. SALIR.
        *******************************************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opci�n: ");
                menu = teclaStr.nextLine();
                meterEspacios(25);
                switch (menu) {
                    
                    case "1", "2", "3", "4", "5", "6", "7", "8" -> Recursos_02.recurso(menu);
                   
                    case "0" -> {}
                    default -> {
                            meterEspacios(25);
                            System.out.println("\n  ��� LA OPCI�N NO ES CORRECTA !!!");
                            meterEspacios(15);
                            esperar(1500);
                            }
                }
            }  catch (Exception e) {
                System.out.println("Error: " + e.toString());
                System.out.println("MENSAJE " + e.getMessage());
                System.out.println("La Excepci�n es: " + e.getClass());
            }
        } while (!"0".equals(menu));
    }    
}