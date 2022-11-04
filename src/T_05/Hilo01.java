package T_05;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

/*
 *     C R E A C I � N   D E   H I L O S
 *
 * 1.- CREAR UNA CLASE QUE HEREDE DE LA CLASE Thread.
 * 2.- REESCRIBIR EL M�TODO run. (NO ES OBLIGATORIO)
 * 3.- CREAR UN OBLETO DE LA NUEVA CLASE.
 *     ESE OBJETO SER� EL HILO CON EL QUE TRABAJAREMOS.
 *
 *     PODREMOS CREAR VARIABLES Y M�TODOS (CONSTRUCTORES,GETTERS, SETTERS ...)
 *     MEDIANTE LOS CONSTRUCTORES CREAMOS HILOS.
 *
 */
public class Hilo01 extends Thread{
    
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
        
        // CREAMOS EL OBJETO 
        Hilo01 hilo1 = new Hilo01();
        
        // LLAMAMOS AL M�TODO run()
        // LANZAMOS EL HILO CON start()
        // ESTO HACE QUE EJECUTE run() EN SEGUNDO PLANO
        // ���OJO!!! -->  NO EJECUTAR DIRECTAMENTE run()
        hilo1.start();
    }
}