package Tema_15;

import static Principal_Main.Main.*;
import static Tema_15.T_15.*;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Recursos_15 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_15 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        **********************************************************************************************************************************
        
            EN ESTA UNIDAD PONDREMOS DE MANIFIESTO
            POR QU� EN UNA COMUNICACI�N DEBEREMOS ENCRIPTAR LAS COMUNICACIONES PARA HACERLAS SEGURAS,
            UTILIZANDO UNA SERIE DE PROTOCOLOS SEGUROS.
                         
            VAMOS A ESTUDIAR CU�LES SON ESOS PROTOCOLOS SEGUROS,
            Y HAREMOS HINCAPI� EN UNO DE LOS M�S IMPORTANTES, EL PROTOCOLO SSL/TLS.
                         
            TAMBI�N SEGUIREMOS AHONDADO SOBRE EL CONCEPTO DE ENCRIPTACI�N,
            PARA CONTINUAR PROTEGIENDO LA INFORMACI�N DE FORMA SEGURA.
                         
            POR �LTIMO,
            EXPERIMENTAREMOS SOBRE C�MO PODREMOS REALIZAR UNA COMUNICACI�N EN RED DE FORMA SEGURA,
            UTILIZANDO PARA ELLO LOS SOCKETS SEGUROS.
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;    
    private static String recurso_02 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_02 + """
        **********************************************************************************************************************************
        
           �CU�NDO DEBEMOS PROPORCIONAR PROTECCI�N A LA INFORMACI�N?
                    CUANDO SE DESARROLLAN APLICACIONES QUE TIENEN COMUNICACIONES EN RED.
                         
                    LA PROTECCI�N DE LA INFORMACI�N, ES ALGO QUE DEBEMOS PROPORCIONAR,
                    YA QUE LAS COMUNICACIONES MEDIANTE UNA RED PUEDEN SER F�CILMENTE INTERCEPTADAS,
                    Y, POR LO TANTO, PUEDEN SER MANIPULADAS POR PERSONAS INDESEADAS.
                         
            �C�MO SE CREA LOS PROTOCOLOS DE SEGUROS DE COMUNICACI�N?
                    CUANDO COMBINAMOS EL PODER DE LA CRIPTOGRAF�A CON LAS COMUNICACIONES EN RED.
                         
                    ESTAR�AMOS CREANDO LO QUE SE CONOCE COMO PROTOCOLOS SEGUROS DE COMUNICACI�N,
                    O TAMBI�N LLAMADOS PROTOCOLOS CRIPTOGR�FICOS, O DE ENCRIPTACI�N.
                         
            EXISTEN MULTITUD DE ESTE TIPO DE PROTOCOLOS, PERO NOS CENTRAREMOS EN LOS DOS M�S COMUNES:
                         
                    * PROTOCOLO SSL: (Secure Sockets Layer)
                            ESTE PROTOCOLO PROPORCIONA LA POSIBILIDAD DE TENER
                            UNA COMUNICACI�N SEGURA EN EL MODELO CLIENTE/SERVIDOR,
                            PROTEGI�NDOLO DE ATAQUES EN LA RED,
                            COMO PUEDE SER EL PROBLEMA DE man 'in the middle' U HOMBRE EN EL MEDIO,
                            QUE CONSISTE EN QUE UN TERCERO SE DEDIQUE A ESNIFAR EL TR�FICO DE LA RED DE COMUNICACIONES,
                            PUDIENDO ACCEDER A INFORMACI�N CONFIDENCIAL.
                         
                    * PROTOCOLO TLS: (Transport Layer Security)
                            ESTE PROTOCOLO SURGI� COMO UNA EVOLUCI�N DEL PROTOCOLO SSL,
                            PROPORCIONANDO LA POSIBILIDAD DE UTILIZAR MUCHOS M�S ALGORITMOS CRIPTOGR�FICOS
                            PARA CODIFICAR LA INFORMACI�N ENVIADA EN LAS COMUNICACIONES.
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;    
    private static String recurso_03 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_03 + """
        **********************************************************************************************************************************
                                 
            LOS PROTOCOLOS SSL Y TLS
            SON UNOS PROTOCOLOS CRIPTOGR�FICOS 
            QUE PODEMOS ENCONTRAR ENTRE LAS CAPAS:
                                                        - DE APLICACI�N 
                                                        - Y DE TRANSPORTE
                                                                            DEL MODELO TCP/IP.
                         
            GRACIAS A ESTO,
            VAMOS A PODER UTILIZARLOS PARA REALIZAR CIFRADOS DE INFORMACI�N EN PROTOCOLOS COMO TELNET, IMAP, FTP, HTTP ...
            SIEMPRE QUE UN PROTOCOLO DE ENCRIPTACI�N COMO SSL O TLS
            SEA EJECUTADO SOBRE UN PROTOCOLO DE COMUNICACI�N,
            OBTENDREMOS LA VERSI�N SEGURA DEL MISMO.
                    - FTPS    -->   VERSI�N SEGURA DEL PROTOCOLO FTP.
                    - HTTPS   -->   VERSI�N SEGURA DEL PROTOCOLO HTTP.
                    - SSH     -->   VERSI�N SEGURA DEL PROTOCOLO TELNET.

            SEG�N ESTO, PODEMOS AFIRMAR QUE,
            POR EJEMPLO, EL PROTOCOLO FTPS NO ES QUE SEA M�S IMPORTANTE QUE EL PROTOCOLO FTP,
            PERO AL ESTAR EJECUT�NDOSE EN �L UN PROTOCOLO DE CRIPTOGRAF�A, YA ES UN PROTOCOLO SEGURO.
                         
            MODELO TCP/IP:           CAPA                 OBJECTORS DE TRANSITION
            ************************************************************************
                             ---- APLICACI�N ---------------- MENSAJES ----
                             ---- TRANSPORTE ---------------- PAQUETES ----
                             ---- RED (INTERNET) ------------ DATAGRAMAS --
                             ---- ENLACE -------------------- TRAMAS ------
                             ---- F�SICA -------------------- BITS --------
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_04 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_04 + """
        **********************************************************************************************************************************
        
            �PARA QU� SE CREO EL PROTOCOLO SSL?
                    EL PROTOCOLO SSL (Secure Sockets Layer)
                    FUE CREADO POR LA EMPRESA Netscape
                    EN UN AF�N DE HACER SEGURAS LAS COMUNICACIONES
                    ENTRE LOS NAVEGADORES WEB Y LOS SERVIDORES,
                    AUNQUE SE POD�A, Y SE PUEDE,
                    UTILIZAR EN CUALQUIER APLICACI�N CON ESQUEMA CLIENTE/SERVIDOR.
                         
            �QU� NOS VA A PROPORCIONAR?
                    EL PROTOCOLO SSL NOS VA A PROPORCIONAR
                    LAS PROPIEDADES QUE HACEN SEGURAS A LAS COMUNICACIONES.
                    ESTAMOS HABLANDO DE:
                            * AUTENTICACI�N.
                            * CONFIDENCIALIDAD.
                            * INTEGRIDAD.
                         
            �C�MO FUNCIONA EL PROTOCOLO SSL?
                    EL FUNCIONAMIENTO DEL PROTOCOLO SSL CONSISTE
                    EN QUE ANTES DE PODER TENER UNAN COMUNICACI�N SEGURA ENTRE CLIENTE Y SERVIDOR,
                    DEBEN DE 'NEGOCIARSE' UNA SERIE DE CONDICIONES O PAR�METROS PARA DICHA COMUNICACI�N,
                    ESTO SE CONOCE COMO APRET�N DE MANOS O handshake,
                    CONOCIDO COMO EL ------------------------------------------->   SSL/TLS Handshake Protocol.
                         
                    TAMBI�N EXISTE LA VERSI�N DEL LLAMADO ---------------------->   SSL/TLS Record Protocol,
                    MEDIANTE EL CUAL SE VAN A ESPECIFICAR DE QU� FORMA
                    SE VAN A ENCAPSULAR LOS DATOS QUE SER�N TRANSMITIDOS,
                    PUDI�NDOSE INCLUSO NEGOCIAR LOS DATOS DE LA PROPIA NEGOCIACI�N PREVIA.
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_05 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_05 + """
        **********************************************************************************************************************************
        
            LAS FASES QUE SE UTILIZAN EN EL PROTOCOLO SSL SON LAS SIGUIENTES:
                         
                  1 - FASE INICIAL:
                            SE NEGOCIAN LOS ALGORITMOS CRIPTOGR�FICOS QUE SE VAN A UTILIZAR EN LA COMUNICACI�N.
                         
                  2 - FASE DE AUTENTICACI�N:
                            - SE INTERCAMBIAR�N LAS CLAVES.
                            - SE AUTENTICAR�N LAS PARTES MEDIANTE CERTIFICADOS DE CRIPTOGRAF�A ASIM�TRICA.
                            EN ESTA FASE ES DONDE SE VAN A CREAR LAS CLAVES NECESARIAS
                            PARA REALIZAR LA TRANSMISI�N DE INFORMACI�N.
                         
                  3 - FASE DE VERIFICACI�N:
                            SE HAR� UNA VERIFICACI�N DE QU� EL CANAL ES SEGURO PARA LA COMUNICACI�N.
                         
                  4 - COMUNICACI�N SEGURA:
                            EN ESTE PUNTO YA COMENZAR�A LA COMUNICACI�N SEGURA DE INFORMACI�N.
                         
            SI POR CUALQUIER MOTIVO FALLASE LA NEGOCIACI�N, LA COMUNICACI�N NO LLEGAR�A A ESTABLECERSE.
                                     
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_06 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_06 + """
        **********************************************************************************************************************************
        
            PODEMOS UTILIZAR LOS SIGUIENTES ALGORITMOS CRIPTOGR�FICOS PARA SER UTILIZADOS CON SSL/TLS:
                         
                    * ALGORITMOS DE CLAVE SIM�TRICA:
                            - IDEA.
                            - DES.
                            - ...
                         
                    * ALGORITMOS DE CLAVE P�BLICA:
                            - RSA.
                         
                    * CERTIFICADOS DIGITALES:
                            - RSA.
                         
                    * RES�MENES:
                            - MD5.
                            - SHA.
                            - ...
                         
            RAZONES DEL �XITO DE SSL/TLS:
                         
            EL �XITO DEL PROTOCOLO SSL/TLS SE DEBE FUNDAMENTALMENTE
            A LA EXPANSI�N QUE HA TENIDO EL COMERCIO ELECTR�NICO EN INTERNET,
            AUNQUE TAMBI�N ES UTILIZADO PARA PODER CREAR REDES PRIVADAS VIRTUALES O VPN.
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_07 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_07 + """
        **********************************************************************************************************************************
        
            EL LENGUAJE DE PROGRAMACI�N JAVA NOS PROPORCIONA LA CLASE  ------>  Cipher
            MEDIANTE LA CUAL VAMOS A PODER REALIZAR CODIFICACIONES DE DATOS.
                         
            UNO DE LOS ALGORITMOS DE ENCRIPTADO QUE VAMOS A PODER UTILIZAR ES EL CIFRADO AES,
            NO OBSTANTE, SE ADMITEN MUCHOS MODOS DE OPERACI�N M�S.
                         
            �QU� ES EL ALGORITMO DE CIFRADO AES?  Advanced Encryption Standard
                    ES UN CIFRADO DE ESQUEMA POR BLOQUES QUE SE COMENZ� A UTILIZAR EN ESTADOS UNIDOS.
                    AES POSEE UN TAMA�O DE BLOQUE FIJO DE 128 BITS
                    Y TAMA�OS DE CLAVE DE 128, 192 O 256 BITS.
                    LA MAYOR�A DE LOS C�LCULOS DEL ALGORITMO AES SE HACEN EN UN CAMPO FINITO DETERMINADO.
                         
            �QU� NECESITAMOS PARA UTILIZAR AES?
                    PARA PODER UTILIZAR AES
                    DEBEREMOS DESCARGAR E INTEGRAR LA BIBLIOTECA DE commons-codec DE APACHE,
                    LA CUAL PODEMOS DESCARGAR DESDE EL SIGUIENTE ENLACE:
                            http://commons.apache.org/proper/commons-codec/download_codec.cgi
                    DESCARGAMOS LOS BINARIOS Y NOS QUEDAMOS CON EL FICHERO  --->   commons-codec-x.yy.jar
                    SIENDO X E YY LAS VERSIONES ACTUALES DEL PAQUETE.
                         
                    UNA VEZ DESCARGADA LA INTEGRAMOS EN NUESTRO PROYECTO NETBEANS.
                  
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_08 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_08 + """
        **********************************************************************************************************************************
                         
            PARA ENCRIPTAR UN MENSAJE CON UNA CLAVE MEDIANTE EL ALGORITMO AES
            PODEMOS USAR EL C�DIGO QUE PODEMOS VER EN LA FIGURA 4.

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
                     * @author Juan Jos� Est�vez Gonz�lez
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
                                
                            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException
                                    | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException error) {
                            
                                System.err.println("Error");
                            }
                        }    
                    }
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_09 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_09 + """
        **********************************************************************************************************************************
        
            EL LENGUAJE DE PROGRAMACI�N JAVA NOS PROPORCIONA LA LASE ---->  Signature    PAQUETE ---->  java.security
            
            NOS VA A PERMITIR REALIZAR LA IMPLEMENTACI�N DE FIRMA DIGITAL Y ADEM�S DE VERIFICARLA.
                         
            PASOS NECESARIOS:
                         
                    1.- GENERAMOS LAS CLAVES P�BLICAS Y PRIVADAS:  CLASE  --->  KeyPairGenerator
                            - CLASE PARA FIRMAR: ---------------------------->  PrivateKey
                            - CLASE PARA VERIFICAR LA FIRMA:  --------------->  PublicKey
                         
                    2.- REALIZAREMOS LA FIRMA DIGITAL MEDIANTE LA CLASE ----->  Signature
                         
                        UTILIZANDO ALGORITMO DE CLAVE ASIM�TRICA, COMO EL --->  DSA
                         
                        USAREMOS LOS M�TODOS:
                                PARA GENERAR LA FIRMA: ---------------------->  initSign()
                                PARA CREAR EL RESUMEN DEL MENSAJE: ---------->  update()
                                PARA TERMINAR DE CREAR LA FIRMA: ------------>  sign()
                         
                    3.- VERIFICAREMOS LA FIRMA MEDIANTE LA CLAVE P�BLICA.
                                LE PASAMOS LA CLAVE P�BLICA AL M�TODO: ------>  initVerify()
                                ACTUALIZAMOS EL RESUMEN DEL MENSAJE: -------->  update()
                                Y COMPROBAMOS SI COINCIDE CON EL ENVIADO.
                                REALIZAMOS LA VERIFICACI�N DE LA FIRMA CON: ->  verify()
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_10 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_10 + """
        **********************************************************************************************************************************
                    
                    import java.security.Signature;
                    import java.security.SignatureException;
                    import java.security.KeyPair;
                    import java.security.KeyPairGenerator;
                    
                    // Biblioteca necesaria para mostrar en ASCII el resultado por pantalla
                    import static org.apache.commons.codec.binary.Base64.encodeBase64;
                    
                    /**
                     *    Ejemplo de uso de firmas digitales: 
                     *    (1) Se crea un par RSA y se firma el texto con la clave privada.
                     *    (2) Se muestra la firma obtenida en BASE64
                     *    (3) Verifica la firma con la correspondiente clave p�blica 
                     *    IMPORTANTE: descargar la biblioteca de commons-codec de Apache, de la URL:
                     *    http://commons.apache.org/proper/commons-codec/download_codec.cgi
                     *    e incluir el fichero commons-codec.jar entre las bibliotecas del proyecto.
                     * 
                     * @author Juan Jos� Est�vez Gonz�lez
                     */
                    public class FirmaDigital {
                    
                        public static void main (String[] args) throws Exception {
                     
                            System.out.println("Generando un par RSA...");
                            KeyPairGenerator generador = KeyPairGenerator.getInstance("RSA");
                            generador.initialize(1024);
                            KeyPair parClaves = generador.genKeyPair();
                            System.out.println("Generando el par de claves.");
                    
                            byte[] datos = "Este es el texto que vamos a firmar".getBytes("UTF8");
                    
                            // Obtener instancia del objeto Signature e inicializarlo con 
                            // la clave privada para firmarlo
                            Signature firma = Signature.getInstance("MD5WithRSA");
                            firma.initSign(parClaves.getPrivate());
                    
                            // Prepara la firma de los datos
                            firma.update(datos);
                    
                            // Firmar los datos
                            byte[] bytesFirma = firma.sign();
                    
                            // Mostrar en ASCII
                            System.out.println("\nFirma:\n" + 
                                new String(encodeBase64(bytesFirma)));
                    
                            // Ahora procedemos a verificar la firma. Para ello necesitaremos 
                            // reinicializar el objeto Signature con la clave p�blica. 
                            // Esto hace un reset de los datos de la firma con lo que hay que 
                            // pas�rselos de nuevo para hacer el update.
                            firma.initVerify(parClaves.getPublic());
                    
                            // Pasar los datos que fueron firmados
                            firma.update(datos);
                    
                            // Verificar
                            boolean verificado = false;
                            try {
                                verificado = firma.verify(bytesFirma);
                            } catch (SignatureException se) {
                                verificado = false;
                            }
                    
                            if (verificado) {
                                System.out.println("\nFirma verificada.");
                            } else {
                                System.out.println("\nFirma incorrecta.");
                            }
                        }
                    }
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_11 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_11 + """
        **********************************************************************************************************************************
        
            EL LENGUAJE DE PROGRAMACI�N JAVA
            NOS PERMITE CREAR UNA VERSI�N SEGURA 
            DE LOS SOCKETS QUE UTILIZAMOS EN UNIDADES ANTERIORES.
                         
            SI RECORDAMOS, UTILIZAMOS LOS SOCKETS
            PARA ESTABLECER UNA COMUNICACI�N EN RED ENTRE LAS DOS PARTES DEL MODELO CLIENTE/SERVIDOR,
            PERO LOS SOCKETS QUE UTILIZAMOS ANTERIORMENTE NO ERAN SEGUROS, YA QUE NO CIFRABAN LA INFORMACI�N.
                         
            CERTIFICADOS PARA SOCKETS SEGUROS:
                    PARA PODER UTILIZAR LA VERSI�N SEGURA DE LOS SOCKETS,
                    PRIMERAMENTE, DEBEREMOS CREAR LOS CERTIFICADOS QUE NOS AYUDAR�N A ENCRIPTAR LA INFORMACI�N.
                         
                    PARA CREAR EL CERTIFICADO DEL SERVIDOR
                    NECESITAMOS ABRIR UNA VENTANA DE COMANDOS (CMD DE WINDOWS O BASH DE LINUX)
                    LO HACEMOS EN MODO ADMINISTRADOR, Y EJECUTAR EL SIGUIENTE COMANDO (Chudiang, 2016):
                         
            (A)             keytool -genkey -keyalg RSA -alias serverKay -keystore serverKey.jks -storepass servpass
                         
                    PUEDE QUE NO FUNCIONE SI NO TIENES LA CARPETA DE JAVA EN EL PAHT DE LAS VARIABLES DE ENTORNO.
                    ENTONCES TENDR�S QUE DESPLAZARTE A LA CARPETA DONDE SE ENCUENTRA keytool.exe,
                    keytool.exe SE ENCUENTRA DENTRO DE LA CARPETA DE INSTALACI�N DE JAVA, JAVA/BIN
                         
                    CUANDO EJECUTEMOS EL COMANDO,
                    EL SISTEMA NOS IR� SOLICITANDO UNA SERIE DE DATOS,
                    COMO NUESTRO NOMBRE, APELLIDOS, ETC. (APUNTAR LOS DATOS QUE LE PASEMOS)
                         
                    UN CERTIFICADO VA A IR ASOCIADO A ALGUNA PERSONA U ORGANIZACI�N,
                    ES POR ESTE MOTIVO POR LO QUE EN ESTE PUNTO NOS SOLICITA ESOS DATOS.
                         
                    CUANDO TENGAMOS EL CERTIFICADO DEL SERVIDOR,
                    DEBEMOS GENERAR EL CERTIFICADO PARA EL CLIENTE.
                    COMO EL CERTIFICADO DEL SERVIDOR EST� DENTRO DE UN ALMAC�N, 
                    TENEMOS QUE SACARLO DE AH� A UN FICHERO. 
                         
                    EL COMANDO PARA GENERAR EL CERTIFICADO DEL CLIENTE QUE DEBEMOS USAR ES:
                         
            (B)             keytool -export -keystore serverKey.jks -alias serverKay -file ServerPublicKey.cer
                    
                    REPETIMOS TODO EL PROCESO PARA GENERAR LOS FICHEROS DEL CLIENTE.
                    CREAMOS EL CERTIFICADO DEL CLIENTE EN UN ALMAC�N DE CERTIFICADOS clientKey.jks:
                         
            (A)             keytool -genkey -keyalg RSA -alias clientKay -keystore clientKey.jks -storepass clientpass
                         
                    EXPORTAMOS EL CERTIFICADO DEL CLIENTE A UN FICHERO:
                         
            (B)             keytool -export -keystore clientKey.jks -alias clientKay -file ClientPublicKey.cer
                         
                    METEMOS LA CLAVE P�BLICA DEL CLIENTE EN LOS CERTIFICADOS DE CONFIANZA DEL SERVIDOR:
                         
            (C)             keytool -import -v -trustcacerts -alias clientKay -file ClientPublicKey.cer -keystore
                            serverTrustedCerts.jks -keypass servpass -storepass servpass
                         
                    METEMOS LA CLAVE P�BLICA DEL SERVIDOR EN LOS CERTIFICADOS DE CONFIANZA DEL CLIENTE:
                                             
            (C)             keytool -import -v -trustcacerts -alias serverKay -file ServerPublicKey.cer -keystore
                            clientTrustedCerts.jks -keypass clientpass -storepass clientpass
                         
            LOS FICHEROS PARA ALMACENAR LOS CERTIFICADOS SON                    clientKey.jks Y serverKey.jks
            LOS FICHEROS DE LOS CERTIFICADOS SON                                ClientPublicKey.cer Y ServerPublicKey.cer
            LAS CLAVES QUE LE QUIERAS PONER AL CERTIFICADO SON                  clientpass Y servpass
            LOS NOMBRES/ALIAS SON                                               clientKay Y serverKay
            LOS FICHEROS ALMACEN QUE QUIERO GENERAR SON                         clientTrustedCerts.jks Y serverTrustedCerts.jks
                                                                 
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_12 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_12 + """
        **********************************************************************************************************************************
        
            VAMOS A VER C�MO PODEMOS IMPLEMENTAR UN SERVIDOR SEGURO EN JAVA.
            LA FORMA F�CIL DE CREAR LOS SOCKETS SSL
            ES USAR LAS FACTOR�AS DE SOCKET SSL POR DEFECTO QUE NOS PROPORCIONA JAVA. 
                         
            PARA EL LADO DEL SERVIDOR, EL C�DIGO SER�A (Chudiang, 2016):
                         
                    SSLServerSocketFactory serverFactory = (SSLServerSocketFactory)
                    SSLServerSocketFactory.getDefault();
                    ServerSocket serverSocket = serverFactory.createServerSocket(puerto);
                         
            LA �NICA PREGUNTA QUE PODEMOS HACERNOS EN ESTE PUNTO ES
            �C�MO PODEMOS INDICAR D�NDE SE ENCUENTRAN LOS ALMACENES DE CERTIFICADOS
            Y CERTIFICADOS DE CONFIANZA QUE GENERAMOS EN EL PASO ANTERIOR? 
                         
            ESTO LO VAMOS A PODER HACER MEDIANTE LAS PROPIEDADES DE System,
            O BIEN CON OPCIONES DEL PAR�METRO -D AL ARRANCAR NUESTRA APLICACI�N JAVA.
                         
            LAS PROPIEDADES A FIJAR SON:
                         
                    * javax.net.ssl.keyStore:
                            CON EL QUE INDICAMOS EL ALMAC�N DONDE EST� EL CERTIFICADO QUE NOS IDENTIFICA.
                         
                    * javax.net.ssl.keyStorePassword:
                            CON EL QUE INDICAMOS LA CLAVE PARA ACCEDER A DICHO ALMAC�N Y PARA ACCEDER AL CERTIFICADO DENTRO DEL ALMAC�N. 
                         
                    * javax.net.ssl.trustStore:
                            CON EL QUE INDICAMOS EL ALMAC�N DONDE EST�N LOS CERTIFICADOS EN LOS QUE SE CONF�A.
                         
                    * javax.net.ssl.trustStorePassword:
                            CON EL QUE INDICAMOS LA CLAVE PARA ACCEDER A DICHO ALMAC�N Y A LOS CERTIFICADOS DENTRO DEL ALMAC�N.
                         
            SI DECIDIMOS HACERLO MEDIANTE System.setProperty(), EL C�DIGO QUEDAR�A AS�:
                         
                    System.setProperty("javax.net.ssl.keyStore", "src/main/certificados/servidor/serverKey.jks");
                    System.setProperty("javax.net.ssl.keyStorePassword","servpass");
                    System.setProperty("javax.net.ssl.trustStore", "src/main/certificados/servidor/serverTrustedCerts.jks");
                    System.setProperty("javax.net.ssl.trustStorePassword", "servpass");
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_13 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_13 + """
        **********************************************************************************************************************************
        
            �C�MO PODEMOS IMPLEMENTAR UN CLIENTE SEGURO EN JAVA?
                         
            VAMOS A VER C�MO PODEMOS IMPLEMENTAR UN CLIENTE SEGURO EN JAVA.
            AL IGUAL QUE CON EL SERVIDOR,
            EN EL CLIENTE LA FORMA F�CIL DE CREAR LOS SOCKETS SSL 
            ES USAR LAS FACTOR�AS DE SOCKET SSL POR DEFECTO QUE NOS PROPORCIONA JAVA. 
            EL C�DIGO EN ESTE CASO SER�A:
                         
                    SSLSocketFactory clientFactory = (SSLSocketFactory)
                    SSLSocketFactory.getDefault();
                    Socket cliente = clientFactory.createSocket(servidorseguro, puerto);
                         
            DONDE MEDIANTE LA VARIABLE servidorseguro y puerto INDICAMOS CU�LES SER�N LA DIRECCI�N IP Y EL PUERTO,
            DONDE EST� EL SERVIDOR SEGURO QUE HEMOS CREADO ANTERIORMENTE.
                         
            PARA TRABAJAR CON LOS CLIENTES A PARTIR DE ESTE PUNTO, SE DEBER� OBTENER UN SOCKET DE LA FORMA HABITUAL.
                         
            �QU� INCONVENIENTE PODEMOS ENCONTRAR EN ESTE MECANISMO?
            HAY QUE REMARCAR QUE TODAS LAS VARIABLES DE CONFIGURACI�N
            QUE HEMOS VISTO ANTERIORMENTE EN LA PARTE DE CREACI�N DEL SERVIDOR SEGURO 
            VAN A AFECTAR A TODO EL PROGRAMA JAVA.
                         
            A PARTIR DE ESE MOMENTO,
            TODOS LOS SOCKETS QUE ABRAMOS TENDR�N EL MISMO CERTIFICADO Y CONFIAR�N EN LOS MISMOS CERTIFICADOS.
            SI QUISI�SEMOS PODER ESTABLECER VARIOS SOCKETS CON DISTINTOS CERTIFICADOS Y DISTINTOS CERTIFICADOS DE CONFIANZA,
            NECESITAMOS UNA CONFIGURACI�N M�S COMPLEJA.
                         
            UNA VEZ QUE YA TENGAMOS CREADOS NUESTRO SERVIDOR Y NUESTROS CLIENTES SEGUROS, LA FORMA DE TRABAJAR VA A SER EXACTAME
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_14 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_14 + """
        **********************************************************************************************************************************
        
            INCONVENIENTES DE ESTE SISTEMA ENTRE CLIENTE Y SERVIDOR:
                         
                    * TODAS LAS VARIABLES DE CONFIGURACI�N QUE HEMOS VISTO ANTERIORMENTE
                      EN LA PARTE DE CREACI�N DEL SERVIDOR SEGURO
                      VAN A AFECTAR A TODO EL PROGRAMA JAVA.
                         
                    * DE ESTE MODO,
                      TODOS LOS SOCKETS QUE ABRAMOS
                      TENDR�N EL MISMO CERTIFICADO 
                      Y CONFIAR�N EN LOS MISMOS CERTIFICADOS.
                         
                    * SI QUISI�RAMOS PODER ESTABLECER VARIOS SOCKETS CON DISTINTOS CERTIFICADOS,
                      POR EJEMPLO, PARA IDENTIFICAR A POSIBLES DIFERENTES CLIENTES,
                      Y DISTINTOS CERTIFICADOS DE CONFIANZA,
                      NECESITAMOS UNA CONFIGURACI�N M�S COMPLEJA.
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_15 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_15 + """
        **********************************************************************************************************************************
        
            EN LA CARPETA DEL TEMA TIENES:
                     
                    EN EL PUNTO 'CERTIFICADOS PARA SOCKETS SEGUROS'
                    SE VEN LOS COMANDOS DEL TEMA QUE GENERAN LOS CERTIFICADOS
                    PARA LA COMUNICACI�N SEGURA ENTRE CLIENTE Y SERVIDOR.
                         
                    - SSLclient.java
                    - SSLservidor.java
                    - SSL_Main.java
                         
                    LOS EJEMPLOS VISTOS EN LA TEORIA.
                         
                    - FirmaDigital.java
                    - Algoritmo_AES.java
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    
    public static void recurso(String opcion) {
        
        String menu="";
        do {
            switch (opcion) {                
                case "1" -> System.out.println(recurso_01);
                case "2" -> System.out.println(recurso_02);
                case "3" -> System.out.println(recurso_03);
                case "4" -> System.out.println(recurso_04);
                case "5" -> System.out.println(recurso_05);                
                case "6" -> System.out.println(recurso_06);
                case "7" -> System.out.println(recurso_07);
                case "8" -> System.out.println(recurso_08);
                case "9" -> System.out.println(recurso_09);
                case "10" -> System.out.println(recurso_10);
                case "11" -> System.out.println(recurso_11);
                case "12" -> System.out.println(recurso_12);
                case "13" -> System.out.println(recurso_13);
                case "14" -> System.out.println(recurso_14);
                case "15" -> {
                    System.out.println(recurso_01);
                    continuar();
                    System.out.println(recurso_02);
                    continuar();
                    System.out.println(recurso_03);
                    continuar();
                    System.out.println(recurso_04);
                    continuar();
                    System.out.println(recurso_05);
                    continuar();
                    System.out.println(recurso_06);
                    continuar();
                    System.out.println(recurso_07);
                    continuar();
                    System.out.println(recurso_08);
                    continuar();
                    System.out.println(recurso_09);
                    continuar();
                    System.out.println(recurso_10);
                    continuar();
                    System.out.println(recurso_11);
                    continuar();
                    System.out.println(recurso_12);
                    continuar();
                    System.out.println(recurso_13);
                    continuar();
                    System.out.println(recurso_14);
                }
            }
            try {                
                menu = miTryRecursos();                
                switch (menu) {                   
                    case "0" -> {}
                    default -> {
                            miDefault();
                            }
                }
            }  catch (Exception e) {
                miError(e);
            }
        } while (!"0".equals(menu));   
    }
}