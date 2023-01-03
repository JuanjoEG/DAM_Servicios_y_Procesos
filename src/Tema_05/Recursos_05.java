package Tema_05;

import static Principal_Main.Main.esperar;
import static Principal_Main.Main.meterEspacios;
import static Tema_05.T_05.*;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Recursos_05 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_05 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        ************************************************************************************************************************
                                       
            - EN EL LENGUAJE DE PROGRAMACI�N JAVA, UN HILO SER� CREADO MEDIANTE UNA INSTANCIA DE LA CLASE Thread,
              QUE NOS PERMITIR� GESTIONAR COMPLETAMENTE NUESTROS HILOS.
                                       
            - LOS PASOS A SEGUIR SON:
                    1. CREAR UNA CLASE QUE HEREDE DE LA CLASE Thread.
                    2. REESCRIBIR EL M�TODO run, EN EL QUE DEBEREMOS PONER TODO EL C�DIGO QUE QUERAMOS QUE EJECUTE NUESTRO HILO.
                    3. CREAR UN OBJETO DE LA NUEVA CLASE, QUE SER� EL HILO CON EL QUE TRABAJEMOS.
                                       
            - DENTRO DE LA CLASE, PODEMOS CREAR TODAS LAS VARIABLES Y M�TODOS QUE NECESITEMOS, INCLUIDOS CONSTRUCTORES, GETTERS,
              SETTERS Y TOSTRING, YA QUE LO QUE ESTAMOS CREANDO ES UNA CLASE SIN NING�N TIPO DE PECULIARIDAD.
                    - MEDIANTE LOS CONSTRUCTORES, PODREMOS CREAR LOS HILOS CON LOS DATOS QUE NECESITEMOS,
                      Y CON LOS M�TODOS GET Y SET, PODREMOS OBTENER O MODIFICAR SUS VARIABLES SIN NING�N TIPO DE PROBLEMA.
                                       
            - NO ES ESTRA�O QUE DENTRO DEL M�TODO run, CREEMOS UN BUCLE INFINITO, PARA QUE LA HEBRA CONTIN�E EJECUT�NDOSE
              DE FORMA CONSTANTE HASTA QUE DECIDAMOS FINALIZARLA O HASTA QUE FINALICE EL PROPIO PROGRAMA.
                                       
            A DIFERENCIA DE OTROS LENGUAJES, JAVA OFRECE DOS FORMAS DE CREAR HILOS, PORQUE NO PERMITE LA HERENCIA M�LTIPLE,
            LO QUE IMPIDE QUE LA CLASE QUE YA TIENE UNA HERENCIA, PUEDA HEREDAR DE Thread.
            POR ESE MOTIVO, TENEMOS LA INTERFAZ Runnable, Y EN JAVA PODEMOS IMPLEMENTAR EN UNA MISMA CLASE TODAS LAS
            INTERFACES QUE NECESITEMOS.
                                      
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    
    private static String recurso_02 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_02 + """
        ************************************************************************************************************************              
                                       
            - JAVA TAMBI�N PERMITE CREAR HILOS IMPLEMENTANDO LA INTERFAZ RUNABLE.
            - EN ESTE CASO, LOS PASOS QUE HAY QUE DAR SON:
                    1. CREAR UNA CLASE QUE IMPLEMENTE LA INTERFAZ Runnable.
                    2. REESCRIBIR EL M�TODO run, EN EL QUE DEBEREMOS PONER TODO EL C�DIGO QUE QUERAMOS QUE EJECUTE NUESTRO HILO.
                    3. CREAR UN OBJETO DE LA NUEVA CLASE, QUE SER� EL HILO CON EL QUE TRABAJEMOS.
                                       
            - AL IMPLEMENTAR UNA INTERFAZ, TENDREMOS QUE SOBREESCRIBIR EL M�TODO run DE FORMA OBLIGATORIA.
              SI NO REESCRIBIMOS EL M�TODO run NO TENDR� FUNCIONALIDAD.
                                       
            - DENTRO DE LA CLASE, PODEMOS CREAR TODAS LAS VARIABLES Y M�TODOS QUE NECESITEMOS, INCLUIDOS CONSTRUCTORES, GETTERS,
              SETTERS Y TOSTRING, YA QUE LO QUE ESTAMOS CREANDO ES UNA CLASE SIN NING�N TIPO DE PECULIARIDAD.
                    - MEDIANTE LOS CONSTRUCTORES, PODREMOS CREAR LOS HILOS CON LOS DATOS QUE NECESITEMOS,
                      Y CON LOS M�TODOS GET Y SET, PODREMOS OBTENER O MODIFICAR SUS VARIABLES SIN NING�N TIPO DE PROBLEMA.

            - NO ES ESTRA�O QUE DENTRO DEL M�TODO run, CREEMOS UN BUCLE INFINITO, PARA QUE LA HEBRA CONTIN�E EJECUT�NDOSE
              DE FORMA CONSTANTE HASTA QUE DECIDAMOS FINALIZARLA O HASTA QUE FINALICE EL PROPIO PROGRAMA.
                                       
            A DIFERENCIA DE OTROS LENGUAJES, JAVA OFRECE DOS FORMAS DE CREAR HILOS, PORQUE NO PERMITE LA HERENCIA M�LTIPLE,
            LO QUE IMPIDE QUE LA CLASE QUE YA TIENE UNA HERENCIA, PUEDA HEREDAR DE Thread.
            POR ESE MOTIVO, TENEMOS LA INTERFAZ Runnable, Y EN JAVA PODEMOS IMPLEMENTAR EN UNA MISMA CLASE TODAS LAS
            INTERFACES QUE NECESITEMOS.
                                       
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    
    private static String recurso_03 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_03 + """
        ************************************************************************************************************************
                                       
            - SI CREAMOS UN OBJETO DE UNA CLASE CON FUNCIONALIDAD DE HILO MEDIANTE HERENCIA DE THREAD: 
              NO LLEGA CON CREAR EL OBJETO CON new(); PARA QUE EL HILO SE EJECUTE Y PASE A SEGUNDO PLANO, 
              DEBEMOS HACER QUE PASE DEL ESTADO 'LISTO' AL ESTADO 'EJECUTANDOSE', INICI�NDO EL Thread CON    --->   star().
                    - NO UTILIZAR DIRECTAMENTE run(), QUE NO HAR�A QUE SE EJECUTE EL HILO DE FORMA PARALELA.
                                       
            - EL M�TODO start() VA A REALIZAR LAS SIGUIENTES TAREAS POR DEBAJO:
                    - RESERVAR TODOS LOS RECURSOS NECESARIOS PARA LA CORRECTA EJECUCI�N DEL HILO.
                    - LLAMAR AL M�TODO run() Y HACER QUE SE EJECUTE DE FORMA PARALELA.
                                       
            - SI HEMOS CREADO UN HILO IMPLEMENTANDO LA INTERFAZ RUNABLE, LOS PASOS SON:
                    1. CREAR UN OBJETO DE LA CLASE HILO.
                    2. CREAR UN OBJETO DE LA CLASE THREAD MEDIANTE EL OBJETO ANTERIOR.
                    3. LLAMAR AL M�TODO run() Y HACER QUE SE EJECUTE DE FORMA PARALELA USANDO   --->   star().
                                       
            UNA VEZ HEMOS LLAMADO AL M�TODO start() DE UN HILO, NO PODEMOS HACERLO DE NUEVO, YA QUE EL HILO SE EST� EJECUTANDO.
            EN CASO DE HACERLO, TENDRIAMOS UNA EXCEPCI�N DEL TIPO   --->    IllegalThreadStateException.
                                       
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_04 =  """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_04 + """
        ************************************************************************************************************************
                                        
            - CUANDO ESTAMOS TRABAJANDO CON HILOS, A VECES NECESITAMOS DE UN BUCLE INFITO 
              PARA QUE LA HEBRA SE EJECUTE CONSTANTEMENTE EN SEGUNDO PLANO.
                                        
            - POR OTRO LADO PUEDE OCURRIR QUE NECESITEMOS QUE NUESTROS HILOS EJECUTEN UNA ACCI�N CADA CIERTO TIEMPO,
              LO CUAL ES IMPOSIBLE, A NO SER QUE CONSIGAMOS DETENER EL HILO DE ALGUNA FORMA.
                                        
            - JAVA NOS PROPORCIONA M�TODOS PARA SUSPENDER HILOS DE FORMA SEGURA:
                                        
                    - M�TODO sleep():
                            - CONSIGUE QUE NUESTRO HILO 'SE DUERMA' UNA CANTIDAD DE MILISEGUNDOS, QUE LE PASAMOS POR PAR�METRO.
                            - EL HILO PASAR� AL ESTADO 'BLOQUEADO' DURANTE ESE TIEMPO, VOLVIENDO DESPU�S A 'LISTO'.
                            - SI QUEREMOS REACTIVAR EL HILO ANTES DE TIEMPO LO HAREMOS CON    --->   interrupt().
                                        
                    - M�TODO wait():
                            - CONSIGUE QUE UN HILO SE QUEDE BLOQUEADO HASTA NUEVO AVISO.
                            - PARA DESBLOQUEARLO DEBEMOS USAR LOS M�TODOS   --->   notify()      DESBLOQUEA ESE HILO.
                                                                                   notifyAll()   DESBLOQUEA TODOS LOS HILOS.
                            - A ESTOS M�TODOS PODREMOS PASARLE COMO PAR�METRO UNA CANTIDAD DE TIEMPO EN MILISEGUNDOS
                              PARA QUE ESPERE ESE TIEMPO ANTES DE ACTUAR EL DESBLOQUEO.
                                        
            - FINALIZAR UN HILO POR NOSOTROS:
                                        
                    - M�TODO isAlive():
                            - NOS INDICA SI UN HILO EST� VIVO O NO, DEVOLVIENDO  true   SI EL HILO NO EST� 'FINALIZADO'.
                            - NOS INDICA SI UN HILO EST� VIVO O NO, DEVOLVIENDO  false   SI EL HILO EST� 'FINALIZADO'.
                                        
                    - M�TODO stop():
                            - PERMITE FINALIZAR UN HILO, PERO EL PELIGRO QUE TIENE USARLO, ES QUE PUEDE DAR SITUACIONES 
                              DE INTERBLOQUEO DE HILOS Y HACER QUE NUESTRA APLICACI�N SE BLOQUEE SIN POSIBILIDAD DE ARREGLO.                                        
                                        
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_05 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_05 + """
        ************************************************************************************************************************
                                       
            - CUANDO TENEMOS VARIOS HILOS EJECUT�NDOSE EN SEGUNDO PLANO, NO CONTROLAMOS CU�L DE ELLOS SE EJECUTAR�:
              ES EL PROPIO PLANIFICADOR DEL SISTEMA OPERATIVO ES QUIEN LO DECIDE.
                 
            - POR ESE MOTIVO, CUANDO EJECUTAMOS VARIOS HILOS A LA VEZ,
              PUEDE QUE TENGAMOS DIFERENTES SALIDAS POR PANTALLA EN DIFERENTES EJECUCIONES.
                                       
            - PUEDE OCURRIR QUE NECESITEMOS ESPERAR A QUE UN HILO O INCLUSO UN GRUPO DE ELLOS FINALICE
              PARA PODER SEGUIR ADELANTE CON LAS DEM�S TAREAS, PERO COMO TENEMOS 'EL PROBLEMA' DE QUE 
              LOS HILOS SE EJECUTAN CONCURRENTEMENTE Y ES EL PLANIFICADOR DEL SISTEMA OPERATIVO EL QUE LOS VA ELIGIENDO,
              PUEDE SER QUE TENGAMOS SALIDAS QUE NO DESEEMOS Y QUE EST�N RELACIONADAS CON EL ORDEN DE EJECUCI�N DE LOS HILOS.
                                       
            - SI QUEREMOS QUE UNA ACCI�N SE REALICE DESPU�S DE FINALIZAR UN HILO, PODEMOS HACER ESPERAR A QUE EL HILO ACABE,
              
              CON EL M�TODO -->  join().
                                       
                    - A ESTE M�TODO PODREMOS PASARLE COMO PAR�METRO LA CANTIDAD DE TIEMPO EN MILISEGUNDOS QUE QUEREMOS ESPERAR
                      PARA QUE ACABE EL HILO O, SI QUEREMOS ESPERAR A QUE EL HILO DE FORMA NATURAL SIN NINGUNA RESTRICCI�N
                      DE TIEMPO, NO LE PASAREMOS NING�N PAR�METRO.
                                       
                    - DEBEMOS TENER CUIDADO CON EL M�TODO join(), YA QUE, SI SE PRODUCE UN ERROR DE BLOQUEO CON LOS HILOS
                      ANTERIORES, NO HABR� FORMA DE QUE ESE C�DIGO SE EJECUTE.   
                                       
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_06 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_06 + """
        ************************************************************************************************************************
                                       
            - OTRA FORMA DE INFLUIR EN EL ORDEN DE LA EJECUCI�N DE LOS HILOS, ES ESTABLECIENDO PRIORIDADES.
              EN JAVA, LA CLASE THREAD USA TRES CONSTANTES PARA LOS NIVELES DE PRIORIDAD RELATIVOS A LOS HILOS:
                                       
                    - MIN_PRIORITY    -->  CON UN VALOR DE  1.
                    - NORM_PRIORITY   -->  CON UN VALOR DE  5.   -->   VALOR POR DEFECTO.
                    - MAX_PRIORITY    -->  CON UN VALOR DE 10.
                                       
            - PARA GESTIONAR LAS PRIORIDADES DE LOS HILOS, USAREMOS M�TODOS DE LA CLASE   -->   Thread.
                                       
                    - M�TODO getPriority()  -->  DEVUELVE LA PRIORIDAD QUE TIENE UN HILO.
                    - M�TODO setPriority()  -->  CAMBIA EN CUALQUIER MOMENTO LA PRIORIDAD DE UN HILO DE NUESTRA APLICACI�N;
                                                 ESTA NUEVA PRIORIDAD LA PASAREMOS AL M�TODO COMO PAR�METRO,
                                                 PUDIENDO VALER:
                                .setPriority(Thread.MIN_PRIORITY);     .setPriority(2);   .setPriority(6);   .setPriority(9);
                                .setPriority(Thread.NORM_PRIORITY);    .setPriority(3);   .setPriority(7);
                                .setPriority(Thread.MAX_PRIORITY);     .setPriority(4);   .setPriority(8);
                                       
            - SI QUEREMOS QUE EL PLANIFICADOR DEL SISTEMA OPERATIVO EQUILIBRE LA EJECUCI�N ENTRE HILOS CON LA MISMA PRIORIDAD,
                                       
              PODREMOS USAR EL M�TODO  DE LA CLASE Thread      --->      yield()
                                       
                    - yield() PASA UN HILO DE 'EJECUTANDOSE' A 'LISTO' Y CEDE EL PROCESADOR A OTRO HILO.
                    - PERMITE EJECUTARSE A HILOS DE LA MISMA PRIORIDAD.
                    - ESTE M�TODO TAMPOCO GARANTIZA UN ORDEN EN LA EJECUCI�N.
                      PUEDE QUE VUELVA A SER SELECCIONADO PARA EJECUTARSE INMEDIATAMENTE, Y EL yield() NO TENGA EFECTO.
                                       
        ************************************************************************************************************************
        *  0. SALIR.
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