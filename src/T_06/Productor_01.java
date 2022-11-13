package T_06;

import static java.lang.Thread.sleep;

/**
 *
 * @author Juan José Estévez González
 */
public class Productor_01 extends Thread {
    
    private Buffer_Almac_01 almacen;
    private int dormir;
    
    /**
     * Constructor del productor
     * @param almacen Buffer donde se producirán los recursos
     * @param dormir Tiempo que dormirá el productor
     */
    public Productor_01(Buffer_Almac_01 almacen, int dormir) {
        
        this.almacen = almacen;
        this.dormir = dormir;
    }
    
    public void run() {
        
            
            for (int i = 0; i < 10; i++) {
                
                
                almacen.put();
                System.out.println("Turno: " + i + " Productor  pone Una. En Almacen hay:" + almacen.contenido);
                try {
                    sleep(dormir);
                } catch (InterruptedException e) {
                    System.err.println("Error en el productor: " + e.toString());
                }
            }
            
    }
}
