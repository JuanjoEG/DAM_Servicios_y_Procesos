package Tema_11;

/*
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
*/

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class ClienteFTP {
    
    /*
    public class ClienteFTP {

                public static void main(String[] args) {
                    
                    FTPClient cliente = new FTPClient();                                // CREANDO NUESTRO OBJETO ClienteFTP.
                                                                                        // DATOS PARA CONECTAR AL SERVIDOR FTP.
                    String ftp = "ftp.miservidor.com";                                  // TAMBI�N PUEDE IR LA DIRECCI�N IP Y EL PUERTO.
                    String user = "usuario";
                    String password = "passwword";

                    try {                        
                        cliente.connect(ftp);                                            // CONECTANDO AL SERVIDOR.
                        
                        boolean login = cliente.login(user, password);                   // LOGUEADO UN USUARIO (true = PUDO CONECTARSE, false = NO PUDO CONECTARSE).
                        
                        cliente.setFileType(FTP.TEXT_FILE_TYPE, FTP.BINARY_FILE_TYPE);   // ESPECIFICAMOS QU� TIPO DE FICHERO QUEREMOS TRANSMITIR.
                        cliente.setFileTransferMode(FTP.BINARY_FILE_TYPE);               // ESPECIFICAMOS C�MO LO QUEREMOS TRANSMITIR.
                        cliente.enterLocalPassiveMode();                                 // ESPECIFICAMOS SI VA A SER UNA CONEXI�N EN MODO ACTIVO O PASIVO.

                        String filename = "miarchivo.txt";

                        FileInputStream fis = new FileInputStream(filename);             // ACCEDEMOS AL FICHERO.
                        
                        cliente.storeFile(filename, fis);                                // GUARDANDO EL ARCHIVO EN EL SERVIDOR.

                        cliente.logout();                                                // CERRANDO SESI�N.
                
                        cliente.disconnect();                                            // DESCONECTANDOSE DEL SERVIDOR.
                    } catch (IOException ioe) {        
                        System.out.println(ioe.getMessage());
                    }
                }    
            }
    */
    
}
