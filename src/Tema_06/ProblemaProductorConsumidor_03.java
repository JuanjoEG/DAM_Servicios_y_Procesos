package Tema_06;

/**
 *
 * @author Juan José Estévez González
 */
public class ProblemaProductorConsumidor_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final int DORMIR_PRODUCTOR = 1000, DORMIR_CONSUMIDOR = 2150;
        
        Buffer_Almac_03  almacen_03     = new   Buffer_Almac_03();
        Productor_03     productor_03   = new   Productor_03(almacen_03, DORMIR_PRODUCTOR);
        Consumidor_03    consumidor_03  = new   Consumidor_03(almacen_03, DORMIR_CONSUMIDOR);
        
        productor_03.start();
        consumidor_03.start();
    }    
}