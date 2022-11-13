
package T_06;

/**
 * Esta clase representa el almacén, es decir, el recurso que se produce y se consume
 * @author Juan José Estévez González
 */
public class Buffer_Almac_02 {
    
    public int contenido = 0;
    
    // VERSIÓN SINCRONIZADA
    
    /**
     * DISMINUYE UN VALOR AL ALMACEN
     * @return Contenido del buffer
     */

    public synchronized int get() {
        // MIENTRAS EL BUFFER ESTÉ A CERO ...
        while (contenido<1) {
            try {
                // ESPERO A QUE AUMENTE EL ALMACEN
                wait();
            } catch (InterruptedException e) {}
        }
        // CUANDO YA HAY ALGÚN CONTENIDO EN ALMACEN --> NOTIFICO QUE ESTÁ DISPONIBLE PARA TOMAR
        notify();
        // YA PUEDO TOMAR UNA
        contenido = contenido - 1;
        return contenido;
    }

    /**
     * AUMENTA UN VALOR AL ALMACEN
     */

    public synchronized void put()  {
        // MIENTRAS EL BUFFER TENGA AGÚN CONTENIDO ...
        while (contenido>0) {
            try {
                // ESPERO A QUE SE CONSUMA EL ALMACEN
                wait();
            } catch (InterruptedException e) {}
        }
        // CUANDO NO HAY NADA EN ALMACEN --> NOTIFICO QUE ESTÁ DISPONIBLE PARA PRODUCIR
        notify();
        // YA PUEDO PONER UNA
        contenido = contenido + 1;
    }    
}