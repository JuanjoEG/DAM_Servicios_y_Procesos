package Tema_05;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

/*
 *     C R E A C I � N   D E   H I L O S
 *
 * 1.- CREAR UNA CLASE QUE IMPLEMENTE LA INTERFAZ Runnable.
 * 2.- REESCRIBIR EL M�TODO run. (SI ES OBLIGATORIO)
 * 3.- CREAR UN OBLETO DE LA NUEVA CLASE.
 *     ESE OBJETO SER� EL HILO CON EL QUE TRABAJAREMOS.
 *
 *     PODREMOS CREAR VARIABLES Y M�TODOS (CONSTRUCTORES,GETTERS, SETTERS ...)
 *     MEDIANTE LOS CONSTRUCTORES CREAMOS HILOS.
 *
 */
public class Hilo02 implements Runnable{
    
    @Override
    public void run() {
        
        // AQU� EL C�DIGO QUE SE EJECUTE DENTRO DEL HILO.
        // PODEMOS CREAR UN BUCLE INFINITO SI NOS INTERESA.
        
        while(true) {
        
            /*
              EN SEGUNDO PLANO.
              C�DIGO A EJECUTAR POR EL HILO.
              EJECUCI�N CONTINUA.
            */
        }    
    }
    public static void main(String[] args) {
        
        // CREAMOS EL OBJETO DE LA CLASE Hilo02
        Hilo02 hilo2 = new Hilo02();
        
        // CREAMOS UN OBJETO DE LA CLASE Thread
        Thread hebra = new Thread(hilo2);
        
        // LLAMAMOS AL M�TODO run()
        // LANZAMOS EL HILO CON start()
        // ESTO HACE QUE EJECUTE run() EN SEGUNDO PLANO
        // ���OJO!!! -->  NO EJECUTAR DIRECTAMENTE run()
        hebra.start();
        
    }
}