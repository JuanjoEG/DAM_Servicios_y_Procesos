package Tema_05;

/**
 *
 * @author Juan José Estévez González
 */

/*
 *     C R E A C I Ó N   D E   H I L O S
 *
 * 1.- CREAR UNA CLASE QUE IMPLEMENTE LA INTERFAZ Runnable.
 * 2.- REESCRIBIR EL MÉTODO run. (SI ES OBLIGATORIO)
 * 3.- CREAR UN OBLETO DE LA NUEVA CLASE.
 *     ESE OBJETO SERÁ EL HILO CON EL QUE TRABAJAREMOS.
 *
 *     PODREMOS CREAR VARIABLES Y MÉTODOS (CONSTRUCTORES,GETTERS, SETTERS ...)
 *     MEDIANTE LOS CONSTRUCTORES CREAMOS HILOS.
 *
 */
public class Hilo02 implements Runnable{
    
    @Override
    public void run() {
        
        // AQUÍ EL CÓDIGO QUE SE EJECUTE DENTRO DEL HILO.
        // PODEMOS CREAR UN BUCLE INFINITO SI NOS INTERESA.
        
        while(true) {
        
            /*
              EN SEGUNDO PLANO.
              CÓDIGO A EJECUTAR POR EL HILO.
              EJECUCIÓN CONTINUA.
            */
        }    
    }
    public static void main(String[] args) {
        
        // CREAMOS EL OBJETO DE LA CLASE Hilo02
        Hilo02 hilo2 = new Hilo02();
        
        // CREAMOS UN OBJETO DE LA CLASE Thread
        Thread hebra = new Thread(hilo2);
        
        // LLAMAMOS AL MÉTODO run()
        // LANZAMOS EL HILO CON start()
        // ESTO HACE QUE EJECUTE run() EN SEGUNDO PLANO
        // ¡¡¡OJO!!! -->  NO EJECUTAR DIRECTAMENTE run()
        hebra.start();
        
    }
}