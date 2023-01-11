package Tema_04;

import static Principal_Main.Main.*;
import static Tema_04.T_04.*;

/**
 *
 * @author Juan José Estévez González
 */

public class Recursos_04 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_04 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        **********************************************************************************************************************************
                                       
            - LA PROGRAMACIÓN PARALELA O MULTIHILO:
                    - ES UN TIPO DE PROGRAMACIÓN CONCURRENTE CAPAZ DE EJECUTAR AL MISMO TIEMPO VARIAS TAREAS O HILOS.
                                       
            - UN HILO O HEBRA:  -->  THREAD.
                    - ES UN TROZO DE CÓDIGO QUE SE EJECUTA DENTRO DE UN PROCESO.
                            - LOS HILOS NO PUEDEN EXISTIR DE FORMA INDEPENDIENTE A UN PROCESO.
                            - LOS HILOS NO SE PODRÁN EJECUTAR POR SÍ SOLOS.
                    - ES UN TROZO DE CÓDIGO QUE PUEDE SER EJECUTADO EN PARALELO CON OTROS HILOS.
                            - DENTRO DE UN MISMO PROCESO PODEMOS TENER TANTOS HILOS EJECUTÁNDOSE COMO SE NECESITE.
                                       
            - SI LOS HILOS, EN LUGAR DE HABER SIDO CREADOS POR EL USUARIO, SON CREADOS POR EL SISTEMA,
              ESOS HILOS SE LLAMARÁN HILOS DEMONIO O DE SISTEMA.
                                       
            - TODOS LOS HILOS DENTRO DE UN PROCESO SÓLO PODRÁN UTILIZAR/COMPARTIR LOS RECURSOS QUE TENGA EL PROCESO.
                    - PUEDE HABER 'INCONSISTENCIAS' CUANDO LOS HILOS ACCEDEN A LOS MISMOS RECURSOS.
                    - LOS RECURSOS SE LIBERAN CUANDO EL SISTEMA OPERATIVO PUEDA DESTRUIR EL PROCESO,
                      AL TERMINAR DE EJECUTARSE TODOS LOS HILOS QUE HAYA LANZADO EL PROCESO ACTIVO EN EJECUCIÓN.
                                      
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    
    private static String recurso_02 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_02 + """
        **********************************************************************************************************************************
        
            - DESDE EL MISMO MOMENTO QUE EJECUTAMOS UN PROGRAMA SE CREAN TAMBIÉN TANTO UN PROCESO COMO UN HILO PRIMARIO.
              SI NOS QUEDAMOS CON UN ÚNICO HILO, ES MUY SIMILAR A UN PROGRAMA SECUENCIAL NORMAL.
                                       
            - IMPORTANTE: MULTIPROCESO NO ES LO MISMO QUE MULTIHILO.
                  
                    - DIFERENTE PROCESOS TIENEN DIFERENTES RECURSOS, COMO POR EJEMPLO DIFERENTES ZONAS DE MEMORIA.
                    - SI HAY MÁS DE UN PROCESO CON VARIOS HILOS CREADOS Y EJECUTANDOSE,
                      ÉSTOS HILOS NUNCA 'VERÁN' LOS HILOS DE OTRO PROCESO.
                                       
                    - LOS DIFERENTES HILOS DENTRO DE UN MISMO PROCESO COMPARTEN LOS MISMOS RECURSOS,
                      QUE SON LOS RECURSOS DEL PROCESO PADRE.
                      CUANDO UN PROCESO CREA UN PROCESO HIJO,
                      ÉSTE PUEDE INTERACTUAR CON OTROS PROCESOS QUE YA EXISTAN.                                       
                                       
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    
    private static String recurso_03 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_03 + """
        **********************************************************************************************************************************
                                VENTAJAS                           *                      INCONVENIENTES
        ************************************************************************************************************************
           - COMPARTIR RECURSOS: DENTRO DE UN PROCESO, TODOS SUS   *  - COMPLICA LA PROGRAMACIÓN: ES TAREA DEL PROGRAMADOR
             HILOS VAN A COMPARTIR TANTO LA MEMORIA COMO LOS       *    CONTROLAR TODOS LOS PROBLEMAS RELACIONADOS CON LA 
             RECURSOS DE LOS QUE DISPONGA, CON LO QUE TODAS LAS    *    COMUNICACIÓN Y SINCRONIZACIÓN DE LOS HILOS.
             OPERACIONES DE LOS HILOS SERÁN MUCHO MÁS RÁPIDAS.     *       - INANICIÓN
                                                                   *       - BLOQUEO ACTIVO
           - USO MÁS EFICIENTE Y AHORRO DE MEMORIA: AL COMPARTIR   *       - ACCESO A LOS RECURSOS CRÍTICOS
             LA MISMA ZONA DE MEMORIA, LA OPERACIÓN DE CREACIÓN DE *       - ZONAS DE EXCLUSIÓN MUTUA
             NUEVOS HILOS EN EL PROCESO NO VA A SUPONER UNA RESERVA*       - CONDICIONES DE CARRERA
             ADICIONAL DE ESTA.                                    *       - ERRORES DE INCONSISTENCIA EN LA MEMORIA COMPARTIDA.
                                                                   *
           - MAYOR CAPACIDAD DE RESPUESTA: EL PROCESO PUEDE ATENDER*   - NO TODOS LOS LENGUAJES DE PROGRAMACIÓN SOPORTAN LA
             OTRAS PETICIONES QUE LE ENVÍE EL USUARIO A TRAVÉS DE  *     PROGRAMACIÓN MULTIHILO, AUNQUE, ACTUALMENTE, CASI TODOS
             OTROS HILOS.                                          *     SI LO HACEN: C, C++, C#, Python, Kotlin, Swift Y UN 
                                                                   *     LARGUÍSIMO ETC...
           - PARALELISMO REAL SI EL MICROPROCESADOR ES MULTINÚCLEO:*
             LOS HILOS SE PODRÁN EJECUTAR CADA UNO EN UN NÚCLEO    *
             DIFERENTE, LO CUAL PERMITE USAR EL PROCESADOR DE FORMA*
             PARALELA (EJECUCIÓN DE VARIAS INSTRUCCIONES AL MISMO  *
             TIEMPO).                                              *
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_04 =  """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_04 + """
        **********************************************************************************************************************************
                                        
            - CADA HILO ESTÁ COMPUESTO DE LOS SIGUIENTES ELEMENTOS PROPIOS E INDIVIDUALES:
                    - IDENTIFICADOR PROPIO: CADA HILO PODRÁ SER IDENTIFICADO DE FORMA RÁPIDA.
                    - CONTADOR DE PROGRAMA: CADA HILO PODRÁ EJECUTAR SU CÓDIGO DE FORMA INDEPENDIENTE.
                    - CONJUNTO DE REGISTROS: CADA HILO PODRÁ REALIZAR SUS CÁLCULOS DE FORMA INDEPENDIENTE.
                    - PILA PROPIA: CADA HILO PUEDE EJECUTAR LAS LLAMADAS A FUNCIONES QUE NECESITE DE FORMA INDEPENDIENTE.
                                        
            - LOS HILOS TAMBIÉN PODRÁN COMPARTIR UNA SERIE DE RECURSOS CON OTROS COMO:
                    - EL CÓDIGO A EJECUTAR.
                    - VARIABLES GLOBALES QUE SE ENCONTRARÁN EN LA ZONA CRÍTICA.
                    - RECURSOS DEL SISTEMA OPERATIVO: FICHEROS, SOCKETS, BASES DE DATOS, ETC...
                                        
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_05 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_05 + """
        **********************************************************************************************************************************
                                       
            - ¿QUÉ OCURRIRÍA SI HILOS DIFERENTES NECESITAN ACCEDER A UNA MISMA VARIABLE GLOBAL PARA REALIZAR UN CÁLCULO,
              PUDIENDO CAMBIAR EL VALOR DE DICHA VARIABLE?
                    - PODRÍA SUCEDER QUE EL PRIMER HILO QUE ACCEDA A LA VARIABLE CAMBIE SU VALOR Y QUE, POR CONSIGUIENTE,
                      LOS DEMÁS HILOS, CUANDO ACCEDAN A ELLA, NO ACCEDEN AL VALOR ANTERIOR, SINO AL CAMBIADO, LO CUAL PODRÁ
                      OCASIONAR CAMBIOS EN LOS RESULTADOS DE NUESTROS PROGRAMAS.
                                       
            - PARA PREVENIR Y RESOLVER ESTO POSIBLES PROBLEMAS, SE USARÁ UN ESQUEMA DE BLOQUEO Y SINCRONIZACIÓN ENTRE HILOS.
                    - SU IMPLEMENTACIÓN NO ES NADA SENCILLA Y COMPLICARÁN BASTANTE NUESTROS PROGRAMAS.

        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_06 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_06 + """
        **********************************************************************************************************************************
                                       
            - LOS HILOS, AL IGUAL QUE LOS PROCESOS, TIENEN UN CICLO DE VIDA DETERMINADO POR UNA SERIE DE ESTADOS.
                    - ESTOS SON IGUALES TANTO PARA LOS HILOS DE USUARIO COMO PARA LOS HILOS DEMONIO O DE SISTEMA.
                                       
            - EL COMPERTAMIENTO DE CADA HILO DEPENDE DE SU ESTADO: DEFINE LA OPERACIÓN QUE ESTÁ REALIZANDO.
                    - MÉTODOS JAVA NOS PERMITIRÁN SABER EL ESTADO EN EL QUE SE ENCUENTRA UN HILO.
                                       
            - LOS ESTADOS POR LOS QUE PUEDE PASAR UN HILO SON LOS MISMOS QUE LOS VISTOS CON LOS PROCESOS.
                    - CADA ESTADO TIENE UNAS PECULIARIDADES.
                    - UNA DIFERENCIA ES QUIÉN DETERMINA EL CAMBIO DE UN ESTADO A OTRO; EN ESTE CASO, AUNQUE LA DECISIÓN PRINCIPAL
                      SIGUE SIENDO DEL SISTEMA OPERATIVO, CON ANTERIORIDAD DEBEMOS HABER SIDO NOSOTROS QUIENES HEMOS 'LANZADO'
                      EL HILO DEL PROCESO.
                                       
            - LOS ESTADOS SON:                           
                                  
                    - NUEVO:
                            - EL HILO YA HA SIDO CREADO Y ESTÁ LISTO PARA EJECUTARSE,
                              AUNQUE NO HAYA SIDO ELEGIDO PARA EMPEZAR A EJECUTARSE.
                                       
                    - LISTO/EJECUTABLE:
                            - EL HILO ENTRARÁ EN ESTE ESTADO CUANDO NOSOTROS INDIQUEMOS, 
                              CON SU MÉTODO CORESPONDIENTE, 
                              QUE ESTÁ LISTO PARA POSER EJECUTARSE.
                                       
                    - EN EJECUCIÓN:
                            - EN ESTE ESTADO, EL HILO ESTÁ LISTO PARA EJECUTARSE
                              Y EL SISTEMA OPERATIVO LO HA SELECCIONADO PARA QUE SE EJECUTE.
                                       
                    - BLOQUEADO/EN ESPERA:
                            - EL HILO ENTRA EN ESTE ESTADO CUANDO NECESITE ALGUNOS RECURSOS 
                              DE ENTRADA/SALIDA QUE DEBE PROPORCIONARLE
                              EL USUARIO O EL PROPIO SISTEMA OPERATIVO.
                                    - EN ESTE ESTADO, NO SE LE VA A ASIGNAR TIEMPO DE CPU AL HILO,
                                      AUNQUE ESTARÁ LISTO PARA VOLVER A SER USADO.
                            
                    - FINALIZADO/TERMINADO:
                            - CUANDO EL HILO TERMINA SU EJECUCIÓN, PASA A ESTE ESTADO,
                              EN ESPERA DE QUE EL SISTEMA OPERATIVO LO DESTRUYA Y LIBERE RECURSOS.

        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_07 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_07 + """
        **********************************************************************************************************************************
                                       
            - CLASE Thread:
                    - CREA HILOS CON EL CÓDIGO QUE QUERAMOS QUE SE EJECUTEN.
                    - LAS CLASES QUE QUERAMOS QUE SEAN HILOS DEBERÁN HEREDAR DE ESTA CLASE Thread.
                                       
            - INTERFAZ Runnable:
                    - PERMITE AÑADIR LA FUNCIONALIDAD DE HILO A CUALQUIER OTRA CLASE,
                      SIMPLEMENTE IMPLEMENTANDO LA INTERFAZ Runnable.                   
                                       
            - CLASE ThreadDeath:                           
                    - PERMITE MANEJAR Y NOTIFICAR ERRORES EN EL USO DE LOS HILOS/HEBRAS/THREAD.
                    - HEREDA DE LA CLASE ERROR.
                                       
            - CLASE ThreadGroup:
                    - PERMITE MANEJAR UN GRUPO DE HILOS DE FORMA CONJUNTA,
                      HACIENDO QUE SE EJECUTEN DE FORMA MÁS EFICIENTE.
                                       
            - A SU VEZ, DENTRO DE LA CLASE Thread, ENCONTRAREMOS LOS SIGUIENTES MÉTODOS PRINCIPALES:
                                       
                    - new()      -->  ESTE MÉTODO CREARÁ UN HILO.
                    - start()    -->  INDICA QUE EL HILO ESTÁ LISTO PARA EJECUTARSE.
                    - run()      -->  EJECUTA EL HILO, QUE EMPEZARÁ A EJECUTARSE DE FORMA PARALELA.
                    - sleep()    -->  BLOQUEA AL HILO UNA CANTIDAD DE TIEMPO DADA EN MILISEGUNDOS.
                    - wait()     -->  HACE QUE EL HILO ESPERE LA EJECUCIÓN DE OTRA TAREA PARA VOLVER A EJECUTARSE.
                    - getState() -->  DEVUELVE EL ESTADO EN EL QUE SE ENCUENTRA ACTUALMENTE EL HILO.

        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    
    public static void recurso(String opcion) {
        
        String menu="";
        do {
            switch (opcion) {                
                case "1" -> System.out.println(recurso_01);
                case "2" -> System.out.println(recurso_02);
                case "3" -> System.out.println(recurso_03);
                case "4" -> System.out.println(recurso_04);
                case "5" -> System.out.println(recurso_05); 
                case "6" -> System.out.println(recurso_06);
                case "7" -> System.out.println(recurso_07);
                case "8" -> {
                    System.out.println(recurso_01);
                    continuar();
                    System.out.println(recurso_02);
                    continuar();
                    System.out.println(recurso_03);
                    continuar();
                    System.out.println(recurso_04);
                    continuar();
                    System.out.println(recurso_05);
                    continuar();
                    System.out.println(recurso_06);
                    continuar();
                    System.out.println(recurso_07);
                }
            }
            try {                
                menu = miTryRecursos();                
                switch (menu) {                   
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