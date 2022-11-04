package T_05;

/**
 *
 * @author Juan José Estévez González
 */
public class Ejemplo01 {
    
    public static void main(String[] args) {
        
        // Creamos los hilos
        Hilo1 hilo1 = new Hilo1("hebra 1", 1000);
        Hilo1 hilo2 = new Hilo1("hebra 2", 2000);
        
        // Lanzamos los hilos
        hilo1.start();
        hilo2.start();
    }    
}