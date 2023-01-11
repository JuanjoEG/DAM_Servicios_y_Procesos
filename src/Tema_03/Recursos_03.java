package Tema_03;

import static Principal_Main.Main.*;
import static Tema_03.T_03.*;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Recursos_03 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_03 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        **********************************************************************************************************************************
                                       
            - PARA CREAR PROCESOS EN JAVA, VAMOS A UTILIZAR LA CLASE   --->   Process
              QUE NOS OFRECE LOS M�TODOS                               --->   ProcessBuilder.start()   Y   Runtime.exec()
                                       
                    - PUEDEN CREAR UN PROCESO NATIVO DEL SISTEMA OPERATIVO DONDE SE EST� EJECUTANDO JVM,
                      LA M�QUINA VIRTUAL DE JAVA.
                    - RECIBEN COMO PAR�METRO EL COMANDO A EJECUTAR.
                    - DEVUELVEN UN OBJETO DE LA CLASE                  --->   Process.
                    - COMPROBAR�N QUE SEA UN COMANDO O FICHERO EJECUTABLE
                      V�LIDO EN EL S.O. QUE ESTEMOS UTILIZANDO.
                    - LA CREACI�N DE UN NUEVO PROCESO DEPENDE DEL S.O. Y PUEDEN OCURRIR DIVERSOS PROBLEMAS:
                            - NO ENCONTRAR EL EJECUTABLE DEBIDO A LA RUTA INDICADA.
                            - NO TENER PERMISOS DE EJECUCI�N.
                            - NO SER UN EJECUTABLE V�LIDO EN EL SISTEMA.
                    - EN CASO DE PROBLEMAS, SE LANZAR� UNA EXCEPCI�N, DIFERENTE SEG�N S.O. Y SUBCLASE DE   --->   IOException.
                                       
            - ProcessBuilder.start():
                    - INICIA UN PROCESO NUEVO.
                    - EJECUTA EL COMANDO Y LOS ARGUMENTOS QUE LE INDIQUEMOS EN EL M�TODO          --->   command()
                    - SE EJECUTA EN EL DIRECTORIO DE TRABAJO QUE LE INDIQUEMOS CON EL M�TODO      --->   directory()
                    - PUEDE UTILIZAR LAS VARIABLES DE ENTORNO DEL S.O. QUE EST�N DEFINIDAS EN     --->   environment()
                            - LAS VARIABLES DE ENTORNO SON LOS PROGRAMAS QUE EST�N CARGADOS EN EL PATH.          
                                       
            - Runtime.exec(String[] cmdarray, String[] envp, File dir):
                    - EJECUTA EL COMANDO                                 --->   cmdarray(DEBE INCLUIR ARGUMENTOS SI LOS HAY)
                    - EN EL ENTORNO                                      --->   envp
                    - Y EN EL DIRECTORIO                                 --->   dir
                    - EL PROCESO HIJO QUE CREA SER� TOTALMENTE INDEPENDIENTE AL PROCESO PADRE.
                                       
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

            - USANDO ProcessBuilder, DESDE JAVA PODEMOS LANZAR,
              EN UN PROCESO INDEPENDIENTE, UN M�TODO DE UNA CLASE CREADA POR NOSOTROS: PARA ELLO:
                    - TENEMOS QUE PROGRAMAR DE FORMA HABITUAL LA CLASE JAVA,
                      INCLUYENDO EL/LOS M�TODOS QUE VAMOS A QUERER QUE SE EJECUTEN EN FORMA DE PROCESO INDEPENDIENTE.
                                       
                            - TENGO LA CLASE Sumador:
                                       
                                    - Y TIENE UN M�TODO sumar QUE RECIBE DOS PAR�METROS ENTEROS
                                      Y DEVUELVE UN ENTERO CON LA SUMA DE TODOS LOS N�MEROS QUE HAY ENTRE LOS DOS PAR�METROS.
                                    - NUESTRO M�TODO sumar RECIBE DOS P�METROS,
                                      Y SABEMOS QUE 'Strin[] args' ES UN ARRAY DE String LLAMADO 'args'
                                      POR TANTO LOS PASAREMOS A TRAV�S DEL 'Strin[] args' DEL main DE LA SIGUIENTE FORMA:
                                      
                                            int numero1 = Integer.valueOf(args[0]);
                                            int numero2 = Integer.valueOf(args[1]);
                                    - CUANDO YO LLAME A LA CLASE JAVA Sumador EN EL CMD POR EJEMPLO,
                                      Y LE PASE PAR�MEROS: --> Tema_03.Sumador 21 56
                                      LE ESTAMOS DICIENDO QUE:   args[0] ---> 21       args[1] ---> 56                                  
                                      
                                    - DENTRO DEL main LLAMAMOS AL M�TODO sumar.
                                            int suma = sumar(numero1, numero2);
                                    - EN EL main LO QUE HACEMOS ES CREAR UN FICHERO .txt Y ESCRIBE EN �L EL RESULTADO.
                            
                            - TENGO LA CLASE Lanzador_Sumador:
                                       
                                    - TODO LO QUE TIENE QUE VER CON INVOCAR AL S.O. EST� AQU�.
                                    - EN SU main PIDE AL USUARIO DOS N�MEROS Y LLAMAREMOS AL M�TODO.  --->    ejecutarClaseProceso:
                                            int estado = ejecutarClaseProceso(Sumador.class, numero1, numero2);

                                    - CREAMOS UNA FUNCI�N DENTRO DE LA CLASE Lanzador_Sumador  --->    ejecutarClaseProceso:
                                            - RECIBE COMO ATRIBUTOS:
                                                    - clase: NOMBRE DE LA CLASE A EJECUTAR.
                                                    - TENDR� TANTOS PAR�METROS COMO PAR�METROS TENGA LA CLASE A EJECUTAR.
       
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

            - CREACI�N DEL PROCESO CON   --->   ProcessBuilder
                    - CON PAR�METROS:
                            - RUTA DEL EJECUTABLE DE JAVA, LA VARIABLE DE ENTORNO java.home.
                            - OPCI�N "-CP" SE USAS PARA INDICAR QUE ES UN EJECUTABLE DE JAVA.
                            - RUTA DONDE SE EST�N ALMACENANDO LAS CLASES JAVA.
                            - NOMBRE DE NUESTRA CLASE QUE QUEREMOS EJECUTAR.
                            - LISTA DE PAR�METROS QUE NECESITABA NUESTRA CLASE.
                                    - SER�N OBLIGATORIAMENTE DE TIPO String:
                                      EN EL main DE LA CLASE USAREMOS EL ARRAY DE String QUE RECIBE PARA RECUPERAR LOS PAR�METROS.
                            - CON TODA �STA INFORMACI�N LLAMAREMOS A      --->   ProcessBuilder
                                       
            - DESPU�S LLAMAREMOS EN EL main AL M�TODO DE LA SIGUIENTE FORMA:
                    int estado = ejecutarClaseProceso(Sumador.class, numero1, numero2);
                    - SIENDO Sumador EL NOMBRE DE LA CLASE QUE QUEREMOS EJECUTAR
                    - SIENDO numero1, numero2 LOS PAR�METROS DE LA CLASE.
                                       
            - COMO OPCI�N PODEMOS GUARDAR LOS ERRORES SI SE GENERASEN, EN UN FICHERO error.txt.
                     
  public static int ejecutarClaseProceso(Class clase, int n1, int n2) throws IOException, InterruptedException {
                                                                      // ESTE M�TODO SE ENCARGAR� DE EJECUTAR OTRA CLASE EN UN PROCESO DIFERENTE
          String ruta_error = "J:\\Ejercicios\\error.txt";
                                                                      // PARA PODER EJECUTAR LA CLASE EN LA M�QUINA VIRTUAL:
          String javaHome = System.getProperty("java.home");          // Defino d�nde est� el home de java 
          String javaBin = javaHome                                   // Defino d�nde est� el bin de Java
                  + File.separator + "bin"
                  + File.separator + "java";
          String classpath = System.getProperty("java.class.path");   // Defino el path de java -> NOMBRE COMPLETO DE LA CLASE A EJECUTAR
          String className = clase.getCanonicalName();                // Obtengo el nombre can�nico de la clase que se va a ejecutar
                                                                      // Creo el proceso a ejecutar.Los dos �ltimos par�metros son los par�metros del m�todo main de la clase

          ProcessBuilder builder = new ProcessBuilder(javaBin, "-cp",classpath, className, String.valueOf(n1), String.valueOf(n2));

                                                                      // INDICAR LAS REDIRECCIONES -> COMUNICA LOS PROCESOS PADRE E HIJO                    
          builder.redirectError(new File(ruta_error));                // Indico cu�l va a ser el fichero de errores de salida del proceso
          builder.redirectError(Redirect.INHERIT);                    // REDIRECCION -> SALIDA DE ERROR -> INHERIT = POR DEFECTO = POR PANTALLA.
                                                                      // Indico cu�l va a ser el fichero de salida del proceso
          builder.redirectOutput(Redirect.INHERIT);                   // REDIRECCION -> SALIDA POR PANTALLA

          Process process = builder.start();                          // EJECUTAMOS EL PROCESO
          process.waitFor();                                          // Espero a que se ejecute el proceso
          return process.exitValue();                                 // DEVOLVEMOS SU VALOR DE EJECUCI�N
      }
                                                 
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

            EJECUTAR UN PROGRAMA PASO A PASO EN NetBeans:
            BOT�N DERECHO SOBRE EL PROGRAMA -> PROPIEDADES -> RUN -> MAIN CLASS -> BROWSE... Y SELECCIONAMOS LA CLASE.
            EN EL MEN� PRINCIPAL -> DEBUG -> STEP INTO -> EMPIEZA A COMPILAR.
            F8 -> SIGUIENTE INSTRUCCI�N    F7 -> METERSE DENTRO DEL M�TODO ( ejecutarClaseProceso )

            PODEMOS VER LOS SIGUIENTES DATOS:

            CLASSPATH   = J:\\Programacion\\Programacion_De_Servicios_Y_Procesos\\build\\classes
                         
            JAVABIN     = C:\\Program Files\\Java\\jdk-18.0.2\\bin\\java
                         
            JAVAHOME    = C:\\Program Files\\Java\\jdk-18.0.2
                          

            AHORA PODEMOS LANZAR EL PROCESO EN EL CMD -> ESCRIBIMOS:   ( "JAVABIN" -cp CLASSPATH PAQUETE.CLASE PAR�METROS )

            "C:\\Program Files\\Java\\jdk-18.0.2\\bin\\java" -cp J:\\Programacion\\Programacion_De_Servicios_Y_Procesos\\build\\classes Tema_03.Sumador 21 56

            Y NOS CONTESTA:
            Proceso HIJO -> El resultado de la suma de todos los n�meros del 21 al 56 es 1386
            Proceso HIJO -> Podras encontrar tambi�n el resultado en: J:\\Ejercicios\\sumador.txt
                                        
            NOTA: EN EL CMD TRANSFORMAR LAS CONTRABARRAS DOBLES SI APARECIERAN, EN CONTRABARRAS SIMPLES.
                                        
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

            - EL M�TODO destroy DE LA CLASE Process FINALIZA UN PROCESO HIJO QUE HAYA CREADO.
                                       
                    - ELIMINA EL PROCESO HIJO QUE INDIQUEMOS, Y LIBERA TODOS LOS RECURSOS DISPONIBLES.
                    - EL S.O. PUEDE REASIGNAR ESTOS RECURSOS DISPONIBLES.
                    - SI ESTAMOS UTILIZANDO JAVA, LOS RECURSOS DEL PROCESO LOS LIBERA EL RECOLECTOR DE BASURA.
                                       
            - SI NO FORZAMOS EL FIN DE LA EJECUCI�N DEL PROPIO HIJO,
              �STE TERMINA Y LIBERA SUS RECURSOS AL FINALIZAR POR DEFECTO.
                                       
            - ESTO TAMBI�N SE PUEDE PRODUCIR CUANDO EL PROCESO HIJO EJECUTA LA OPERACI�N   --->   exit
              exit FUERZA LA FINALIZACI�N DE SU EJECUCI�N. FINALIZACI�N FORZADA.
                                       
                                 destroy   --->   ELIMINAR EL PROCESO. NO LO TERMINAS, LO ELIMINAS.
                                 exit      --->   FORZAR LA FINALIZACI�N.

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

            - LOS PROCESOS SON UN PROGRAMA EN EJECUCI�N Y PUEDEN PEDIR Y LEER INFORMACI�N, PROCESARLA Y MOSTRARLA POR PANTALLA.
              PARA ELLO TENEMOS:
                    - ENTRADA DE DATOS EST�NDAR (stdin):
                            - POR ESTA OBTENDREMOS LOS DATOS NECESARIOS PARA QUE NUESTRO PROCESO SE EJECUTE.
                            - PODREMOS LEER DE TECLADO, DE UN FICHERO, DE UN SOCKET, ETC...
                    - SALIDA EST�NDAR (stdout):
                            - MEDIANTE LA SALIDA DE DATOS, PODEMOS MOSTRAR INFORMACI�N.
                            - PODREMOS MOSTRAR INFORMACI�N EN LA PANTALLA, EN UN FICHERO, EN UN SOCKET, ETC...
                    - LA SALIDA DE ERROR (stderr):
                            - MEDIANTE LA SALIDA DE ERROR, MOSTRAREMOS INFORMACI�N
                              DE LOS ERRORES EN LA EJECUCI�N DE NUESTROS PROCESOS.
                            - PODREMOS MOSTRAR LOS ERRORES IGUALMENTE EN LA PANTALLA, EN UN FICHERO, EN UN SOCKET, ETC...
                                       
            - EN GENERAL EN LA TEOR�A DE PROCESOS, 
              LAS ENTRADAS Y LAS SALIDAS DE DATOS DE UN PROCESO HIJO SEAN LAS MISMAS QUE LAS DE SU PROCESO PADRE.
                    - SI CREAMOS UN PROCESO HIJO DENTRO DE UN PROGRAMA QUE LEE LA INFORMACI�N DE UN FICHERO
                      Y MUESTRA LOS RESULTADOS POR PANTALLA, ESPERAMOS QUE EL PROCESO HIJO QUE CREEMOS LO HAGA DE IGUAL FORMA.
                                       
            - EN JAVA SI CREAMOS UN PROCESO, NO VA A TENER SU PROPIA INTERFAZ DE COMUNICACI�N,
              Y NO PODR� COMUNICARSE CON EL PADRE DIRECTAMENTE.
                    - SI NECESITAMOS ESTA COMUNICACI�N ENTRE PROCESOS,
                      DEBEREMOS REDIRECCIONAR TODAS SUS SALIDAS Y ENTRADAS, stdin, stdout Y stderr MEDIANTE:
                                       
                            - OutputStream :
                                    - SER� EL FLUJO DE SALIDA.
                                    - EST� CONECTADO A LA SALIDA EST�NDAR DEL PROCESO HIJO.
                                    - SE REDIRECCIONA CON                  -->  redirectOutput.
                                       
                            - InputStream  :
                                    - SER� EL FLUJO DE ENTRADA.
                                    - EST� CONECTADO A LA ENTRADA EST�DAR DEL PROCESO HIJO.
                                    - SE REDIRECCIONA CON                  -->  redirectInput.
                                       
                            - ErrorStream  :
                                    - SER� EL FLUJO DE SALIDA PARA ERRORES.
                                    - EST� CONECTADO A LA SALIDA EST�NDAR DE ERRORES DEL PROCESO HIJO.
                                    - SE REDIRECCIONA CON                  -->  redirectError.
                                       
                    - UNA VEZ REDIRIGIDOS TODOS ESTOS FLUJOS, PODREMOS HACER UNA COMUNICACI�N ENTRE LOS PROCESOS PADRE E HIJO.
                    - SI QUEREMOS REDIRECCIONAR A LA SALIDA/ENTRADA EST�NDAR,
                                       
                      DEBEMOS UTILIZAR :                                   -->  Redirect.INHERIT.
                                       
                    - EN NUESTRO EJEMPLO, SI EN M�TODO   -->   ejecutarClaseProceso
                      NO PONEMOS  -->   builder.redirectOutput(Redirect.INHERIT); 
                      EL PADRE Y EL HIJO NO SE VEN, Y SOLO SE MOSTRAR�A LOS MENSAJES DEL PADRE.

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
                                       
            - SI EN JAVA LANZAMOS M�S DE UN PROCESO A LA VEZ,
              NO PODEMOS SABER QU� L�NEA DE C�DIGO EST� EJECUTANDO CADA UNO.
                    - EJEMPLO: SI DOS O M�S PROCESOS NECESITAN ACCEDER A UNA VARIABLE EN MEMORIA,
                      ES POSIBLE QUE ALGUNO DE ELLOS LA MODIFIQUE.
                    - LOS DEM�S YA NO PUEDEN VER SU VALOR ORIGINAL,
                      SINO EL VALOR MODIFICADO POR EL PROCESO QUE ACCEDI� PRIMERO.
                                       
            - ESTO SE DENOMINA ZONA CR�TICA:
                    - LO VAMOS A ENCONTRAR EN TODOS Y CADA UNO DE LOS PROGRAMAS QUE TENGAN M�S DE UN PROCESO ACTIVO.
                    - ESTAS ZONAS CR�TICAS DEBEN PROTEGERSE.
                    - LOS MECANISMOS M�S COMUNES PARA CONTROLAR ESTAS SITUACIONES SON:
                            - SEM�FOROS.
                            - COLAS DE MENSAJES.
                            - PIPES O TUBER�AS.
                            - BLOQUES DE MEMORIA COMPARTIDA.
                                       
            - TODOS ESTOS MECANISMOS OFRECEN UNA SOLUCI�N AL PROBLEMA DE LAS SECCIONES CR�TICAS,
              PERO UNOS NECESITAN MAYOR ELABORACI�N QUE OTROS.
            - ESTOS MECANISMOS IMPIDEN QUE SE EJECUTE UN PROCESO QUE PUEDA USAR UN RECURSO QUE 
              YA EST� SIENDO UTILIZADO POR OTRO PROCESO QUE TRABAJE EN LA ZONA CR�TICA.
                                       
            - EN JAVA, SE PUEDE SINCRONIZAR UN BLOQUE DE C�DIGO ENTRE 
              VARIOS PROCESOS INCLUYENDO LA PALABRA RESERVADA         --->       synchronized.    
                                       
                    - DE ESTA FORMA, LA PROPIA M�QUINA VIRTUAL DE JAVA HACE QUE ESE C�DIGO SEA SEGURO
                      EN LA EJECUCI�N DE DOS O M�S PROCESOS.             

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
                case "11" -> {
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