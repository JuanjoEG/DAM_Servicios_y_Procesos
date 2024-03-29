package Tema_06;

/**
 * Esta clase representa el almac�n, es decir, el recurso que se produce y se consume
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Buffer_Almac_02 {
    
    public int contenido = 0;
    
    // VERSI�N SINCRONIZADA    
    /** 
     * DISMINUYE UN VALOR AL ALMACEN
     */
    public synchronized void get_02() {
        // MIENTRAS EL BUFFER EST� A CERO ...
        while (contenido<1) {
            try {
                // ESPERO A QUE AUMENTE EL ALMACEN
                wait();
            } catch (InterruptedException e) {}
        }
        // CUANDO YA HAY ALG�N CONTENIDO EN ALMACEN --> NOTIFICO QUE EST� DISPONIBLE PARA TOMAR
        notify();
        // YA PUEDO TOMAR UNA
        contenido = contenido - 1;        
    }

    /**
     * AUMENTA UN VALOR AL ALMACEN
     */
    public synchronized void put_02()  {
        // MIENTRAS EL BUFFER TENGA AG�N CONTENIDO ...
        while (contenido>0) {
            try {
                // ESPERO A QUE SE CONSUMA EL ALMACEN
                wait();
            } catch (InterruptedException e) {}
        }
        // CUANDO NO HAY NADA EN ALMACEN --> NOTIFICO QUE EST� DISPONIBLE PARA PRODUCIR
        notify();
        // YA PUEDO PONER UNA
        contenido = contenido + 1;
    }    
}