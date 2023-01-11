package Tema_06;

import static Principal_Main.Main.*;
import static Tema_06.T_06.*;

/**
 *
 * @author Juan José Estévez González
 */

public class Recursos_06 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_06 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        **********************************************************************************************************************************
                                       
            - OCURRE CUANDO VARIOS HILOS INTENTAN ACCEDER AL MISMO TIEMPO A LOS MISMOS RECURSOS COMPARTIDOS.
            - LOS DIFERENTE PROBLEMAS QUE MENCIONAREMOS VAN A PODER EXISTIR UNOS A LA VEZ DE OTROS,
              E INCLUSO SER CAUSA DE OTROS:
                                       
                    - CONDICIÓN DE CARRERA:
                            - EL RESULTADO DE EJECUTAR EL PROGRAMA DEPENDERÁ
                              DEL ORDEN EN QUE SE REALICEN LOS ACCESOS A LOS RECURSOS.
                                       
                    - INCONSISTENCIA DE MEMORIA:
                            - DIFERENTES HILOS TIENEN UNA VISIÓN DIFERENTE DE UN MISMO DATO.
                                       
                    - INANICIÓN:
                            - A UN HILO SE LE DENIEGA CONTINUAMENTE EL ACCESO
                              A UN RECURSO COMPARTIDO AL QUE QUIERE TENER ACCESO,
                              PORQUE OTROS HILOS TOMAN EL CONTROL ANTES QUE ÉL.
                                       
                    - INTERBLOQUEO O DEADLOCK:
                            - DOS O MÁS HILOS ESTÁN ESPERANDO QUE SUCEDA UN EVENTO,
                              QUE A SU VEZ SOLO PUEDE GENERAR UN HILO QUE SE ENCUENTRA BLOQUEADO.
                                       
                    - BLOQUEO ACTIVO:
                            - DOS HILOS QUE ESTÁN CAMBIANDO CONTINUAMENTE DE ESTADO
                              Y TERMINAN POR BLOQUEARSE MUTUAMENTE.
                              ES UN TIPO DE INANICIÓN,
                              PORQUE UN PROCESO NO DEJA AVANZAR A OTRO, Y VICEVERSA.
                                       
            - LA SOLUCIÓN A LA MAYORÍA DE ESTOS PROBLEMAS VA A PASAR POR DEFINIR...
                           
                    -'ZONAS' DE EXCLUSIÓN MÚTUA:
                            - ES UN MECANISMO CONSISTENTE EN QUE ÚNICAMENTE SE VA A 
                              PERMITIR ACCEDER A RECURSOS COMPARTIDOS A UN SOLO PROCESO, 
                              EXCLUYENDO TEMPORALMENTE A TODOS LOS DEMÁS,
                              DE FORMA QUE GARANTICE LA INTEGRIDAD DEL SISTEMA.                                       
                                      
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
                                       
            - LOS MONITORES:
                    - SE ENCARGAN DE GESTIONAR EL ACCESO ALOS RECURSOS COMPARTIDOS O CRÍTICOS.
                                       
            - SECCIÓN CRÍTICA O ZONA DE EXCLUSIÓN MUTUA:
                    - ES EL FRAGMENTO DE CÓDIGO QUE ENGLOBA LOS RECURSOS COMPARTIDOS O CRÍTICOS.
                    - ES UNA REGIÓN DE CÓDIGO A LA QUE SE ACCEDE DE FORMA ORDENADA A LOS RECURSOS COMPARTIDOS.
                    - ES UNA ZONA EXCLUYENTE PARA LOS HILOS:
                            - SI UN HILO SE ENCUENTRA EJECUTANDO SU FRAGMENTO
                              DE CÓDIGO DE LA SECCIÓN CRÍTICA EN UN MOMENTO DADO,
                              NINGÚN OTRO HILO PODRÁ ENTRAR A ESTA ZONA HASTA QUE ÉSTE NO FINALICE.
                                       
            - EL LENGUAJE DE PROGRAMACIÓN JAVA NOS PROPORCIONA EL MODIFICADOR   --->   synchronized
              QUE CUANDO LO APLIQUEMOS A UN MÉTODO, NOS VA A GARANTIZAR QUE ESTE SE VA A EJECUTAR DE FORMA EXCLUYENTE.
                                       
            - UN MONITOR:
                    - ES LA CLASE QUE TIENE UN MÉTODO CON EL MODIFICADOR   --->   synchronized
                      DENTRO DE ESTE MÉTODO SE VA A ESTAR MONITOREANDO ALGÚN RECURSO CRÍTICO.
                      ESTOS FRAGMENTOS DE CÓDIGO SON LOS QUE VAMOS A TENER DENTRO DE LA PALABRA RESERVADA --->   synchronized                 
                    - SON LOS ENCARGADOS DE IMPLEMENTAR LAS SECCIONES CRÍTICAS.
                      LA IMPLEMENTACIÓN DE MONITORES DEBE TENER FORZOSAMENTE:
                            - MECANISMOS QUE PERMITAN LLEVAR A CABO LA SINCRONIZACIÓN.
                            - MECANISMOS QUE ACTÚEN ANTES Y DESPUÉS DE ENTRAR EN LA SECCIÓN CRÍTICA.
                                       
            - PARA PROGRAMAR MONITORES EN JAVA VAMOS A UTILIZAR TAMBIÉN LOS MÉTODOS:
                                       
                    - wait()      --> SI NO SE CUMPLE LA CONDICIÓN DE EXCLUSIÓN TENDREMOS QUE ESPERAR.
                    - notify()    --> AL CONCLUIR UNA TAREA DE LA SECCIÓN CRÍTICA, AVISAR AL HILO QUE ESTÁ ESPERANDO PARA ENTRAR.
                    - notifyAll() --> IGUAL QUE notify() PERO NOTIFICA A TODOS LOS HILOS QUE ESTÁN ESPERANDO PARA ENTRAR.
                                       
                    - RECUERDA: MÉTODO wait():
                            - CONSIGUE QUE UN HILO SE QUEDE BLOQUEADO HASTA NUEVO AVISO.
                            - PARA DESBLOQUEARLO DEBEMOS USAR LOS MÉTODOS   --->   notify()      DESBLOQUEA ESE HILO.
                                                                                   notifyAll()   DESBLOQUEA TODOS LOS HILOS.
                            - A ESTOS MÉTODOS PODREMOS PASARLE COMO PARÁMETRO UNA CANTIDAD DE TIEMPO EN MILISEGUNDOS
                              PARA QUE ESPERE ESE TIEMPO ANTES DE ACTUAR EL DESBLOQUEO.                      
                                       
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
                                       
            - EL PROBLEMA DEL PRODUCTOR-CONSUMIDOR ES UN PROBLEMA CLÁSICO QUE CONSISTE EN TENER DOS 'AGENTES'
              QUE COMPARTEN UN ALMACÉN O BUFFER CON UN TAMAÑO LIMITADO.
                                       
                    - AGENTE --> PRODUCTOR:
                            SE ENCARGARÁ DE COLOCAR O DE PRODUCIR INFORMACIÓN EN EL BUFFER O ALMACÉN.
                                       
                    - AGENTE --> CONSUMIDOR:
                            SE ENCARGARÁ DE EXTRAER O DE CONSUMIR INFORMACIÓN DEL BUFFER O ALMACÉN.
                                       
            - SITUACIONES A CONTROLAR:
                                       
                    - SI EL PRODUCTOR SE DISPONE A COLOCAR UN NUEVO ELEMENTO,
                      PERO EL ALMACÉN SE ENCUENTRA LLENO, EL PRODUCTOR DEBERÁ 'DORMIRSE'.
                            - CUANDO EL CONSUMIDOR HAYA EXTRAÍDO ALGÚN ELEMENTO DEL ALMACÉN,
                        --->  EL CONSUMIDOR 'DESPERTARÁ' AL PRODUCTOR. <---
                                       
                    - SI EL CONSUMIDOR SE DISPONE A EXTRAER UN ELEMENTO,
                      PERO EL ALMACÉN SE ENCUENTRA VACÍO, EL CONSUMIDOR DEBERÁ 'DORMIRSE'.
                            - CUANDO EL PRODUCTOR HAYA COLOCADO ALGÚN ELEMENTO EN EL ALMACÉN,
                        --->  EL PRODUCTOR 'DESPERTARÁ' AL CONSUMIDOR. <---
                                       
            - ESTE PROBLEMA PUEDE LLEGAR A PRODUCIR CONDICIONES DE CARRERA E INCONSISTENCIA DE MEMORIA.
                                       
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
                                        
            - PARA SOLUCIONAR EL PROBLEMA DEL PRODUCTOR-CONSUMIDOR,
                    - NECESITAMOS TENER DOS HILOS, QUE CUBRIRÁN LOS LUGARES DE LOS AGENTES:
                                       
                            - UN HILO PRODUCTOR: --> ENCARGADO DE GENERAR ELEMENTOS Y GUARDARLOS.
                                       
                            - UN HILO CONSUMIDOR: --> ENCARGADO DE EXTRAER ELEMENTOS Y CONSUMIRLOS.
                                       
            - PROBLEMAS:
                    - TANTO EL PRODUCTOR COMO EL CONSUMIDOR QUIEREN ACCEDER A LA VEZ AL ALMACÉN.
                    - EL PRODUCTOR Y EL CONSUMIDOR TRABAJAN A DISTINTA VELOCIDAD, UNO TENDRÁ QUE ESPERAR AL OTRO.
                    - EL PRODUCTOR HA LLENADO EL ALMACÉN Y NO PUEDE PRODUCIR MÁS.
                    - EL CONSUMIDOR NO PUEDE CONSUMIR NADA PORQUE EL ALMACÉN ESTÁ VACÍO.
                                       
            - SOLUCIÓN:
                    - CREAR CLASE PRODUCTOR:  PRODUCE LOS ELEMENTOS QUE SE GUARDAN EN EL ALMACÉN.
                    - CREAR CLASE CONSUMIDOR: EXTRAE LOS ELEMENTOS DEL ALMACÉN.
                    - CREAR CLASE BUFFER:     ES EL ALMACÉN DE ELEMENTOS DONDE ESTÁN LOS RECURSOS COMPARTIDOS.
                                              ES LA CLASE MONITOR.
                                              TENDRÁ LOS SIGUIENTES MÉTODOS CON EL MODIFICADOR   --->   synchronized
                                       
                            - MÉTODO put:     SERÁ EL ENCARGADO DE INTRODUCIR UN ELEMENTO EN EL BUFFER.
                                              SINCRONIZADO PARA QUE:
                                              MIENTRAS EL BUFFER TENGA AGÚN CONTENIDO --> ESPERO A QUE SE CONSUMA EL ALMACEN.
                                              CUANDO NO HAY NADA EN ALMACEN --> NOTIFICO QUE ESTÁ DISPONIBLE PARA PRODUCIR.
                                       
                            - MÉTODO get:     SERÁ EL ENCARGADO DE EXTRAER UN ELEMENTO DEL BUFFER.
                                              SINCRONIZADO PARA QUE:
                                              MIENTRAS EL BUFFER ESTÉ A CERO --> ESPERO A QUE AUMENTE EL ALMACEN.
                                              CUANDO YA HAY ALGÚN CONTENIDO EN ALMACEN --> NOTIFICO QUE ESTÁ DISPONIBLE PARA TOMAR.
            
            - FUNCIONAMIENTO:
                    1. SE LANZARÁN TANTO PRODUCTOR COMO CONSUMIDOR.
                    2. SI EL BUFFER ESTÁ VACÍO, EL CONSUMIDOR NO OBTIENE VALOR HASTA QUE EL PRODUCTOR CREE Y ALMACENE UNO.
                            - EN ESTE CASO, SERÁ CUANDO EL PRODUCTOR SE ACTIVE Y COLOQUE UN ELEMENTO EN EL ALMACÉN.
                    3. SI EL BUFFER ESTÁ LLENO, EL PRODUCTOR NO INTRODUCE NINGÚN VALOR HASTA QUE EL CONSUMIDOR OBTENGA Y CONSUMA.
                            - EN ESTE CASO, SERÁ CUANDO EL CONSUMIDOR SE ACTIVE Y OBTENGA EL VALOR DEL ALMACÉN.                                                                                
                                        
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
                                       
            - OTRO DE LOS MECANISMOS QUE NOS VA A PROPORCIONAR EL LENGUAJE DE PROGRAMACIÓN JAVA PARA SOLUCIONAR PROBLEMAS
              DE SINCRONIZACIÓN DE VARIOS HILOS SON LOS SEMÁFOROS.
                                       
                    - UN SEMÁFORO BINARIO:
                            - ES UN INDICADOR DE CONDICIÓN DE ENTRADA QUE GESTIONA
                              SI UN RECURSO DE LA SECCIÓN CRÍTICA DE NUESTRO CÓDIGO ESTÁ DISPONIBLE O NO.
                            - ES BINARIO PORQUE SOLO PUEDE POSEER DOS VALORES. --> 'DISPONIBLE' O 'NO DISPONIBLE'.
                                       
            - EN LOS PROBLEMAS DE CONCURRENCIA Y SINCRONIZACIÓN TENDREMOS UNA SECCIÓN CRÍTICA
              QUE NECESITAMOS PROTEGER DE ACCESOS INDEBIDOS, LA CUAL PUEDE CONSISTIR EN UN NÚMERO DE VARIABLES COMPARTIDAS
              QUE LOS HILOS VAN A NECESITAR.
                    - MEDIANTE LOS SEMÁFOROS PODREMOS SINCRONIZAR TODOS ESOS HILOS
                      PARA QUE NO SE PRODUZCA INANICIÓN NI ACCESOS INDEBIDOS.
                                       
            - EN JAVA, PODREMOS UTILIZAR LA CLASE   --->   java.util.concurrent.Semaphore
                                       
                    - ESTA CLASE YA ESTÁ INTEGRADA EN LA JDK DE JAVA Y ES FUNCIONAL.
                    - LOS SEMÁFOROS TIENEN DOS MÉTODOS:
                                       
                            - MÉTODO acquire()   --->   CIERRA LA SECCIÓN CRÍTICA PARA QUE NINGÚN OTRO HILO TENGA ACCESO.
                                       
                            - MÉTODO release()   --->   ABRE LA SECCIÓN CRÍTICA PARA QUE UN HILO PUEDA ACCEDER.
                                       
            - AL CREAR EL SEMÁFORO, PODEMOS INDICAR EL NÚMERO DE HILOS QUE TENDRÁN ACCESO SIMULTANEO A LA SECCIÓN CRÍTICA.
              EN CASO DE NO INDICAR NADA, SERÁ UN SEMÁFORO BINARIO. --> UN SOLO HILO TENDRÁ ACCESO.    
                                       
                                       Semaphore semaphore = new Semaphore (1, true);
                                       
            - LOS SEMÁFOROS SON MUCHO MÁS SIMPLE QUE LOS MONITORES.
                    - LOS SEMÁFOROS SON --> UNA VARIABLE ENTERA, A LA QUE SE PUEDE ACCEDER DE FORMA CONTROLADA Y EXCLUSIVA.
                      SOLO UN HILO DE UN PROCESO PODRÁ MODIFICARLA EN UN MOMENTO DETERMINADO.
                    - ES EL PROGRAMADOR QUIEN GESTIONA EL USO DE ESA VARIABLE.
                                       
            - EL MONITOR ES UN 'TIPO DE DATO' ABSTRACTO (UNA CLASE) 
              QUE PERMITE QUE SOLO SE EJECUTE UN PROCESO EN LA SECCIÓN CRÍTICA A LA VEZ,
              Y CON EL QUE PODEMOS HACER MUCHAS MÁS COSAS, Y MÁS COMPLEJAS.
                                       
            - UTILIZANDO SEMÁFOROS DE MANERA AGREGADA, SE PUEDE LLEGAR A SIMULAR EL COMPORTAMIENTO DE LOS MONITORES.
                                       
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

        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_08 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_08 + """
        **********************************************************************************************************************************
                                       
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
                case "8" -> System.out.println(recurso_08);
                case "13" -> {
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
                    continuar();
                    System.out.println(recurso_08);
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