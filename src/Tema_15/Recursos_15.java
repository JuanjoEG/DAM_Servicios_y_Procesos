package Tema_15;

import static Principal_Main.Main.*;
import static Tema_15.T_15.*;

/**
 *
 * @author Juan José Estévez González
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
            POR QUÉ EN UNA COMUNICACIÓN DEBEREMOS ENCRIPTAR LAS COMUNICACIONES PARA HACERLAS SEGURAS,
            UTILIZANDO UNA SERIE DE PROTOCOLOS SEGUROS.
                         
            VAMOS A ESTUDIAR CUÁLES SON ESOS PROTOCOLOS SEGUROS,
            Y HAREMOS HINCAPIÉ EN UNO DE LOS MÁS IMPORTANTES, EL PROTOCOLO SSL/TLS.
                         
            TAMBIÉN SEGUIREMOS AHONDADO SOBRE EL CONCEPTO DE ENCRIPTACIÓN,
            PARA CONTINUAR PROTEGIENDO LA INFORMACIÓN DE FORMA SEGURA.
                         
            POR ÚLTIMO,
            EXPERIMENTAREMOS SOBRE CÓMO PODREMOS REALIZAR UNA COMUNICACIÓN EN RED DE FORMA SEGURA,
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
        
           ¿CUÁNDO DEBEMOS PROPORCIONAR PROTECCIÓN A LA INFORMACIÓN?
                    CUANDO SE DESARROLLAN APLICACIONES QUE TIENEN COMUNICACIONES EN RED.
                         
                    LA PROTECCIÓN DE LA INFORMACIÓN, ES ALGO QUE DEBEMOS PROPORCIONAR,
                    YA QUE LAS COMUNICACIONES MEDIANTE UNA RED PUEDEN SER FÁCILMENTE INTERCEPTADAS,
                    Y, POR LO TANTO, PUEDEN SER MANIPULADAS POR PERSONAS INDESEADAS.
                         
            ¿CÓMO SE CREA LOS PROTOCOLOS DE SEGUROS DE COMUNICACIÓN?
                    CUANDO COMBINAMOS EL PODER DE LA CRIPTOGRAFÍA CON LAS COMUNICACIONES EN RED.
                         
                    ESTARÍAMOS CREANDO LO QUE SE CONOCE COMO PROTOCOLOS SEGUROS DE COMUNICACIÓN,
                    O TAMBIÉN LLAMADOS PROTOCOLOS CRIPTOGRÁFICOS, O DE ENCRIPTACIÓN.
                         
            EXISTEN MULTITUD DE ESTE TIPO DE PROTOCOLOS, PERO NOS CENTRAREMOS EN LOS DOS MÁS COMUNES:
                         
                    * PROTOCOLO SSL: (Secure Sockets Layer)
                            ESTE PROTOCOLO PROPORCIONA LA POSIBILIDAD DE TENER
                            UNA COMUNICACIÓN SEGURA EN EL MODELO CLIENTE/SERVIDOR,
                            PROTEGIÉNDOLO DE ATAQUES EN LA RED,
                            COMO PUEDE SER EL PROBLEMA DE man 'in the middle' U HOMBRE EN EL MEDIO,
                            QUE CONSISTE EN QUE UN TERCERO SE DEDIQUE A ESNIFAR EL TRÁFICO DE LA RED DE COMUNICACIONES,
                            PUDIENDO ACCEDER A INFORMACIÓN CONFIDENCIAL.
                         
                    * PROTOCOLO TLS: (Transport Layer Security)
                            ESTE PROTOCOLO SURGIÓ COMO UNA EVOLUCIÓN DEL PROTOCOLO SSL,
                            PROPORCIONANDO LA POSIBILIDAD DE UTILIZAR MUCHOS MÁS ALGORITMOS CRIPTOGRÁFICOS
                            PARA CODIFICAR LA INFORMACIÓN ENVIADA EN LAS COMUNICACIONES.
                         
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
            SON UNOS PROTOCOLOS CRIPTOGRÁFICOS 
            QUE PODEMOS ENCONTRAR ENTRE LAS CAPAS:
                                                        - DE APLICACIÓN 
                                                        - Y DE TRANSPORTE
                                                                            DEL MODELO TCP/IP.
                         
            GRACIAS A ESTO,
            VAMOS A PODER UTILIZARLOS PARA REALIZAR CIFRADOS DE INFORMACIÓN EN PROTOCOLOS COMO TELNET, IMAP, FTP, HTTP ...
            SIEMPRE QUE UN PROTOCOLO DE ENCRIPTACIÓN COMO SSL O TLS
            SEA EJECUTADO SOBRE UN PROTOCOLO DE COMUNICACIÓN,
            OBTENDREMOS LA VERSIÓN SEGURA DEL MISMO.
                    - FTPS    -->   VERSIÓN SEGURA DEL PROTOCOLO FTP.
                    - HTTPS   -->   VERSIÓN SEGURA DEL PROTOCOLO HTTP.
                    - SSH     -->   VERSIÓN SEGURA DEL PROTOCOLO TELNET.

            SEGÚN ESTO, PODEMOS AFIRMAR QUE,
            POR EJEMPLO, EL PROTOCOLO FTPS NO ES QUE SEA MÁS IMPORTANTE QUE EL PROTOCOLO FTP,
            PERO AL ESTAR EJECUTÁNDOSE EN ÉL UN PROTOCOLO DE CRIPTOGRAFÍA, YA ES UN PROTOCOLO SEGURO.
                         
            MODELO TCP/IP:           CAPA                 OBJECTORS DE TRANSITION
            ************************************************************************
                             ---- APLICACIÓN ---------------- MENSAJES ----
                             ---- TRANSPORTE ---------------- PAQUETES ----
                             ---- RED (INTERNET) ------------ DATAGRAMAS --
                             ---- ENLACE -------------------- TRAMAS ------
                             ---- FÍSICA -------------------- BITS --------
                         
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
        
            ¿PARA QUÉ SE CREO EL PROTOCOLO SSL?
                    EL PROTOCOLO SSL (Secure Sockets Layer)
                    FUE CREADO POR LA EMPRESA Netscape
                    EN UN AFÁN DE HACER SEGURAS LAS COMUNICACIONES
                    ENTRE LOS NAVEGADORES WEB Y LOS SERVIDORES,
                    AUNQUE SE PODÍA, Y SE PUEDE,
                    UTILIZAR EN CUALQUIER APLICACIÓN CON ESQUEMA CLIENTE/SERVIDOR.
                         
            ¿QUÉ NOS VA A PROPORCIONAR?
                    EL PROTOCOLO SSL NOS VA A PROPORCIONAR
                    LAS PROPIEDADES QUE HACEN SEGURAS A LAS COMUNICACIONES.
                    ESTAMOS HABLANDO DE:
                            * AUTENTICACIÓN.
                            * CONFIDENCIALIDAD.
                            * INTEGRIDAD.
                         
            ¿CÓMO FUNCIONA EL PROTOCOLO SSL?
                    EL FUNCIONAMIENTO DEL PROTOCOLO SSL CONSISTE
                    EN QUE ANTES DE PODER TENER UNAN COMUNICACIÓN SEGURA ENTRE CLIENTE Y SERVIDOR,
                    DEBEN DE 'NEGOCIARSE' UNA SERIE DE CONDICIONES O PARÁMETROS PARA DICHA COMUNICACIÓN,
                    ESTO SE CONOCE COMO APRETÓN DE MANOS O handshake,
                    CONOCIDO COMO EL ------------------------------------------->   SSL/TLS Handshake Protocol.
                         
                    TAMBIÉN EXISTE LA VERSIÓN DEL LLAMADO ---------------------->   SSL/TLS Record Protocol,
                    MEDIANTE EL CUAL SE VAN A ESPECIFICAR DE QUÉ FORMA
                    SE VAN A ENCAPSULAR LOS DATOS QUE SERÁN TRANSMITIDOS,
                    PUDIÉNDOSE INCLUSO NEGOCIAR LOS DATOS DE LA PROPIA NEGOCIACIÓN PREVIA.
                         
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
                            SE NEGOCIAN LOS ALGORITMOS CRIPTOGRÁFICOS QUE SE VAN A UTILIZAR EN LA COMUNICACIÓN.
                         
                  2 - FASE DE AUTENTICACIÓN:
                            - SE INTERCAMBIARÁN LAS CLAVES.
                            - SE AUTENTICARÁN LAS PARTES MEDIANTE CERTIFICADOS DE CRIPTOGRAFÍA ASIMÉTRICA.
                            EN ESTA FASE ES DONDE SE VAN A CREAR LAS CLAVES NECESARIAS
                            PARA REALIZAR LA TRANSMISIÓN DE INFORMACIÓN.
                         
                  3 - FASE DE VERIFICACIÓN:
                            SE HARÁ UNA VERIFICACIÓN DE QUÉ EL CANAL ES SEGURO PARA LA COMUNICACIÓN.
                         
                  4 - COMUNICACIÓN SEGURA:
                            EN ESTE PUNTO YA COMENZARÍA LA COMUNICACIÓN SEGURA DE INFORMACIÓN.
                         
            SI POR CUALQUIER MOTIVO FALLASE LA NEGOCIACIÓN, LA COMUNICACIÓN NO LLEGARÍA A ESTABLECERSE.
                                     
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
        
            PODEMOS UTILIZAR LOS SIGUIENTES ALGORITMOS CRIPTOGRÁFICOS PARA SER UTILIZADOS CON SSL/TLS:
                         
                    * ALGORITMOS DE CLAVE SIMÉTRICA:
                            - IDEA.
                            - DES.
                            - ...
                         
                    * ALGORITMOS DE CLAVE PÚBLICA:
                            - RSA.
                         
                    * CERTIFICADOS DIGITALES:
                            - RSA.
                         
                    * RESÚMENES:
                            - MD5.
                            - SHA.
                            - ...
                         
            RAZONES DEL ÉXITO DE SSL/TLS:
                         
            EL ÉXITO DEL PROTOCOLO SSL/TLS SE DEBE FUNDAMENTALMENTE
            A LA EXPANSIÓN QUE HA TENIDO EL COMERCIO ELECTRÓNICO EN INTERNET,
            AUNQUE TAMBIÉN ES UTILIZADO PARA PODER CREAR REDES PRIVADAS VIRTUALES O VPN.
                         
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
        
            EL LENGUAJE DE PROGRAMACIÓN JAVA NOS PROPORCIONA LA CLASE  ------>  Cipher
            MEDIANTE LA CUAL VAMOS A PODER REALIZAR CODIFICACIONES DE DATOS.
                         
            UNO DE LOS ALGORITMOS DE ENCRIPTADO QUE VAMOS A PODER UTILIZAR ES EL CIFRADO AES,
            NO OBSTANTE, SE ADMITEN MUCHOS MODOS DE OPERACIÓN MÁS.
                         
            ¿QUÉ ES EL ALGORITMO DE CIFRADO AES?  Advanced Encryption Standard
                    ES UN CIFRADO DE ESQUEMA POR BLOQUES QUE SE COMENZÓ A UTILIZAR EN ESTADOS UNIDOS.
                    AES POSEE UN TAMAÑO DE BLOQUE FIJO DE 128 BITS
                    Y TAMAÑOS DE CLAVE DE 128, 192 O 256 BITS.
                    LA MAYORÍA DE LOS CÁLCULOS DEL ALGORITMO AES SE HACEN EN UN CAMPO FINITO DETERMINADO.
                         
            ¿QUÉ NECESITAMOS PARA UTILIZAR AES?
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
            PODEMOS USAR EL CÓDIGO QUE PODEMOS VER EN LA FIGURA 4.

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
        
            EL LENGUAJE DE PROGRAMACIÓN JAVA NOS PROPORCIONA LA LASE ---->  Signature    PAQUETE ---->  java.security
            
            NOS VA A PERMITIR REALIZAR LA IMPLEMENTACIÓN DE FIRMA DIGITAL Y ADEMÁS DE VERIFICARLA.
                         
            PASOS NECESARIOS:
                         
                    1.- GENERAMOS LAS CLAVES PÚBLICAS Y PRIVADAS:  CLASE  --->  KeyPairGenerator
                            - CLASE PARA FIRMAR: ---------------------------->  PrivateKey
                            - CLASE PARA VERIFICAR LA FIRMA:  --------------->  PublicKey
                         
                    2.- REALIZAREMOS LA FIRMA DIGITAL MEDIANTE LA CLASE ----->  Signature
                         
                        UTILIZANDO ALGORITMO DE CLAVE ASIMÉTRICA, COMO EL --->  DSA
                         
                        USAREMOS LOS MÉTODOS:
                                PARA GENERAR LA FIRMA: ---------------------->  initSign()
                                PARA CREAR EL RESUMEN DEL MENSAJE: ---------->  update()
                                PARA TERMINAR DE CREAR LA FIRMA: ------------>  sign()
                         
                    3.- VERIFICAREMOS LA FIRMA MEDIANTE LA CLAVE PÚBLICA.
                                LE PASAMOS LA CLAVE PÚBLICA AL MÉTODO: ------>  initVerify()
                                ACTUALIZAMOS EL RESUMEN DEL MENSAJE: -------->  update()
                                Y COMPROBAMOS SI COINCIDE CON EL ENVIADO.
                                REALIZAMOS LA VERIFICACIÓN DE LA FIRMA CON: ->  verify()
                         
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
                     *    (3) Verifica la firma con la correspondiente clave pública 
                     *    IMPORTANTE: descargar la biblioteca de commons-codec de Apache, de la URL:
                     *    http://commons.apache.org/proper/commons-codec/download_codec.cgi
                     *    e incluir el fichero commons-codec.jar entre las bibliotecas del proyecto.
                     * 
                     * @author Juan José Estévez González
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
                            // reinicializar el objeto Signature con la clave pública. 
                            // Esto hace un reset de los datos de la firma con lo que hay que 
                            // pasárselos de nuevo para hacer el update.
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
        
            EL LENGUAJE DE PROGRAMACIÓN JAVA
            NOS PERMITE CREAR UNA VERSIÓN SEGURA 
            DE LOS SOCKETS QUE UTILIZAMOS EN UNIDADES ANTERIORES.
                         
            SI RECORDAMOS, UTILIZAMOS LOS SOCKETS
            PARA ESTABLECER UNA COMUNICACIÓN EN RED ENTRE LAS DOS PARTES DEL MODELO CLIENTE/SERVIDOR,
            PERO LOS SOCKETS QUE UTILIZAMOS ANTERIORMENTE NO ERAN SEGUROS, YA QUE NO CIFRABAN LA INFORMACIÓN.
                         
            CERTIFICADOS PARA SOCKETS SEGUROS:
                    PARA PODER UTILIZAR LA VERSIÓN SEGURA DE LOS SOCKETS,
                    PRIMERAMENTE, DEBEREMOS CREAR LOS CERTIFICADOS QUE NOS AYUDARÁN A ENCRIPTAR LA INFORMACIÓN.
                         
                    PARA CREAR EL CERTIFICADO DEL SERVIDOR
                    NECESITAMOS ABRIR UNA VENTANA DE COMANDOS (CMD DE WINDOWS O BASH DE LINUX)
                    LO HACEMOS EN MODO ADMINISTRADOR, Y EJECUTAR EL SIGUIENTE COMANDO (Chudiang, 2016):
                         
            (A)             keytool -genkey -keyalg RSA -alias serverKay -keystore serverKey.jks -storepass servpass
                         
                    PUEDE QUE NO FUNCIONE SI NO TIENES LA CARPETA DE JAVA EN EL PAHT DE LAS VARIABLES DE ENTORNO.
                    ENTONCES TENDRÁS QUE DESPLAZARTE A LA CARPETA DONDE SE ENCUENTRA keytool.exe,
                    keytool.exe SE ENCUENTRA DENTRO DE LA CARPETA DE INSTALACIÓN DE JAVA, JAVA/BIN
                         
                    CUANDO EJECUTEMOS EL COMANDO,
                    EL SISTEMA NOS IRÁ SOLICITANDO UNA SERIE DE DATOS,
                    COMO NUESTRO NOMBRE, APELLIDOS, ETC. (APUNTAR LOS DATOS QUE LE PASEMOS)
                         
                    UN CERTIFICADO VA A IR ASOCIADO A ALGUNA PERSONA U ORGANIZACIÓN,
                    ES POR ESTE MOTIVO POR LO QUE EN ESTE PUNTO NOS SOLICITA ESOS DATOS.
                         
                    CUANDO TENGAMOS EL CERTIFICADO DEL SERVIDOR,
                    DEBEMOS GENERAR EL CERTIFICADO PARA EL CLIENTE.
                    COMO EL CERTIFICADO DEL SERVIDOR ESTÁ DENTRO DE UN ALMACÉN, 
                    TENEMOS QUE SACARLO DE AHÍ A UN FICHERO. 
                         
                    EL COMANDO PARA GENERAR EL CERTIFICADO DEL CLIENTE QUE DEBEMOS USAR ES:
                         
            (B)             keytool -export -keystore serverKey.jks -alias serverKay -file ServerPublicKey.cer
                    
                    REPETIMOS TODO EL PROCESO PARA GENERAR LOS FICHEROS DEL CLIENTE.
                    CREAMOS EL CERTIFICADO DEL CLIENTE EN UN ALMACÉN DE CERTIFICADOS clientKey.jks:
                         
            (A)             keytool -genkey -keyalg RSA -alias clientKay -keystore clientKey.jks -storepass clientpass
                         
                    EXPORTAMOS EL CERTIFICADO DEL CLIENTE A UN FICHERO:
                         
            (B)             keytool -export -keystore clientKey.jks -alias clientKay -file ClientPublicKey.cer
                         
                    METEMOS LA CLAVE PÚBLICA DEL CLIENTE EN LOS CERTIFICADOS DE CONFIANZA DEL SERVIDOR:
                         
            (C)             keytool -import -v -trustcacerts -alias clientKay -file ClientPublicKey.cer -keystore
                            serverTrustedCerts.jks -keypass servpass -storepass servpass
                         
                    METEMOS LA CLAVE PÚBLICA DEL SERVIDOR EN LOS CERTIFICADOS DE CONFIANZA DEL CLIENTE:
                                             
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
        
            VAMOS A VER CÓMO PODEMOS IMPLEMENTAR UN SERVIDOR SEGURO EN JAVA.
            LA FORMA FÁCIL DE CREAR LOS SOCKETS SSL
            ES USAR LAS FACTORÍAS DE SOCKET SSL POR DEFECTO QUE NOS PROPORCIONA JAVA. 
                         
            PARA EL LADO DEL SERVIDOR, EL CÓDIGO SERÍA (Chudiang, 2016):
                         
                    SSLServerSocketFactory serverFactory = (SSLServerSocketFactory)
                    SSLServerSocketFactory.getDefault();
                    ServerSocket serverSocket = serverFactory.createServerSocket(puerto);
                         
            LA ÚNICA PREGUNTA QUE PODEMOS HACERNOS EN ESTE PUNTO ES
            ¿CÓMO PODEMOS INDICAR DÓNDE SE ENCUENTRAN LOS ALMACENES DE CERTIFICADOS
            Y CERTIFICADOS DE CONFIANZA QUE GENERAMOS EN EL PASO ANTERIOR? 
                         
            ESTO LO VAMOS A PODER HACER MEDIANTE LAS PROPIEDADES DE System,
            O BIEN CON OPCIONES DEL PARÁMETRO -D AL ARRANCAR NUESTRA APLICACIÓN JAVA.
                         
            LAS PROPIEDADES A FIJAR SON:
                         
                    * javax.net.ssl.keyStore:
                            CON EL QUE INDICAMOS EL ALMACÉN DONDE ESTÁ EL CERTIFICADO QUE NOS IDENTIFICA.
                         
                    * javax.net.ssl.keyStorePassword:
                            CON EL QUE INDICAMOS LA CLAVE PARA ACCEDER A DICHO ALMACÉN Y PARA ACCEDER AL CERTIFICADO DENTRO DEL ALMACÉN. 
                         
                    * javax.net.ssl.trustStore:
                            CON EL QUE INDICAMOS EL ALMACÉN DONDE ESTÁN LOS CERTIFICADOS EN LOS QUE SE CONFÍA.
                         
                    * javax.net.ssl.trustStorePassword:
                            CON EL QUE INDICAMOS LA CLAVE PARA ACCEDER A DICHO ALMACÉN Y A LOS CERTIFICADOS DENTRO DEL ALMACÉN.
                         
            SI DECIDIMOS HACERLO MEDIANTE System.setProperty(), EL CÓDIGO QUEDARÍA ASÍ:
                         
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
        
            ¿CÓMO PODEMOS IMPLEMENTAR UN CLIENTE SEGURO EN JAVA?
                         
            VAMOS A VER CÓMO PODEMOS IMPLEMENTAR UN CLIENTE SEGURO EN JAVA.
            AL IGUAL QUE CON EL SERVIDOR,
            EN EL CLIENTE LA FORMA FÁCIL DE CREAR LOS SOCKETS SSL 
            ES USAR LAS FACTORÍAS DE SOCKET SSL POR DEFECTO QUE NOS PROPORCIONA JAVA. 
            EL CÓDIGO EN ESTE CASO SERÍA:
                         
                    SSLSocketFactory clientFactory = (SSLSocketFactory)
                    SSLSocketFactory.getDefault();
                    Socket cliente = clientFactory.createSocket(servidorseguro, puerto);
                         
            DONDE MEDIANTE LA VARIABLE servidorseguro y puerto INDICAMOS CUÁLES SERÁN LA DIRECCIÓN IP Y EL PUERTO,
            DONDE ESTÁ EL SERVIDOR SEGURO QUE HEMOS CREADO ANTERIORMENTE.
                         
            PARA TRABAJAR CON LOS CLIENTES A PARTIR DE ESTE PUNTO, SE DEBERÁ OBTENER UN SOCKET DE LA FORMA HABITUAL.
                         
            ¿QUÉ INCONVENIENTE PODEMOS ENCONTRAR EN ESTE MECANISMO?
            HAY QUE REMARCAR QUE TODAS LAS VARIABLES DE CONFIGURACIÓN
            QUE HEMOS VISTO ANTERIORMENTE EN LA PARTE DE CREACIÓN DEL SERVIDOR SEGURO 
            VAN A AFECTAR A TODO EL PROGRAMA JAVA.
                         
            A PARTIR DE ESE MOMENTO,
            TODOS LOS SOCKETS QUE ABRAMOS TENDRÁN EL MISMO CERTIFICADO Y CONFIARÁN EN LOS MISMOS CERTIFICADOS.
            SI QUISIÉSEMOS PODER ESTABLECER VARIOS SOCKETS CON DISTINTOS CERTIFICADOS Y DISTINTOS CERTIFICADOS DE CONFIANZA,
            NECESITAMOS UNA CONFIGURACIÓN MÁS COMPLEJA.
                         
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
                         
                    * TODAS LAS VARIABLES DE CONFIGURACIÓN QUE HEMOS VISTO ANTERIORMENTE
                      EN LA PARTE DE CREACIÓN DEL SERVIDOR SEGURO
                      VAN A AFECTAR A TODO EL PROGRAMA JAVA.
                         
                    * DE ESTE MODO,
                      TODOS LOS SOCKETS QUE ABRAMOS
                      TENDRÁN EL MISMO CERTIFICADO 
                      Y CONFIARÁN EN LOS MISMOS CERTIFICADOS.
                         
                    * SI QUISIÉRAMOS PODER ESTABLECER VARIOS SOCKETS CON DISTINTOS CERTIFICADOS,
                      POR EJEMPLO, PARA IDENTIFICAR A POSIBLES DIFERENTES CLIENTES,
                      Y DISTINTOS CERTIFICADOS DE CONFIANZA,
                      NECESITAMOS UNA CONFIGURACIÓN MÁS COMPLEJA.
                         
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
                    PARA LA COMUNICACIÓN SEGURA ENTRE CLIENTE Y SERVIDOR.
                         
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