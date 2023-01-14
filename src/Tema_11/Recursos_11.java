package Tema_11;

import static Principal_Main.Main.*;
import static Tema_11.T_11.*;

/**
 *
 * @author Juan José Estévez González
 */

public class Recursos_11 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_11 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        **********************************************************************************************************************************
        
            EN ESTA UNIDAD VAMOS A CONTINUAR CON LOS SERVICIOS EN RED, CON EL CONCEPTO DE SOCKET,
            APRENDIENDO CÓMO PODEMOS CREAR DIFERENTES TIPOS DE CLIENTES EN JAVA.
                         
                - CLIENTE HTTP.
                         
                - CLIENTE FTP.
                         
                - CLIENTE TELNET.
                         
                - CLIENTE SMTP.
                         
            CREAREMOS APLICACIONES CON SOCKETS
            QUE IMPLEMENTEN UN SERVIDOR QUE PUEDA ATENDER A VARIOS CLIENTES A LA VEZ,
            UTILIZANDO HEBRAS.
                         
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
        
            LA IMPLEMENTACIÓN DEL PROTOCOLO HTTP O HTTPS SE BASA EN UN PROCESO QUE IMPLICA
            UNA SERIE DE SOLICITUDES Y RESPUESTAS A ESAS SOLICITUDES POR PARTE DEL CLIENTE Y DEL SERVIDOR.
                         
                    1.- UN CLIENTE ESTABLECERÁ UNA CONEXIÓN CON UN SERVIDOR,
                        ENVIANDO UN MENSAJE DE SOLICITUD CON LOS DATOS PERTINENTES, --> PÁGINA WEB QUE QUIERE VER.
                         
                    2.- CUANDO EL SERVIDOR RECIBA EL MENSAJE,
                        LE RESPONDERÁ CON UN MENSAJE CONTENIENDO EL RESULTADO
                        DE LA OPERACIÓN SOLICITADA POR EL CLIENTE,  -->  PÁGINA WEB EN CÓDIGO HTML.
                         
            JAVA DISPONE DE DOS CLASES PARA APLICACIONES CON SERVIDORES Y CLIENTES HTTP:
                         
                    - LA CLASE URL:
                            PERMITE REPRESENTAR UNA DIRECCIÓN DE UNA PÁGINA WEB,
                            DE FORMA QUE EL PROGRAMA PUEDA REALIZAR OPERACIONES CON ELLA.
                         
                    - LA CLASE URLConnection:
                            PERMITE REALIZAR OPERACIONES CON LA DIRECCIÓN WEB QUE HEMOS 'CREADO/CONECTADO' MEDIANTE URL.
                                POR EJEMPLO: PODEMOS OBTENER LA RESPUESTA DEL SERVIDOR HTTP.
                         
            UNA VEZ HECHO LO ANTERIOR, PODREMOS LANZAR OPERACIONES TIPO GET 
            (CON LAS QUE ACTIVAR DETERMINADOS SERVICIOS DEL SERVIDOR, PASÁNDOLE PARÁMETROS),
            Y OBTENER LAS RESPUESTAS A ESTAS PETICIONES.
                         
                AL UTILIZAR ESTAS CLASES ESTAMOS PROGRAMANDO UN SERVICIO HTTP DE ALTO NIVEL:
                    - TODAS LAS OPERACIONES QUE HARÁN POSIBLE LA COMUNICACIÓN NO SE VISUALIZARÁN.
                    - TRABAJAR CON ELLO SERÁ TAN SENCILLO CÓMO PROGRAMAR UN SERVIDOR O CLIENTE MEDIANTE EL USO DE SOCKETS.
                         
                    - LA 'ÚNICA' DIFERENCIA SERÁ QUE EN LUGAR DE UTILIZAR LAS CLASES DE LOS SOCKETS,
                      UTILIZAREMOS LAS DE HTTP/HTTPS. -->    URL  Y  URLConnection
                         
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
                         
            package Tema_11;

            import java.io.BufferedReader;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.InputStreamReader;
            import java.net.MalformedURLException;
            import java.net.URL;
            import java.net.URLConnection;

            /**
             *                                    EJEMPLO DE CLIENTE HTTP SENCILLO:
             *                        LA SALIDA QUE SE OBTIENE ES EL 'CÓDIGO FUENTE' DE LA PÁGINA.
             */
            public class ClienteHTTP {

                public static void main(String[] args) {

                    try {                        
                        URL url = new URL("http://www.google.es");                          // SE ABRE LA CONEXIÓN.
                        URLConnection conexion = url.openConnection();
                        conexion.connect();
                        
                        InputStream is = conexion.getInputStream();                         // LECTURA
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
                        
                        char[] buffer = new char[1000];                         // ARRAY DE 1000 CARACTERES PARA GUARDAR EL CÓDIGO FUENTE DE LA PÁGINA WEB.
                        int leido;
                        
                        while ((leido = br.read(buffer))>0) {                   // MOSTRAMOS POR PANTALLA
                            System.out.println(new String(buffer, 0, leido));
                        }            
                    } catch (MalformedURLException e) {    
                        e.printStackTrace();        
                    } catch (IOException e) {    
                        e.printStackTrace();
                    }        
                }    
            }
                         
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
        
            FTP --> FILE TRANSFER PROTOCOL  --> PROTOCOLO DE TRANSFERENCIA DE FICHEROS.
                         
            HACE REFERENCIA A UN PROTOCOLO PARA ENVIAR FICHEROS ENTRE UN SERVIDOR Y UN CLIENTE O VICEVERSA,
                         
            LOS PASOS PARA CREAR UN CLIENTE FTP SON LOS SIGUIENTES:
                         
                    - REALIZAR UNA CONEXIÓN AL SERVIDOR.
                    - COMPROBAR QUE LA CONEXIÓN QUE SE HA REALIZADO CON ÉXITO.
                    - VALIDAR EL USUARIO FTP QUE SE HA CONECTADO.
                            - EN CASO DE QUE EL USUARIO NO SEA VÁLIDO DEBEREMOS
                              ABORTAR LA CONEXIÓN Y ENVIAR UN MENSAJE DE ERROR.
                    - REALIZAR LAS OPERACIONES PERTINENTES CON EL SERVIDOR.
                    - DESCONECTAR DEL SERVIDOR UNA VEZ TERMINEMOS DE REALIZAR LAS OPERACIONES REQUERIDAS.
                         
            TODO EL PROCESO DE CONEXIONES Y REALIZACIÓN DE OPERACIONES PUEDE GENERAR EXCEPCIONES:
                         
                    - SocketException.
                    - IOException.
                         
            TANTO SI ES FTP ACTIVO O PASIVO, HAY QUE HACER UNA VALIDACIÓN DEL USUARIO,
            TIENE QUE HABER UN MENSAJE DE IDENTIFICACIÓN DEL USUARIO QUE SE CONECTA.
            
            ESTA ES LA DIFERENCIA PRINCIPAL ENTRE UN CLIENTE:
                    FTP  --> SÍ REQUIERE USUARIO.
                    HTTP --> NO REQUIERE USUARIO.
                         
                FTP ACTIVO: (CONEXIÓN POR PUERTO DEL CLIENTE)

                        EL CLIENTE LE INDICA AL SERVIDOR QUE SE CONECTE A SU PUERTO.

                        EL SERVIDOR INICIA LA CONEXIÓN CON EL PUERTO QUE EL CLIENTE LE HA ESPECIFICADO.                       

                FTP PASIVO: (CONEXIÓN POR PUERTO DEL SERVIDOR)

                        PARA ACTIVARLO, EL CLIENTE SE CONECTA AL SERVIDOR Y LE ENVÍA LA ORDEN --> 'PASV'.

                        EL SERVIDOR LE CONTESTA AL CLIENTE QUE TIENE QUE ABRIR OTRA CONEXIÓN A UN PUERTO INDICADO POR EL SERVIDOR.

                        EL CLIENTE SE CONECTA POR EL PUERTO QUE EL SERVIDOR LE INDICA.
                        EL SERVIDOR RECIBE LA CONEXIÓN DEL CLIENTE POR EL PUERTO INDICADO.
                         
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
        
            EL LENGUAJE DE PROGRAMACIÓN JAVA NO DISPONE DE CLASES ESPECÍFICAS PARA EL USO DEL PROTOCOLO FTP.
                         
            PARA TRABAJAR CON CLIENTES Y SERVIDORES FTP:
            LA FUNDACIÓN APACHE CREÓ LA API:         --->     org.apache.commons.net.ftp
                         
            PARA QUE FUNCIONE NUESTRO PROYECTO JAVA 'ClienteFTP' NECESITAMOS INCLUIR:             
                         
                    - SI TENEMOS UN MAVEN PROJECT:
                            INCLUIR LAS DEPENDENCIAS DE ESTA API EN EL ACHIVO   -->  pom.xml
                         
                    - SI ESTAMOS CON OTROS SISTEMAS:
                            IMPORTAR LOS .jar Y DEMÁS,
                            PARA PODER UTILIZAR TODO LO QUE ESTÁ DENTRO DE org.apache.commons.net.ftp
                         
            ESTA API TIENE LAS SIGUIENTES CLASES PARA OPERAR CON EL PROTOCOLO FTP:
                         
                    - LA CLASE FTP:
                            PROPORCIONA TODAS LAS FUNCIONALIDADES BÁSICAS PARA PODER REALIZAR UN CLIENTE FTP BÁSICO.
                            ESTA CLASE HEREDA DE   --->    SocketClient
                         
                    - LA CLASE FTPReplay:
                            PERMITE OPERAR CON LOS VALORES DEVUELTOS POR LAS CONSULTAS FTP DEL SERVIDOR.
                         
                    - LA CLASE FTPClient:
                            ENCARGADA DE DAR SOPORTE A LAS FUNCIONALIDADES DEL CLIENTE FTP.
                            ESTA CLASE HEREDA DE   --->    SocketClient
                         
                    - LA CLASE FTPClientConfig:
                            PERMITE REALIZAR LAS CONFIGURACIONES OPORTUNAS DE LOS CLIENTES FTP.
                         
                    - LA CLASE FTPSClient:
                            PERMITE UTILIZAR EL PROTOCOLO FTPS.
                            FTPS ES LA VERSIÓN SEGURA DEL PROTOCOLO FTP.
                            ESTA CLASE UTILIZA EL PROTOCOLO   --->    SSL.
                            ESTA CLASE HEREDA DE   --->    FTPClient
                         
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
                         
            package Tema_11;

            import java.io.FileInputStream;
            import java.io.IOException;
            import org.apache.commons.net.ftp.FTP;
            import org.apache.commons.net.ftp.FTPClient;
            
            public class ClienteFTP {

                public static void main(String[] args) {
                    
                    FTPClient cliente = new FTPClient();                                // CREANDO NUESTRO OBJETO ClienteFTP.
                                                                                        // DATOS PARA CONECTAR AL SERVIDOR FTP.
                    String ftp = "ftp.miservidor.com";                                  // TAMBIÉN PUEDE IR LA DIRECCIÓN IP Y EL PUERTO.
                    String user = "usuario";
                    String password = "passwword";

                    try {                        
                        cliente.connect(ftp);                                            // CONECTANDO AL SERVIDOR.
                        
                        boolean login = cliente.login(user, password);                   // LOGUEADO UN USUARIO (true = PUDO CONECTARSE, false = NO PUDO CONECTARSE).
                        
                        cliente.setFileType(FTP.TEXT_FILE_TYPE, FTP.BINARY_FILE_TYPE);   // ESPECIFICAMOS QUÉ TIPO DE FICHERO QUEREMOS TRANSMITIR.
                        cliente.setFileTransferMode(FTP.BINARY_FILE_TYPE);               // ESPECIFICAMOS CÓMO LO QUEREMOS TRANSMITIR.
                        cliente.enterLocalPassiveMode();                                 // ESPECIFICAMOS SI VA A SER UNA CONEXIÓN EN MODO ACTIVO O PASIVO.

                        String filename = "miarchivo.txt";

                        FileInputStream fis = new FileInputStream(filename);             // ACCEDEMOS AL FICHERO.
                        
                        cliente.storeFile(filename, fis);                                // GUARDANDO EL ARCHIVO EN EL SERVIDOR.

                        cliente.logout();                                                // CERRANDO SESIÓN.
                
                        cliente.disconnect();                                            // DESCONECTANDOSE DEL SERVIDOR.
                    } catch (IOException ioe) {        
                        System.out.println(ioe.getMessage());
                    }
                }    
            }
                         
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
        
            PARA UNA MÍNIMA SEGURIDAD EN EL SISTEMA PODRÍAMOS REALIZAR
            LAS SIGUIENTES COMPROBACIONES UNA VEZ NOS LLEGUE UNA PETICIÓN DE UN CLIENTE:
                         
                - COMPROBAR QUE EL CLIENTE ES UN CLIENTE VÁLIDO DEL SISTEMA:
                  PARA ESTO DEBEREMOS MANTENER UN LISTADO DE CLIENTES VÁLIDOS DEL SISTEMA:
                        - EN UNA BASE DE DATOS.
                        - EN SU DEFECTO, EN UN FICHERO.
                         
                - COMPROBAR QUE LA OPERACIÓN QUE NOS PIDE EL CLIENTE ES UNA OPERACIÓN VÁLIDA EN EL SISTEMA.
                        - PARA ESTO BASTA CON SABER QUÉ OPERACIONES HEMOS DISEÑADO EN NUESTRO SISTEMA
                          Y CUÁLES SON SUS PARÁMETROS. (LOS ENDPOINT DE LA API).
                         
                - COMPROBAR QUE EL CIENTE TIENE PERMISOS PARA REALIZAR DICHA OPERACIÓN.
                        - DE IGUAL FORMA QUE DEBEMOS TENER UN REGISTRO DE CLIENTES VÁLIDOS EN EL SISTEMA,
                          LE PODEMOS AGREGAR UNA SERIE DE DATOS INDICANDO QUÉ OPERACIONES PUEDEN REALIZAR CADA UNO.
                         
            NO SOLO CON LOS SERVIDORES FTP TENEMOS QUE HACER UNA SERIE DE COMPROBACIONES BÁSICAS,
            SINO QUE CON CUALQUIER TIPO DE SERVICIO DEBERÍAMOS DE TENER UNAS MÍNIMAS COMPROBACIONES DE SEGURIDAD.
                         
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
        
            TELNET:  -->  TELECOMUNICATION NETWORK  -->  RED DE TELECOMUNICACIONES.
                         
            EL PROTOCOLO TELNET:
                PERMITE ACCEDER A OTROS EQUIPOS CONECTADOS A NUESTRA RED,
                PUDIENDO REALIZAR ASÍ ADMINISTRACIÓN REMOTA,
                COMO SI ESTUVIÉRAMOS SENTADOS FRENTE AL EQUIPO QUE ESTAMOS ADMINISTRANDO REMOTAMENTE.
                         
                        - SE HACE MUY SIMPLE LA ADMINISTRACIÓN DE EQUIPOS QUE NO TENGAN PANTALLA NI TECLADO,
                          ES DECIR, QUE SEA UN SERVIDOR QUE SE ARRANCA Y LANZA TODAS SUS TAREAS Y SERVICIOS AUTOMÁTICAMENTE.
                         
                EL PROTOCOLO TELNET ESTÁ BASADO EN:
                         
                        - TIENE EL ESQUEMA BÁSICO DEL PROTOCOLO CLIENTE/SERVIDOR.
                         
                        - EL PUERTO QUE UTILIZA POR DEFECTO ES EL  -->  23.
                         
                        - FUNCIONA MEDIANTE COMANDOS EN MODO TEXTO.
                         
                EL PROTOCOLO TELNET NO OFRECE MUCHA SEGURIDAD,
                Y ES POR ESTA MISMA RAZÓN POR LA QUE APENAS SE UTILIZA EN LAS GRANDES EMPRESAS.
                         
                        - TODA INFORMACIÓN SE TRANSMITE EN MODO TEXTO PLANO,
                          INCLUIDOS LOS DATOS Y CONTRASEÑAS DE LOS USUARIOS,
                          CUANDO ESTE TIPO DE INFORMACIÓN DEBERÍA INTERCAMBIARSE CIFRADA.
                         
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
        
            EL LENGUAJE DE PROGRAMACIÓN JAVA NO DISPONE DE CLASES ESPECÍFICAS PARA EL USO DEL PROTOCOLO TELNET.
                                     
            PARA TRABAJAR CON CLIENTES Y SERVIDORES TELNET:
            LA FUNDACIÓN APACHE CREÓ LA API:         --->     org.apache.commons.net.telnet

            PARA QUE FUNCIONE NUESTRO PROYECTO JAVA 'ClienteTELNET' NECESITAMOS INCLUIR:             

                    - SI TENEMOS UN MAVEN PROJECT:
                            INCLUIR LAS DEPENDENCIAS DE ESTA API EN EL ACHIVO   -->  pom.xml

                    - SI ESTAMOS CON OTROS SISTEMAS:
                            IMPORTAR LOS .jar Y DEMÁS,
                            PARA PODER UTILIZAR TODO LO QUE ESTÁ DENTRO DE org.apache.commons.net.telnet

            ESTA API TIENE LA SIGUIENTE CLASES PARA OPERAR CON EL PROTOCOLO TELNET:

                    - LA CLASE TelnetClient:
                            PERMITE IMPLEMENTAR UN TERMINAL PARA USAR EL PROTOCOLO TELNET.
                            ESTA CLASE HEREDA DE   --->    SocketClient
                         
                            ENTRE LOS MÉTODOS MÁS ÚTILES DE ESTA CLASE TENEMOS:
                         
                                    - EL MÉTODO SocketClient.connect():
                                            NOS PERMITIRÁ REALIZAR UNA CONEXIÓN AL SERVIDOR.
                         
                                    - EL MÉTODO TelnetClient.getInputStream():
                                            NOS PERMITIRÁ OBTENER LOS FLUJOS DE COMUNICACIÓN DE ENTRADA.
                         
                                    - EL MÉTODO TelnetClient.getOutputStream():
                                            NOS PERMITIRÁ OBTENER LOS FLUJOS DE COMUNICACIÓN DE SALIDA.
                         
                                    - EL MÉTODO TelnetClient.disconnect():
                                            NOS PERMITIRÁ DESCONECTARNOS DE ESTE SERVIDOR REMOTO.
                         
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
                         
            package Tema_11;
            
            import java.io.IOException;
            import org.apache.commons.net.telnet.TelnetClient;
                         
            public class ClienteTELNET {
                
                public static void main(String[] args) {

                    TelnetClient telnet = new TelnetClient();

                    try {        
                        telnet.connect("rainmaker.wunderground.com", 3000);
                    } catch (IOException e) {

                        e.printStackTrace();
                        System.exit(1);
                    }
                    IOUtil.readWrite(telnet.getInputStream(), telnet.getOutputStream(), System.in, System.out);
                    try {        
                        telnet.disconnect();
                    } catch(IOException e) {

                        e.printStackTrace();
                        System.exit(1);
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
        
            EL PROTOCOLO SMTP ES EL QUE SE UTILIZA PARA ENVIAR Y RECIBIR CORREOS ELECTRÓNICOS.
                         
            PARA PODER IMPLEMENTAR UN CLIENTE SMTP VAMOS A UTILIZAR LA API QUE PROPORCIONA JAVA   --->   javax.mail
                         
            DENTRO DE ESTA API TENEMOS LAS SIGUIENTES CLASES DE INTERÉS:
                         
                    - LA CLASE Session:
                            REPRESENTA UNA SESIÓN DE USUARIO PARA CORREO ELECTÓNICO.
                         
                                    - TIENE AGRUPADA TODA LA CONFIGURACIÓN POR DEFECTO QUE UTILIZA LA API  -->  javax.mail
                                      PARA LA GESTIÓN DE CORREOS ELECTRÓNICOS.
                         
                                    - MEDIANTE EL MÉTODO:    --->   getDeaultInstance()
                                      PODREMOS OBTENER UNA SISIÓN POR DEFECTO, CON TODA SU CONFIGURACIÓN CORRESPONDIENTE.
                         
                    - LA CLASE Message:
                            REPRESENTA UN MENSAJE DE CORREO ELECTRÓNICO.
                            PODEMOS CONFIGURAR:
                         
                                    - HACIA QUIÉN VA DIRIGIDO, MEDIANTE EL MÉTODO:   --->   setFrom()
                         
                                    - EL ASUNTO DEL CORREO ELECTÓNICO, MEDIANTE EL MÉTODO:   --->   setSubject()
                         
                                    - EL TEXTO DEL MISMO, MEDIANTE EL MÉTODO:   --->   setTex()
            
                    - LA CLASE Transport:
                            REPRESENTA EL ENVÍO DE LOS CORREOS ELECTRÓNICOS.
                          
                                    - ESTA CLASE HEREDA DE   --->    Service
                         
                                    - LA CLASE Service:
                                            PROPORCIONA LAS FUNCIONALIDADES COMUNES A TODOS LOS SERVICIOS DE MENSAJERÍA.
                         
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
                         
            package Tema_11;

            import java.io.UnsupportedEncodingException;
            import java.util.Date;

            import javax.activation.DataHandler;
            import javax.activation.DataSource;
            import javax.activation.FileDataSource;
            import javax.mail.BodyPart;
            import javax.mail.Message;
            import javax.mail.MessagingException;
            import javax.mail.Multipart;
            import javax.mail.Session;
            import javax.mail.Transport;
            import javax.mail.internet.InternetAddress;
            import javax.mail.internet.MimeBodyPart;
            import javax.mail.internet.MimeMessage;
            import javax.mail.internet.MimeMultipart;
            
            public class EmailUtil {
                /**
                 *  MÉTODO PARA ENVIAR UN MENSAJE SENCILLO DE HTML POR CORREO
                 */

                public static void sendEmail(Session session, String toEmail, String subject, String body) {

                    try {

                        MimeMessage msg = new MimeMessage(sesion);

                        // CABECERAS DEL MENSAJE
                        msg.addHeader("Content-type", "text/HTML.charset=UTF-8");
                        msg.addHeader("format", "flowed");
                        msg.addHeader("Content-Transfer-Encoding", "8bit");
                        msg.setFrom(new InternetAddress("no:reply@example.com", "NoReply-JD"));
                        msg.setReplyTo(InternetAddress.parse("no_reply@example.com", false));
                        msg.setSubject(subjet, "UTF-8");
                        msg.setText(body, "UTF-8");
                        msg.setSentDate(new Date());
                        msg.setRecipients(Message.RecipientType TO, InternetAddress.parse(toEmail, false));
                        System.out.println("Menssage is ready");
                        Transport.send(msg);
                        System.out.println("EMail Sent Successfully!!");
                    } catch (Exception e) {

                        e.printStackTrace();
                    }
                }            
            }
        
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
                         
            package Tema_11;

            import java.util.Properties;
            import javax.mail.Authenticator;
            import javax.mail.PasswordAuthentication;
            import javax.mail.Session;

            public class TLSEmail {    
                /**
                 *                          EL SERVIDOR DE CORREO SALIENTE (SMTP)
                 *                          REQUIERE TLS O SSL: smtp.gmail.com (USA AUTENTICACIÓN)
                 *                          PUERTO PARA TLS/STARTTLS: 587
                 */    
                public static void main(String[] args) {

                    final String fromEmail = "myemailid@gmail.com";                         // REQUIERE UN ID VÁLIDO DE GMAIL
                    final String password = "mypassword";                                   // CLAVE PARA EL ID DE GMAIL
                    final String toEmail = "myemail@yahoo.com";                             // PUEDE SER CUALQUIER CUENTA VÁLIDA DE EMAIL

                    System.out.println("TLSEmail Iniciot");
                    Properties props = new Properties();
                    props.put("mail.smtp.host", "smtp.gmail.com");                 // SMTP HOST
                    props.put("mail.smtp.port", "587");                            // TLS PUERTO
                    props.put("mail.auth", "true");                                // ACTIVA AUTENITACION
                    props.put("mail.smtp.starttls.enable", "true");                // PERMITE STARTTLS

                    Authenticator auth = new Authenticator() {                              // CREA EL OBJETO Authenticator PARA PASAR COMO PARÁMETRO Session getInstance        

                        // override the getPasswordAuthentication method
                        protected PasswordAuthentication getPasswordAuthentication() {            
                            return new PasswordAuthentication(fromEmail, password);
                        }            
                    };
                    Session session = Session.getInstance(props, auth);
                    EmailUtil.sendEmail(session, toEmail, "Asunto test correo TLS", "Texto de prueba TLS");
                }
            }
                         
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
        
            LOS SERVIDORES TCP Y UDP DESARROLLADOS HASTA AHORA, UNICAMENTE PUEDEN ATENDER A UN CLIENTE A LA VEZ.
            LOS DEMÁS CLIENTES QUE QUERÍAN SOLICITAR UN SERVICIO A NUESTRO SERVIDOR,
            TENÍAN QUE ESPERAR A QUE EL CLIENTE QUE ESTUVIERA EN ACCIÓN TERMINARA SU PROCESO,
            FORMANDO UNA COLA DE ESPERA DE CLIENTES.
                         
            ESTO ES UNA GRAN DEFICIENCIA Y CONTRAPRODUCENTE PARA PROGRAMAR CUALQUIER SERVICIO,
            SIENDO LO IDEAL QUE CADA SERVIDOR PUEDA ATENDER A MUCHOS CLIENTES AL MISMO TIEMPO,
            HACIENDO ASÍ UNA IMPLEMENTACIÓN CONCURRENTE DE LOS SERVICIOS.
                         
            LA CONCURRENCIA SE CONSEGUIRÁ UTILIZANDO HEBRAS O HILOS:
                         
                    - CUANDO EL SERVIDOR DETECTE QUE UN CLIENTE LE HA HECHO UNA PETICIÓN,
                      ÉSTE DEBERÁ ACEPTARLA, PROCESARLA Y CREAR UNA HEBRA QUE SEA CAPAZ DE ATENDER LA PETICIÓN DEL CLIENTE.
                            - CADA CLIENTE SERÁ ATENDIDO POR UNA HEBRA DIFERENTE.
                         
                    - EL SERVIDOR PODRÁ VOLVER A ESCUCHAR UNA PETICIÓN NUEVA DE OTRO CLIENTE,
                      INMEDIATAMENTE DESPUÉS DE LANZAR LA HEBRA QUE ATENDERÁ AL PRIMER CLIENTE.
                         
            LAS HEBRAS SE EJECUTARÁN EN LA PARTE DEL SERVIDOR,
            YA QUE ES ESTE EL QUE ATIENDE LA PETICIÓN DEL CLIENTE.
                         
                    - EL CLIENTE NO SERÁ CONSCIENTE DE SI LO ESTÁ ATENDIENDO EL PROPIO SERVIDOR O UNA HEBRA EN EL MISMO SERVIDOR.                        
                         
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
        
            * CLASE Cliente:
                    REPRESENTA UN CLIENTE DE NUESTRA APLICACIÓN.
                         
                    - DENTRO DE LA CLASE Cliente DEBEREMOS CREAR UN main,
                      EN EL QUE CREAMOS UN Socket QUE CONECTAREMOS AL SERVIDOR.
                         
                    - UNA VEZ HECHO ESTO, NOS COMUNICAREMOS CON EL SERVIDOR NORMALMENTE.
                         
                    - SE PODRÁN EJECUTAR TANTOS CLIENTES COMO SE QUIERA, TODOS A LA VEZ.
                         
            * CLASE ServidorHebra:
                    REPRESENTA LA HEBRA QUE SE LANZARÁ EN EL SERVIDOR,
                    HACIENDO POSIBLE LA CONCURRENCIA.
                         
                    - SERÁ LA ENCARGADA REALMENTE DE DAR SERVICIO AL CLIENTE CONECTADO.
                         
                    - DENTRO DE LA CLASE ServidorHebra SE IMPLEMENTA EL MÉTODO run
                      Y EL MÉTODO QUE EJECUTARÁ LA HEBRA.
                         
                            - DICHO MÉTODO CONTENDRÁ TODA LA FUNCIONALIDAD QUE DEBE DAR EL SERVIDOR NORMALMENTE.
                         
                            - REALIZARÁ UNA COMUNICACIÓN NORMAL CON EL CLIENTE,
                              TANTO PARA RECIBIR COMO PARA ENVIARLE INFORMACIÓN.
                         
                    - DENTRO DE LA CLASE ServidorHebra SE IMPLEMENTA TODAS LAS FUNCIONES 
                      QUE NECESITEMOS PARA DAR LOS SERVICIOS REQUERIDOS A LOS CLIENTES.
                         
            * CLASE Servidor:
                    REPRESENTA EL SERVIDOR DE NUESTRA DE NUESTRA APLICACIÓN.
                         
                    - DENTRO DEL main DE LA CLASE Servidor, CREAMOS UN  -->  ServerSocket
                      CON EL QUE ESPERAREMOS QUE SE CONECTE UN CLIENTE.
                         
                    - UNA VEZ CONECTADO EL CLIENTE A NUESTRO SERVIDOR,
                      DEBEREMOS CREAR UN OBJETO DE LA CLASE   -->  ServidorHebra
                      AL QUE LE PASAREMOS COMO MÍNIMO, LOS FLUJOS DE ENTRADA Y SALIDA DEL CLIENTE,
                      PARA PODER ASÍ PODER ESTABLECER UNA COMUNICACIÓN CON ÉL.
                         
                    - DESPUÉS DE CREAR Y LANZAR LA HEBRA,
                      NUESTRO SERVIDOR VOLVERÁ A ESCUCHAR
                      PARA QUE SE CONECTE OTRO CLIENTE AL QUE DAR SERVICIO.
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;    
    private static String recurso_16 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_16 + """
        **********************************************************************************************************************************
        
            PARA REALIZAR ESTA PRÁCTICA NECESITAMOS TRES CLASES JAVA INCLUIDAS EN EL TEMA:
                         
                - Cliente:
                        REPRESENTA UN CLIENTE DE NUESTRA APLICACIÓN.                        
                         
                - Servidor:
                        REPRESENTA UN SERVIDOR DE NUESTRA APLICACIÓN.
                         
                - ServidorHebra.
                        HEREDA DE Thread.
                         
            1.- DEBEREMOS EJECUTAR EL Servidor.
                        NOS DICE QUE ESTÁ ESCUCHANDO EN EL PUERTO 5056
                         
            2.- EJECUTAMOS UN Cliente
                        
                        - EN EL Servidor SE INDICA QUE HAY UN Cliente NUEVO CONECTADO.
                          SE LANZA LA HEBRA PARA ATENDERLO.
                         
                        - EN EL Cliente:
                         
                        CLIENTE: Conectando con localhost:5056...
                        CLIENTE: Conexión establecida.
                        SERVIDOR: ¿Qué quieres hacer?
                             1.- Generar número aleatorio.
                             2.- Salir.
                             (Esperando petición del cliente...)
                         
            3.- LANZAMOS TANTOS CLIENTES COMO QUERAMOS.
                         
                RESPONDEREMOS 1 O 2 SEGÚN NOS INTERESE.
                         
            COMPROBAR QUE TODOS LOS Clientes SON ATENDIDOS SIN ESPERAS.                         
                         
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
                case "15" -> System.out.println(recurso_15);
                case "16" -> System.out.println(recurso_16);
                case "18" -> {
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
                    continuar();
                    System.out.println(recurso_15);
                    continuar();
                    System.out.println(recurso_16);
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