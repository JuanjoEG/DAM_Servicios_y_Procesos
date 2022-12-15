package Tema_04;

import Tema_03.*;
import static Principal_Main.Main.esperar;
import static Principal_Main.Main.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Recursos_04 {
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        *   PROGRAMACI�N DE SERVICIOS Y PROCESOS.     TEMA 4:       INTRODUCCI�N A LA PROGRAMACI�N PARALELA O MULTIHILO.       *
        ************************************************************************************************************************
                                            HILOS DE EJECUCI�N EN UN PROCESO I.
                                       
            - LA PROGRAMACI�N PARALELA O MULTIHILO:
                    - ES UN TIPO DE PROGRAMACI�N CONCURRENTE CAPAZ DE EJECUTAR AL MISMO TIEMPO VARIAS TAREAS O HILOS.
                                       
            - UN HILO O HEBRA:  -->  THREAD.
                    - ES UN TROZO DE C�DIGO QUE SE EJECUTA DENTRO DE UN PROCESO.
                            - LOS HILOS NO PUEDEN EXISTIR DE FORMA INDEPENDIENTE A UN PROCESO.
                            - LOS HILOS NO SE PODR�N EJECUTAR POR S� SOLOS.
                    - ES UN TROZO DE C�DIGO QUE PUEDE SER EJECUTADO EN PARALELO CON OTROS HILOS.
                            - DENTRO DE UN MISMO PROCESO PODEMOS TENER TANTOS HILOS EJECUT�NDOSE COMO SE NECESITE.
                                       
            - SI LOS HILOS, EN LUGAR DE HABER SIDO CREADOS POR EL USUARIO, SON CREADOS POR EL SISTEMA,
              ESOS HILOS SE LLAMAR�N HILOS DEMONIO O DE SISTEMA.
                                       
            - TODOS LOS HILOS DENTRO DE UN PROCESO S�LO PODR�N UTILIZAR/COMPARTIR LOS RECURSOS QUE TENGA EL PROCESO.
                    - PUEDE HABER 'INCONSISTENCIAS' CUANDO LOS HILOS ACCEDEN A LOS MISMOS RECURSOS.
                    - LOS RECURSOS SE LIBERAN CUANDO EL SISTEMA OPERATIVO PUEDA DESTRUIR EL PROCESO,
                      AL TERMINAR DE EJECUTARSE TODOS LOS HILOS QUE HAYA LANZADO EL PROCESO ACTIVO EN EJECUCI�N.
                                      
        ************************************************************************************************************************
        *  0. SALIR.                                                                                                           *
        ************************************************************************************************************************
                               
                               """;
    
    private static String recurso_02 = """                          
                               
        ************************************************************************************************************************
        *   PROGRAMACI�N DE SERVICIOS Y PROCESOS.     TEMA 4:       INTRODUCCI�N A LA PROGRAMACI�N PARALELA O MULTIHILO.       *
        ************************************************************************************************************************
                                            HILOS DE EJECUCI�N EN UN PROCESO II.
        
            - DESDE EL MISMO MOMENTO QUE EJECUTAMOS UN PROGRAMA SE CREAN TAMBI�N TANTO UN PROCESO COMO UN HILO PRIMARIO.
              SI NOS QUEDAMOS CON UN �NICO HILO, ES MUY SIMILAR A UN PROGRAMA SECUENCIAL NORMAL.
                                       
            - IMPORTANTE: MULTIPROCESO NO ES LO MISMO QUE MULTIHILO.
                  
                    - DIFERENTE PROCESOS TIENEN DIFERENTES RECURSOS, COMO POR EJEMPLO DIFERENTES ZONAS DE MEMORIA.
                    - SI HAY M�S DE UN PROCESO CON VARIOS HILOS CREADOS Y EJECUTANDOSE,
                      �STOS HILOS NUNCA 'VER�N' LOS HILOS DE OTRO PROCESO.
                                       
                    - LOS DIFERENTES HILOS DENTRO DE UN MISMO PROCESO COMPARTEN LOS MISMOS RECURSOS,
                      QUE SON LOS RECURSOS DEL PROCESO PADRE.
                      CUANDO UN PROCESO CREA UN PROCESO HIJO,
                      �STE PUEDE INTERACTUAR CON OTROS PROCESOS QUE YA EXISTAN.                                       
                                       
        ************************************************************************************************************************
        *  0. SALIR.                                                                                                           *
        ************************************************************************************************************************
                               
                               """;
    
    private static String recurso_03 = """                          
                               
        ************************************************************************************************************************
        *   PROGRAMACI�N DE SERVICIOS Y PROCESOS.     TEMA 4:       INTRODUCCI�N A LA PROGRAMACI�N PARALELA O MULTIHILO.       *
        ************************************************************************************************************************
                                                VENTAJAS Y DESVENTAJAS DEL USO DE HILOS:
        ************************************************************************************************************************
                                VENTAJAS                           *                      INCONVENIENTES
        ************************************************************************************************************************
           - COMPARTIR RECURSOS: DENTRO DE UN PROCESO, TODOS SUS   *  - COMPLICA LA PROGRAMACI�N: ES TAREA DEL PROGRAMADOR
             HILOS VAN A COMPARTIR TANTO LA MEMORIA COMO LOS       *    CONTROLAR TODOS LOS PROBLEMAS RELACIONADOS CON LA 
             RECURSOS DE LOS QUE DISPONGA, CON LO QUE TODAS LAS    *    COMUNICACI�N Y SINCRONIZACI�N DE LOS HILOS.
             OPERACIONES DE LOS HILOS SER�N MUCHO M�S R�PIDAS.     *       - INANICI�N
                                                                   *       - BLOQUEO ACTIVO
           - USO M�S EFICIENTE Y AHORRO DE MEMORIA: AL COMPARTIR   *       - ACCESO A LOS RECURSOS CR�TICOS
             LA MISMA ZONA DE MEMORIA, LA OPERACI�N DE CREACI�N DE *       - ZONAS DE EXCLUSI�N MUTUA
             NUEVOS HILOS EN EL PROCESO NO VA A SUPONER UNA RESERVA*       - CONDICIONES DE CARRERA
             ADICIONAL DE ESTA.                                    *       - ERRORES DE INCONSISTENCIA EN LA MEMORIA COMPARTIDA.
                                                                   *
           - MAYOR CAPACIDAD DE RESPUESTA: EL PROCESO PUEDE ATENDER*   - NO TODOS LOS LENGUAJES DE PROGRAMACI�N SOPORTAN LA
             OTRAS PETICIONES QUE LE ENV�E EL USUARIO A TRAV�S DE  *     PROGRAMACI�N MULTIHILO, AUNQUE, ACTUALMENTE, CASI TODOS
             OTROS HILOS.                                          *     SI LO HACEN: C, C++, C#, Python, Kotlin, Swift Y UN 
                                                                   *     LARGU�SIMO ETC...
           - PARALELISMO REAL SI EL MICROPROCESADOR ES MULTIN�CLEO:*
             LOS HILOS SE PODR�N EJECUTAR CADA UNO EN UN N�CLEO    *
             DIFERENTE, LO CUAL PERMITE USAR EL PROCESADOR DE FORMA*
             PARALELA (EJECUCI�N DE VARIAS INSTRUCCIONES AL MISMO  *
             TIEMPO).                                              *
        ************************************************************************************************************************
        *  0. SALIR.                                                                                                           *
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_04 =  """                          
                               
        ************************************************************************************************************************
        *   PROGRAMACI�N DE SERVICIOS Y PROCESOS.     TEMA 4:       INTRODUCCI�N A LA PROGRAMACI�N PARALELA O MULTIHILO.       *
        ************************************************************************************************************************
                        RECURSOS COMPARTIDOS POR LOS HILOS. ELEMENTOS PROPIOS DE UN HILO Y RECURSOS COMPARTIDOS.
                                        
            - CADA HILO EST� COMPUESTO DE LOS SIGUIENTES ELEMENTOS PROPIOS E INDIVIDUALES:
                    - IDENTIFICADOR PROPIO: CADA HILO PODR� SER IDENTIFICADO DE FORMA R�PIDA.
                    - CONTADOR DE PROGRAMA: CADA HILO PODR� EJECUTAR SU C�DIGO DE FORMA INDEPENDIENTE.
                    - CONJUNTO DE REGISTROS: CADA HILO PODR� REALIZAR SUS C�LCULOS DE FORMA INDEPENDIENTE.
                    - PILA PROPIA: CADA HILO PUEDE EJECUTAR LAS LLAMADAS A FUNCIONES QUE NECESITE DE FORMA INDEPENDIENTE.
                                        
            - LOS HILOS TAMBI�N PODR�N COMPARTIR UNA SERIE DE RECURSOS CON OTROS COMO:
                    - EL C�DIGO A EJECUTAR.
                    - VARIABLES GLOBALES QUE SE ENCONTRAR�N EN LA ZONA CR�TICA.
                    - RECURSOS DEL SISTEMA OPERATIVO: FICHEROS, SOCKETS, BASES DE DATOS, ETC...
                                        
        ************************************************************************************************************************
        *  0. SALIR.                                                                                                           *
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_05 = """                          
                               
        ************************************************************************************************************************
        *   PROGRAMACI�N DE SERVICIOS Y PROCESOS.     TEMA 4:       INTRODUCCI�N A LA PROGRAMACI�N PARALELA O MULTIHILO.       *
        ************************************************************************************************************************
                       RECURSOS COMPARTIDOS POR LOS HILOS. RIESGOS POR LA COMPARTICI�N DE RECURSOS EN LOS HILOS.
                                       
            - �QU� OCURRIR�A SI HILOS DIFERENTES NECESITAN ACCEDER A UNA MISMA VARIABLE GLOBAL PARA REALIZAR UN C�LCULO,
              PUDIENDO CAMBIAR EL VALOR DE DICHA VARIABLE?
                    - PODR�A SUCEDER QUE EL PRIMER HILO QUE ACCEDA A LA VARIABLE CAMBIE SU VALOR Y QUE, POR CONSIGUIENTE,
                      LOS DEM�S HILOS, CUANDO ACCEDAN A ELLA, NO ACCEDEN AL VALOR ANTERIOR, SINO AL CAMBIADO, LO CUAL PODR�
                      OCASIONAR CAMBIOS EN LOS RESULTADOS DE NUESTROS PROGRAMAS.
                                       
            - PARA PREVENIR Y RESOLVER ESTO POSIBLES PROBLEMAS, SE USAR� UN ESQUEMA DE BLOQUEO Y SINCRONIZACI�N ENTRE HILOS.
                    - SU IMPLEMENTACI�N NO ES NADA SENCILLA Y COMPLICAR�N BASTANTE NUESTROS PROGRAMAS.

        ************************************************************************************************************************
        *  0. SALIR.                                                                                                           *
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_06 = """                          
                               
        ************************************************************************************************************************
        *   PROGRAMACI�N DE SERVICIOS Y PROCESOS.     TEMA 4:       INTRODUCCI�N A LA PROGRAMACI�N PARALELA O MULTIHILO.       *
        ************************************************************************************************************************
                                                ESTADOS DE UN HILO.
                                       
            - LOS HILOS, AL IGUAL QUE LOS PROCESOS, TIENEN UN CICLO DE VIDA DETERMINADO POR UNA SERIE DE ESTADOS.
                    - ESTOS SON IGUALES TANTO PARA LOS HILOS DE USUARIO COMO PARA LOS HILOS DEMONIO O DE SISTEMA.
                                       
            - EL COMPERTAMIENTO DE CADA HILO DEPENDE DE SU ESTADO: DEFINE LA OPERACI�N QUE EST� REALIZANDO.
                    - M�TODOS JAVA NOS PERMITIR�N SABER EL ESTADO EN EL QUE SE ENCUENTRA UN HILO.
                                       
            - LOS ESTADOS POR LOS QUE PUEDE PASAR UN HILO SON LOS MISMOS QUE LOS VISTOS CON LOS PROCESOS.
                    - CADA ESTADO TIENE UNAS PECULIARIDADES.
                    - UNA DIFERENCIA ES QUI�N DETERMINA EL CAMBIO DE UN ESTADO A OTRO; EN ESTE CASO, AUNQUE LA DECISI�N PRINCIPAL
                      SIGUE SIENDO DEL SISTEMA OPERATIVO, CON ANTERIORIDAD DEBEMOS HABER SIDO NOSOTROS QUIENES HEMOS 'LANZADO'
                      EL HILO DEL PROCESO.
                                       
            - LOS ESTADOS SON:                           
                                  
                    - NUEVO:
                            - EL HILO YA HA SIDO CREADO Y EST� LISTO PARA EJECUTARSE,
                              AUNQUE NO HAYA SIDO ELEGIDO PARA EMPEZAR A EJECUTARSE.
                                       
                    - LISTO/EJECUTABLE:
                            - EL HILO ENTRAR� EN ESTE ESTADO CUANDO NOSOTROS INDIQUEMOS, 
                              CON SU M�TODO CORESPONDIENTE, 
                              QUE EST� LISTO PARA POSER EJECUTARSE.
                                       
                    - EN EJECUCI�N:
                            - EN ESTE ESTADO, EL HILO EST� LISTO PARA EJECUTARSE
                              Y EL SISTEMA OPERATIVO LO HA SELECCIONADO PARA QUE SE EJECUTE.
                                       
                    - BLOQUEADO/EN ESPERA:
                            - EL HILO ENTRA EN ESTE ESTADO CUANDO NECESITE ALGUNOS RECURSOS 
                              DE ENTRADA/SALIDA QUE DEBE PROPORCIONARLE
                              EL USUARIO O EL PROPIO SISTEMA OPERATIVO.
                                    - EN ESTE ESTADO, NO SE LE VA A ASIGNAR TIEMPO DE CPU AL HILO,
                                      AUNQUE ESTAR� LISTO PARA VOLVER A SER USADO.
                            
                    - FINALIZADO/TERMINADO:
                            - CUANDO EL HILO TERMINA SU EJECUCI�N, PASA A ESTE ESTADO,
                              EN ESPERA DE QUE EL SISTEMA OPERATIVO LO DESTRUYA Y LIBERE RECURSOS.

        ************************************************************************************************************************
        *  0. SALIR.                                                                                                           *
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_07 = """                          
                               
        ************************************************************************************************************************
        *   PROGRAMACI�N DE SERVICIOS Y PROCESOS.     TEMA 4:       INTRODUCCI�N A LA PROGRAMACI�N PARALELA O MULTIHILO.       *
        ************************************************************************************************************************
                                               CLASES PARA HILOS EN JAVA.       PAQUETE java.lang
                                       
            - CLASE Thread:
                    - CREA HILOS CON EL C�DIGO QUE QUERAMOS QUE SE EJECUTEN.
                    - LAS CLASES QUE QUERAMOS QUE SEAN HILOS DEBER�N HEREDAR DE ESTA CLASE Thread.
                                       
            - INTERFAZ Runnable:
                    - PERMITE A�ADIR LA FUNCIONALIDAD DE HILO A CUALQUIER OTRA CLASE,
                      SIMPLEMENTE IMPLEMENTANDO LA INTERFAZ Runnable.                   
                                       
            - CLASE ThreadDeath:                           
                    - PERMITE MANEJAR Y NOTIFICAR ERRORES EN EL USO DE LOS HILOS/HEBRAS/THREAD.
                    - HEREDA DE LA CLASE ERROR.
                                       
            - CLASE ThreadGroup:
                    - PERMITE MANEJAR UN GRUPO DE HILOS DE FORMA CONJUNTA,
                      HACIENDO QUE SE EJECUTEN DE FORMA M�S EFICIENTE.
                                       
            - A SU VEZ, DENTRO DE LA CLASE Thread, ENCONTRAREMOS LOS SIGUIENTES M�TODOS PRINCIPALES:
                                       
                    - new()      -->  ESTE M�TODO CREAR� UN HILO.
                    - start()    -->  INDICA QUE EL HILO EST� LISTO PARA EJECUTARSE.
                    - run()      -->  EJECUTA EL HILO, QUE EMPEZAR� A EJECUTARSE DE FORMA PARALELA.
                    - sleep()    -->  BLOQUEA AL HILO UNA CANTIDAD DE TIEMPO DADA EN MILISEGUNDOS.
                    - wait()     -->  HACE QUE EL HILO ESPERE LA EJECUCI�N DE OTRA TAREA PARA VOLVER A EJECUTARSE.
                    - getState() -->  DEVUELVE EL ESTADO EN EL QUE SE ENCUENTRA ACTUALMENTE EL HILO.

        ************************************************************************************************************************
        *  0. SALIR.                                                                                                           *
        ************************************************************************************************************************
                               
                               """;
    
    
    
    public static void recurso(String opcion) {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            
            switch (opcion) {                
                case "1" -> System.out.println(recurso_01);
                case "2" -> System.out.println(recurso_02);
                case "3" -> System.out.println(recurso_03);
                case "4" -> System.out.println(recurso_04);
                case "5" -> System.out.println(recurso_05); 
                case "6" -> System.out.println(recurso_06);
                case "7" -> System.out.println(recurso_07);
            }
            try {
                System.out.print("Seleccione una opci�n: ");
                menu = teclaStr.nextLine();
                switch (menu) {
                   
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