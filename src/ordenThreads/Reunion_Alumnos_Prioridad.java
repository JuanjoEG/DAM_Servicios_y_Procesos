package ordenThreads;


/**
 * Ejemplo sencillo para ilustrar diferentes resultados de ejecucion.
 * @author oscar
 */
public class Reunion_Alumnos_Prioridad {
    public static void main(String args[]) throws InterruptedException{
 
        
        Thread luis = new Thread (new Alumno("Luis"));
        Thread rosa = new Thread (new Alumno("Rosa"));
        Thread juan = new Thread (new Alumno("Juan"));
        
        
        luis.setPriority(Thread.MIN_PRIORITY);
        rosa.setPriority(Thread.NORM_PRIORITY);
        juan.setPriority(Thread.MAX_PRIORITY);
        
        // Notar que el orden en que los iniciamos es diferente de su prioridad
        
        luis.start();
        rosa.start();
        juan.start();
    }  
}
/**
 * Clase Alumno, implementando Runnable para poder hacer Threads
 */
class Alumno implements Runnable{
    String mensaje;  

    public Alumno(String nombre){
        mensaje = "Hola, soy " + nombre + " y este es mi mensaje numero: ";
    }

    @Override
    public void run(){
        for (int i=1; i<6;i++){
            String msj = mensaje + i;
            System.out.println(msj);
        } 
    }
}