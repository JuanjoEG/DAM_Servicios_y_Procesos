package Tema_02;

import Tema_01.*;
import static Principal_Main.Main.esperar;
import static Principal_Main.Main.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class Recursos_02 {
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        *   PROGRAMACIÓN DE SERVICIOS Y PROCESOS.            TEMA 2:   PROCESOS.                                               *
        ************************************************************************************************************************
                                  INTRODUCCIÓN A LOS PROCESOS.
                                       
            - PROCESO:
                    - PROGRAMA EN EJECUCIÓN.
                    - UN PROCESO SE CREA CUANDO EJECUTAMOS UN PROGRAMA.
                            - UN PROGRAMA ES EN CIERTO MODO UN PROCESO.
                    - UN PROCESO NO SE REFIERE SÓLO AL CÓDIGO Y LOS DATOS:
                            - INCLIYE TODO LO NECESARIO PARA QUE SE EJECUTE.
                    - CADA PROCESO ES UNA ENTIDAD INDEPENDIENTE DE TODO LO DEMÁS,
                      AUNQUE SE EJECUTE EN UN MISMO PROGRAMA.
                    - ES UNA ACTIVIDAD CARACTERIZADA POR:
                            - EJECUCIÓN DE UNA LISTA ORDENADA DE INSTRUCCIONES.
                            - TIENE UN ESTADO ACTUAL.
                            - UTILIZA UN CONJUNTO DE RECURSOS DEL SISTEMA.
                                       
            - TODOS LOS SISTEMAS OPERATIVOS MODERNOS TIENEN LA CAPACIDAD NECESARIA PARA EJECUTAR VARIOS PROCESOS A LA VEZ.
              EL SISTEMA OPERATIVO REALIZA LA GESTIÓN DE LA MULTITAREA PARA QUE:
                    - LOS PROCESOS PUEDAN COMPARTIR UN NÚCLEO DEL MICROPROCESADOR O VARIOS.
                    - LAS TAREAS SE EJECUTAN UNA TRAS OTRA HASTA EL FINAL, O POCO A POCO CADA TAREA.                                       
                                       
        ************************************************************************************************************************
        *  0. SALIR.                                                                                                           *
        ************************************************************************************************************************
                               
                               """;
    
    private static String recurso_02 = """                          
                               
        ************************************************************************************************************************
        *   PROGRAMACIÓN DE SERVICIOS Y PROCESOS.            TEMA 2:   PROCESOS.                                               *
        ************************************************************************************************************************
                                  TIPOS DE PROCESO SEGÚN EL MODO Y ORIGEN DE EJECUCIÓN.

            - SI NOS FIJAMOS EN EL MODO DE EJECUCIÓN DE LOS PROCESOS,
              Y SI NECESITAN O NO DEL USUARIO, LOS PODEMOS DIFERENCIAR EN:
                                       
                    -PROCESOS INTERACTIVOS:
                            - EL USUARIO INTERACTUA CON EL PROCESO,
                              NORMALMENTE PARA APORTAR INFORMACIÓN NECESARIA
                              PARA LA EJECUCIÓN DEL PROCESO.
                                       
                    - PROCESO POR LOTES:
                            - EL USUARIO NO ESTÁ TAN INTERESADO EN LA EJECUCIÓN,
                              SINO SIMPLEMENTE EN LANZAR EL PROCESO AL PRINCIPIO,
                              Y COMPROBAR AL FINAL EL RESULTADO DE LA EJECUCIÓN.
                                       
                    - PROCESO EN TIEMPO REAL:
                            - SON UN TIPO ESPECIAL DE PROCESO,
                              EN LO QUE LO MÁS IMPORTANTE ES
                              EL TIEMPO DE RESPUESTA POR PARTE DEL SISTEMA.
                                       
            - SI NOS FIJAMOS EN CUÁL ES EL ORIGEN DE LOS PROCESOS,
              Y QUIÉN ES EL QUE LOS LANZA, HAY DOS TIPOS:
                    
                    - PROCESO EN MODO USUARIO:
                            - QUE LANZA EL PROPIO USUARIO. SON LOS MÁS NORMALES.
                                     
                    - PROCESO MODO KERNEL:
                            - LOS EJECUTA EL PROPIO NÚCLEO DEL SISTEMA OPERATIVO, DE FORMA AUTOMÁTICA.
                            - EN GENERAL, EL USUARIO NO LOS PUEDE CONTROLAR.
                            - REALIZAN LAS TAREAS MÁS DELICADAS: GESTIÓN DE MEMORIA, TRAFICO DE RED, ETC...

        ************************************************************************************************************************
        *  0. SALIR.                                                                                                           *
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_03 = """                          
                               
        ************************************************************************************************************************
        *   PROGRAMACIÓN DE SERVICIOS Y PROCESOS.            TEMA 2:   PROCESOS.                                               *
        ************************************************************************************************************************
                                  ESTADOS DE UN PROCESO.

            - EN EL SISTEMA HABRÁ UN PLANIFICADOR (SCHEDULER) QUE CREA Y PONE EN EJECUCIÓN LOS PROCESOS.
                                       
            - EL CICLO DE VIDA DE UN PROCESO SON UNA SERIE DE ESTADOS
              POR LOS QUE PASARÁ EL PROCESO A LO LARGO DE SU EJECUCIÓN,
              Y TIENE QUE CUMPLIR VARIAS CONDICIONES PARA PASAR DE UN ESTADO A OTRO:
                    
                    - NUEVO:
                            -EL PROCESO SE CREA A PARTIR DE UN FICHERO EJECUTABLE.
                                       
                    - LISTO:
                            - EL PROCESO ESTÁ CREADO, Y TIENE TODO LO QUE NECESITA PARA EJECUTARSE,
                              PERO ESTÁ A LA ESPERA QUE EL PLANIFICADOR LE DÉ TIEMPO/TURNO DE EJECUCIÓN.
                                       
                    - EN EJECUCIÓN:
                            - EL PLANIFICADOR DEL SISTEMA OPERATIVO, ELIGE AL PROCESO PARA QUE SE EJECUTE,
                              Y LE DA UN TIEMPO DE TURNO DE EJECUCIÓN (QUANTUM).
                              EL PROCESO SIGUE EJECUTANDOSE HASTA QUE:
                                    - FINALIZA SU ÚLTIMA INSTRUCCIÓN, PASANDO AL ESTADO  -->  TERMINADO.
                                    - CUMPLA SU TIEMPO MÁXIMO DE EJECUCIÓN, QUANTUM,
                                      SIN HABER ACABADO SUS INSTRUCCIONES, PASANDO AL ESTADO  -->  LISTO.
                                    - EL PLANIFICADOR, POR CUALQUIER MOTIVO, LO ABORTA,
                                      LO TERMINA ANTES DE ACABADO SUS INSTRUCCIONES, PASANDO AL ESTADO  -->  TERMINADO.
                                    - SI EL PROCESO NECESITA ALGÚN RECURSO, LO PODRÁ PEDIR MEDIANTE INTERUPCIONES
                                      Y PASARÁ AL ESTADO  -->  EN ESPERA. (O BLOQUEADO).
                                       
                    - BLOQUEADO/EN ESPERA:
                            - CUANDO EL PROCESO CONSIGUE EL RECURSO QUE NECESITABA, VOLVERÁ AL ESTADO  -->  LISTO.
                            
                    - TERMINADO:
                            - EL PROCESO HA FINALIZADO SU EJECUCIÓN Y LIBERA TODOS LOS RECURSOS QUE ESTABA ACAPARANDO,
                              ESPERANDO QUE EL SISTEMA OPERATIVO LO DESTRUYA.

        ************************************************************************************************************************
        *  0. SALIR.                                                                                                           *
        ************************************************************************************************************************
                               
                               """;
    
    private static String recurso_04 = """                          
                               
        ************************************************************************************************************************
        *   PROGRAMACIÓN DE SERVICIOS Y PROCESOS.            TEMA 2:   PROCESOS.                                               *
        ************************************************************************************************************************
                                  GESTIÓN DE PROCESOS.   EL SISTEMA OPERATIVO, RESPONSABLE PRINCIPAL.

            - EL ENCARGADO PRINCIPAL DE TODA LA GESTIÓN DE PROCESOS ES EL SISTEMA OPERATIVO,
              NORMALMENTE SIGUIENDO INSTRUCCIONES DE UN USUARIO:
                    - EL USUARIO SIMPLEMENTE ABRE UN PROGRAMA.
                    - EL SISTEMA OPERATIVO CREA EL PROCESO, LO PONE EN EJECUCIÓN,
                      LO COORDINA CON EL RESTO DE PROCESOS, ETC...
                                       
            - EXISTEN 4 EVENTOS QUE VAN A PROVOCAR LA CREACIÓN DE UN PROCESO:
                    - EL ARRANQUE DEL SISTEMA.
                    - UNA PETICIÓN DE USUARIO PARA CREAR UN PROCESO.
                    - LA EJECUCIÓN, DESDE UN PROCESO, DE UNA LLAMADA AL SISTEMA
                      PARA LA CREACIÓN DE OTRO PROCESO.
                    - EL INICIO DE UN FICHERO POR LOTES,
                      NORMALMENTE SOLICITADO POR EL USUARIO.
                                       
            - CUANDO EL PROCESADOR, MEDIANTE LA ORDEN DEL PLANIFICADOR DEL SISTEMA OPERATIVO,
              PASA A EJECUTAR UN NUEVO PROCESO, EL SISTEMA OPERATIVO:
                    1. GUARDA TODO EL CONTEXTO QUE TIENE EL PROCESO ACTUAL.
                    2. RESTAURA EL CONTEXTO QUE TENÍA EL PROCESO
                       QUE EL PLANIFICADOR DE PROCESOS HA DECIDIDO EJECUTAR.
                    3. CONTROLA TODA LA COMUNICACIÓN Y SINCRONIZACIÓN ENTRE LOS PROCESOS.
                    4. TAMBIÉN SE ENCARGA DE LA ELIMINACIÓN Y TERMINACIÓN DE ÉSTOS PROCESOS.

        ************************************************************************************************************************
        *  0. SALIR.                                                                                                           *
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_05 =  """                          
                               
        ************************************************************************************************************************
        *   PROGRAMACIÓN DE SERVICIOS Y PROCESOS.            TEMA 2:   PROCESOS.                                               *
        ************************************************************************************************************************
                       GESTIÓN DE PROCESOS. GESTIÓN DE LA EJECUCIÓN CONCURRENTE MEDIANTE 'COLAS'.

            - LOS SISTEMAS OPERATIVOS ACTUALES PERMITEN LA MULTIPROGRAMACIÓN:
              ADMITEN LA EJECUCIÓN DE VARIOS PROCESOS EN MEMORIA PARA MAXIMIZAR EL USO DEL PROCESADOR.
                    - LOS PROCESOS IRÁN INTERCAMBIÁNDOSE CON LOS QUE ESTÁN EN EJECUCIÓN.
                    - TODOS USARÁN IGUAL EL PROCESADOR, EJECUCIÓN CONCURRENTE DE PROCESOS.
                                        
            - PARA ESTO, EL SISTEMA OPERATIVO ORGANIZA LOS PROCESOS EN VARIAS COLAS O LISTAS:
                                        
                    - COLA DE PROCESOS: 
                            - TODOS LOS PROCESOS QUE HAY EN EL SISTEMA.
                                        
                    - COLA DE PROCESOS PREPARADOS:
                            - TODOS LOS PROCESOS EN ESTADO 'LISTO'.
                            - ESTÁ ESPERANDO QUE EL PLANIFICADOR LOS SELECCIONE PARA EJECUTARSE.
                                        
                    - COLAS QUE CONTIENEN PROCESOS EN ESTADO 'BLOQUEADO':
                            - ESTÁN ESPERANDO ALGUNA OPERACIÓN DE ENTRADA/SALIDA.
                            - HABRÁ UNA COLA POR CADA DISPOSITIVO DE ENTRADA/SALIDA.

        ************************************************************************************************************************
        *  0. SALIR.                                                                                                           *
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_06 = """                          
                               
        ************************************************************************************************************************
        *   PROGRAMACIÓN DE SERVICIOS Y PROCESOS.            TEMA 2:   PROCESOS.                                               *
        ************************************************************************************************************************
                         PLANIFICACIÓN DE PROCESOS I:  TIPOS.         

            - EL PLANIFICADOR DE PROCESOS (SCHEDULER):
                    - DECIDE Y SELECCIONA, MEDIANTE UN ALGORITMO, LOS PROCESOS QUE VAN A EJECUTARSE EN EL PROCESADOR,
                      IMPONIENDO UN ORDEN DE EJECUCIÓN EN LAS COLAS.
                    - DECIDE QUÉ PROCESOS, DE LOS QUE ESTÉN LISTOS PARA SER EJECUTADOS, DEBEN INICIARSE Y EN QUÉ ORDEN.
                    - NO SE ENCARGAN DE CREAR LAS ESTRUCTURAS QUE COMPONEN LOS PROCESOS:
                      ESTAS ESTRUCTURAS SE CREAN SOLO UNA VEZ, CUANDO EL PROCESO SE CREA.
                                       
            - PRINCIPALMENTE, DOS TIPOS DE PLANIFICACIÓN QUE COEXISTEN:
                                       
                    - CORTO PLAZO:
                            - SELECCIONAN QUÉ PROCESO DE LA COLA DE PROCESOS PREPARADOS VA A PASAR A EJECUCIÓN.
                            - INVOCACIÓN MUY FRECUENTE, MILISEGUNDOS, EXIGE RAPIDEZ AL DECIDIR, ALGORITMOS SENCILLOS:
                                       
                                    - PLANIFICACIÓN SIN DESALOJO O COOPERATIVA:
                                            - SOLO SE CAMBIA EL PROCESO EN EJECUCIÓN SI SE HA BLOQUEADO O TERMINADO.
                                       
                                    - PLANIFICACIÓN APROPIATIVA:
                                            - UNE PLANIFICACIÓN COOPERATIVA Y CAMBIO DE PROCESO SI OTRO CON MAYOR PRIORIDAD
                                              PUEDE EJECUTARSE.
                                       
                                    - PLANIFICACIÓN DE TIEMPO COMPARTIDO:
                                            - CADA CIERTO TIEMPO (QUANTUM), QUITA EL PROCESO EN EJECUCIÓN
                                              Y SELECCIONA OTRO PROCESO. TODAS LAS PRIORIDADES SON CONSIDERADAS IGUALES.
                                       
                    - LARGO PLAZO:
                            - SELECCIONAN PROCESOS NUEVOS QUE DEBEN PASAR A LA COLA DE PREPARADOS,
                              SON INVOCADOS CON POCA FRECUENCIA, YA QUE SON MUY LENTOS.
                                       
            - EL MÓDULO PLANIFICADOR DE PROCESOS INCORPORA LAS POLÍTICAS Y MECANISMOS DEL SISTEMA OPERATIVO
              PARA EL DESICIÓN DE LOS PROCESOS QUE SE VAN A EJECUTAR.
                                       
            - EL PLANIFICADOR UTILIZA ALGORITMOS DE PLANIFICACIÓN PARA ASEGURAR EL MÁXIMO APROVECHAMIENTO:
                    - DAR SERVICIO A TODOS LOS PROCESOS EN EJECUCIÓN.
                    - NO DEJAR A NINGÚN PROCESO SIN EJECUTARSE.

        ************************************************************************************************************************
        *  0. SALIR.                                                                                                           *
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_07 = """                          
                               
        ************************************************************************************************************************
        *   PROGRAMACIÓN DE SERVICIOS Y PROCESOS.            TEMA 2:   PROCESOS.                                               *
        ************************************************************************************************************************
                                PLANIFICACIÓN DE PROCESOS II: ALGORITMOS DE PLANIFICACIÓN.

            - PRIMERO EN LLEGAR (FCFS O FIFO):
                    - LOS PROCESOS SE VAN EJECUTANDO SEGÚN SE CEEN, SIN NINGÚN OTRO CRITERIO.
                    
            - PRIORIDAD AL MÁS CORTO: (EN TIEMPO DE EJECUCIÓN).
                    - ORDENA SEGÚN EL TIEMPO DE EJECUCIÓN QUE NECESITEN, Y PRIORIZA EL QUE MENOS TIEMPO NECESITE.
                    - INANICIÓN: SI UN PROCESO NECESITA MUCHO TIEMPO
                      Y SIEMPRE ENTRAN OTROS QUE NECESITEN MENOS, NUNCA SE EJECUTARÁ.
            
            - PRIORIDAD AL MÁS LARGO: (EN TIEMPO DE EJECUCIÓN).
                    - ORDENA SEGÚN EL TIEMPO DE EJECUCIÓN QUE NECESITEN, Y PRIORIZA EL QUE MÁS TIEMPO NECESITE.
                    - INANICIÓN: SI UN PROCESO NECESITA POCO TIEMPO
                      Y SIEMPRE ENTRAN OTROS QUE NECESITEN MÁS, NUNCA SE EJECUTARÁ. 
                                       
            - ROUND ROBIN (TURNOS):
                    - EJECUTA CADA PROCESO DURANTE UN TIEMPO FIJO PARA TODOS, QUANTUM,
                      SACÁDOLOS DE EJECUCIÓN PASADO EL TIEMPO QUANTUM.
                    - TODOS LOS PROCESOS SE EJECUTARÁN POCO A POCO.
                                       
            - PLANIFICACIÓN POR PRIORIDAD:
                    - UTILIZA LA PRIORIDAD DE EJECUCIÓN DE LOS PROCESOS, EJECUTANDO ANTES EL MÁS PRIORITARIO.
                    - INANICIÓN: SI UN PROCESO TIENE POCA PRIORIDAD
                      Y SIEMPRE ENTRAN OTROS CON MAYOR PRIORIDAD, NUNCA SE EJECUTARÁ.
                                       
            - PLANIFICACIÓN DE COLAS MÚLTIPLES:
                    - ESTE TIPO DE PLANIFICADOR ES UNA MEZCLA DE TODOS LOS ANTERIORES.

        ************************************************************************************************************************
        *  0. SALIR.                                                                                                           *
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_08 = """                          
                               
        ************************************************************************************************************************
        *   PROGRAMACIÓN DE SERVICIOS Y PROCESOS.            TEMA 2:   PROCESOS.                                               *
        ************************************************************************************************************************
                                  CAMBIOS DE CONTEXTO.

            - CAMBIO DE CONTEXTO:
                    - EL SISTEMA OPERATIVO GUARDA DATOS DE SITUACIÓN DEL PROCESO QUE SALE DEL ESTADO 'EJECUTÁNDOSE',
                      EN DOS MOMENTOS:
                            - CUANDO LOS PROCESOS PASAN A 'LISTO'. SUCEDE MUY FRECUENTE.
                            - CUANDO LOS PROCESOS GENERAN UMA INTERUPCIÓN:
                              DESDE EJECUCIÓN NECESITAN UN RECURSO, Y PRODUCE LA INTERRUPCIÓN PARA QUE SE LE PROPORCIONE.
                                       
            - CADA VEZ QUE SE PRODUZCA UN CAMBIO DE CONTEXTO,
              EL SISTEMA OPERATIVO DEBE GUARDAR, AUTOMÁTICAMENTE:
                                       
                    - ESTADO EN EL QUE SE ENCONTRABA EL PROCESO.
                                       
                    - ESTADO DEL PROCESADOR:
                            -VALORES DE LOS REGISTROS DEL PROCESADOR EN EL MOMENTO DEL CAMBIO,
                             IMPORTANTE EL TENER PROCESADORES POTENTES.
                                       
                    - INFORMACIÓN DE GESTIÓN DE MEMORIA:
                            - ESPACIO DE MEMORIA QUE TENÍA RESERVADO EL PROCESO.
                                       
                    - CONTADOR DE PROGRAMA: 
                            - INDICA POR DÓNDE VA EJECUTÁNDOSE EL PROCESO,
                              Y PERMITIRÁ SEGUIR EJECUTANDO LA INSTRUCCIÓN DEL PROCESO DONDE SE QUEDÓ.
                                       
                    - PUNTERO DE PILA: 
                            - APUNTA A LA PARTE SUPERIOR DE LA PILA DE EJECUCIÓN DEL PROCESO.
                                       
            - DESPUÉS DE GUARDAR ESTA INFORMACIÓN DEL PROCESO SALIENTEM,
              EL SISTEMA OPERATIVO RESTAURA LOS DEL PROCESO QUE EL PLANIFICADOR HA DECIDIDO EJECUTAR.
                    - EL PROCESO QUE VUELVE A ENTRAR AL ESTADO 'EJECUTÁNDOSE'
                      PUEDE SEGUIR EJECUTÁNDOSE COMO SI NADA HUBIESE PASADO.
                                       
            - EL CAMBIO DE CONTEXTO ES 'TIEMPO PERDIDO' NO APROVECHADO:
              EL PROCESADOR NO HACE UN TRABAJO ÚTIL DURANTE ESE TIEMPO, NO PROCESA INSTRUCCIONES.

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
                case "8" -> System.out.println(recurso_08);
                
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