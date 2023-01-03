package Tema_05;

import static Principal_Main.Main.esperar;
import static Principal_Main.Main.meterEspacios;
import static Tema_05.T_05.*;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class Recursos_05 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_05 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        ************************************************************************************************************************
                                       
            - EN EL LENGUAJE DE PROGRAMACIÍN JAVA, UN HILO SERÁ CREADO MEDIANTE UNA INSTANCIA DE LA CLASE Thread,
              QUE NOS PERMITIRÁ GESTIONAR COMPLETAMENTE NUESTROS HILOS.
                                       
            - LOS PASOS A SEGUIR SON:
                    1. CREAR UNA CLASE QUE HEREDE DE LA CLASE Thread.
                    2. REESCRIBIR EL MÉTODO run, EN EL QUE DEBEREMOS PONER TODO EL CÓDIGO QUE QUERAMOS QUE EJECUTE NUESTRO HILO.
                    3. CREAR UN OBJETO DE LA NUEVA CLASE, QUE SERÁ EL HILO CON EL QUE TRABAJEMOS.
                                       
            - DENTRO DE LA CLASE, PODEMOS CREAR TODAS LAS VARIABLES Y MÉTODOS QUE NECESITEMOS, INCLUIDOS CONSTRUCTORES, GETTERS,
              SETTERS Y TOSTRING, YA QUE LO QUE ESTAMOS CREANDO ES UNA CLASE SIN NINGÚN TIPO DE PECULIARIDAD.
                    - MEDIANTE LOS CONSTRUCTORES, PODREMOS CREAR LOS HILOS CON LOS DATOS QUE NECESITEMOS,
                      Y CON LOS MÉTODOS GET Y SET, PODREMOS OBTENER O MODIFICAR SUS VARIABLES SIN NINGÚN TIPO DE PROBLEMA.
                                       
            - NO ES ESTRAÑO QUE DENTRO DEL MÉTODO run, CREEMOS UN BUCLE INFINITO, PARA QUE LA HEBRA CONTINÚE EJECUTÁNDOSE
              DE FORMA CONSTANTE HASTA QUE DECIDAMOS FINALIZARLA O HASTA QUE FINALICE EL PROPIO PROGRAMA.
                                       
            A DIFERENCIA DE OTROS LENGUAJES, JAVA OFRECE DOS FORMAS DE CREAR HILOS, PORQUE NO PERMITE LA HERENCIA MÚLTIPLE,
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
                                       
            - JAVA TAMBIÉN PERMITE CREAR HILOS IMPLEMENTANDO LA INTERFAZ RUNABLE.
            - EN ESTE CASO, LOS PASOS QUE HAY QUE DAR SON:
                    1. CREAR UNA CLASE QUE IMPLEMENTE LA INTERFAZ Runnable.
                    2. REESCRIBIR EL MÉTODO run, EN EL QUE DEBEREMOS PONER TODO EL CÓDIGO QUE QUERAMOS QUE EJECUTE NUESTRO HILO.
                    3. CREAR UN OBJETO DE LA NUEVA CLASE, QUE SERÁ EL HILO CON EL QUE TRABAJEMOS.
                                       
            - AL IMPLEMENTAR UNA INTERFAZ, TENDREMOS QUE SOBREESCRIBIR EL MÉTODO run DE FORMA OBLIGATORIA.
              SI NO REESCRIBIMOS EL MÉTODO run NO TENDRÁ FUNCIONALIDAD.
                                       
            - DENTRO DE LA CLASE, PODEMOS CREAR TODAS LAS VARIABLES Y MÉTODOS QUE NECESITEMOS, INCLUIDOS CONSTRUCTORES, GETTERS,
              SETTERS Y TOSTRING, YA QUE LO QUE ESTAMOS CREANDO ES UNA CLASE SIN NINGÚN TIPO DE PECULIARIDAD.
                    - MEDIANTE LOS CONSTRUCTORES, PODREMOS CREAR LOS HILOS CON LOS DATOS QUE NECESITEMOS,
                      Y CON LOS MÉTODOS GET Y SET, PODREMOS OBTENER O MODIFICAR SUS VARIABLES SIN NINGÚN TIPO DE PROBLEMA.

            - NO ES ESTRAÑO QUE DENTRO DEL MÉTODO run, CREEMOS UN BUCLE INFINITO, PARA QUE LA HEBRA CONTINÚE EJECUTÁNDOSE
              DE FORMA CONSTANTE HASTA QUE DECIDAMOS FINALIZARLA O HASTA QUE FINALICE EL PROPIO PROGRAMA.
                                       
            A DIFERENCIA DE OTROS LENGUAJES, JAVA OFRECE DOS FORMAS DE CREAR HILOS, PORQUE NO PERMITE LA HERENCIA MÚLTIPLE,
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
              DEBEMOS HACER QUE PASE DEL ESTADO 'LISTO' AL ESTADO 'EJECUTANDOSE', INICIÁNDO EL Thread CON    --->   star().
                    - NO UTILIZAR DIRECTAMENTE run(), QUE NO HARÍA QUE SE EJECUTE EL HILO DE FORMA PARALELA.
                                       
            - EL MÉTODO start() VA A REALIZAR LAS SIGUIENTES TAREAS POR DEBAJO:
                    - RESERVAR TODOS LOS RECURSOS NECESARIOS PARA LA CORRECTA EJECUCIÓN DEL HILO.
                    - LLAMAR AL MÉTODO run() Y HACER QUE SE EJECUTE DE FORMA PARALELA.
                                       
            - SI HEMOS CREADO UN HILO IMPLEMENTANDO LA INTERFAZ RUNABLE, LOS PASOS SON:
                    1. CREAR UN OBJETO DE LA CLASE HILO.
                    2. CREAR UN OBJETO DE LA CLASE THREAD MEDIANTE EL OBJETO ANTERIOR.
                    3. LLAMAR AL MÉTODO run() Y HACER QUE SE EJECUTE DE FORMA PARALELA USANDO   --->   star().
                                       
            UNA VEZ HEMOS LLAMADO AL MÉTODO start() DE UN HILO, NO PODEMOS HACERLO DE NUEVO, YA QUE EL HILO SE ESTÁ EJECUTANDO.
            EN CASO DE HACERLO, TENDRIAMOS UNA EXCEPCIÓN DEL TIPO   --->    IllegalThreadStateException.
                                       
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
                                        
            - POR OTRO LADO PUEDE OCURRIR QUE NECESITEMOS QUE NUESTROS HILOS EJECUTEN UNA ACCIÓN CADA CIERTO TIEMPO,
              LO CUAL ES IMPOSIBLE, A NO SER QUE CONSIGAMOS DETENER EL HILO DE ALGUNA FORMA.
                                        
            - JAVA NOS PROPORCIONA MÉTODOS PARA SUSPENDER HILOS DE FORMA SEGURA:
                                        
                    - MÉTODO sleep():
                            - CONSIGUE QUE NUESTRO HILO 'SE DUERMA' UNA CANTIDAD DE MILISEGUNDOS, QUE LE PASAMOS POR PARÁMETRO.
                            - EL HILO PASARÁ AL ESTADO 'BLOQUEADO' DURANTE ESE TIEMPO, VOLVIENDO DESPUÉS A 'LISTO'.
                            - SI QUEREMOS REACTIVAR EL HILO ANTES DE TIEMPO LO HAREMOS CON    --->   interrupt().
                                        
                    - MÉTODO wait():
                            - CONSIGUE QUE UN HILO SE QUEDE BLOQUEADO HASTA NUEVO AVISO.
                            - PARA DESBLOQUEARLO DEBEMOS USAR LOS MÉTODOS   --->   notify()      DESBLOQUEA ESE HILO.
                                                                                   notifyAll()   DESBLOQUEA TODOS LOS HILOS.
                            - A ESTOS MÉTODOS PODREMOS PASARLE COMO PARÁMETRO UNA CANTIDAD DE TIEMPO EN MILISEGUNDOS
                              PARA QUE ESPERE ESE TIEMPO ANTES DE ACTUAR EL DESBLOQUEO.
                                        
            - FINALIZAR UN HILO POR NOSOTROS:
                                        
                    - MÉTODO isAlive():
                            - NOS INDICA SI UN HILO ESTÁ VIVO O NO, DEVOLVIENDO  true   SI EL HILO NO ESTÁ 'FINALIZADO'.
                            - NOS INDICA SI UN HILO ESTÁ VIVO O NO, DEVOLVIENDO  false   SI EL HILO ESTÁ 'FINALIZADO'.
                                        
                    - MÉTODO stop():
                            - PERMITE FINALIZAR UN HILO, PERO EL PELIGRO QUE TIENE USARLO, ES QUE PUEDE DAR SITUACIONES 
                              DE INTERBLOQUEO DE HILOS Y HACER QUE NUESTRA APLICACIÓN SE BLOQUEE SIN POSIBILIDAD DE ARREGLO.                                        
                                        
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
                                       
            - CUANDO TENEMOS VARIOS HILOS EJECUTÁNDOSE EN SEGUNDO PLANO, NO CONTROLAMOS CUÁL DE ELLOS SE EJECUTARÁ:
              ES EL PROPIO PLANIFICADOR DEL SISTEMA OPERATIVO ES QUIEN LO DECIDE.
                 
            - POR ESE MOTIVO, CUANDO EJECUTAMOS VARIOS HILOS A LA VEZ,
              PUEDE QUE TENGAMOS DIFERENTES SALIDAS POR PANTALLA EN DIFERENTES EJECUCIONES.
                                       
            - PUEDE OCURRIR QUE NECESITEMOS ESPERAR A QUE UN HILO O INCLUSO UN GRUPO DE ELLOS FINALICE
              PARA PODER SEGUIR ADELANTE CON LAS DEMÁS TAREAS, PERO COMO TENEMOS 'EL PROBLEMA' DE QUE 
              LOS HILOS SE EJECUTAN CONCURRENTEMENTE Y ES EL PLANIFICADOR DEL SISTEMA OPERATIVO EL QUE LOS VA ELIGIENDO,
              PUEDE SER QUE TENGAMOS SALIDAS QUE NO DESEEMOS Y QUE ESTÉN RELACIONADAS CON EL ORDEN DE EJECUCIÓN DE LOS HILOS.
                                       
            - SI QUEREMOS QUE UNA ACCIÓN SE REALICE DESPUÉS DE FINALIZAR UN HILO, PODEMOS HACER ESPERAR A QUE EL HILO ACABE,
              
              CON EL MÉTODO -->  join().
                                       
                    - A ESTE MÉTODO PODREMOS PASARLE COMO PARÁMETRO LA CANTIDAD DE TIEMPO EN MILISEGUNDOS QUE QUEREMOS ESPERAR
                      PARA QUE ACABE EL HILO O, SI QUEREMOS ESPERAR A QUE EL HILO DE FORMA NATURAL SIN NINGUNA RESTRICCIÓN
                      DE TIEMPO, NO LE PASAREMOS NINGÚN PARÁMETRO.
                                       
                    - DEBEMOS TENER CUIDADO CON EL MÉTODO join(), YA QUE, SI SE PRODUCE UN ERROR DE BLOQUEO CON LOS HILOS
                      ANTERIORES, NO HABRÁ FORMA DE QUE ESE CÓDIGO SE EJECUTE.   
                                       
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
                                       
            - OTRA FORMA DE INFLUIR EN EL ORDEN DE LA EJECUCIÓN DE LOS HILOS, ES ESTABLECIENDO PRIORIDADES.
              EN JAVA, LA CLASE THREAD USA TRES CONSTANTES PARA LOS NIVELES DE PRIORIDAD RELATIVOS A LOS HILOS:
                                       
                    - MIN_PRIORITY    -->  CON UN VALOR DE  1.
                    - NORM_PRIORITY   -->  CON UN VALOR DE  5.   -->   VALOR POR DEFECTO.
                    - MAX_PRIORITY    -->  CON UN VALOR DE 10.
                                       
            - PARA GESTIONAR LAS PRIORIDADES DE LOS HILOS, USAREMOS MÉTODOS DE LA CLASE   -->   Thread.
                                       
                    - MÉTODO getPriority()  -->  DEVUELVE LA PRIORIDAD QUE TIENE UN HILO.
                    - MÉTODO setPriority()  -->  CAMBIA EN CUALQUIER MOMENTO LA PRIORIDAD DE UN HILO DE NUESTRA APLICACIÓN;
                                                 ESTA NUEVA PRIORIDAD LA PASAREMOS AL MÉTODO COMO PARÁMETRO,
                                                 PUDIENDO VALER:
                                .setPriority(Thread.MIN_PRIORITY);     .setPriority(2);   .setPriority(6);   .setPriority(9);
                                .setPriority(Thread.NORM_PRIORITY);    .setPriority(3);   .setPriority(7);
                                .setPriority(Thread.MAX_PRIORITY);     .setPriority(4);   .setPriority(8);
                                       
            - SI QUEREMOS QUE EL PLANIFICADOR DEL SISTEMA OPERATIVO EQUILIBRE LA EJECUCIÓN ENTRE HILOS CON LA MISMA PRIORIDAD,
                                       
              PODREMOS USAR EL MÉTODO  DE LA CLASE Thread      --->      yield()
                                       
                    - yield() PASA UN HILO DE 'EJECUTANDOSE' A 'LISTO' Y CEDE EL PROCESADOR A OTRO HILO.
                    - PERMITE EJECUTARSE A HILOS DE LA MISMA PRIORIDAD.
                    - ESTE MÉTODO TAMPOCO GARANTIZA UN ORDEN EN LA EJECUCIÓN.
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