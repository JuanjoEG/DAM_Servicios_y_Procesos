package Tema_06;

/**
 *
 * @author Juan José Estévez González
 */
public class ProblemaProductorConsumidor_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final int DORMIR_PRODUCTOR = 1000, DORMIR_CONSUMIDOR = 2150;
        
        Buffer_Almac_02  almacen_02     = new Buffer_Almac_02();
        Productor_02     productor_02   = new Productor_02(almacen_02, DORMIR_PRODUCTOR);
        Consumidor_02    consumidor_02  = new Consumidor_02(almacen_02, DORMIR_CONSUMIDOR);
        
        productor_02.start();
        consumidor_02.start();
    }    
}