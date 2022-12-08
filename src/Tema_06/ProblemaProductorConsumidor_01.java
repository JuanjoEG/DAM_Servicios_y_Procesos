package Tema_06;

/**
 *
 * @author Juan José Estévez González
 */
public class ProblemaProductorConsumidor_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final int DORMIR_PRODUCTOR = 1000, DORMIR_CONSUMIDOR = 2150;
        
        Buffer_Almac_01 almacen_01 = new Buffer_Almac_01();
        Productor_01 productor_01 = new Productor_01(almacen_01, DORMIR_PRODUCTOR);
        Consumidor_01 consumidor_01 = new Consumidor_01(almacen_01, DORMIR_CONSUMIDOR);
        
        productor_01.start();
        consumidor_01.start();
    }    
}