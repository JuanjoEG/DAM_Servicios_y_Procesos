package Tema_02;

import Tema_01.*;
import static Principal_Main.Main.esperar;
import static Principal_Main.Main.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Recursos_02 {
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        *   PROGRAMACI�N DE SERVICIOS Y PROCESOS.            TEMA 2:   PROCESOS.                                               *
        ************************************************************************************************************************
                                  INTRODUCCI�N A LOS PROCESOS.
                                       
            - PROCESO:
                    - PROGRAMA EN EJECUCI�N.
                    - UN PROCESO SE CREA CUANDO EJECUTAMOS UN PROGRAMA.
                            - UN PROGRAMA ES EN CIERTO MODO UN PROCESO.
                    - UN PROCESO NO SE REFIERE S�LO AL C�DIGO Y LOS DATOS:
                            - INCLIYE TODO LO NECESARIO PARA QUE SE EJECUTE.
                    - CADA PROCESO ES UNA ENTIDAD INDEPENDIENTE DE TODO LO DEM�S,
                      AUNQUE SE EJECUTE EN UN MISMO PROGRAMA.
                    - ES UNA ACTIVIDAD CARACTERIZADA POR:
                            - EJECUCI�N DE UNA LISTA ORDENADA DE INSTRUCCIONES.
                            - TIENE UN ESTADO ACTUAL.
                            - UTILIZA UN CONJUNTO DE RECURSOS DEL SISTEMA.
                                       
            - TODOS LOS SISTEMAS OPERATIVOS MODERNOS TIENEN LA CAPACIDAD NECESARIA PARA EJECUTAR VARIOS PROCESOS A LA VEZ.
              EL SISTEMA OPERATIVO REALIZA LA GESTI�N DE LA MULTITAREA PARA QUE:
                    - LOS PROCESOS PUEDAN COMPARTIR UN N�CLEO DEL MICROPROCESADOR O VARIOS.
                    - LAS TAREAS SE EJECUTAN UNA TRAS OTRA HASTA EL FINAL, O POCO A POCO CADA TAREA.                                       
                                       
        ************************************************************************************************************************
        *  0. SALIR.                                                                                                           *
        ************************************************************************************************************************
                               
                               """;
    
    private static String recurso_02 = """                          
                               
        ************************************************************************************************************************
        *   PROGRAMACI�N DE SERVICIOS Y PROCESOS.            TEMA 2:   PROCESOS.                                               *
        ************************************************************************************************************************
                                  TIPOS DE PROCESO SEG�N EL MODO Y ORIGEN DE EJECUCI�N.

            - SI NOS FIJAMOS EN EL MODO DE EJECUCI�N DE LOS PROCESOS,
              Y SI NECESITAN O NO DEL USUARIO, LOS PODEMOS DIFERENCIAR EN:
                                       
                    -PROCESOS INTERACTIVOS:
                            - EL USUARIO INTERACTUA CON EL PROCESO,
                              NORMALMENTE PARA APORTAR INFORMACI�N NECESARIA
                              PARA LA EJECUCI�N DEL PROCESO.
                                       
                    - PROCESO POR LOTES:
                            - EL USUARIO NO EST� TAN INTERESADO EN LA EJECUCI�N,
                              SINO SIMPLEMENTE EN LANZAR EL PROCESO AL PRINCIPIO,
                              Y COMPROBAR AL FINAL EL RESULTADO DE LA EJECUCI�N.
                                       
                    - PROCESO EN TIEMPO REAL:
                            - SON UN TIPO ESPECIAL DE PROCESO,
                              EN LO QUE LO M�S IMPORTANTE ES
                              EL TIEMPO DE RESPUESTA POR PARTE DEL SISTEMA.
                                       
            - SI NOS FIJAMOS EN CU�L ES EL ORIGEN DE LOS PROCESOS,
              Y QUI�N ES EL QUE LOS LANZA, HAY DOS TIPOS:
                    
                    - PROCESO EN MODO USUARIO:
                            - QUE LANZA EL PROPIO USUARIO. SON LOS M�S NORMALES.
                                     
                    - PROCESO MODO KERNEL:
                            - LOS EJECUTA EL PROPIO N�CLEO DEL SISTEMA OPERATIVO, DE FORMA AUTOM�TICA.
                            - EN GENERAL, EL USUARIO NO LOS PUEDE CONTROLAR.
                            - REALIZAN LAS TAREAS M�S DELICADAS: GESTI�N DE MEMORIA, TRAFICO DE RED, ETC...

        ************************************************************************************************************************
        *  0. SALIR.                                                                                                           *
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_03 = """                          
                               
        ************************************************************************************************************************
        *   PROGRAMACI�N DE SERVICIOS Y PROCESOS.            TEMA 2:   PROCESOS.                                               *
        ************************************************************************************************************************
                                  ESTADOS DE UN PROCESO.

            - EN EL SISTEMA HABR� UN PLANIFICADOR (SCHEDULER) QUE CREA Y PONE EN EJECUCI�N LOS PROCESOS.
                                       
            - EL CICLO DE VIDA DE UN PROCESO SON UNA SERIE DE ESTADOS
              POR LOS QUE PASAR� EL PROCESO A LO LARGO DE SU EJECUCI�N,
              Y TIENE QUE CUMPLIR VARIAS CONDICIONES PARA PASAR DE UN ESTADO A OTRO:
                    
                    - NUEVO:
                            -EL PROCESO SE CREA A PARTIR DE UN FICHERO EJECUTABLE.
                                       
                    - LISTO:
                            - EL PROCESO EST� CREADO, Y TIENE TODO LO QUE NECESITA PARA EJECUTARSE,
                              PERO EST� A LA ESPERA QUE EL PLANIFICADOR LE D� TIEMPO/TURNO DE EJECUCI�N.
                                       
                    - EN EJECUCI�N:
                            - EL PLANIFICADOR DEL SISTEMA OPERATIVO, ELIGE AL PROCESO PARA QUE SE EJECUTE,
                              Y LE DA UN TIEMPO DE TURNO DE EJECUCI�N (QUANTUM).
                              EL PROCESO SIGUE EJECUTANDOSE HASTA QUE:
                                    - FINALIZA SU �LTIMA INSTRUCCI�N, PASANDO AL ESTADO  -->  TERMINADO.
                                    - CUMPLA SU TIEMPO M�XIMO DE EJECUCI�N, QUANTUM,
                                      SIN HABER ACABADO SUS INSTRUCCIONES, PASANDO AL ESTADO  -->  LISTO.
                                    - EL PLANIFICADOR, POR CUALQUIER MOTIVO, LO ABORTA,
                                      LO TERMINA ANTES DE ACABADO SUS INSTRUCCIONES, PASANDO AL ESTADO  -->  TERMINADO.
                                    - SI EL PROCESO NECESITA ALG�N RECURSO, LO PODR� PEDIR MEDIANTE INTERUPCIONES
                                      Y PASAR� AL ESTADO  -->  EN ESPERA. (O BLOQUEADO).
                                       
                    - BLOQUEADO/EN ESPERA:
                            - CUANDO EL PROCESO CONSIGUE EL RECURSO QUE NECESITABA, VOLVER� AL ESTADO  -->  LISTO.
                            
                    - TERMINADO:
                            - EL PROCESO HA FINALIZADO SU EJECUCI�N Y LIBERA TODOS LOS RECURSOS QUE ESTABA ACAPARANDO,
                              ESPERANDO QUE EL SISTEMA OPERATIVO LO DESTRUYA.

        ************************************************************************************************************************
        *  0. SALIR.                                                                                                           *
        ************************************************************************************************************************
                               
                               """;
    
    private static String recurso_04 = """                          
                               
        ************************************************************************************************************************
        *   PROGRAMACI�N DE SERVICIOS Y PROCESOS.            TEMA 2:   PROCESOS.                                               *
        ************************************************************************************************************************
                                  GESTI�N DE PROCESOS.   EL SISTEMA OPERATIVO, RESPONSABLE PRINCIPAL.

            - EL ENCARGADO PRINCIPAL DE TODA LA GESTI�N DE PROCESOS ES EL SISTEMA OPERATIVO,
              NORMALMENTE SIGUIENDO INSTRUCCIONES DE UN USUARIO:
                    - EL USUARIO SIMPLEMENTE ABRE UN PROGRAMA.
                    - EL SISTEMA OPERATIVO CREA EL PROCESO, LO PONE EN EJECUCI�N,
                      LO COORDINA CON EL RESTO DE PROCESOS, ETC...
                                       
            - EXISTEN 4 EVENTOS QUE VAN A PROVOCAR LA CREACI�N DE UN PROCESO:
                    - EL ARRANQUE DEL SISTEMA.
                    - UNA PETICI�N DE USUARIO PARA CREAR UN PROCESO.
                    - LA EJECUCI�N, DESDE UN PROCESO, DE UNA LLAMADA AL SISTEMA
                      PARA LA CREACI�N DE OTRO PROCESO.
                    - EL INICIO DE UN FICHERO POR LOTES,
                      NORMALMENTE SOLICITADO POR EL USUARIO.
                                       
            - CUANDO EL PROCESADOR, MEDIANTE LA ORDEN DEL PLANIFICADOR DEL SISTEMA OPERATIVO,
              PASA A EJECUTAR UN NUEVO PROCESO, EL SISTEMA OPERATIVO:
                    1. GUARDA TODO EL CONTEXTO QUE TIENE EL PROCESO ACTUAL.
                    2. RESTAURA EL CONTEXTO QUE TEN�A EL PROCESO
                       QUE EL PLANIFICADOR DE PROCESOS HA DECIDIDO EJECUTAR.
                    3. CONTROLA TODA LA COMUNICACI�N Y SINCRONIZACI�N ENTRE LOS PROCESOS.
                    4. TAMBI�N SE ENCARGA DE LA ELIMINACI�N Y TERMINACI�N DE �STOS PROCESOS.

        ************************************************************************************************************************
        *  0. SALIR.                                                                                                           *
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_05 =  """                          
                               
        ************************************************************************************************************************
        *   PROGRAMACI�N DE SERVICIOS Y PROCESOS.            TEMA 2:   PROCESOS.                                               *
        ************************************************************************************************************************
                       GESTI�N DE PROCESOS. GESTI�N DE LA EJECUCI�N CONCURRENTE MEDIANTE 'COLAS'.

            - LOS SISTEMAS OPERATIVOS ACTUALES PERMITEN LA MULTIPROGRAMACI�N:
              ADMITEN LA EJECUCI�N DE VARIOS PROCESOS EN MEMORIA PARA MAXIMIZAR EL USO DEL PROCESADOR.
                    - LOS PROCESOS IR�N INTERCAMBI�NDOSE CON LOS QUE EST�N EN EJECUCI�N.
                    - TODOS USAR�N IGUAL EL PROCESADOR, EJECUCI�N CONCURRENTE DE PROCESOS.
                                        
            - PARA ESTO, EL SISTEMA OPERATIVO ORGANIZA LOS PROCESOS EN VARIAS COLAS O LISTAS:
                                        
                    - COLA DE PROCESOS: 
                            - TODOS LOS PROCESOS QUE HAY EN EL SISTEMA.
                                        
                    - COLA DE PROCESOS PREPARADOS:
                            - TODOS LOS PROCESOS EN ESTADO 'LISTO'.
                            - EST� ESPERANDO QUE EL PLANIFICADOR LOS SELECCIONE PARA EJECUTARSE.
                                        
                    - COLAS QUE CONTIENEN PROCESOS EN ESTADO 'BLOQUEADO':
                            - EST�N ESPERANDO ALGUNA OPERACI�N DE ENTRADA/SALIDA.
                            - HABR� UNA COLA POR CADA DISPOSITIVO DE ENTRADA/SALIDA.

        ************************************************************************************************************************
        *  0. SALIR.                                                                                                           *
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_06 = """                          
                               
        ************************************************************************************************************************
        *   PROGRAMACI�N DE SERVICIOS Y PROCESOS.            TEMA 2:   PROCESOS.                                               *
        ************************************************************************************************************************
                         PLANIFICACI�N DE PROCESOS I:  TIPOS.         

            - EL PLANIFICADOR DE PROCESOS (SCHEDULER):
                    - DECIDE Y SELECCIONA, MEDIANTE UN ALGORITMO, LOS PROCESOS QUE VAN A EJECUTARSE EN EL PROCESADOR,
                      IMPONIENDO UN ORDEN DE EJECUCI�N EN LAS COLAS.
                    - DECIDE QU� PROCESOS, DE LOS QUE EST�N LISTOS PARA SER EJECUTADOS, DEBEN INICIARSE Y EN QU� ORDEN.
                    - NO SE ENCARGAN DE CREAR LAS ESTRUCTURAS QUE COMPONEN LOS PROCESOS:
                      ESTAS ESTRUCTURAS SE CREAN SOLO UNA VEZ, CUANDO EL PROCESO SE CREA.
                                       
            - PRINCIPALMENTE, DOS TIPOS DE PLANIFICACI�N QUE COEXISTEN:
                                       
                    - CORTO PLAZO:
                            - SELECCIONAN QU� PROCESO DE LA COLA DE PROCESOS PREPARADOS VA A PASAR A EJECUCI�N.
                            - INVOCACI�N MUY FRECUENTE, MILISEGUNDOS, EXIGE RAPIDEZ AL DECIDIR, ALGORITMOS SENCILLOS:
                                       
                                    - PLANIFICACI�N SIN DESALOJO O COOPERATIVA:
                                            - SOLO SE CAMBIA EL PROCESO EN EJECUCI�N SI SE HA BLOQUEADO O TERMINADO.
                                       
                                    - PLANIFICACI�N APROPIATIVA:
                                            - UNE PLANIFICACI�N COOPERATIVA Y CAMBIO DE PROCESO SI OTRO CON MAYOR PRIORIDAD
                                              PUEDE EJECUTARSE.
                                       
                                    - PLANIFICACI�N DE TIEMPO COMPARTIDO:
                                            - CADA CIERTO TIEMPO (QUANTUM), QUITA EL PROCESO EN EJECUCI�N
                                              Y SELECCIONA OTRO PROCESO. TODAS LAS PRIORIDADES SON CONSIDERADAS IGUALES.
                                       
                    - LARGO PLAZO:
                            - SELECCIONAN PROCESOS NUEVOS QUE DEBEN PASAR A LA COLA DE PREPARADOS,
                              SON INVOCADOS CON POCA FRECUENCIA, YA QUE SON MUY LENTOS.
                                       
            - EL M�DULO PLANIFICADOR DE PROCESOS INCORPORA LAS POL�TICAS Y MECANISMOS DEL SISTEMA OPERATIVO
              PARA EL DESICI�N DE LOS PROCESOS QUE SE VAN A EJECUTAR.
                                       
            - EL PLANIFICADOR UTILIZA ALGORITMOS DE PLANIFICACI�N PARA ASEGURAR EL M�XIMO APROVECHAMIENTO:
                    - DAR SERVICIO A TODOS LOS PROCESOS EN EJECUCI�N.
                    - NO DEJAR A NING�N PROCESO SIN EJECUTARSE.

        ************************************************************************************************************************
        *  0. SALIR.                                                                                                           *
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_07 = """                          
                               
        ************************************************************************************************************************
        *   PROGRAMACI�N DE SERVICIOS Y PROCESOS.            TEMA 2:   PROCESOS.                                               *
        ************************************************************************************************************************
                                PLANIFICACI�N DE PROCESOS II: ALGORITMOS DE PLANIFICACI�N.

            - PRIMERO EN LLEGAR (FCFS O FIFO):
                    - LOS PROCESOS SE VAN EJECUTANDO SEG�N SE CEEN, SIN NING�N OTRO CRITERIO.
                    
            - PRIORIDAD AL M�S CORTO: (EN TIEMPO DE EJECUCI�N).
                    - ORDENA SEG�N EL TIEMPO DE EJECUCI�N QUE NECESITEN, Y PRIORIZA EL QUE MENOS TIEMPO NECESITE.
                    - INANICI�N: SI UN PROCESO NECESITA MUCHO TIEMPO
                      Y SIEMPRE ENTRAN OTROS QUE NECESITEN MENOS, NUNCA SE EJECUTAR�.
            
            - PRIORIDAD AL M�S LARGO: (EN TIEMPO DE EJECUCI�N).
                    - ORDENA SEG�N EL TIEMPO DE EJECUCI�N QUE NECESITEN, Y PRIORIZA EL QUE M�S TIEMPO NECESITE.
                    - INANICI�N: SI UN PROCESO NECESITA POCO TIEMPO
                      Y SIEMPRE ENTRAN OTROS QUE NECESITEN M�S, NUNCA SE EJECUTAR�. 
                                       
            - ROUND ROBIN (TURNOS):
                    - EJECUTA CADA PROCESO DURANTE UN TIEMPO FIJO PARA TODOS, QUANTUM,
                      SAC�DOLOS DE EJECUCI�N PASADO EL TIEMPO QUANTUM.
                    - TODOS LOS PROCESOS SE EJECUTAR�N POCO A POCO.
                                       
            - PLANIFICACI�N POR PRIORIDAD:
                    - UTILIZA LA PRIORIDAD DE EJECUCI�N DE LOS PROCESOS, EJECUTANDO ANTES EL M�S PRIORITARIO.
                    - INANICI�N: SI UN PROCESO TIENE POCA PRIORIDAD
                      Y SIEMPRE ENTRAN OTROS CON MAYOR PRIORIDAD, NUNCA SE EJECUTAR�.
                                       
            - PLANIFICACI�N DE COLAS M�LTIPLES:
                    - ESTE TIPO DE PLANIFICADOR ES UNA MEZCLA DE TODOS LOS ANTERIORES.

        ************************************************************************************************************************
        *  0. SALIR.                                                                                                           *
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_08 = """                          
                               
        ************************************************************************************************************************
        *   PROGRAMACI�N DE SERVICIOS Y PROCESOS.            TEMA 2:   PROCESOS.                                               *
        ************************************************************************************************************************
                                  CAMBIOS DE CONTEXTO.

            - CAMBIO DE CONTEXTO:
                    - EL SISTEMA OPERATIVO GUARDA DATOS DE SITUACI�N DEL PROCESO QUE SALE DEL ESTADO 'EJECUT�NDOSE',
                      EN DOS MOMENTOS:
                            - CUANDO LOS PROCESOS PASAN A 'LISTO'. SUCEDE MUY FRECUENTE.
                            - CUANDO LOS PROCESOS GENERAN UMA INTERUPCI�N:
                              DESDE EJECUCI�N NECESITAN UN RECURSO, Y PRODUCE LA INTERRUPCI�N PARA QUE SE LE PROPORCIONE.
                                       
            - CADA VEZ QUE SE PRODUZCA UN CAMBIO DE CONTEXTO,
              EL SISTEMA OPERATIVO DEBE GUARDAR, AUTOM�TICAMENTE:
                                       
                    - ESTADO EN EL QUE SE ENCONTRABA EL PROCESO.
                                       
                    - ESTADO DEL PROCESADOR:
                            -VALORES DE LOS REGISTROS DEL PROCESADOR EN EL MOMENTO DEL CAMBIO,
                             IMPORTANTE EL TENER PROCESADORES POTENTES.
                                       
                    - INFORMACI�N DE GESTI�N DE MEMORIA:
                            - ESPACIO DE MEMORIA QUE TEN�A RESERVADO EL PROCESO.
                                       
                    - CONTADOR DE PROGRAMA: 
                            - INDICA POR D�NDE VA EJECUT�NDOSE EL PROCESO,
                              Y PERMITIR� SEGUIR EJECUTANDO LA INSTRUCCI�N DEL PROCESO DONDE SE QUED�.
                                       
                    - PUNTERO DE PILA: 
                            - APUNTA A LA PARTE SUPERIOR DE LA PILA DE EJECUCI�N DEL PROCESO.
                                       
            - DESPU�S DE GUARDAR ESTA INFORMACI�N DEL PROCESO SALIENTEM,
              EL SISTEMA OPERATIVO RESTAURA LOS DEL PROCESO QUE EL PLANIFICADOR HA DECIDIDO EJECUTAR.
                    - EL PROCESO QUE VUELVE A ENTRAR AL ESTADO 'EJECUT�NDOSE'
                      PUEDE SEGUIR EJECUT�NDOSE COMO SI NADA HUBIESE PASADO.
                                       
            - EL CAMBIO DE CONTEXTO ES 'TIEMPO PERDIDO' NO APROVECHADO:
              EL PROCESADOR NO HACE UN TRABAJO �TIL DURANTE ESE TIEMPO, NO PROCESA INSTRUCCIONES.

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