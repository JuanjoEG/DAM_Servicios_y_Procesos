package Tema_06;

import static Principal_Main.Main.*;
import static Tema_06.T_06.*;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
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
                                       
                    - CONDICI�N DE CARRERA:
                            - EL RESULTADO DE EJECUTAR EL PROGRAMA DEPENDER�
                              DEL ORDEN EN QUE SE REALICEN LOS ACCESOS A LOS RECURSOS.
                                       
                    - INCONSISTENCIA DE MEMORIA:
                            - DIFERENTES HILOS TIENEN UNA VISI�N DIFERENTE DE UN MISMO DATO.
                                       
                    - INANICI�N:
                            - A UN HILO SE LE DENIEGA CONTINUAMENTE EL ACCESO
                              A UN RECURSO COMPARTIDO AL QUE QUIERE TENER ACCESO,
                              PORQUE OTROS HILOS TOMAN EL CONTROL ANTES QUE �L.
                                       
                    - INTERBLOQUEO O DEADLOCK:
                            - DOS O M�S HILOS EST�N ESPERANDO QUE SUCEDA UN EVENTO,
                              QUE A SU VEZ SOLO PUEDE GENERAR UN HILO QUE SE ENCUENTRA BLOQUEADO.
                                       
                    - BLOQUEO ACTIVO:
                            - DOS HILOS QUE EST�N CAMBIANDO CONTINUAMENTE DE ESTADO
                              Y TERMINAN POR BLOQUEARSE MUTUAMENTE.
                              ES UN TIPO DE INANICI�N,
                              PORQUE UN PROCESO NO DEJA AVANZAR A OTRO, Y VICEVERSA.
                                       
            - LA SOLUCI�N A LA MAYOR�A DE ESTOS PROBLEMAS VA A PASAR POR DEFINIR...
                           
                    -'ZONAS' DE EXCLUSI�N M�TUA:
                            - ES UN MECANISMO CONSISTENTE EN QUE �NICAMENTE SE VA A 
                              PERMITIR ACCEDER A RECURSOS COMPARTIDOS A UN SOLO PROCESO, 
                              EXCLUYENDO TEMPORALMENTE A TODOS LOS DEM�S,
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
                    - SE ENCARGAN DE GESTIONAR EL ACCESO ALOS RECURSOS COMPARTIDOS O CR�TICOS.
                                       
            - SECCI�N CR�TICA O ZONA DE EXCLUSI�N MUTUA:
                    - ES EL FRAGMENTO DE C�DIGO QUE ENGLOBA LOS RECURSOS COMPARTIDOS O CR�TICOS.
                    - ES UNA REGI�N DE C�DIGO A LA QUE SE ACCEDE DE FORMA ORDENADA A LOS RECURSOS COMPARTIDOS.
                    - ES UNA ZONA EXCLUYENTE PARA LOS HILOS:
                            - SI UN HILO SE ENCUENTRA EJECUTANDO SU FRAGMENTO
                              DE C�DIGO DE LA SECCI�N CR�TICA EN UN MOMENTO DADO,
                              NING�N OTRO HILO PODR� ENTRAR A ESTA ZONA HASTA QUE �STE NO FINALICE.
                                       
            - EL LENGUAJE DE PROGRAMACI�N JAVA NOS PROPORCIONA EL MODIFICADOR   --->   synchronized
              QUE CUANDO LO APLIQUEMOS A UN M�TODO, NOS VA A GARANTIZAR QUE ESTE SE VA A EJECUTAR DE FORMA EXCLUYENTE.
                                       
            - UN MONITOR:
                    - ES LA CLASE QUE TIENE UN M�TODO CON EL MODIFICADOR   --->   synchronized
                      DENTRO DE ESTE M�TODO SE VA A ESTAR MONITOREANDO ALG�N RECURSO CR�TICO.
                      ESTOS FRAGMENTOS DE C�DIGO SON LOS QUE VAMOS A TENER DENTRO DE LA PALABRA RESERVADA --->   synchronized                 
                    - SON LOS ENCARGADOS DE IMPLEMENTAR LAS SECCIONES CR�TICAS.
                      LA IMPLEMENTACI�N DE MONITORES DEBE TENER FORZOSAMENTE:
                            - MECANISMOS QUE PERMITAN LLEVAR A CABO LA SINCRONIZACI�N.
                            - MECANISMOS QUE ACT�EN ANTES Y DESPU�S DE ENTRAR EN LA SECCI�N CR�TICA.
                                       
            - PARA PROGRAMAR MONITORES EN JAVA VAMOS A UTILIZAR TAMBI�N LOS M�TODOS:
                                       
                    - wait()      --> SI NO SE CUMPLE LA CONDICI�N DE EXCLUSI�N TENDREMOS QUE ESPERAR.
                    - notify()    --> AL CONCLUIR UNA TAREA DE LA SECCI�N CR�TICA, AVISAR AL HILO QUE EST� ESPERANDO PARA ENTRAR.
                    - notifyAll() --> IGUAL QUE notify() PERO NOTIFICA A TODOS LOS HILOS QUE EST�N ESPERANDO PARA ENTRAR.
                                       
                    - RECUERDA: M�TODO wait():
                            - CONSIGUE QUE UN HILO SE QUEDE BLOQUEADO HASTA NUEVO AVISO.
                            - PARA DESBLOQUEARLO DEBEMOS USAR LOS M�TODOS   --->   notify()      DESBLOQUEA ESE HILO.
                                                                                   notifyAll()   DESBLOQUEA TODOS LOS HILOS.
                            - A ESTOS M�TODOS PODREMOS PASARLE COMO PAR�METRO UNA CANTIDAD DE TIEMPO EN MILISEGUNDOS
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
                                       
            - EL PROBLEMA DEL PRODUCTOR-CONSUMIDOR ES UN PROBLEMA CL�SICO QUE CONSISTE EN TENER DOS 'AGENTES'
              QUE COMPARTEN UN ALMAC�N O BUFFER CON UN TAMA�O LIMITADO.
                                       
                    - AGENTE --> PRODUCTOR:
                            SE ENCARGAR� DE COLOCAR O DE PRODUCIR INFORMACI�N EN EL BUFFER O ALMAC�N.
                                       
                    - AGENTE --> CONSUMIDOR:
                            SE ENCARGAR� DE EXTRAER O DE CONSUMIR INFORMACI�N DEL BUFFER O ALMAC�N.
                                       
            - SITUACIONES A CONTROLAR:
                                       
                    - SI EL PRODUCTOR SE DISPONE A COLOCAR UN NUEVO ELEMENTO,
                      PERO EL ALMAC�N SE ENCUENTRA LLENO, EL PRODUCTOR DEBER� 'DORMIRSE'.
                            - CUANDO EL CONSUMIDOR HAYA EXTRA�DO ALG�N ELEMENTO DEL ALMAC�N,
                        --->  EL CONSUMIDOR 'DESPERTAR�' AL PRODUCTOR. <---
                                       
                    - SI EL CONSUMIDOR SE DISPONE A EXTRAER UN ELEMENTO,
                      PERO EL ALMAC�N SE ENCUENTRA VAC�O, EL CONSUMIDOR DEBER� 'DORMIRSE'.
                            - CUANDO EL PRODUCTOR HAYA COLOCADO ALG�N ELEMENTO EN EL ALMAC�N,
                        --->  EL PRODUCTOR 'DESPERTAR�' AL CONSUMIDOR. <---
                                       
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
                    - NECESITAMOS TENER DOS HILOS, QUE CUBRIR�N LOS LUGARES DE LOS AGENTES:
                                       
                            - UN HILO PRODUCTOR: --> ENCARGADO DE GENERAR ELEMENTOS Y GUARDARLOS.
                                       
                            - UN HILO CONSUMIDOR: --> ENCARGADO DE EXTRAER ELEMENTOS Y CONSUMIRLOS.
                                       
            - PROBLEMAS:
                    - TANTO EL PRODUCTOR COMO EL CONSUMIDOR QUIEREN ACCEDER A LA VEZ AL ALMAC�N.
                    - EL PRODUCTOR Y EL CONSUMIDOR TRABAJAN A DISTINTA VELOCIDAD, UNO TENDR� QUE ESPERAR AL OTRO.
                    - EL PRODUCTOR HA LLENADO EL ALMAC�N Y NO PUEDE PRODUCIR M�S.
                    - EL CONSUMIDOR NO PUEDE CONSUMIR NADA PORQUE EL ALMAC�N EST� VAC�O.
                                       
            - SOLUCI�N:
                    - CREAR CLASE PRODUCTOR:  PRODUCE LOS ELEMENTOS QUE SE GUARDAN EN EL ALMAC�N.
                    - CREAR CLASE CONSUMIDOR: EXTRAE LOS ELEMENTOS DEL ALMAC�N.
                    - CREAR CLASE BUFFER:     ES EL ALMAC�N DE ELEMENTOS DONDE EST�N LOS RECURSOS COMPARTIDOS.
                                              ES LA CLASE MONITOR.
                                              TENDR� LOS SIGUIENTES M�TODOS CON EL MODIFICADOR   --->   synchronized
                                       
                            - M�TODO put:     SER� EL ENCARGADO DE INTRODUCIR UN ELEMENTO EN EL BUFFER.
                                              SINCRONIZADO PARA QUE:
                                              MIENTRAS EL BUFFER TENGA AG�N CONTENIDO --> ESPERO A QUE SE CONSUMA EL ALMACEN.
                                              CUANDO NO HAY NADA EN ALMACEN --> NOTIFICO QUE EST� DISPONIBLE PARA PRODUCIR.
                                       
                            - M�TODO get:     SER� EL ENCARGADO DE EXTRAER UN ELEMENTO DEL BUFFER.
                                              SINCRONIZADO PARA QUE:
                                              MIENTRAS EL BUFFER EST� A CERO --> ESPERO A QUE AUMENTE EL ALMACEN.
                                              CUANDO YA HAY ALG�N CONTENIDO EN ALMACEN --> NOTIFICO QUE EST� DISPONIBLE PARA TOMAR.
            
            - FUNCIONAMIENTO:
                    1. SE LANZAR�N TANTO PRODUCTOR COMO CONSUMIDOR.
                    2. SI EL BUFFER EST� VAC�O, EL CONSUMIDOR NO OBTIENE VALOR HASTA QUE EL PRODUCTOR CREE Y ALMACENE UNO.
                            - EN ESTE CASO, SER� CUANDO EL PRODUCTOR SE ACTIVE Y COLOQUE UN ELEMENTO EN EL ALMAC�N.
                    3. SI EL BUFFER EST� LLENO, EL PRODUCTOR NO INTRODUCE NING�N VALOR HASTA QUE EL CONSUMIDOR OBTENGA Y CONSUMA.
                            - EN ESTE CASO, SER� CUANDO EL CONSUMIDOR SE ACTIVE Y OBTENGA EL VALOR DEL ALMAC�N.                                                                                
                                        
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
                                       
            - OTRO DE LOS MECANISMOS QUE NOS VA A PROPORCIONAR EL LENGUAJE DE PROGRAMACI�N JAVA PARA SOLUCIONAR PROBLEMAS
              DE SINCRONIZACI�N DE VARIOS HILOS SON LOS SEM�FOROS.
                                       
                    - UN SEM�FORO BINARIO:
                            - ES UN INDICADOR DE CONDICI�N DE ENTRADA QUE GESTIONA
                              SI UN RECURSO DE LA SECCI�N CR�TICA DE NUESTRO C�DIGO EST� DISPONIBLE O NO.
                            - ES BINARIO PORQUE SOLO PUEDE POSEER DOS VALORES. --> 'DISPONIBLE' O 'NO DISPONIBLE'.
                                       
            - EN LOS PROBLEMAS DE CONCURRENCIA Y SINCRONIZACI�N TENDREMOS UNA SECCI�N CR�TICA
              QUE NECESITAMOS PROTEGER DE ACCESOS INDEBIDOS, LA CUAL PUEDE CONSISTIR EN UN N�MERO DE VARIABLES COMPARTIDAS
              QUE LOS HILOS VAN A NECESITAR.
                    - MEDIANTE LOS SEM�FOROS PODREMOS SINCRONIZAR TODOS ESOS HILOS
                      PARA QUE NO SE PRODUZCA INANICI�N NI ACCESOS INDEBIDOS.
                                       
            - EN JAVA, PODREMOS UTILIZAR LA CLASE   --->   java.util.concurrent.Semaphore
                                       
                    - ESTA CLASE YA EST� INTEGRADA EN LA JDK DE JAVA Y ES FUNCIONAL.
                    - LOS SEM�FOROS TIENEN DOS M�TODOS:
                                       
                            - M�TODO acquire()   --->   CIERRA LA SECCI�N CR�TICA PARA QUE NING�N OTRO HILO TENGA ACCESO.
                                       
                            - M�TODO release()   --->   ABRE LA SECCI�N CR�TICA PARA QUE UN HILO PUEDA ACCEDER.
                                       
            - AL CREAR EL SEM�FORO, PODEMOS INDICAR EL N�MERO DE HILOS QUE TENDR�N ACCESO SIMULTANEO A LA SECCI�N CR�TICA.
              EN CASO DE NO INDICAR NADA, SER� UN SEM�FORO BINARIO. --> UN SOLO HILO TENDR� ACCESO.    
                                       
                                       Semaphore semaphore = new Semaphore (1, true);
                                       
            - LOS SEM�FOROS SON MUCHO M�S SIMPLE QUE LOS MONITORES.
                    - LOS SEM�FOROS SON --> UNA VARIABLE ENTERA, A LA QUE SE PUEDE ACCEDER DE FORMA CONTROLADA Y EXCLUSIVA.
                      SOLO UN HILO DE UN PROCESO PODR� MODIFICARLA EN UN MOMENTO DETERMINADO.
                    - ES EL PROGRAMADOR QUIEN GESTIONA EL USO DE ESA VARIABLE.
                                       
            - EL MONITOR ES UN 'TIPO DE DATO' ABSTRACTO (UNA CLASE) 
              QUE PERMITE QUE SOLO SE EJECUTE UN PROCESO EN LA SECCI�N CR�TICA A LA VEZ,
              Y CON EL QUE PODEMOS HACER MUCHAS M�S COSAS, Y M�S COMPLEJAS.
                                       
            - UTILIZANDO SEM�FOROS DE MANERA AGREGADA, SE PUEDE LLEGAR A SIMULAR EL COMPORTAMIENTO DE LOS MONITORES.
                                       
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