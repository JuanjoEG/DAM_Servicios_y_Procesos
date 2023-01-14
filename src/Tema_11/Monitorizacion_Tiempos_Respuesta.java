package Tema_11;

import static java.lang.Thread.sleep;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan José Estévez González
 */
public class Monitorizacion_Tiempos_Respuesta {
    
    public static void main(String[] args) {
        try {
            Date inicio = Calendar.getInstance().getTime();
            System.out.println("\n * * * * * * * * *      OBTENEMOS EL TIEMPO INICIAL      * * * * * * * * *      " + inicio + "\n");
            
            System.out.println("\n * * * * * * * * *   DORMIMOS EL PROGRAMA 3.7 SEGUNDOS   * * * * * * * * * \n");
            sleep(3700);
            
            Date fin = Calendar.getInstance().getTime();
            System.out.println("\n * * * * * * * * *       OBTENEMOS EL TIEMPO FINAL       * * * * * * * * *      " + fin + "\n");
            
            long milisegundos = diferenciaTiempo(inicio, fin);    // CALCULAMOS LA DIFERENCIA DE TIEMPO EN MILISEGUNDOS
            double segundos = ((double) milisegundos)/1000;                          // REALIZAMOS UN CASTING PARA PASALO A SEGUNDOS
            
            System.out.println("\n * * * * * * * * *       MOSTRAMOS LOS RESULTADOS        * * * * * * * * * \n");
            System.out.println("LA DIFERENCIA ES:     " + milisegundos + " milisegundos.     --->      " + segundos + " segundos.\n");
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Monitorizacion_Tiempos_Respuesta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    /**
     * Esta función calcula la diferencia en milisegundos entre dos fechas
     * @param tiempo_inicio Tiempo de inicio
     * @param tiempo_fin Tiempo final
     * @return Diferencia en milisegundos entre tiemponicio y tiempofinal
     */
    private static long diferenciaTiempo(Date tiempo_inicio, Date tiempo_fin) {
        
        long milisegundos = (long) (tiempo_fin.getTime() - tiempo_inicio.getTime());
        return milisegundos;
    }    
}