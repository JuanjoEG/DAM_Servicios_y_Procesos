package Tema_06;

import static java.lang.Thread.sleep;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Productor_04 extends Thread {
    
    private Buffer_Almac_04 almacen;
    private int dormir;
    
    /**
     * Constructor del productor
     * @param almacen Buffer donde se producir�n los recursos
     * @param dormir Tiempo que dormir� el productor
     */
    public Productor_04(Buffer_Almac_04 almacen, int dormir) {        
        this.almacen = almacen;
        this.dormir = dormir;
    }
    
    @Override
    public void run() {
        
        int valor;
        for (int i = 0; i < 10; i++) {
            almacen.put_04(i);
            valor = almacen.getContenido();
            System.out.println("Turno: " + i + " Productor  pone Una. Es la n�mero: " + valor);
            try {
                sleep(dormir);
            } catch (InterruptedException e) {
                System.err.println("Error en el productor: " + e.toString());
            }
        }            
    }
}