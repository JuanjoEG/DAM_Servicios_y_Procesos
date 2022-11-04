package IntroThreads;

/**
 * atencionColaConThreads simula la atencion por una clase Caja, a otra clase Cliente, usando threads:
 * - La clase Cliente lleva una serie de productos, cada uno de los cuales su atencion demora un numero de segundos.
 * - Ahora se llamara a la clase CajaThread, que atiende cada producto el numero de segundos especificado, y lo muestra en pantalla.
 * En este caso, al usar threads, la atencion se hace en paralelo.
 * NOTA: La clase Cliente es la misma, la unica que ha cambiado es la Caja (y que dentro de la caja se llama a su run).
 * 
 * @author oscar
 */
public class atencionColaConThread {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 });
        Cliente cliente2 = new Cliente("Cliente 2", new int[] { 1, 3, 5, 1, 1 });

        // Tiempo inicial de referencia MARCA DE TIEMPO
        long initialTime = System.currentTimeMillis();
        
        // 1.- CREAR UNA CLASE QUE HEREDE DE LA CLASE Thread. --> CajaThread extends Thread
        // 2.- REESCRIBIR EL MÉTODO run() EN LA CLASE CajaThread
        // SU CÓDIGO SERÁ EL MISMO QUE TENEMOS EN EL MÉTODO procesarCompra() DE LA CLASE Caja (CON PEQUEÑOS AJUSTES)
        
        // 3.- CREAR UN OBLETO DE LA NUEVA CLASE CajaThread
        // ESE OBJETO SERÁ EL HILO CON EL QUE TRABAJAREMOS
        CajaThread caja1 = new CajaThread("Caja 1", cliente1, initialTime);
        CajaThread caja2 = new CajaThread("Caja 2", cliente2, initialTime);
        
        // LLAMAMOS AL MÉTODO run()
        // LANZAMOS EL HILO CON start()
        // ESTO HACE QUE EJECUTE run() EN SEGUNDO PLANO
        // ¡¡¡OJO!!! -->  NO EJECUTAR DIRECTAMENTE run()
        caja1.start();
        caja2.start();
    }    
}