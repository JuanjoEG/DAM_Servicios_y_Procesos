package IntroThreads;

/**
 * atencionColaConRunnable simula la atencion por una clase Caja, a otra clase Cliente, usando Runnable en lugar de Threads:
 * - Las clases Cliente y Caja son exactamente iguales que en la implementacion sin threads.
 * - En este caso la diferencia esta en la propia clase atencionColaConRunnable, que implementa la interfaz Runnable.
 * Incluye sobreescribir el metodo run, que en este caso sera el que llame al procesarCompra de cada caja.
 * 
 * @author oscar
 */

// 1.- CREAR UNA CLASE QUE IMPLEMENTE LA INTERFAZ Runnable.
public class atencionColaConRunnable implements Runnable{
    
    private Cliente cliente;
    private Caja caja;
    private long initialTime;

    public atencionColaConRunnable (Cliente cliente, Caja caja, long initialTime){
        this.caja = caja;
        this.cliente = cliente;
        this.initialTime = initialTime;
    }

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 });
        Cliente cliente2 = new Cliente("Cliente 2", new int[] { 1, 3, 5, 1, 1 });

        Caja caja1 = new Caja("Caja 1");
        Caja caja2 = new Caja("Caja 2");

        // Tiempo inicial de referencia
        long initialTime = System.currentTimeMillis();

        // 3.- CREAR UN OBLETO DE LA NUEVA CLASE.
        // ESE OBJETO SERÁ EL HILO CON EL QUE TRABAJAREMOS.
        Runnable proceso1 = new atencionColaConRunnable(cliente1, caja1, initialTime);
        Runnable proceso2 = new atencionColaConRunnable(cliente2, caja2, initialTime);

        // CREAMOS UN OBJETO DE LA CLASE Thread
        // LLAMAMOS AL MÉTODO run()
        // LANZAMOS EL HILO CON start()
        // ESTO HACE QUE EJECUTE run() EN SEGUNDO PLANO
        // ¡¡¡OJO!!! -->  NO EJECUTAR DIRECTAMENTE run()
        new Thread(proceso1).start();
        //new Thread(proceso2).start();
        
        Thread hebra2 = new Thread(proceso2);
        hebra2.start();

    }

    // 2.- REESCRIBIR EL MÉTODO run. (SI ES OBLIGATORIO)
    // USAMOS EL MÉTODO procesarCompra() DE LA CLASE Caja
    @Override
    public void run() {
        this.caja.procesarCompra(this.cliente, this.initialTime);
    }
    
}