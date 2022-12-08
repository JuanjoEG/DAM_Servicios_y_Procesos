package Tema_03;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * Esta clase sumar� todos lso n�meros entre dos n�meros
 *
 * @author Francis
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Sumador {

    /**
     * Este m�todo suma todos los n�meros que hay en un intervalo
     * @param numero1 Inicio del intervalo
     * @param numero2 Fin del intervalo
     * @return Suma de todos los n�meros que hay en el intervalo definido
     */
    public static int sumar(int numero1, int numero2) {
        
        int suma = 0;
        for (int i = numero1; i <= numero2; i++) {
            suma += i;
        }
        return suma;
    }

    public static void main(String[] args) {
        
        // Ruta del Fichero d�nde queda escrito una copia de la prueba del proceso
        String ruta_sumador = "J:\\Ejercicios\\sumador.txt";
        
        // Obtenemos los par�metros pasados al crear el proceso
        int numero1 = Integer.valueOf(args[0]);
        int numero2 = Integer.valueOf(args[1]);
        
        // LLAMADA AL M�TODO sumar
        int suma = sumar(numero1, numero2);
        
        try {
            // COMO OPCI�N PODEMOS GENERAR UN FICHERO PARA VER SI EN PROCESO SE LANZA CORRECTAMENTE
            File archivo = new File(ruta_sumador);
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            String lineToAppend = "El resultado de la suma de los n�meros de " + numero1 + " a " + numero2 + " es " + suma;
            bw.write(lineToAppend);
            bw.close();
        } catch (Exception e) {
            System.out.println("Erroe: " + e);
        }
        System.out.println("\nProceso HIJO -> El resultado de la suma de todos los n�meros del " + numero1 + " al " + numero2 + " es " + suma);
    }
}