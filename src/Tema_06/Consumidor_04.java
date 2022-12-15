package Tema_06;

import static java.lang.Thread.sleep;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

/**
 * Esta clase representa al productor
 * @author Francisco Jes�s Delgado Almir�n
 */
public class Consumidor_04 extends Thread 
{
    private Buffer_Almac_04 almacen;
    private int dormir;
    
    /**
     * Constructor del consumidor
     * @param almacen Buffer de donde se obtendr�n los recursos
     * @param dormir Tiempo que dormir� el consumidor
     */
    public Consumidor_04(Buffer_Almac_04 almacen, int dormir) {        
        this.almacen = almacen;
        this.dormir = dormir;
    }
    
    @Override
    public void run() {      
        
        int valor = 0;
        for (int i = 0; i < 10; i++) {
            valor = almacen.get_04();
            System.out.println("Turno: " + i + " Consumidor toma Una. Es la n�mero: " + valor);
            try {
                sleep(dormir);
            } catch (InterruptedException e) {
                System.err.println("Error en el consumidor: " + e.toString());
            }
        }            
    }
}