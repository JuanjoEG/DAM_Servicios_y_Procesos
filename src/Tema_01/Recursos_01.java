package Tema_01;

import static Principal_Main.Main.esperar;
import static Principal_Main.Main.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Recursos_01 {
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        *   PROGRAMACI�N DE SERVICIOS Y PROCESOS.            TEMA 1:   TIPOS DE PROGRAMACI�N.                                  *
        ************************************************************************************************************************
                                  CONCEPTOS B�SICOS I. PROGRAMA, PROCESO, SERVICIO.
                                       
            - PROGRAMA:
                    - INFORMACI�N, TANTO DE C�DIGO COMO DE DATOS, ALMACENADA EN DISCO DE UNA APLICACI�N
                      Y QUE NOS RESOLVER� UN PROBLEMA CONCRETO.
                    - UN PROGRAMA PUEDE LANZAR UNO O VARIOS PROCESOS.
                                       
            - PROCESO:
                    - PROGRAMA EN EJECUCI�N.
                    - UN PROCESO SE CREA CUANDO EJECUTAMOS UN PROGRAMA.
                            - UN PROGRAMA ES EN CIERTO MODO UN PROCESO.
                    - UN PROCESO NO SE REFIERE S�LO AL C�DIGO Y LOS DATOS:
                            - INCLIYE TODO LO NECESARIO PARA QUE SE EJECUTE.
                    - CADA PROCESO ES UNA ENTIDAD INDEPENDIENTE DE TODO LO DEM�S,
                      AUNQUE SE EJECUTE EN UN MISMO PROGRAMA.
                                       
            - SERVICIOS: (O DEMONIOS)
                    - PROCESOS QUE NO SON INTERCTIVOS, PERO QUE SE EST�N EJECUTANDO CONTINUAMENTE.
                    - LOS CONTROLA EL SISTEMA, SIN INTERMEDIACI�N DEL USUARIO.
                            - PARA EL USUARIO PASAN DESAPERCIBIDOS.
                    - PROPORCIONAN UN SERVIO B�SICO PARA EL RESTO DE PROCESOS.
                    - EL SISTEMA OPERATIVO TIENE SUS PROPIOS SERVICIOS Y LOS ARRANCAR� AUTOM�TICAMENTE EN SU INICIACI�N.
                    - SE SUELE DECIR QUE SE EJECUTAN EN SEGUNDO PLANO. BACKGROUND.
                    - UN PROCESO PUEDE TENER UNO O VARIOS SERVICIOS.
                                       
        ************************************************************************************************************************
        *  0. SALIR.                                                                                                           *
        ************************************************************************************************************************
                               
                               """;
    
    private static String recurso_02 = """                          
                               
        ************************************************************************************************************************
        *   PROGRAMACI�N DE SERVICIOS Y PROCESOS.            TEMA 1:   TIPOS DE PROGRAMACI�N.                                  *
        ************************************************************************************************************************
                                  CONCEPTOS B�SICOS II. HILOS Y EJECUTABLE.

            - HILOS: (HEBRA O THREAD)
                    - ES CADA UNA DE LAS TAREAS QUE PODEMOS EJECUTAR EN PARALELO A OTRAS TAREAS.
                            - EN PARALELO: --> SIMULT�NEAMENTE, AL MISMO TIEMPO.
                    - SE UTILIZAN PARA APLICACIONES QUE DEBEN REALIZAR VARIAS FUNCIONES A LA VEZ.
                            - TODOS LOS HILOS SE EJECUTAN AL MISMO TIEMPO.
                                    --> LA TAREA QUE EJECUTAN SE REALIZAR� MUCHO M�S R�PIDO.
                    - LOS PROGRAMAS DE FLUJO M�LTIPLE:
                            - SON LOS PROGRAMAS QUE SE EJECUTAN MEDIANTE VARIOS HILOS.
                    - LOS PROGRAMAS DE FLUJO �NICO:
                            - SON LOS PROGRAMAS QUE SE EJECUTAN MEDIANTE UN SOLO HILO.
                    - FORMAN PARTE DE UN MISMO PROCESO TODOS LOS HILOS QUE COMPARTEN LOS MISMOS RECURSOS.
                            - RECURSOS:
                                    - ESPACIO DE MEMORIA, LOS ARCHIVOS ABIERTOS,
                                      LOS PUERTOS PARA LA COMUNICACI�N EN RED O UNA BASE DE DATOS.
                            - CUALQUIER HILO QUE FORME PARTE DEL MISMO PROCESO,
                              PUEDE ACCEDER A ESTOS RECURSOS Y MODIFICARLOS;
                              HAY QUE CONTROLARLO PARA EVITAR ERRORES.
                    - PROCESO PADRE:
                            - CONTEXTO DEL PROCESO, DENTRO DEL CU�L SE EJECUTA UN HILO.
                    - UN PROCESO FORMADO POR VARIOS HILOS
                      VA A SEGUIR EN EJECUCI�N MIENTRAS ALGUNO DE SUS HILOS SIGA ACTIVO.
                            - HASTA QUE TODOS SUS HILOS FINALIZAN,
                              NO FINALIZA EL PROCESO Y TODOS LOS RECURSOS EN USO SE LIBERAN.                              

            - EJECUTABLE:
                    - ES UN FICHERO QUE CONTIENE TODA LA INFORMACI�N NECESARIA
                      PARA CREAR UN PROCESO USANDO LOS DATOS ALMACENADOS DE UN PROGRAMA.
                    - PERMITE PONER EL PROGRAMA EN EJECUCI�N COMO UN PROCESO.

        ************************************************************************************************************************
        *  0. SALIR.                                                                                                           *
        ************************************************************************************************************************
                               
                               """;
    
    private static String recurso_03 = """                          
                               
        ************************************************************************************************************************
        *   PROGRAMACI�N DE SERVICIOS Y PROCESOS.            TEMA 1:   TIPOS DE PROGRAMACI�N.                                  *
        ************************************************************************************************************************
                                  PROGRAMACI�N CONCURRENTE.

            - PROGRAMACI�N CONCURRENTE:
                    - PROGRAMACI�N PARA EJECUTAR AL MISMO TIEMPO VARIAS TAREAS INTERACTIVAS.
                    - PROPORCIONA MECANISMOS DE COMUNICACI�N Y SINCRONIZACI�N ENTRE PROCESOS.
                    - PERMITE AHORRAR TIEMPO, QUE PERDERIAMOS SI LAS TAREAS SE HICIERAN UNA TRAS OTRA.
                    - LAS TAREAS DE LA PROGRAMACI�N CONCURRENTE SE LLAMAR�N DIFERENTE
                      SEG�N SE EJECUTE EN UN PROCESADOR CON UNO O VARIOS N�CLEOS.
                            - MULTIPROGRAMACI�N:
                                    - EJECUCI�N EN UN �NICO PROCESADOR, O CON UN �NICO N�CLEO.
                                    - PARA EL USUARIO PARECE QUE SE EJECUTAN VARIOS PROCESOS AL MISMO TIEMPO,
                                      PERO AL EXISTIR UN �NICO PROCESADOR, EN REALIDAD SOLO SE PUEDE ESTAR
                                      EJECUTANDO UN �NICO PROCESO EN CADA INSTANTE DE TIEMPO.
                                    - EL SISTEMA OPERATIVO CAMBIA EL PROCESO EN EJECUCI�N, ENTRE LOS DIFERENTES PROCESOS QUE SE
                                      DEBEN EJECUTAR, CADA CIERTO TIEMPO, MILISEGUNDOS, DANDO LA IMPRESI�N QUE SE EJECUTAN
                                      AL MISMO TIEMPO, CUANDO NO ES CIERTO.
                                    - ESTA ESTRATEGIA NO MEJORA EL TIEMPO DE EJECUCI�N GLOBAL DE LOS PROGRAMAS,
                                      SOLO PERMITE QUE VARIOS PROGRAMAS TENGAN LA APARIENCIA DE QUE SE EJECUTAN AL MISMO TIEMPO.
                            - MULTITAREA:
                                    - VARIOS N�CLEOS EN UN MISMO PROCESADOR.
                                    - CADA UNO DE ESOS N�CLEOS PODR�A ESTAR EJECUTANDO UNA INSTRUCCI�N DIFERENTE AL MISMO TIEMPO.
            
                                    - PROGRAMACI�N PARALELA:
                                            - SISTEMA CON VARIOS PROCESADORES.
                                            - ES UN TIPO ESPECIAL DE PROGRAMACI�N CONCURRENTE MULTITAREA.
                                            - PERMITE LA EJECUCI�N SIMULTANEA DE UNA O VARIAS TAREAS DE UN PROCESO.

        ************************************************************************************************************************
        *  0. SALIR.                                                                                                           *
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_04 =  """                          
                               
        ************************************************************************************************************************
        *   PROGRAMACI�N DE SERVICIOS Y PROCESOS.            TEMA 1:   TIPOS DE PROGRAMACI�N.                                  *
        ************************************************************************************************************************
                                  PROGRAMACI�N PARALELA.   MULTIHILO, MULTIHEBRA O MULTITHREADING.

            - PROGRAMACI�N PARALELA:
                    - ES UN TIPO ESPECIAL DE PROGRAMACI�N CONCURRENTE PORQUE PERSIGUE EJECUTAR VARIAS TAREAS AL MISMO TIEMPO.
                            - SU PECULIARIDAD ES QUE SOLO SE PUEDE UTILIZAR EN SISTEMAS MULTIPROCESADOR, CON M�S DE UN N�CLEO
                              EN SU MICROPROCESADOR, PORQUE DE FORMA NATIVA PERMITEN LA EJECUCI�N SIMULTANEA DE UNA O VARIAS
                              TAREAS DE UN PROCESO.
                                        
            - VENTAJAS:
                    - PERMITE MEJORAR EL RENDIMIENTO DE NUESTROS PROGRAMAS SI IMPLEMENTAMOS DE FORMA CORRECTA LA T�CNICA.
                    - OBJETIVO: EJECUCI�N DE CADA UNA DE LAS TAREAS EN UN N�CLEO/PROCESADOR DIFERENTE.
                    - ESTAS TAREAS PODR�N COOPERAR ENTRE S�, POR LO QUE RESUELVEN EL PROBLEMA MUCH�SIMO M�S R�PIDO.
                                        
            - INCONVENIENTES:
                    - COMPLEJIDAD DEL DISE�O DE SUS ALGORITMOS EN LA PARTE DE COMUNICACI�N DE LOS DISTINTOS PROCESOS O HILOS.
                            - OPCIONES: SEM�FOROS, INTERBLOQUEOS, ALGORITMOS DE EXCLUSI�N MUTUA, ETC...
                                        
            - ARQUITECTURA QUE UTILIZAN PROGRAMACI�N PARALELA:
                    - SISTEMAS MULTIN�CLEO: TODOS LOS MICROPROCESADORES ACTUALES.
                    - MICROPROCESADORES ESPEC�FICOS: PROCESADORES GR�FICOS, PARA VIDEOJUEGOS, EMBEBIDOS, ETC...
                                        
            - TIPOS DE PARALELISMO:
                    - GRANO FINO: AUTOM�TICO, ADECUADO SI LAS SUBTAREAS SE COMUNICAN MUCHAS VECES POR SEGUNDO.
                    - GRANO GRUESO: MANUAL, A NIVEL DE C�DIGO, ADECUADO SI LAS SUBTAREAS NO SE COMUNICAN MUCHAS VECES POR SEGUNDO.

        ************************************************************************************************************************
        *  0. SALIR.                                                                                                           *
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_05 = """                          
                               
        ************************************************************************************************************************
        *   PROGRAMACI�N DE SERVICIOS Y PROCESOS.            TEMA 1:   TIPOS DE PROGRAMACI�N.                                  *
        ************************************************************************************************************************
                                            PROGRAMACI�N DISTRIBUIDA. (EN VARIOS EQUIPOS).

            - SISTEMAS DISTRIBUIDOS:
                    - CONJUNTO DE ORDENADORES INTERCONECTADOS, COMPARTIENDO UN MISMO ESTADO 
                      Y DANDO LA IMPRESI�N DE QUE SON UN �NICO SISTEMA,
                      CON EL OBJETIVO DE COMPARTIR RECURSOS.
                            - EL SISTEMA DISTRIBUIDO M�S CONOCIDO POR TODOS ES LA RED DE INTERNET.

            - PROGRAMACI�N DISTRIBUIDA:
                    - SE DA EN SISTEMAS DISTRIBUIDOS.
                    - EST� ENFOCADA A DESARROLLAR SOFTWARE ABIERTO, ESTABLE, TRANSPARENTE Y MUY TOLERANTE A FALLOS,
                      UTILIZABLE EN ESOS MISMOS SISTEMAS DISTRIBUIDOS.
                    - ARQUITECTURA HARDWARE: CLIENTE-SERVIDOR.
                      SISTEMAS DONDE SE UTILIZA ARQUITECTURA Y PROGRAMACI�N DISTRIBUIDA. (SEG�N LA POTENCIA INDIVIDUAL).
                            - REDES CLUSTER:
                                    - PUEDEN SER ORDENADORES DOMESTICOS.
                                    - LOS MICROPROCESADORES DE VARIOS ORDENADORES CON CONEXIONES DE ALTA VELOCIDAD ENTRE S�,
                                      A TRAV�S DE REDES DE �REA LOCAL.
                            - SUPERCOMPUTADORES:
                                    - SISTEMAS COMPUTACIONALES MUY POTENTES.
                                    - TAREAS QUE NECESITAN UNA ENORME CAPACIDAD DE C�LCULO, COMO MILITARES, METEOROLOG�A, ETC...
                            - GRID COMPUTING: 
                                    - ORDENADORES MUY POTENTES EN RED ENTRE S�.
                            - CLOUD COMPUTING:
                                    - SISTEMAS DONDE PODREMOS TENER VARIOS RECURSOS O SERVICIOS. (COMO EL ESPACIO DE ALMACENAMIENTO).
                                            - LAS M�QUINAS QUE OFRECEN ESE SERVICIO PUEDEN ESTAR EN DIFERENTES PARTES DEL MUNDO
                                              Y EST�N INTERCONECTADAS.   

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