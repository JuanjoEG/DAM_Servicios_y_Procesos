package Tema_03;

import static Principal_Main.Main.*;
import static Tema_03.T_03.*;

/**
 *
 * @author Juan José Estévez González
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
              QUE NOS OFRECE LOS MÉTODOS                               --->   ProcessBuilder.start()   Y   Runtime.exec()
                                       
                    - PUEDEN CREAR UN PROCESO NATIVO DEL SISTEMA OPERATIVO DONDE SE ESTÁ EJECUTANDO JVM,
                      LA MÁQUINA VIRTUAL DE JAVA.
                    - RECIBEN COMO PARÁMETRO EL COMANDO A EJECUTAR.
                    - DEVUELVEN UN OBJETO DE LA CLASE                  --->   Process.
                    - COMPROBARÁN QUE SEA UN COMANDO O FICHERO EJECUTABLE
                      VÁLIDO EN EL S.O. QUE ESTEMOS UTILIZANDO.
                    - LA CREACIÓN DE UN NUEVO PROCESO DEPENDE DEL S.O. Y PUEDEN OCURRIR DIVERSOS PROBLEMAS:
                            - NO ENCONTRAR EL EJECUTABLE DEBIDO A LA RUTA INDICADA.
                            - NO TENER PERMISOS DE EJECUCIÓN.
                            - NO SER UN EJECUTABLE VÁLIDO EN EL SISTEMA.
                    - EN CASO DE PROBLEMAS, SE LANZARÁ UNA EXCEPCIÓN, DIFERENTE SEGÚN S.O. Y SUBCLASE DE   --->   IOException.
                                       
            - ProcessBuilder.start():
                    - INICIA UN PROCESO NUEVO.
                    - EJECUTA EL COMANDO Y LOS ARGUMENTOS QUE LE INDIQUEMOS EN EL MÉTODO          --->   command()
                    - SE EJECUTA EN EL DIRECTORIO DE TRABAJO QUE LE INDIQUEMOS CON EL MÉTODO      --->   directory()
                    - PUEDE UTILIZAR LAS VARIABLES DE ENTORNO DEL S.O. QUE ESTÉN DEFINIDAS EN     --->   environment()
                            - LAS VARIABLES DE ENTORNO SON LOS PROGRAMAS QUE ESTÁN CARGADOS EN EL PATH.          
                                       
            - Runtime.exec(String[] cmdarray, String[] envp, File dir):
                    - EJECUTA EL COMANDO                                 --->   cmdarray(DEBE INCLUIR ARGUMENTOS SI LOS HAY)
                    - EN EL ENTORNO                                      --->   envp
                    - Y EN EL DIRECTORIO                                 --->   dir
                    - EL PROCESO HIJO QUE CREA SERÁ TOTALMENTE INDEPENDIENTE AL PROCESO PADRE.
                                       
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
              EN UN PROCESO INDEPENDIENTE, UN MÉTODO DE UNA CLASE CREADA POR NOSOTROS: PARA ELLO:
                    - TENEMOS QUE PROGRAMAR DE FORMA HABITUAL LA CLASE JAVA,
                      INCLUYENDO EL/LOS MÉTODOS QUE VAMOS A QUERER QUE SE EJECUTEN EN FORMA DE PROCESO INDEPENDIENTE.
                                       
                            - TENGO LA CLASE Sumador:
                                       
                                    - Y TIENE UN MÉTODO sumar QUE RECIBE DOS PARÁMETROS ENTEROS
                                      Y DEVUELVE UN ENTERO CON LA SUMA DE TODOS LOS NÚMEROS QUE HAY ENTRE LOS DOS PARÁMETROS.
                                    - NUESTRO MÉTODO sumar RECIBE DOS PÁMETROS,
                                      Y SABEMOS QUE 'Strin[] args' ES UN ARRAY DE String LLAMADO 'args'
                                      POR TANTO LOS PASAREMOS A TRAVÉS DEL 'Strin[] args' DEL main DE LA SIGUIENTE FORMA:
                                      
                                            int numero1 = Integer.valueOf(args[0]);
                                            int numero2 = Integer.valueOf(args[1]);
                                    - CUANDO YO LLAME A LA CLASE JAVA Sumador EN EL CMD POR EJEMPLO,
                                      Y LE PASE PARÁMEROS: --> Tema_03.Sumador 21 56
                                      LE ESTAMOS DICIENDO QUE:   args[0] ---> 21       args[1] ---> 56                                  
                                      
                                    - DENTRO DEL main LLAMAMOS AL MÉTODO sumar.
                                            int suma = sumar(numero1, numero2);
                                    - EN EL main LO QUE HACEMOS ES CREAR UN FICHERO .txt Y ESCRIBE EN ÉL EL RESULTADO.
                            
                            - TENGO LA CLASE Lanzador_Sumador:
                                       
                                    - TODO LO QUE TIENE QUE VER CON INVOCAR AL S.O. ESTÁ AQUÍ.
                                    - EN SU main PIDE AL USUARIO DOS NÚMEROS Y LLAMAREMOS AL MÉTODO.  --->    ejecutarClaseProceso:
                                            int estado = ejecutarClaseProceso(Sumador.class, numero1, numero2);

                                    - CREAMOS UNA FUNCIÓN DENTRO DE LA CLASE Lanzador_Sumador  --->    ejecutarClaseProceso:
                                            - RECIBE COMO ATRIBUTOS:
                                                    - clase: NOMBRE DE LA CLASE A EJECUTAR.
                                                    - TENDRÁ TANTOS PARÁMETROS COMO PARÁMETROS TENGA LA CLASE A EJECUTAR.
       
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

            - CREACIÓN DEL PROCESO CON   --->   ProcessBuilder
                    - CON PARÁMETROS:
                            - RUTA DEL EJECUTABLE DE JAVA, LA VARIABLE DE ENTORNO java.home.
                            - OPCIÓN "-CP" SE USAS PARA INDICAR QUE ES UN EJECUTABLE DE JAVA.
                            - RUTA DONDE SE ESTÁN ALMACENANDO LAS CLASES JAVA.
                            - NOMBRE DE NUESTRA CLASE QUE QUEREMOS EJECUTAR.
                            - LISTA DE PARÁMETROS QUE NECESITABA NUESTRA CLASE.
                                    - SERÁN OBLIGATORIAMENTE DE TIPO String:
                                      EN EL main DE LA CLASE USAREMOS EL ARRAY DE String QUE RECIBE PARA RECUPERAR LOS PARÁMETROS.
                            - CON TODA ÉSTA INFORMACIÓN LLAMAREMOS A      --->   ProcessBuilder
                                       
            - DESPUÉS LLAMAREMOS EN EL main AL MÉTODO DE LA SIGUIENTE FORMA:
                    int estado = ejecutarClaseProceso(Sumador.class, numero1, numero2);
                    - SIENDO Sumador EL NOMBRE DE LA CLASE QUE QUEREMOS EJECUTAR
                    - SIENDO numero1, numero2 LOS PARÁMETROS DE LA CLASE.
                                       
            - COMO OPCIÓN PODEMOS GUARDAR LOS ERRORES SI SE GENERASEN, EN UN FICHERO error.txt.
                     
  public static int ejecutarClaseProceso(Class clase, int n1, int n2) throws IOException, InterruptedException {
                                                                      // ESTE MÉTODO SE ENCARGARÁ DE EJECUTAR OTRA CLASE EN UN PROCESO DIFERENTE
          String ruta_error = "J:\\Ejercicios\\error.txt";
                                                                      // PARA PODER EJECUTAR LA CLASE EN LA MÁQUINA VIRTUAL:
          String javaHome = System.getProperty("java.home");          // Defino dónde está el home de java 
          String javaBin = javaHome                                   // Defino dónde está el bin de Java
                  + File.separator + "bin"
                  + File.separator + "java";
          String classpath = System.getProperty("java.class.path");   // Defino el path de java -> NOMBRE COMPLETO DE LA CLASE A EJECUTAR
          String className = clase.getCanonicalName();                // Obtengo el nombre canónico de la clase que se va a ejecutar
                                                                      // Creo el proceso a ejecutar.Los dos últimos parámetros son los parámetros del método main de la clase

          ProcessBuilder builder = new ProcessBuilder(javaBin, "-cp",classpath, className, String.valueOf(n1), String.valueOf(n2));

                                                                      // INDICAR LAS REDIRECCIONES -> COMUNICA LOS PROCESOS PADRE E HIJO                    
          builder.redirectError(new File(ruta_error));                // Indico cuál va a ser el fichero de errores de salida del proceso
          builder.redirectError(Redirect.INHERIT);                    // REDIRECCION -> SALIDA DE ERROR -> INHERIT = POR DEFECTO = POR PANTALLA.
                                                                      // Indico cuál va a ser el fichero de salida del proceso
          builder.redirectOutput(Redirect.INHERIT);                   // REDIRECCION -> SALIDA POR PANTALLA

          Process process = builder.start();                          // EJECUTAMOS EL PROCESO
          process.waitFor();                                          // Espero a que se ejecute el proceso
          return process.exitValue();                                 // DEVOLVEMOS SU VALOR DE EJECUCIÓN
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
            BOTÓN DERECHO SOBRE EL PROGRAMA -> PROPIEDADES -> RUN -> MAIN CLASS -> BROWSE... Y SELECCIONAMOS LA CLASE.
            EN EL MENÚ PRINCIPAL -> DEBUG -> STEP INTO -> EMPIEZA A COMPILAR.
            F8 -> SIGUIENTE INSTRUCCIÓN    F7 -> METERSE DENTRO DEL MÉTODO ( ejecutarClaseProceso )

            PODEMOS VER LOS SIGUIENTES DATOS:

            CLASSPATH   = J:\\Programacion\\Programacion_De_Servicios_Y_Procesos\\build\\classes
                         
            JAVABIN     = C:\\Program Files\\Java\\jdk-18.0.2\\bin\\java
                         
            JAVAHOME    = C:\\Program Files\\Java\\jdk-18.0.2
                          

            AHORA PODEMOS LANZAR EL PROCESO EN EL CMD -> ESCRIBIMOS:   ( "JAVABIN" -cp CLASSPATH PAQUETE.CLASE PARÁMETROS )

            "C:\\Program Files\\Java\\jdk-18.0.2\\bin\\java" -cp J:\\Programacion\\Programacion_De_Servicios_Y_Procesos\\build\\classes Tema_03.Sumador 21 56

            Y NOS CONTESTA:
            Proceso HIJO -> El resultado de la suma de todos los números del 21 al 56 es 1386
            Proceso HIJO -> Podras encontrar también el resultado en: J:\\Ejercicios\\sumador.txt
                                        
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

            - EL MÉTODO destroy DE LA CLASE Process FINALIZA UN PROCESO HIJO QUE HAYA CREADO.
                                       
                    - ELIMINA EL PROCESO HIJO QUE INDIQUEMOS, Y LIBERA TODOS LOS RECURSOS DISPONIBLES.
                    - EL S.O. PUEDE REASIGNAR ESTOS RECURSOS DISPONIBLES.
                    - SI ESTAMOS UTILIZANDO JAVA, LOS RECURSOS DEL PROCESO LOS LIBERA EL RECOLECTOR DE BASURA.
                                       
            - SI NO FORZAMOS EL FIN DE LA EJECUCIÓN DEL PROPIO HIJO,
              ÉSTE TERMINA Y LIBERA SUS RECURSOS AL FINALIZAR POR DEFECTO.
                                       
            - ESTO TAMBIÉN SE PUEDE PRODUCIR CUANDO EL PROCESO HIJO EJECUTA LA OPERACIÓN   --->   exit
              exit FUERZA LA FINALIZACIÓN DE SU EJECUCIÓN. FINALIZACIÓN FORZADA.
                                       
                                 destroy   --->   ELIMINAR EL PROCESO. NO LO TERMINAS, LO ELIMINAS.
                                 exit      --->   FORZAR LA FINALIZACIÓN.

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

            - LOS PROCESOS SON UN PROGRAMA EN EJECUCIÓN Y PUEDEN PEDIR Y LEER INFORMACIÓN, PROCESARLA Y MOSTRARLA POR PANTALLA.
              PARA ELLO TENEMOS:
                    - ENTRADA DE DATOS ESTÁNDAR (stdin):
                            - POR ESTA OBTENDREMOS LOS DATOS NECESARIOS PARA QUE NUESTRO PROCESO SE EJECUTE.
                            - PODREMOS LEER DE TECLADO, DE UN FICHERO, DE UN SOCKET, ETC...
                    - SALIDA ESTÁNDAR (stdout):
                            - MEDIANTE LA SALIDA DE DATOS, PODEMOS MOSTRAR INFORMACIÓN.
                            - PODREMOS MOSTRAR INFORMACIÓN EN LA PANTALLA, EN UN FICHERO, EN UN SOCKET, ETC...
                    - LA SALIDA DE ERROR (stderr):
                            - MEDIANTE LA SALIDA DE ERROR, MOSTRAREMOS INFORMACIÓN
                              DE LOS ERRORES EN LA EJECUCIÓN DE NUESTROS PROCESOS.
                            - PODREMOS MOSTRAR LOS ERRORES IGUALMENTE EN LA PANTALLA, EN UN FICHERO, EN UN SOCKET, ETC...
                                       
            - EN GENERAL EN LA TEORÍA DE PROCESOS, 
              LAS ENTRADAS Y LAS SALIDAS DE DATOS DE UN PROCESO HIJO SEAN LAS MISMAS QUE LAS DE SU PROCESO PADRE.
                    - SI CREAMOS UN PROCESO HIJO DENTRO DE UN PROGRAMA QUE LEE LA INFORMACIÓN DE UN FICHERO
                      Y MUESTRA LOS RESULTADOS POR PANTALLA, ESPERAMOS QUE EL PROCESO HIJO QUE CREEMOS LO HAGA DE IGUAL FORMA.
                                       
            - EN JAVA SI CREAMOS UN PROCESO, NO VA A TENER SU PROPIA INTERFAZ DE COMUNICACIÓN,
              Y NO PODRÁ COMUNICARSE CON EL PADRE DIRECTAMENTE.
                    - SI NECESITAMOS ESTA COMUNICACIÓN ENTRE PROCESOS,
                      DEBEREMOS REDIRECCIONAR TODAS SUS SALIDAS Y ENTRADAS, stdin, stdout Y stderr MEDIANTE:
                                       
                            - OutputStream :
                                    - SERÁ EL FLUJO DE SALIDA.
                                    - ESTÁ CONECTADO A LA SALIDA ESTÁNDAR DEL PROCESO HIJO.
                                    - SE REDIRECCIONA CON                  -->  redirectOutput.
                                       
                            - InputStream  :
                                    - SERÁ EL FLUJO DE ENTRADA.
                                    - ESTÁ CONECTADO A LA ENTRADA ESTÁDAR DEL PROCESO HIJO.
                                    - SE REDIRECCIONA CON                  -->  redirectInput.
                                       
                            - ErrorStream  :
                                    - SERÁ EL FLUJO DE SALIDA PARA ERRORES.
                                    - ESTÁ CONECTADO A LA SALIDA ESTÁNDAR DE ERRORES DEL PROCESO HIJO.
                                    - SE REDIRECCIONA CON                  -->  redirectError.
                                       
                    - UNA VEZ REDIRIGIDOS TODOS ESTOS FLUJOS, PODREMOS HACER UNA COMUNICACIÓN ENTRE LOS PROCESOS PADRE E HIJO.
                    - SI QUEREMOS REDIRECCIONAR A LA SALIDA/ENTRADA ESTÁNDAR,
                                       
                      DEBEMOS UTILIZAR :                                   -->  Redirect.INHERIT.
                                       
                    - EN NUESTRO EJEMPLO, SI EN MÉTODO   -->   ejecutarClaseProceso
                      NO PONEMOS  -->   builder.redirectOutput(Redirect.INHERIT); 
                      EL PADRE Y EL HIJO NO SE VEN, Y SOLO SE MOSTRARÍA LOS MENSAJES DEL PADRE.

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
                                       
            - SI EN JAVA LANZAMOS MÁS DE UN PROCESO A LA VEZ,
              NO PODEMOS SABER QUÉ LÍNEA DE CÓDIGO ESTÁ EJECUTANDO CADA UNO.
                    - EJEMPLO: SI DOS O MÁS PROCESOS NECESITAN ACCEDER A UNA VARIABLE EN MEMORIA,
                      ES POSIBLE QUE ALGUNO DE ELLOS LA MODIFIQUE.
                    - LOS DEMÁS YA NO PUEDEN VER SU VALOR ORIGINAL,
                      SINO EL VALOR MODIFICADO POR EL PROCESO QUE ACCEDIÓ PRIMERO.
                                       
            - ESTO SE DENOMINA ZONA CRÍTICA:
                    - LO VAMOS A ENCONTRAR EN TODOS Y CADA UNO DE LOS PROGRAMAS QUE TENGAN MÁS DE UN PROCESO ACTIVO.
                    - ESTAS ZONAS CRÍTICAS DEBEN PROTEGERSE.
                    - LOS MECANISMOS MÁS COMUNES PARA CONTROLAR ESTAS SITUACIONES SON:
                            - SEMÁFOROS.
                            - COLAS DE MENSAJES.
                            - PIPES O TUBERÍAS.
                            - BLOQUES DE MEMORIA COMPARTIDA.
                                       
            - TODOS ESTOS MECANISMOS OFRECEN UNA SOLUCIÓN AL PROBLEMA DE LAS SECCIONES CRÍTICAS,
              PERO UNOS NECESITAN MAYOR ELABORACIÓN QUE OTROS.
            - ESTOS MECANISMOS IMPIDEN QUE SE EJECUTE UN PROCESO QUE PUEDA USAR UN RECURSO QUE 
              YA ESTÁ SIENDO UTILIZADO POR OTRO PROCESO QUE TRABAJE EN LA ZONA CRÍTICA.
                                       
            - EN JAVA, SE PUEDE SINCRONIZAR UN BLOQUE DE CÓDIGO ENTRE 
              VARIOS PROCESOS INCLUYENDO LA PALABRA RESERVADA         --->       synchronized.    
                                       
                    - DE ESTA FORMA, LA PROPIA MÁQUINA VIRTUAL DE JAVA HACE QUE ESE CÓDIGO SEA SEGURO
                      EN LA EJECUCIÓN DE DOS O MÁS PROCESOS.             

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