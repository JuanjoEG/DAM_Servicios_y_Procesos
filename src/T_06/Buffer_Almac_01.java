package T_06;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Buffer_Almac_01 {
    
    public int contenido = 0;
    
    // VERSI�N NO SINCRONIZADA
    
    /**
     * DISMINUYE UN VALOR AL ALMACEN
     * @return Contenido del buffer
     */

    public int get() {
        contenido = contenido - 1;
        return contenido;
    }

    /**
     * AUMENTA UN VALOR AL ALMACEN
     */

    public void put() {
        contenido = contenido + 1;
    } 
}