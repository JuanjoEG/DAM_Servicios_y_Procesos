package Tema_14;

import static Principal_Main.Main.continuar;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class Cifrado_con_HASH {
    
    public static void main(String[] args) {
        
        try {
            String mi_Clave = obtenerClave();
            
            encriptar(mi_Clave, "MD2");
            encriptar(mi_Clave, "MD5");
            encriptar(mi_Clave, "SHA-1");
            encriptar(mi_Clave, "SHA-256");
            encriptar(mi_Clave, "SHA-384");
            encriptar(mi_Clave, "SHA-512");
            continuar();
        }  catch (NoSuchAlgorithmException error) {
            System.out.println("Error: " + error.toString());
        }
    }
    public static String obtenerClave() {
        Scanner teclado = new Scanner(System.in, "UTF-8");
        System.out.println("Introduce la contraseña a cifrar:");
        String mi_Clave = teclado.nextLine();
        return mi_Clave;
    }
    
    public static void encriptar(String mi_Clave, String tipo_Cifrado) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance(tipo_Cifrado);     // CREAMOS UNA INSTANCIA DE MessageDigest CON EL TIPO DE CIFRADO
        md.update(mi_Clave.getBytes());                                    // CON EL MÉTODO update CODIFICAMOS mi_Cave USANDO EL CIFRADO DE md
        byte[] byteData = md.digest();                                          // EL RESULTADO SERÁ CON LA FUNCIÓN digest, Y VENDRÁ DADO EN UN ARRAY DE TIPO BYTE.
        StringBuilder sb = new StringBuilder();                                 // MEDIANTE UN StringBuilder VAMOS A TRADUCIR EL TEXTO CIFRADO, YA QUE VIENE DADO EN BYTE.
        for (int i = 0; i < byteData.length; i++) {                             // DE ESTA FORMA LO VAMOS A PASAR A STRING.
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100,16).substring(1));}
        String clave_Segura = sb.toString();                                    // GUARDO LA clave_Segura EN UN STRING.
        System.out.println("\n********************************************************************************************");
        System.out.println("*   Contraseña -> " + mi_Clave);                    // MOSTRAMOS RESULTADOS.
        System.out.println("*   " + tipo_Cifrado +" -> " + clave_Segura);
        System.out.println("********************************************************************************************\n");         
    }    
}