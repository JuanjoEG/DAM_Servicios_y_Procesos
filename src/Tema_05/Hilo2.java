package Tema_05;

import static java.lang.Thread.sleep;

/**
 *
 * @author Juan José Estévez González
 */
public class Hilo2 implements Runnable {
    
    private String nombre;
    private int dormir;
    
    public Hilo2(String nombre, int dormir) {
        
        this.nombre = nombre;
        this.dormir = dormir;
    }
    
    @Override
    public void run() {
        
        for (int i = 0; i < 10; i++) {
            
            System.out.println("Soy el hilo2 " + nombre + " en la iteración " + i);
            try {
                sleep(dormir);
            } catch (InterruptedException ex) {
                System.out.println("Error: " + ex.toString());
            }
        }
    }
}