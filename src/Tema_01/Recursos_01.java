package Tema_01;

import static Principal_Main.Main.esperar;
import static Principal_Main.Main.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class Recursos_01 {
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        *   PROGRAMACIÓN DE SERVICIOS Y PROCESOS.            TEMA 1:   TIPOS DE PROGRAMACIÓN.                                  *
        ************************************************************************************************************************
                                  CONCEPTOS BÁSICOS I. PROGRAMA, PROCESO, SERVICIO.
                                       
            - PROGRAMA:
                    - INFORMACIÓN, TANTO DE CÓDIGO COMO DE DATOS, ALMACENADA EN DISCO DE UNA APLICACIÓN
                      Y QUE NOS RESOLVERÁ UN PROBLEMA CONCRETO.
                    - UN PROGRAMA PUEDE LANZAR UNO O VARIOS PROCESOS.
                                       
            - PROCESO:
                    - PROGRAMA EN EJECUCIÓN.
                    - UN PROCESO SE CREA CUANDO EJECUTAMOS UN PROGRAMA.
                            - UN PROGRAMA ES EN CIERTO MODO UN PROCESO.
                    - UN PROCESO NO SE REFIERE SÓLO AL CÓDIGO Y LOS DATOS:
                            - INCLIYE TODO LO NECESARIO PARA QUE SE EJECUTE.
                    - CADA PROCESO ES UNA ENTIDAD INDEPENDIENTE DE TODO LO DEMÁS,
                      AUNQUE SE EJECUTE EN UN MISMO PROGRAMA.
                                       
            - SERVICIOS: (O DEMONIOS)
                    - PROCESOS QUE NO SON INTERCTIVOS, PERO QUE SE ESTÁN EJECUTANDO CONTINUAMENTE.
                    - LOS CONTROLA EL SISTEMA, SIN INTERMEDIACIÓN DEL USUARIO.
                            - PARA EL USUARIO PASAN DESAPERCIBIDOS.
                    - PROPORCIONAN UN SERVIO BÁSICO PARA EL RESTO DE PROCESOS.
                    - EL SISTEMA OPERATIVO TIENE SUS PROPIOS SERVICIOS Y LOS ARRANCARÁ AUTOMÁTICAMENTE EN SU INICIACIÓN.
                    - SE SUELE DECIR QUE SE EJECUTAN EN SEGUNDO PLANO. BACKGROUND.
                    - UN PROCESO PUEDE TENER UNO O VARIOS SERVICIOS.
                                       
        ************************************************************************************************************************
        *  0. SALIR.                                                                                                           *
        ************************************************************************************************************************
                               
                               """;
    
    private static String recurso_02 = """                          
                               
        ************************************************************************************************************************
        *   PROGRAMACIÓN DE SERVICIOS Y PROCESOS.            TEMA 1:   TIPOS DE PROGRAMACIÓN.                                  *
        ************************************************************************************************************************
                                  CONCEPTOS BÁSICOS II. HILOS Y EJECUTABLE.

            - HILOS: (HEBRA O THREAD)
                    - ES CADA UNA DE LAS TAREAS QUE PODEMOS EJECUTAR EN PARALELO A OTRAS TAREAS.
                            - EN PARALELO: --> SIMULTÁNEAMENTE, AL MISMO TIEMPO.
                    - SE UTILIZAN PARA APLICACIONES QUE DEBEN REALIZAR VARIAS FUNCIONES A LA VEZ.
                            - TODOS LOS HILOS SE EJECUTAN AL MISMO TIEMPO.
                                    --> LA TAREA QUE EJECUTAN SE REALIZARÁ MUCHO MÁS RÁPIDO.
                    - LOS PROGRAMAS DE FLUJO MÚLTIPLE:
                            - SON LOS PROGRAMAS QUE SE EJECUTAN MEDIANTE VARIOS HILOS.
                    - LOS PROGRAMAS DE FLUJO ÚNICO:
                            - SON LOS PROGRAMAS QUE SE EJECUTAN MEDIANTE UN SOLO HILO.
                    - FORMAN PARTE DE UN MISMO PROCESO TODOS LOS HILOS QUE COMPARTEN LOS MISMOS RECURSOS.
                            - RECURSOS:
                                    - ESPACIO DE MEMORIA, LOS ARCHIVOS ABIERTOS,
                                      LOS PUERTOS PARA LA COMUNICACIÓN EN RED O UNA BASE DE DATOS.
                            - CUALQUIER HILO QUE FORME PARTE DEL MISMO PROCESO,
                              PUEDE ACCEDER A ESTOS RECURSOS Y MODIFICARLOS;
                              HAY QUE CONTROLARLO PARA EVITAR ERRORES.
                    - PROCESO PADRE:
                            - CONTEXTO DEL PROCESO, DENTRO DEL CUÁL SE EJECUTA UN HILO.
                    - UN PROCESO FORMADO POR VARIOS HILOS
                      VA A SEGUIR EN EJECUCIÓN MIENTRAS ALGUNO DE SUS HILOS SIGA ACTIVO.
                            - HASTA QUE TODOS SUS HILOS FINALIZAN,
                              NO FINALIZA EL PROCESO Y TODOS LOS RECURSOS EN USO SE LIBERAN.                              

            - EJECUTABLE:
                    - ES UN FICHERO QUE CONTIENE TODA LA INFORMACIÓN NECESARIA
                      PARA CREAR UN PROCESO USANDO LOS DATOS ALMACENADOS DE UN PROGRAMA.
                    - PERMITE PONER EL PROGRAMA EN EJECUCIÓN COMO UN PROCESO.

        ************************************************************************************************************************
        *  0. SALIR.                                                                                                           *
        ************************************************************************************************************************
                               
                               """;
    
    private static String recurso_03 = """                          
                               
        ************************************************************************************************************************
        *   PROGRAMACIÓN DE SERVICIOS Y PROCESOS.            TEMA 1:   TIPOS DE PROGRAMACIÓN.                                  *
        ************************************************************************************************************************
                                  PROGRAMACIÓN CONCURRENTE.

            - PROGRAMACIÓN CONCURRENTE:
                    - PROGRAMACIÓN PARA EJECUTAR AL MISMO TIEMPO VARIAS TAREAS INTERACTIVAS.
                    - PROPORCIONA MECANISMOS DE COMUNICACIÓN Y SINCRONIZACIÓN ENTRE PROCESOS.
                    - PERMITE AHORRAR TIEMPO, QUE PERDERIAMOS SI LAS TAREAS SE HICIERAN UNA TRAS OTRA.
                    - LAS TAREAS DE LA PROGRAMACIÓN CONCURRENTE SE LLAMARÁN DIFERENTE
                      SEGÚN SE EJECUTE EN UN PROCESADOR CON UNO O VARIOS NÚCLEOS.
                            - MULTIPROGRAMACIÓN:
                                    - EJECUCIÓN EN UN ÚNICO PROCESADOR, O CON UN ÚNICO NÚCLEO.
                                    - PARA EL USUARIO PARECE QUE SE EJECUTAN VARIOS PROCESOS AL MISMO TIEMPO,
                                      PERO AL EXISTIR UN ÚNICO PROCESADOR, EN REALIDAD SOLO SE PUEDE ESTAR
                                      EJECUTANDO UN ÚNICO PROCESO EN CADA INSTANTE DE TIEMPO.
                                    - EL SISTEMA OPERATIVO CAMBIA EL PROCESO EN EJECUCIÓN, ENTRE LOS DIFERENTES PROCESOS QUE SE
                                      DEBEN EJECUTAR, CADA CIERTO TIEMPO, MILISEGUNDOS, DANDO LA IMPRESIÓN QUE SE EJECUTAN
                                      AL MISMO TIEMPO, CUANDO NO ES CIERTO.
                                    - ESTA ESTRATEGIA NO MEJORA EL TIEMPO DE EJECUCIÓN GLOBAL DE LOS PROGRAMAS,
                                      SOLO PERMITE QUE VARIOS PROGRAMAS TENGAN LA APARIENCIA DE QUE SE EJECUTAN AL MISMO TIEMPO.
                            - MULTITAREA:
                                    - VARIOS NÚCLEOS EN UN MISMO PROCESADOR.
                                    - CADA UNO DE ESOS NÚCLEOS PODRÍA ESTAR EJECUTANDO UNA INSTRUCCIÓN DIFERENTE AL MISMO TIEMPO.
            
                                    - PROGRAMACIÓN PARALELA:
                                            - SISTEMA CON VARIOS PROCESADORES.
                                            - ES UN TIPO ESPECIAL DE PROGRAMACIÓN CONCURRENTE MULTITAREA.
                                            - PERMITE LA EJECUCIÓN SIMULTANEA DE UNA O VARIAS TAREAS DE UN PROCESO.

        ************************************************************************************************************************
        *  0. SALIR.                                                                                                           *
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_04 =  """                          
                               
        ************************************************************************************************************************
        *   PROGRAMACIÓN DE SERVICIOS Y PROCESOS.            TEMA 1:   TIPOS DE PROGRAMACIÓN.                                  *
        ************************************************************************************************************************
                                  PROGRAMACIÓN PARALELA.   MULTIHILO, MULTIHEBRA O MULTITHREADING.

            - PROGRAMACIÓN PARALELA:
                    - ES UN TIPO ESPECIAL DE PROGRAMACIÓN CONCURRENTE PORQUE PERSIGUE EJECUTAR VARIAS TAREAS AL MISMO TIEMPO.
                            - SU PECULIARIDAD ES QUE SOLO SE PUEDE UTILIZAR EN SISTEMAS MULTIPROCESADOR, CON MÁS DE UN NÚCLEO
                              EN SU MICROPROCESADOR, PORQUE DE FORMA NATIVA PERMITEN LA EJECUCIÓN SIMULTANEA DE UNA O VARIAS
                              TAREAS DE UN PROCESO.
                                        
            - VENTAJAS:
                    - PERMITE MEJORAR EL RENDIMIENTO DE NUESTROS PROGRAMAS SI IMPLEMENTAMOS DE FORMA CORRECTA LA TÉCNICA.
                    - OBJETIVO: EJECUCIÓN DE CADA UNA DE LAS TAREAS EN UN NÚCLEO/PROCESADOR DIFERENTE.
                    - ESTAS TAREAS PODRÁN COOPERAR ENTRE SÍ, POR LO QUE RESUELVEN EL PROBLEMA MUCHÍSIMO MÁS RÁPIDO.
                                        
            - INCONVENIENTES:
                    - COMPLEJIDAD DEL DISEÑO DE SUS ALGORITMOS EN LA PARTE DE COMUNICACIÓN DE LOS DISTINTOS PROCESOS O HILOS.
                            - OPCIONES: SEMÁFOROS, INTERBLOQUEOS, ALGORITMOS DE EXCLUSIÓN MUTUA, ETC...
                                        
            - ARQUITECTURA QUE UTILIZAN PROGRAMACIÓN PARALELA:
                    - SISTEMAS MULTINÚCLEO: TODOS LOS MICROPROCESADORES ACTUALES.
                    - MICROPROCESADORES ESPECÍFICOS: PROCESADORES GRÁFICOS, PARA VIDEOJUEGOS, EMBEBIDOS, ETC...
                                        
            - TIPOS DE PARALELISMO:
                    - GRANO FINO: AUTOMÁTICO, ADECUADO SI LAS SUBTAREAS SE COMUNICAN MUCHAS VECES POR SEGUNDO.
                    - GRANO GRUESO: MANUAL, A NIVEL DE CÓDIGO, ADECUADO SI LAS SUBTAREAS NO SE COMUNICAN MUCHAS VECES POR SEGUNDO.

        ************************************************************************************************************************
        *  0. SALIR.                                                                                                           *
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_05 = """                          
                               
        ************************************************************************************************************************
        *   PROGRAMACIÓN DE SERVICIOS Y PROCESOS.            TEMA 1:   TIPOS DE PROGRAMACIÓN.                                  *
        ************************************************************************************************************************
                                            PROGRAMACIÓN DISTRIBUIDA. (EN VARIOS EQUIPOS).

            - SISTEMAS DISTRIBUIDOS:
                    - CONJUNTO DE ORDENADORES INTERCONECTADOS, COMPARTIENDO UN MISMO ESTADO 
                      Y DANDO LA IMPRESIÓN DE QUE SON UN ÚNICO SISTEMA,
                      CON EL OBJETIVO DE COMPARTIR RECURSOS.
                            - EL SISTEMA DISTRIBUIDO MÁS CONOCIDO POR TODOS ES LA RED DE INTERNET.

            - PROGRAMACIÓN DISTRIBUIDA:
                    - SE DA EN SISTEMAS DISTRIBUIDOS.
                    - ESTÁ ENFOCADA A DESARROLLAR SOFTWARE ABIERTO, ESTABLE, TRANSPARENTE Y MUY TOLERANTE A FALLOS,
                      UTILIZABLE EN ESOS MISMOS SISTEMAS DISTRIBUIDOS.
                    - ARQUITECTURA HARDWARE: CLIENTE-SERVIDOR.
                      SISTEMAS DONDE SE UTILIZA ARQUITECTURA Y PROGRAMACIÓN DISTRIBUIDA. (SEGÚN LA POTENCIA INDIVIDUAL).
                            - REDES CLUSTER:
                                    - PUEDEN SER ORDENADORES DOMESTICOS.
                                    - LOS MICROPROCESADORES DE VARIOS ORDENADORES CON CONEXIONES DE ALTA VELOCIDAD ENTRE SÍ,
                                      A TRAVÉS DE REDES DE ÁREA LOCAL.
                            - SUPERCOMPUTADORES:
                                    - SISTEMAS COMPUTACIONALES MUY POTENTES.
                                    - TAREAS QUE NECESITAN UNA ENORME CAPACIDAD DE CÁLCULO, COMO MILITARES, METEOROLOGÍA, ETC...
                            - GRID COMPUTING: 
                                    - ORDENADORES MUY POTENTES EN RED ENTRE SÍ.
                            - CLOUD COMPUTING:
                                    - SISTEMAS DONDE PODREMOS TENER VARIOS RECURSOS O SERVICIOS. (COMO EL ESPACIO DE ALMACENAMIENTO).
                                            - LAS MÁQUINAS QUE OFRECEN ESE SERVICIO PUEDEN ESTAR EN DIFERENTES PARTES DEL MUNDO
                                              Y ESTÁN INTERCONECTADAS.   

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
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                switch (menu) {
                   
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