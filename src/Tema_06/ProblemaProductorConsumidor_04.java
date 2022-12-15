package Tema_06;

/**
 *
 * @author Juan José Estévez González
 */
public class ProblemaProductorConsumidor_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final int DORMIR_PRODUCTOR = 1000, DORMIR_CONSUMIDOR = 2150;
        
        Buffer_Almac_04  almacen_04     = new   Buffer_Almac_04();
        Productor_04     productor_04   = new   Productor_04(almacen_04, DORMIR_PRODUCTOR);
        Consumidor_04    consumidor_04  = new   Consumidor_04(almacen_04, DORMIR_CONSUMIDOR);
        
        productor_04.start();
        consumidor_04.start();
    }    
}