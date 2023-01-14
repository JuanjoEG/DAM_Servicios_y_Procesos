package Tema_11;

import static Principal_Main.Main.*;

/**
 *
 * @author Juan José Estévez González
 */
public class T_11 {
    
    public static String punto_01 ="*  PUNTO  1.  INTRODUCCIÓN.\n";
    public static String punto_02 ="*  PUNTO  2.  PROGRAMACIÓN DE UN CLIENTE HTTP.\n";
    public static String punto_03 ="*  PUNTO  3.  CÓDIGO DE CLIENTE HTTP SENCILLO.\n";
    public static String punto_04 ="*  PUNTO  4.  PROGRAMACIÓN DE UN CLIENTE FTP.\n";
    public static String punto_05 ="*  PUNTO  5.  PROGRAMACIÓN DE UN CLIENTE FTP. LA API DE APACHE.\n";
    public static String punto_06 ="*  PUNTO  6.  CÓDIGO DE CLIENTE FTP SENCILLO.\n";
    public static String punto_07 ="*  PUNTO  7.  PROGRAMACIÓN DE UN CLIENTE FTP. COMPROBACIONES MÍNIMAS DE SEGURIDAD.\n";
    public static String punto_08 ="*  PUNTO  8.  PROGRAMACIÓN DE UN CLIENTE TELNET.\n";
    public static String punto_09 ="*  PUNTO  9.  PROGRAMACIÓN DE UN CLIENTE TELNET. LA API DE APACHE.\n";
    public static String punto_10 ="*  PUNTO 10.  CÓDIGO DE CLIENTE TELNET SENCILLO.\n";
    public static String punto_11 ="*  PUNTO 11.  PROGRAMACIÓN DE UN CLIENTE SMTP.\n";
    public static String punto_12 ="*  PUNTO 12.  CÓDIGO PARA ENVIAR UN MENSAJE SENCILLO DE HTML POR CORREO I.\n";
    public static String punto_13 ="*  PUNTO 13.  CÓDIGO PARA ENVIAR UN MENSAJE SENCILLO DE HTML POR CORREO II.\n";
    public static String punto_14 ="*  PUNTO 14.  SOCKETS E HILOS I.\n";
    public static String punto_15 ="*  PUNTO 15.  SOCKETS E HILOS II.\n";
    public static String punto_16 ="*  PUNTO 16.  PRÁCTICA CLIENTE/SERVIDOR CONCURRENTE CON TCP CON HILOS.\n";
    public static String punto_17 ="*  PUNTO 17.  EJEMPLO MONITORIZAR TIEMPO DE RESPUESTA DE UNA APLICACIÓN.\n";
    public static String punto_18 ="*  PUNTO 18.  T O D O.\n";
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            meterEspacios(25);
            System.out.println("""                          
                               
        *******************************************************************************************
        """ + Principal_Main.Main.asignatura + """
        *******************************************************************************************
        """ + Principal_Main.Main.tema_11 + """
        *******************************************************************************************
        *
        """ + punto_01 + """
        *                
        """ + punto_02 + """
        """ + punto_03 + """ 
        *
        """ + punto_04 + """
        """ + punto_05 + """
        """ + punto_06 + """
        """ + punto_07 + """
        *
        """ + punto_08 + """
        """ + punto_09 + """
        """ + punto_10 + """
        *
        """ + punto_11 + """
        """ + punto_12 + """                        
        """ + punto_13 + """
        *
        """ + punto_14 + """                        
        """ + punto_15 + """
        *
        """ + punto_16 + """
        *
        """ + punto_17 + """
        *
        """ + punto_18 + """
        *
        *******************************************************************************************
        *  0. SALIR.
        *******************************************************************************************
                               
                               """);
                               
            try {
                menu = miTry();
                switch (menu) {
                    
                    case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "18" -> Recursos_11.recurso(menu);
                    
                    case "17" -> {
                        Monitorizacion_Tiempos_Respuesta.main(args);
                        continuar();
                    }
                    
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