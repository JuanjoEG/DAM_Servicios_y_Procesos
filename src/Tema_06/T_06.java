package Tema_06;

import Tema_05.*;
import static Principal_Main.Main.esperar;
import static Principal_Main.Main.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class T_06 {
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            meterEspacios(25);
            System.out.println("""                          
                               
        ****************************************************************************************************
        *   PROGRAMACI�N DE SERVICIOS Y PROCESOS.                                                          *
        ****************************************************************************************************
        *   TEMA 6:                    SINCRONIZACI�N DE VARIOS HILOS.                                     *
        ****************************************************************************************************
        *                                                                                                  *
        *  1. PROBLEMAS ASOCIADOS A LA SINCRONIZACI�N.                                                     *
        *  2. HERRAMIENTAS PARA SINCRONIZACI�N: MONITORES.                                                 *
        *  3. PROBLEMA DEL PRODUCTOR-CONSUMIDOR.                                                           *
        *  4. SOLUCI�N DEL PROBLEMA DEL PRODUCTOR-CONSUMIDOR. MONITORES.                                   *
        *  5. HERRAMIENTAS PARA SINCRONIZACI�N: SEM�FOROS.                                                 *
        *  6. EL PROBLEMA DE LOS FUMADORES.                                                                * 
        *  7. EL PROBLEMA DE LOS FIL�SOFOS.                                                                *
        *  8. EL PROBLEMA DEL BARBERO.                                                                     *
        *                                                                                                  *
        * 10. EJEMPLO 1 PRODUCTOR-CONSUMIDOR. SIN MONITORES.                                               *
        * 11. EJEMPLO 1 PRODUCTOR-CONSUMIDOR. CON MONITORES.                                               *
        *                                                                                                  *
        * 12. EJEMPLO 2 PRODUCTOR-CONSUMIDOR. SIN MONITORES.                                               *
        * 13. EJEMPLO 2 PRODUCTOR-CONSUMIDOR. CON MONITORES.                                               *
        * 14.                                                                                              *
        * 15.                                                                                              *
        *                                                                                                  *
        ****************************************************************************************************
        *  0. SALIR.                                                                                       *
        ****************************************************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opci�n: ");
                menu = teclaStr.nextLine();
                meterEspacios(25);
                switch (menu) {
                    
                    case "1", "2", "3", "4", "5", "6", "7", "8" -> Recursos_06.recurso(menu);
                    
                    case "10" -> ProblemaProductorConsumidor_01.main(args);
                    case "11" -> ProblemaProductorConsumidor_02.main(args);
                    
                    case "12" -> ProblemaProductorConsumidor_03.main(args);
                    case "13" -> ProblemaProductorConsumidor_04.main(args);
                   
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
