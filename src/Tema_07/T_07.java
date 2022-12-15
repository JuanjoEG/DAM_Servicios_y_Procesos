package Tema_07;

import static Principal_Main.Main.esperar;
import static Principal_Main.Main.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class T_07 {
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            meterEspacios(25);
            System.out.println("""                          
                               
        ****************************************************************************************************
        *   PROGRAMACIÓN DE SERVICIOS Y PROCESOS.                                                          *
        ****************************************************************************************************
        *   TEMA 7:                INTRODUCCIÓN A LA COMUNICACIÓN ENTRE APLICACIONES.                      *
        ****************************************************************************************************
        *                                                                                                  *
        *  1. REDES Y PROTOLOS.                                                                            *
        *  2. EL MODELO DE REFERENCIA OSI.                                                                 *
        *  3. EL MODELO TCP/IP.                                                                            *
        *  4. CORRESPONDENCIA ENTRE OSI Y TCP/IP.                                                          *
        *  5. COMPARATIVA ENTRE OSI Y TCP/IP.                                                              *
        *  6. PROTOCOLOS DE COMUNICACIONES: PROTOCOLO TCP.                                                 *
        *  7. PROTOCOLOS DE COMUNICACIONES: PROTOCOLO UDP.                                                 * 
        *  8. COMPARATIVA ENTRE LOS PROTOCOLOS TCP Y UDP.                                                  *
        *  9. LOS PUERTOS. ALEATORIOS, CONOCIDOS, REGISTRADOS Y DINÁMICOS.                                 *
        * 10. INTRODUCCIÓN AL TRÁFICO DE RED.                                                              *
        * 11. BIBLIOTECAS PARA NETWORKING EN JAVA.                                                         *
        * 12. TABLA DE LA BIBLIOTECAS PARA NETWORKING EN JAVA.                                             *
        *                                                                                                  *
        ****************************************************************************************************
        *  0. SALIR.                                                                                       *
        ****************************************************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                meterEspacios(25);
                switch (menu) {
                    
                    case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" -> Recursos_07.recurso(menu);
                    
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
