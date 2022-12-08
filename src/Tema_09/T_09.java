package Tema_09;

import static Principal.Main.esperar;
import static Principal.Main.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class T_09 {
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
        *******************************************************************************************
        *   PROGRAMACI�N DE SERVICIOS Y PROCESOS.                                                 *
        *******************************************************************************************
        *   TEMA 9:        PROTOCOLOS A NIVEL DE APLICACI�N.                                      *
        *******************************************************************************************
        *                                                                                         *
        *  1. INTRODUCCI�N A LOS SERVICIOS EN RED.                                                *
        *  2. PROTOCOLOS A NIVEL DE APLICACI�N.                                                   *
        *  3. EL PROTOCOLO DNS.          -->  RESOLUCI�N DE NOMBRES DE DOMINIO.                   *
        *  4. EL PROTOCOLO FTP.          -->  PARA TRANSFERENCIA DE FICHEROS.                     *
        *  5. EL PROTOCOLO SMTP.         -->  PARA EL CORREO.                                     *
        *  5. EL PROTOCOLO POP3 E IMAP.  -->  DIFERENTES FORMAS DE CONECTARNOS A LOS MENSAJES.    *
        *  6. EL PROTOCOLO HTTP.         -->  PARA LA NAVEGACI�N POR INTERNET.                    *
        *  7. CONEXI�N - COMUNICACI�N - DESCONEXI�N.                                              *
        *  8. COMANDOS HABITUALES.                                                                *
        *                                                                                         *
        *******************************************************************************************
        *  0. SALIR.                                                                              *
        *******************************************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opci�n: ");
                menu = teclaStr.nextLine();
                switch (menu) {
                    
                    case "1", "2", "3", "4", "5", "6", "7", "8" -> Recursos.recurso(menu);
                   
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
