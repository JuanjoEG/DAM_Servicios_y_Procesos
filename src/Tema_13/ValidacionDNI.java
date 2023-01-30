
package Tema_13;

import java.util.Scanner;
import java.util.regex.Pattern;


/**
 *
 * @author Juan José Estévez González
 */
public class ValidacionDNI {
    
    public static void main(String[] args) {
        
        System.out.println("""
                           
                           PRUEBA ESTOS EJEMPLOS:
                           
                           34052775x     Error de VALIDACIÓN
                           34052X        Error de ESTRUCTURA
                           X34052775     Error de FORMATO
                           34052775X     Correcto
                           
                           """);
        
        // EXPRESIONES REGULARES PARA EL DNI
        String dniExpresionReg1 = "\\w{9}";
        String dniExpresionReg2 = "\\d{8}\\D{1}";
        String dniExpresionReg3 = "[0-9]{8}[A-Z]{1}";  // OTRA FORMA DE PONER LO MISMO  -->  "\\d{8}[A-Z]{1}"
        
        // INTRODUCIR DNI
        int salir = 1;
        Scanner teclaStr = new Scanner(System.in, "UTF-8");
        
        do {
        
            System.out.println("\n Introduce tu DNI sin espacios y la letra en mayúsculas: ");
            String DNI = teclaStr.nextLine();

            // COMPROBAMOS SI ES CORRECTO EL DNI
            if(Pattern.matches(dniExpresionReg1, DNI)){

                System.out.println("\n El DNI tiene 9 caracteres.                               --> OK.");
            } else {

                System.out.println("\n El DNI NO tiene 9 caracteres.                            --> NO es correcto.");
            }

            // COMPROBAMOS SI ES CORRECTO EL DNI
            if(Pattern.matches(dniExpresionReg2, DNI)){

                System.out.println("\n El DNI tiene 8 dígitos y 1 no dígito al final.           --> OK.");
            } else {

                System.out.println("\n El DNI NO tiene 8 dígitos y 1 no dígito al final.        --> NO es correcto.");
            }

            // COMPROBAMOS SI ES CORRECTO EL DNI
            if(Pattern.matches(dniExpresionReg3, DNI)){

                System.out.println("\n El DNI tiene 8 números y 1 letra Mayúscula al final.     --> OK.");
            } else {

                System.out.println("\n El DNI NO tiene 8 números y 1 letra Mayúscula al final.  --> NO es correcto.");
            }
            
            try {
                validarDNI(DNI);
                System.out.println("\n El DNI:  "+DNI+"  es Correcto.                         --> OK.");
                System.out.println("""
                                   
                                   ¡¡¡ MUY BIÉN CAMPEÓN !!!
                                   
                                   """);
                salir = 0;
            }
            catch (DNIException ex) {
                
                System.out.println("""
                                   
                                   Error de VALIDACIÓN: 
                                   """+ ex.toString());
                System.out.println(" ");
            }
            catch (StringIndexOutOfBoundsException e) {
                System.out.println("""
                                   
                                   Error de ESTRUCTURA: 
                                   """+ e.toString());
                System.out.println("""
                                   
                                   Recuerda que son 8 cifras y la letra en Mayusculas, todo junto.
                                   Vamos a ver churrita...
                                   ¿QUÉ PARTE ES LA QUE NO ENTIENDES?
                                   
                                   """);              
            }
            catch (NumberFormatException error) {
                System.out.println("""
                                   
                                   Error de FORMATO: 
                                   """+ error.toString());
                System.out.println("""
                                   
                                   UUUFFF... ¡¡¡ Lo que no te pase a tí­... !!!");
                                   ¿TE LO TENGO QUE EXPLICAR OTRA VEZ?
                                   Recuerda que la letra va en Mayusculas,
                                   sin poner espacios y la pones al final.
                                   
                                   """);
            }
        } while (salir!=0);            
    }
    
    public static void validarDNI(String DNI) throws DNIException {
        int DNIsinletra = Integer.valueOf(DNI.substring(0,8));
        String letra = DNI.substring(8,9);
        String[] letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        int resto = DNIsinletra %23;
        if ( !letra.equals(letras[resto]) ) {
            throw new DNIException ("""
                                    
                                    El DNI:""" + " " + DNIsinletra + " y la LETRA: "+letra
                                  + "   ¡¡¡ NO SON CORRECTOS !!!\n"
                                  + "Yo creo que es FALSO,\n"
                                  + "¡¡¡ CUIDADO CON ESE PÁJARO !!!\n");
        }
    }    
}