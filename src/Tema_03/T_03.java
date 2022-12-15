package Tema_03;

import static Principal_Main.Main.esperar;
import static Principal_Main.Main.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class T_03 {
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            meterEspacios(25);
            System.out.println("""                          
                               
        ****************************************************************************************************
        *   PROGRAMACI�N DE SERVICIOS Y PROCESOS.                                                          *
        ****************************************************************************************************
        *   TEMA 3:                      GESTI�N DE PROCESOS.                                              *
        ****************************************************************************************************
        *                                                                                                  *
        *  1. CREACI�N DE PROCESOS EN JAVA: EJECUCI�N DE COMANDOS DEL SISTEMA OPERATIVO.                   *
        *  2. CREACI�N DE PROCESOS EN JAVA: EJECUCI�N DE UNA CLASE EN UN PROCESO.                          *
        *  3. CREACI�N DEL PROCESO CON ProcessBuilder: CREACI�NS EL M�TODO ejecutarClaseProceso.           *
        *  4. EJECUTAR UN PROGRAMA PASO A PASO EN NetBeans. LANZADOR DE PROCESOS EN EL CMD.                *
        *  5. TERMINAR UN PROCESO. EL M�TODO destroy Y exit.                                               *
        *  6. COMUNICACI�N ENTRE PROCESOS. REDIRECCIONES NECESARIAS PARA COMUNICACI�N ENTRE PROCESOS JAVA. *                               
        *  7. SINCRONIZACI�N ENTRE PROCESOS.                                                               *
        *                                                                                                  *
        *  8. EJEMPLO LANZADOR DE COMANDOS DEL CMD. INVOCAR AL BASH DEL SISTEMA OPERATIVO.                 *
        *  9. EJEMPLO SUMADOR N�MEROS.                                                                     *
        * 10. EJEMPLO LANZADOR/DESTRUCTOR DEL PROCESO DEL BLOC DE NOTAS.                                   *
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
                    
                    case "1", "2", "3", "4", "5", "6", "7" -> Recursos_03.recurso(menu);
                    case "8" -> Lanzador_Comandos.main(args);
                    case "9" -> Lanzando_Sumador.main(args);
                    case "10" -> Lanzador_BlocDeNotas.main(args);
                   
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
