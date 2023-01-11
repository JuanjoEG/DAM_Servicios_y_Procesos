package Tema_03;

import static Principal_Main.Main.*;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class T_03 {
    
    public static String punto_01 ="*  PUNTO  1.  CREACI�N DE PROCESOS EN JAVA: EJECUCI�N DE COMANDOS DEL SISTEMA OPERATIVO.\n";
    public static String punto_02 ="*  PUNTO  2.  CREACI�N DE PROCESOS EN JAVA: EJECUCI�N DE UNA CLASE EN UN PROCESO.\n";
    public static String punto_03 ="*  PUNTO  3.  CREACI�N DEL PROCESO CON ProcessBuilder: CREACI�NS EL M�TODO ejecutarClaseProceso.\n";
    public static String punto_04 ="*  PUNTO  4.  EJECUTAR UN PROGRAMA PASO A PASO EN NetBeans. LANZADOR DE PROCESOS EN EL CMD.\n";
    public static String punto_05 ="*  PUNTO  5.  TERMINAR UN PROCESO. EL M�TODO destroy Y exit.\n";
    public static String punto_06 ="*  PUNTO  6.  COMUNICACI�N ENTRE PROCESOS. REDIRECCIONES NECESARIAS PARA COMUNICACI�N ENTRE PROCESOS JAVA.\n";
    public static String punto_07 ="*  PUNTO  7.  SINCRONIZACI�N ENTRE PROCESOS.\n";
    public static String punto_08 ="*  PUNTO  8.  EJEMPLO LANZADOR DE COMANDOS DEL CMD. INVOCAR AL BASH DEL SISTEMA OPERATIVO.\n";
    public static String punto_09 ="*  PUNTO  9.  EJEMPLO SUMADOR N�MEROS.\n";
    public static String punto_10 ="*  PUNTO 10.  EJEMPLO LANZADOR/DESTRUCTOR DEL PROCESO DEL BLOC DE NOTAS.\n";
    public static String punto_11 ="*  PUNTO 11.  T O D O.\n";
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            meterEspacios(25);
            System.out.println("""                          
                               
        *******************************************************************************************
        """ + Principal_Main.Main.asignatura + """
        *******************************************************************************************
        """ + Principal_Main.Main.tema_03 + """
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
        """ + punto_08 + """
        """ + punto_09 + """                        
        """ + punto_10 + """
        *
        """ + punto_11 + """
        *
        *******************************************************************************************
        *  0. SALIR.
        *******************************************************************************************
                               
                               """);
            try {
                menu = miTry();
                switch (menu) {
                    
                    case "1", "2", "3", "4", "5", "6", "7", "11" -> Recursos_03.recurso(menu);
                    case "8" -> Lanzador_Comandos.main(args);
                    case "9" -> Lanzando_Sumador.main(args);
                    case "10" -> Lanzador_BlocDeNotas.main(args);
                   
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