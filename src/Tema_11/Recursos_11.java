package Tema_11;

import static Principal_Main.Main.*;
import static Tema_11.T_11.*;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
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
            APRENDIENDO C�MO PODEMOS CREAR DIFERENTES TIPOS DE CLIENTES EN JAVA.
                         
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
        
            LA IMPLEMENTACI�N DEL PROTOCOLO HTTP O HTTPS SE BASA EN UN PROCESO QUE IMPLICA
            UNA SERIE DE SOLICITUDES Y RESPUESTAS A ESAS SOLICITUDES POR PARTE DEL CLIENTE Y DEL SERVIDOR.
                         
                    1.- UN CLIENTE ESTABLECER� UNA CONEXI�N CON UN SERVIDOR,
                        ENVIANDO UN MENSAJE DE SOLICITUD CON LOS DATOS PERTINENTES, --> P�GINA WEB QUE QUIERE VER.
                         
                    2.- CUANDO EL SERVIDOR RECIBA EL MENSAJE,
                        LE RESPONDER� CON UN MENSAJE CONTENIENDO EL RESULTADO
                        DE LA OPERACI�N SOLICITADA POR EL CLIENTE,  -->  P�GINA WEB EN C�DIGO HTML.
                         
            JAVA DISPONE DE DOS CLASES PARA APLICACIONES CON SERVIDORES Y CLIENTES HTTP:
                         
                    - LA CLASE URL:
                            PERMITE REPRESENTAR UNA DIRECCI�N DE UNA P�GINA WEB,
                            DE FORMA QUE EL PROGRAMA PUEDA REALIZAR OPERACIONES CON ELLA.
                         
                    - LA CLASE URLConnection:
                            PERMITE REALIZAR OPERACIONES CON LA DIRECCI�N WEB QUE HEMOS 'CREADO/CONECTADO' MEDIANTE URL.
                                POR EJEMPLO: PODEMOS OBTENER LA RESPUESTA DEL SERVIDOR HTTP.
                         
            UNA VEZ HECHO LO ANTERIOR, PODREMOS LANZAR OPERACIONES TIPO GET 
            (CON LAS QUE ACTIVAR DETERMINADOS SERVICIOS DEL SERVIDOR, PAS�NDOLE PAR�METROS),
            Y OBTENER LAS RESPUESTAS A ESTAS PETICIONES.
                         
                AL UTILIZAR ESTAS CLASES ESTAMOS PROGRAMANDO UN SERVICIO HTTP DE ALTO NIVEL:
                    - TODAS LAS OPERACIONES QUE HAR�N POSIBLE LA COMUNICACI�N NO SE VISUALIZAR�N.
                    - TRABAJAR CON ELLO SER� TAN SENCILLO C�MO PROGRAMAR UN SERVIDOR O CLIENTE MEDIANTE EL USO DE SOCKETS.
                         
                    - LA '�NICA' DIFERENCIA SER� QUE EN LUGAR DE UTILIZAR LAS CLASES DE LOS SOCKETS,
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
             *                        LA SALIDA QUE SE OBTIENE ES EL 'C�DIGO FUENTE' DE LA P�GINA.
             */
            public class ClienteHTTP {

                public static void main(String[] args) {

                    try {                        
                        URL url = new URL("http://www.google.es");                          // SE ABRE LA CONEXI�N.
                        URLConnection conexion = url.openConnection();
                        conexion.connect();
                        
                        InputStream is = conexion.getInputStream();                         // LECTURA
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
                        
                        char[] buffer = new char[1000];                         // ARRAY DE 1000 CARACTERES PARA GUARDAR EL C�DIGO FUENTE DE LA P�GINA WEB.
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
                         
                    - REALIZAR UNA CONEXI�N AL SERVIDOR.
                    - COMPROBAR QUE LA CONEXI�N QUE SE HA REALIZADO CON �XITO.
                    - VALIDAR EL USUARIO FTP QUE SE HA CONECTADO.
                            - EN CASO DE QUE EL USUARIO NO SEA V�LIDO DEBEREMOS
                              ABORTAR LA CONEXI�N Y ENVIAR UN MENSAJE DE ERROR.
                    - REALIZAR LAS OPERACIONES PERTINENTES CON EL SERVIDOR.
                    - DESCONECTAR DEL SERVIDOR UNA VEZ TERMINEMOS DE REALIZAR LAS OPERACIONES REQUERIDAS.
                         
            TODO EL PROCESO DE CONEXIONES Y REALIZACI�N DE OPERACIONES PUEDE GENERAR EXCEPCIONES:
                         
                    - SocketException.
                    - IOException.
                         
            TANTO SI ES FTP ACTIVO O PASIVO, HAY QUE HACER UNA VALIDACI�N DEL USUARIO,
            TIENE QUE HABER UN MENSAJE DE IDENTIFICACI�N DEL USUARIO QUE SE CONECTA.
            
            ESTA ES LA DIFERENCIA PRINCIPAL ENTRE UN CLIENTE:
                    FTP  --> S� REQUIERE USUARIO.
                    HTTP --> NO REQUIERE USUARIO.
                         
                FTP ACTIVO: (CONEXI�N POR PUERTO DEL CLIENTE)

                        EL CLIENTE LE INDICA AL SERVIDOR QUE SE CONECTE A SU PUERTO.

                        EL SERVIDOR INICIA LA CONEXI�N CON EL PUERTO QUE EL CLIENTE LE HA ESPECIFICADO.                       

                FTP PASIVO: (CONEXI�N POR PUERTO DEL SERVIDOR)

                        PARA ACTIVARLO, EL CLIENTE SE CONECTA AL SERVIDOR Y LE ENV�A LA ORDEN --> 'PASV'.

                        EL SERVIDOR LE CONTESTA AL CLIENTE QUE TIENE QUE ABRIR OTRA CONEXI�N A UN PUERTO INDICADO POR EL SERVIDOR.

                        EL CLIENTE SE CONECTA POR EL PUERTO QUE EL SERVIDOR LE INDICA.
                        EL SERVIDOR RECIBE LA CONEXI�N DEL CLIENTE POR EL PUERTO INDICADO.
                         
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
        
            EL LENGUAJE DE PROGRAMACI�N JAVA NO DISPONE DE CLASES ESPEC�FICAS PARA EL USO DEL PROTOCOLO FTP.
                         
            PARA TRABAJAR CON CLIENTES Y SERVIDORES FTP:
            LA FUNDACI�N APACHE CRE� LA API:         --->     org.apache.commons.net.ftp
                         
            PARA QUE FUNCIONE NUESTRO PROYECTO JAVA 'ClienteFTP' NECESITAMOS INCLUIR:             
                         
                    - SI TENEMOS UN MAVEN PROJECT:
                            INCLUIR LAS DEPENDENCIAS DE ESTA API EN EL ACHIVO   -->  pom.xml
                         
                    - SI ESTAMOS CON OTROS SISTEMAS:
                            IMPORTAR LOS .jar Y DEM�S,
                            PARA PODER UTILIZAR TODO LO QUE EST� DENTRO DE org.apache.commons.net.ftp
                         
            ESTA API TIENE LAS SIGUIENTES CLASES PARA OPERAR CON EL PROTOCOLO FTP:
                         
                    - LA CLASE FTP:
                            PROPORCIONA TODAS LAS FUNCIONALIDADES B�SICAS PARA PODER REALIZAR UN CLIENTE FTP B�SICO.
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
                            FTPS ES LA VERSI�N SEGURA DEL PROTOCOLO FTP.
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
        
            PARA UNA M�NIMA SEGURIDAD EN EL SISTEMA PODR�AMOS REALIZAR
            LAS SIGUIENTES COMPROBACIONES UNA VEZ NOS LLEGUE UNA PETICI�N DE UN CLIENTE:
                         
                - COMPROBAR QUE EL CLIENTE ES UN CLIENTE V�LIDO DEL SISTEMA:
                  PARA ESTO DEBEREMOS MANTENER UN LISTADO DE CLIENTES V�LIDOS DEL SISTEMA:
                        - EN UNA BASE DE DATOS.
                        - EN SU DEFECTO, EN UN FICHERO.
                         
                - COMPROBAR QUE LA OPERACI�N QUE NOS PIDE EL CLIENTE ES UNA OPERACI�N V�LIDA EN EL SISTEMA.
                        - PARA ESTO BASTA CON SABER QU� OPERACIONES HEMOS DISE�ADO EN NUESTRO SISTEMA
                          Y CU�LES SON SUS PAR�METROS. (LOS ENDPOINT DE LA API).
                         
                - COMPROBAR QUE EL CIENTE TIENE PERMISOS PARA REALIZAR DICHA OPERACI�N.
                        - DE IGUAL FORMA QUE DEBEMOS TENER UN REGISTRO DE CLIENTES V�LIDOS EN EL SISTEMA,
                          LE PODEMOS AGREGAR UNA SERIE DE DATOS INDICANDO QU� OPERACIONES PUEDEN REALIZAR CADA UNO.
                         
            NO SOLO CON LOS SERVIDORES FTP TENEMOS QUE HACER UNA SERIE DE COMPROBACIONES B�SICAS,
            SINO QUE CON CUALQUIER TIPO DE SERVICIO DEBER�AMOS DE TENER UNAS M�NIMAS COMPROBACIONES DE SEGURIDAD.
                         
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
                PUDIENDO REALIZAR AS� ADMINISTRACI�N REMOTA,
                COMO SI ESTUVI�RAMOS SENTADOS FRENTE AL EQUIPO QUE ESTAMOS ADMINISTRANDO REMOTAMENTE.
                         
                        - SE HACE MUY SIMPLE LA ADMINISTRACI�N DE EQUIPOS QUE NO TENGAN PANTALLA NI TECLADO,
                          ES DECIR, QUE SEA UN SERVIDOR QUE SE ARRANCA Y LANZA TODAS SUS TAREAS Y SERVICIOS AUTOM�TICAMENTE.
                         
                EL PROTOCOLO TELNET EST� BASADO EN:
                         
                        - TIENE EL ESQUEMA B�SICO DEL PROTOCOLO CLIENTE/SERVIDOR.
                         
                        - EL PUERTO QUE UTILIZA POR DEFECTO ES EL  -->  23.
                         
                        - FUNCIONA MEDIANTE COMANDOS EN MODO TEXTO.
                         
                EL PROTOCOLO TELNET NO OFRECE MUCHA SEGURIDAD,
                Y ES POR ESTA MISMA RAZ�N POR LA QUE APENAS SE UTILIZA EN LAS GRANDES EMPRESAS.
                         
                        - TODA INFORMACI�N SE TRANSMITE EN MODO TEXTO PLANO,
                          INCLUIDOS LOS DATOS Y CONTRASE�AS DE LOS USUARIOS,
                          CUANDO ESTE TIPO DE INFORMACI�N DEBER�A INTERCAMBIARSE CIFRADA.
                         
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
        
            EL LENGUAJE DE PROGRAMACI�N JAVA NO DISPONE DE CLASES ESPEC�FICAS PARA EL USO DEL PROTOCOLO TELNET.
                                     
            PARA TRABAJAR CON CLIENTES Y SERVIDORES TELNET:
            LA FUNDACI�N APACHE CRE� LA API:         --->     org.apache.commons.net.telnet

            PARA QUE FUNCIONE NUESTRO PROYECTO JAVA 'ClienteTELNET' NECESITAMOS INCLUIR:             

                    - SI TENEMOS UN MAVEN PROJECT:
                            INCLUIR LAS DEPENDENCIAS DE ESTA API EN EL ACHIVO   -->  pom.xml

                    - SI ESTAMOS CON OTROS SISTEMAS:
                            IMPORTAR LOS .jar Y DEM�S,
                            PARA PODER UTILIZAR TODO LO QUE EST� DENTRO DE org.apache.commons.net.telnet

            ESTA API TIENE LA SIGUIENTE CLASES PARA OPERAR CON EL PROTOCOLO TELNET:

                    - LA CLASE TelnetClient:
                            PERMITE IMPLEMENTAR UN TERMINAL PARA USAR EL PROTOCOLO TELNET.
                            ESTA CLASE HEREDA DE   --->    SocketClient
                         
                            ENTRE LOS M�TODOS M�S �TILES DE ESTA CLASE TENEMOS:
                         
                                    - EL M�TODO SocketClient.connect():
                                            NOS PERMITIR� REALIZAR UNA CONEXI�N AL SERVIDOR.
                         
                                    - EL M�TODO TelnetClient.getInputStream():
                                            NOS PERMITIR� OBTENER LOS FLUJOS DE COMUNICACI�N DE ENTRADA.
                         
                                    - EL M�TODO TelnetClient.getOutputStream():
                                            NOS PERMITIR� OBTENER LOS FLUJOS DE COMUNICACI�N DE SALIDA.
                         
                                    - EL M�TODO TelnetClient.disconnect():
                                            NOS PERMITIR� DESCONECTARNOS DE ESTE SERVIDOR REMOTO.
                         
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
        
            EL PROTOCOLO SMTP ES EL QUE SE UTILIZA PARA ENVIAR Y RECIBIR CORREOS ELECTR�NICOS.
                         
            PARA PODER IMPLEMENTAR UN CLIENTE SMTP VAMOS A UTILIZAR LA API QUE PROPORCIONA JAVA   --->   javax.mail
                         
            DENTRO DE ESTA API TENEMOS LAS SIGUIENTES CLASES DE INTER�S:
                         
                    - LA CLASE Session:
                            REPRESENTA UNA SESI�N DE USUARIO PARA CORREO ELECT�NICO.
                         
                                    - TIENE AGRUPADA TODA LA CONFIGURACI�N POR DEFECTO QUE UTILIZA LA API  -->  javax.mail
                                      PARA LA GESTI�N DE CORREOS ELECTR�NICOS.
                         
                                    - MEDIANTE EL M�TODO:    --->   getDeaultInstance()
                                      PODREMOS OBTENER UNA SISI�N POR DEFECTO, CON TODA SU CONFIGURACI�N CORRESPONDIENTE.
                         
                    - LA CLASE Message:
                            REPRESENTA UN MENSAJE DE CORREO ELECTR�NICO.
                            PODEMOS CONFIGURAR:
                         
                                    - HACIA QUI�N VA DIRIGIDO, MEDIANTE EL M�TODO:   --->   setFrom()
                         
                                    - EL ASUNTO DEL CORREO ELECT�NICO, MEDIANTE EL M�TODO:   --->   setSubject()
                         
                                    - EL TEXTO DEL MISMO, MEDIANTE EL M�TODO:   --->   setTex()
            
                    - LA CLASE Transport:
                            REPRESENTA EL ENV�O DE LOS CORREOS ELECTR�NICOS.
                          
                                    - ESTA CLASE HEREDA DE   --->    Service
                         
                                    - LA CLASE Service:
                                            PROPORCIONA LAS FUNCIONALIDADES COMUNES A TODOS LOS SERVICIOS DE MENSAJER�A.
                         
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
                 *  M�TODO PARA ENVIAR UN MENSAJE SENCILLO DE HTML POR CORREO
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
                 *                          REQUIERE TLS O SSL: smtp.gmail.com (USA AUTENTICACI�N)
                 *                          PUERTO PARA TLS/STARTTLS: 587
                 */    
                public static void main(String[] args) {

                    final String fromEmail = "myemailid@gmail.com";                         // REQUIERE UN ID V�LIDO DE GMAIL
                    final String password = "mypassword";                                   // CLAVE PARA EL ID DE GMAIL
                    final String toEmail = "myemail@yahoo.com";                             // PUEDE SER CUALQUIER CUENTA V�LIDA DE EMAIL

                    System.out.println("TLSEmail Iniciot");
                    Properties props = new Properties();
                    props.put("mail.smtp.host", "smtp.gmail.com");                 // SMTP HOST
                    props.put("mail.smtp.port", "587");                            // TLS PUERTO
                    props.put("mail.auth", "true");                                // ACTIVA AUTENITACION
                    props.put("mail.smtp.starttls.enable", "true");                // PERMITE STARTTLS

                    Authenticator auth = new Authenticator() {                              // CREA EL OBJETO Authenticator PARA PASAR COMO PAR�METRO Session getInstance        

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
            LOS DEM�S CLIENTES QUE QUER�AN SOLICITAR UN SERVICIO A NUESTRO SERVIDOR,
            TEN�AN QUE ESPERAR A QUE EL CLIENTE QUE ESTUVIERA EN ACCI�N TERMINARA SU PROCESO,
            FORMANDO UNA COLA DE ESPERA DE CLIENTES.
                         
            ESTO ES UNA GRAN DEFICIENCIA Y CONTRAPRODUCENTE PARA PROGRAMAR CUALQUIER SERVICIO,
            SIENDO LO IDEAL QUE CADA SERVIDOR PUEDA ATENDER A MUCHOS CLIENTES AL MISMO TIEMPO,
            HACIENDO AS� UNA IMPLEMENTACI�N CONCURRENTE DE LOS SERVICIOS.
                         
            LA CONCURRENCIA SE CONSEGUIR� UTILIZANDO HEBRAS O HILOS:
                         
                    - CUANDO EL SERVIDOR DETECTE QUE UN CLIENTE LE HA HECHO UNA PETICI�N,
                      �STE DEBER� ACEPTARLA, PROCESARLA Y CREAR UNA HEBRA QUE SEA CAPAZ DE ATENDER LA PETICI�N DEL CLIENTE.
                            - CADA CLIENTE SER� ATENDIDO POR UNA HEBRA DIFERENTE.
                         
                    - EL SERVIDOR PODR� VOLVER A ESCUCHAR UNA PETICI�N NUEVA DE OTRO CLIENTE,
                      INMEDIATAMENTE DESPU�S DE LANZAR LA HEBRA QUE ATENDER� AL PRIMER CLIENTE.
                         
            LAS HEBRAS SE EJECUTAR�N EN LA PARTE DEL SERVIDOR,
            YA QUE ES ESTE EL QUE ATIENDE LA PETICI�N DEL CLIENTE.
                         
                    - EL CLIENTE NO SER� CONSCIENTE DE SI LO EST� ATENDIENDO EL PROPIO SERVIDOR O UNA HEBRA EN EL MISMO SERVIDOR.                        
                         
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
                    REPRESENTA UN CLIENTE DE NUESTRA APLICACI�N.
                         
                    - DENTRO DE LA CLASE Cliente DEBEREMOS CREAR UN main,
                      EN EL QUE CREAMOS UN Socket QUE CONECTAREMOS AL SERVIDOR.
                         
                    - UNA VEZ HECHO ESTO, NOS COMUNICAREMOS CON EL SERVIDOR NORMALMENTE.
                         
                    - SE PODR�N EJECUTAR TANTOS CLIENTES COMO SE QUIERA, TODOS A LA VEZ.
                         
            * CLASE ServidorHebra:
                    REPRESENTA LA HEBRA QUE SE LANZAR� EN EL SERVIDOR,
                    HACIENDO POSIBLE LA CONCURRENCIA.
                         
                    - SER� LA ENCARGADA REALMENTE DE DAR SERVICIO AL CLIENTE CONECTADO.
                         
                    - DENTRO DE LA CLASE ServidorHebra SE IMPLEMENTA EL M�TODO run
                      Y EL M�TODO QUE EJECUTAR� LA HEBRA.
                         
                            - DICHO M�TODO CONTENDR� TODA LA FUNCIONALIDAD QUE DEBE DAR EL SERVIDOR NORMALMENTE.
                         
                            - REALIZAR� UNA COMUNICACI�N NORMAL CON EL CLIENTE,
                              TANTO PARA RECIBIR COMO PARA ENVIARLE INFORMACI�N.
                         
                    - DENTRO DE LA CLASE ServidorHebra SE IMPLEMENTA TODAS LAS FUNCIONES 
                      QUE NECESITEMOS PARA DAR LOS SERVICIOS REQUERIDOS A LOS CLIENTES.
                         
            * CLASE Servidor:
                    REPRESENTA EL SERVIDOR DE NUESTRA DE NUESTRA APLICACI�N.
                         
                    - DENTRO DEL main DE LA CLASE Servidor, CREAMOS UN  -->  ServerSocket
                      CON EL QUE ESPERAREMOS QUE SE CONECTE UN CLIENTE.
                         
                    - UNA VEZ CONECTADO EL CLIENTE A NUESTRO SERVIDOR,
                      DEBEREMOS CREAR UN OBJETO DE LA CLASE   -->  ServidorHebra
                      AL QUE LE PASAREMOS COMO M�NIMO, LOS FLUJOS DE ENTRADA Y SALIDA DEL CLIENTE,
                      PARA PODER AS� PODER ESTABLECER UNA COMUNICACI�N CON �L.
                         
                    - DESPU�S DE CREAR Y LANZAR LA HEBRA,
                      NUESTRO SERVIDOR VOLVER� A ESCUCHAR
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
        
            PARA REALIZAR ESTA PR�CTICA NECESITAMOS TRES CLASES JAVA INCLUIDAS EN EL TEMA:
                         
                - Cliente:
                        REPRESENTA UN CLIENTE DE NUESTRA APLICACI�N.                        
                         
                - Servidor:
                        REPRESENTA UN SERVIDOR DE NUESTRA APLICACI�N.
                         
                - ServidorHebra.
                        HEREDA DE Thread.
                         
            1.- DEBEREMOS EJECUTAR EL Servidor.
                        NOS DICE QUE EST� ESCUCHANDO EN EL PUERTO 5056
                         
            2.- EJECUTAMOS UN Cliente
                        
                        - EN EL Servidor SE INDICA QUE HAY UN Cliente NUEVO CONECTADO.
                          SE LANZA LA HEBRA PARA ATENDERLO.
                         
                        - EN EL Cliente:
                         
                        CLIENTE: Conectando con localhost:5056...
                        CLIENTE: Conexi�n establecida.
                        SERVIDOR: �Qu� quieres hacer?
                             1.- Generar n�mero aleatorio.
                             2.- Salir.
                             (Esperando petici�n del cliente...)
                         
            3.- LANZAMOS TANTOS CLIENTES COMO QUERAMOS.
                         
                RESPONDEREMOS 1 O 2 SEG�N NOS INTERESE.
                         
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