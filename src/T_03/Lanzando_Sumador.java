package T_03;

import java.io.File;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author Juan José Estévez González
 */
public class Lanzando_Sumador {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int numero1, numero2, numero3;
        
        try {
            // PEDIMOS LOS DOS NÚMEROS
            System.out.println("Vamos a calcular la suma de todos los números comprendidos entre dos valores:");
            System.out.print("\nDame el primer número:   ");
            numero1 = teclado.nextInt();
            System.out.print("\nDame el otro número:   ");
            numero2 = teclado.nextInt();        
        
        // ME ASEGURO QUE EL PRIMERO SEA MENOR QUE EL SEGUNDO - Y SI NO ES ASÍ SE INTERCAMBIAN.
        if (numero1>numero2) {        
            numero3 = numero1;
            numero1 = numero2;
            numero2 = numero3;            
        }       
                    
            // LLAMAMOS AL MÉTODO ejecutarClaseProceso Y MOSTRAMOS SI SE A EJECUTADO CORRECTAMENTE
            int estado_ejecucion = ejecutarClaseProceso(Sumador.class, numero1, numero2);
            if (estado_ejecucion == 0) {                
                System.out.println("\nProceso PADRE -> Ejecutado correctamente.\n");
            } 
            else {
                System.out.println("\nProceso PADRE -> Error ejecutando el proceso.\n");
            }
        } catch (IOException | InterruptedException ex) {
            System.err.println("\nProceso PADRE -> Error: " + ex.toString());
            System.exit(-1);
        } catch (InputMismatchException ex) {
            System.out.println("\nEl valor introducido no se corresponde con lo solicitado.\n");        
        }
    }

    /**
     * Ejecuta una clase del proyecto en un proceso
     *
     * @param clase Clase a ejecutar
     * @param n1 número 1
     * @param n2 número 2
     * @return Resultado de haber ejecutado el proceso
     * @throws IOException Esta excepción se lanzará si ocurre algún error en la
     * ejecución del proceso
     * @throws InterruptedException Esta excepción se lanzará si ocurre algún
     * error en la ejecución del proceso
     *
     * La clase a ejecutar ha de tener un método main que es el que se ejecutará
     */
    
    public static int ejecutarClaseProceso(Class clase, int n1, int n2) throws IOException, InterruptedException {
        
        // ESTE MÉTODO SE ENCARGARÁ DE EJECUTAR OTRA CLASE EN UN PROCESO DIFERENTE
                
        String ruta_error = "J:\\Ejercicios\\error.txt";
        
        // PARA PODER EJECUTAR LA CLASE EN LA MÁQUINA VIRTUAL:
        
        // Defino dónde está el home de java 
        String javaHome = System.getProperty("java.home");
        
        System.out.println("\nJAVAHOME : " + javaHome);
        
        // Defino dónde está el bin de Java
        String javaBin = javaHome
                + File.separator + "bin"
                + File.separator + "java";
        
        System.out.println("\nJAVABIN : " + javaBin);
        
        // Defino el path de java -> NOMBRE COMPLETO DE LA CLASE A EJECUTAR
        String classpath = System.getProperty("java.class.path");
        
        System.out.println("\nCLASSPATH : " + classpath);
        
        // Obtengo el nombre canónico de la clase que se va a ejecutar
        String className = clase.getCanonicalName();
        
        System.out.println("\nCLASSNAME : " + className);
        
        // 
        // Creo el proceso a ejecutar
        // Los dos últimos parámetros son los parámetros del método main de la clase 
        ProcessBuilder builder = new ProcessBuilder(javaBin, "-cp",classpath, className, String.valueOf(n1), String.valueOf(n2));
        
        // INDICAR LAS REDIRECCIONES -> COMUNICA LOS PROCESOS PADRE E HIJO     
        builder.redirectError(new File(ruta_error));        // Indico cuál va a ser el fichero de errores de salida del proceso
        builder.redirectError(Redirect.INHERIT);          // REDIRECCION -> SALIDA DE ERROR -> INHERIT = POR DEFECTO = POR PANTALLA.
        
        // Indico cuál va a ser el fichero de salida del proceso
        builder.redirectOutput(Redirect.INHERIT);         // REDIRECCION -> SALIDA POR PANTALLA
        
        // EJECUTAMOS EL PROCESO
        Process process = builder.start();
        
        // Espero a que se ejecute el proceso
        process.waitFor();
        
        // DEVOLVEMOS SU VALOR DE EJECUCIÓN
        return process.exitValue();
    }
}
    /**
    *       L A N Z A R     P R O C E S O     E N     E L     C M D .
    *
    * EJECUTAR UN PROGRAMA PASO A PASO:
    * BOTÓN DERECHO SOBRE EL PROGRAMA -> PROPIEDADES -> RUN -> MAIN CLASS -> BROWSE... Y SELECCIONAMOS LA CLASE.
    * EN EL MENÚ PRINCIPAL -> DEBUG -> STEP INTO -> EMPIEZA A COMPILAR.
    * F8 -> SIGUIENTE INSTRUCCIÓN    F7 -> METERSE DENTRO DEL MÉTODO ( ejecutarClaseProceso )
    *
    * PODEMOS VER LOS SIGUIENTES DATOS:
    *
    * CLASSPATH   = J:\Programacion\Programacion_De_Servicios_Y_Procesos\build\classes
    * JAVABIN     = C:\Program Files\Java\jdk-18.0.2\bin\java
    * JAVAHOME    = C:\Program Files\Java\jdk-18.0.2
    *
    * AHORA PODEMOS LANZAR EL PROCESO EN EL CMD -> ESCRIBIMOS:   ( "JAVABIN" -cp CLASSPATH PAQUETE.CLASE PARÁMETROS )
    *
    * "C:\Program Files\Java\jdk-18.0.2\bin\java" -cp J:\Programacion\Programacion_De_Servicios_Y_Procesos\build\classes T_03.Sumador 21 56
    *
    * Y NOS CONTESTA:
    * 
    * Proceso HIJO -> El resultado de la suma de los números de 21 a 56 es 1386
    * Proceso HIJO -> Sumo desde 21 hasta 56  RESULTADO: 1386
    *
    */