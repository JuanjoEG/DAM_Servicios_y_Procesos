package T_06;

import static java.lang.Thread.sleep;

/**
 *
 * @author Juan José Estévez González
 */

/**
 * Esta clase representa al productor
 * @author Francisco Jesús Delgado Almirón
 */
public class Consumidor_01 extends Thread 
{
    private Buffer_Almac_01 almacen;
    private int dormir;
    
    /**
     * Constructor del consumidor
     * @param almacen Buffer de donde se obtendrán los recursos
     * @param dormir Tiempo que dormirá el consumidor
     */
    public Consumidor_01(Buffer_Almac_01 almacen, int dormir) {        
        this.almacen = almacen;
        this.dormir = dormir;
    }
    
    public void run() {      
        
        for (int i = 0; i < 10; i++) {
            almacen.get();
            System.out.println("Turno: " + i + " Consumidor toma Una. En Almacen hay:" + almacen.contenido);
            try {
                sleep(dormir);
            } catch (InterruptedException e) {
                System.err.println("Error en el consumidor: " + e.toString());
            }
        }            
    }
}