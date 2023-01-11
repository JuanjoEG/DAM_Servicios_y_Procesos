package Tema_07;

import static Principal_Main.Main.*;

/**
 *
 * @author Juan José Estévez González
 */

public class T_07 {
    
    public static String punto_01 ="*  PUNTO  1.  REDES Y PROTOLOS.\n";
    public static String punto_02 ="*  PUNTO  2.  EL MODELO DE REFERENCIA OSI.\n";
    public static String punto_03 ="*  PUNTO  3.  EL MODELO TCP/IP.\n";
    public static String punto_04 ="*  PUNTO  4.  CORRESPONDENCIA ENTRE OSI Y TCP/IP.\n";
    public static String punto_05 ="*  PUNTO  5.  COMPARATIVA ENTRE OSI Y TCP/IP.\n";
    public static String punto_06 ="*  PUNTO  6.  PROTOCOLOS DE COMUNICACIONES: PROTOCOLO TCP.\n";
    public static String punto_07 ="*  PUNTO  7.  PROTOCOLOS DE COMUNICACIONES: PROTOCOLO UDP.\n";
    public static String punto_08 ="*  PUNTO  8.  COMPARATIVA ENTRE LOS PROTOCOLOS TCP Y UDP.\n";
    public static String punto_09 ="*  PUNTO  9.  LOS PUERTOS. ALEATORIOS, CONOCIDOS, REGISTRADOS Y DINÁMICOS.\n";
    public static String punto_10 ="*  PUNTO 10.  INTRODUCCIÓN AL TRÁFICO DE RED.\n";
    public static String punto_11 ="*  PUNTO 11.  BIBLIOTECAS PARA NETWORKING EN JAVA.\n";
    public static String punto_12 ="*  PUNTO 12.  TABLA DE LA BIBLIOTECAS PARA NETWORKING EN JAVA.\n";
    public static String punto_13 ="*  PUNTO 13.  T O D O.\n";
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            meterEspacios(25);
            System.out.println("""                          
                               
        *******************************************************************************************
        """ + Principal_Main.Main.asignatura + """
        *******************************************************************************************
        """ + Principal_Main.Main.tema_07 + """
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
        """ + punto_09 + """                        
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
                    
                    case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13" -> Recursos_07.recurso(menu);
                    
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