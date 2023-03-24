package Tema_15;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import static org.apache.commons.codec.binary.Base64.encodeBase64;
// Librerias para la gestion de excepciones
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/**
 *   Ejemplo de cifrado AES
 *   IMPORTANTE: descargar la biblioteca de commons-codec de Apache, de la URL:
 *   http://commons.apache.org/proper/commons-codec/download_codec.cgi
 *   e incluir el fichero commons-codec.jar entre las bibliotecas del proyecto.
 *  
 * @author Juan José Estévez González
 */
public class Algoritmo_AES {
    
    public static void main(String[] args) {
        
        String key = "92AE31A79FEEB2A3";   //  LLAVE
        String iv = "0123456789ABCDEF";
        String mensaje = "Hola mundo";
        
        try {
            // PROCESO DE ENCRIPTADO CON AES
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes(), "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(iv.getBytes());
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, ivParameterSpec);
            byte[] encrypted = cipher.doFinal(mensaje.getBytes());
            System.out.println("El mensaje encriptado es: " + new String(encodeBase64(encrypted)));
            
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException error) {
        
            System.err.println("Error");
        }
    }    
}