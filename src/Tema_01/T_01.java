package Tema_01;

import static Principal_Main.Main.esperar;
import static Principal_Main.Main.meterEspacios;
import java.util.Scanner;

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
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
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
                *******************************************************************************************
                *  0. SALIR.
                *******************************************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opci�n: ");
                menu = teclaStr.nextLine();
                meterEspacios(25);
                switch (menu) {
                    
                    case "1", "2", "3", "4", "5" -> Recursos_01.recurso(menu);
                   
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