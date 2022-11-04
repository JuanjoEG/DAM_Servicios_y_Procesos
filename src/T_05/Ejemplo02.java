package T_05;

/**
 *
 * @author Juan José Estévez González
 */
public class Ejemplo02 {
    
    public static void main(String[] args) {
        // Creamos los hilos
        Hilo2 hilo1 = new Hilo2("Hilo 1", 1000);        
        Hilo2 hilo2 = new Hilo2("Hilo 2", 1000);
        
        Thread hebra1 = new Thread(hilo1);
        Thread hebra2 = new Thread(hilo2);
        
        // Lanzamos los hilos
        hebra1.start();
        hebra2.start();
    }    
}