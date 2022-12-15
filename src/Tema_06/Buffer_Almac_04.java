package Tema_06;

/**
 * Esta clase representa el almacén, es decir, el recurso que se produce y se consume
 * @author Juan José Estévez González
 */
public class Buffer_Almac_04 {
    
    private int contenido;
    private boolean disponible = false;
    
    // VERSIÓN SINCRONIZADA    
    /** 
     * DISMINUYE UN VALOR AL ALMACEN
     * @return 
     */
    public synchronized int get_04() {
        // MIENTRAS EL BUFFER ESTÉ A CERO ...
        while (disponible == false) {
            try {
                // ESPERO A QUE AUMENTE EL ALMACEN
                wait();
            } catch (InterruptedException e) {}
        }
        // CUANDO YA HAY ALGÚN CONTENIDO EN ALMACEN --> NOTIFICO QUE ESTÁ DISPONIBLE PARA TOMAR
        disponible = false;
        notify();
        // YA PUEDO TOMAR UNA
        return contenido;        
    }

    /**
     * AUMENTA UN VALOR AL ALMACEN
     * @param valor
     */
    public synchronized void put_04(int valor)  {
        // MIENTRAS EL BUFFER TENGA AGÚN CONTENIDO ...
        while (disponible == true) {
            try {
                // ESPERO A QUE SE CONSUMA EL ALMACEN
                wait();
            } catch (InterruptedException e) {}
        }
        // CUANDO NO HAY NADA EN ALMACEN --> NOTIFICO QUE ESTÁ DISPONIBLE PARA PRODUCIR
        contenido = valor;
        disponible = true;
        notify();
        // YA PUEDO PONER UNA        
    }
    public int getContenido() {    
        return contenido; 
    }
    
}