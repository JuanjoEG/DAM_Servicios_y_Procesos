package Tema_05;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Hilo1 extends Thread {
    
    // ATRIBUTOS
    private String nombre;
    private int dormir;
    
    // CONSTRUCTOR POR PAR�METROS -> CREA OBJETOS -> HILOS.
    public Hilo1(String nombre, int dormir) {
        
        this.nombre = nombre;
        this.dormir = dormir;
    }
    
    @Override
    public void run() {
        
        for (int i = 0; i < 10; i++) {
            
            System.out.println("Soy el Hilo1 " + nombre + " en la iteraci�n " + i);
            try {
                sleep(dormir);
            } catch (InterruptedException ex) {
                System.out.println("Error: " + ex.toString());
            }
        }
    }
}