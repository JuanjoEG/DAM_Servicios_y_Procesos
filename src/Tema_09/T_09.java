package Tema_09;

import static Principal_Main.Main.*;

/**
 *
 * @author Juan José Estévez González
 */

public class T_09 {
    
    public static String punto_01 ="*  PUNTO  1.  INTRODUCCIÓN A LOS SERVICIOS EN RED.\n";
    public static String punto_02 ="*  PUNTO  2.  PROTOCOLOS A NIVEL DE APLICACIÓN.\n";
    public static String punto_03 ="*  PUNTO  3.  EL PROTOCOLO DNS.          -->  RESOLUCIÓN DE NOMBRES DE DOMINIO.\n";
    public static String punto_04 ="*  PUNTO  4.  EL PROTOCOLO FTP.          -->  PARA TRANSFERENCIA DE FICHEROS.\n";
    public static String punto_05 ="*  PUNTO  5.  EL PROTOCOLO SMTP.         -->  PARA EL CORREO.\n*              - LOS PROT. POP3 E IMAP.  -->  DIFERENTES FORMAS DE CONECTARNOS A LOS MENSAJES.\n";
    public static String punto_06 ="*  PUNTO  6.  EL PROTOCOLO HTTP.         -->  PARA LA NAVEGACIÓN POR INTERNET.\n";
    public static String punto_07 ="*  PUNTO  7.  CONEXIÓN - COMUNICACIÓN - DESCONEXIÓN.\n";
    public static String punto_08 ="*  PUNTO  8.  COMANDOS HABITUALES.\n";
    public static String punto_09 ="*  PUNTO  9.  T O D O.\n";
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            meterEspacios(25);
            System.out.println("""                          
                               
        *******************************************************************************************
        """ + Principal_Main.Main.asignatura + """
        *******************************************************************************************
        """ + Principal_Main.Main.tema_09 + """
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
                    
                    case "1", "2", "3", "4", "5", "6", "7", "8", "9" -> Recursos_09.recurso(menu);
                   
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