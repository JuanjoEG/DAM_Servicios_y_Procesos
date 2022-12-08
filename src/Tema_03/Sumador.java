package Tema_03;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * Esta clase sumará todos lso números entre dos números
 *
 * @author Francis
 * @author Juan José Estévez González
 */

public class Sumador {

    /**
     * Este método suma todos los números que hay en un intervalo
     * @param numero1 Inicio del intervalo
     * @param numero2 Fin del intervalo
     * @return Suma de todos los números que hay en el intervalo definido
     */
    public static int sumar(int numero1, int numero2) {
        
        int suma = 0;
        for (int i = numero1; i <= numero2; i++) {
            suma += i;
        }
        return suma;
    }

    public static void main(String[] args) {
        
        // Ruta del Fichero dónde queda escrito una copia de la prueba del proceso
        String ruta_sumador = "J:\\Ejercicios\\sumador.txt";
        
        // Obtenemos los parámetros pasados al crear el proceso
        int numero1 = Integer.valueOf(args[0]);
        int numero2 = Integer.valueOf(args[1]);
        
        // LLAMADA AL MÉTODO sumar
        int suma = sumar(numero1, numero2);
        
        try {
            // COMO OPCIÓN PODEMOS GENERAR UN FICHERO PARA VER SI EN PROCESO SE LANZA CORRECTAMENTE
            File archivo = new File(ruta_sumador);
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            String lineToAppend = "El resultado de la suma de los números de " + numero1 + " a " + numero2 + " es " + suma;
            bw.write(lineToAppend);
            bw.close();
        } catch (Exception e) {
            System.out.println("Erroe: " + e);
        }
        System.out.println("\nProceso HIJO -> El resultado de la suma de todos los números del " + numero1 + " al " + numero2 + " es " + suma);
    }
}