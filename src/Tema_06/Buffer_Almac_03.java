package Tema_06;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Buffer_Almac_03 {
    
    private int contenido;
    
    // VERSI�N NO SINCRONIZADA
    
    /**
     * DISMINUYE UN VALOR AL ALMACEN
     * @return 
     */
    public int get_03() {
        return contenido;      
    }

    /**
     * AUMENTA UN VALOR AL ALMACEN
     * @param valor
     */
    public void put_03(int valor) {
        contenido = valor;
    } 
}