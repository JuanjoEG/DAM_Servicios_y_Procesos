package Tema_06;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Buffer_Almac_01 {
    
    public int contenido = 0;
    
    // VERSI�N NO SINCRONIZADA
    
    /**
     * DISMINUYE UN VALOR AL ALMACEN
     */
    public void get_01() {
        contenido = contenido - 1;
      
    }

    /**
     * AUMENTA UN VALOR AL ALMACEN
     */
    public void put_01() {
        contenido = contenido + 1;
    } 
}