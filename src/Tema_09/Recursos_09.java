package Tema_09;

import static Principal_Main.Main.*;
import static Tema_09.T_09.*;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Recursos_09 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_09 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        **********************************************************************************************************************************
        *   UNA RED DE ORDENADORES ES:                                                                                         *
        *      - UN SISTEMA DE TELECOMUNICACIONES INTERCONECTADO ENTRE S�                                                      *
        *        Y QUE TIENE LA FINALIDAD DE COMPARTIR INFORMACI�N O RECURSOS.                                                 *
        ************************************************************************************************************************
        *   UN SERVICIO EN RED ES:                                                                                             *
        *      - UN PROGRAMA O SOFTWARE QUE VA A PROPORCIONAR UNA DETERMINADA FUNCIONALIDAD A NUESTRO SISTEMA,                 *
        *        EST�N BASADOS EN UNA SERIE DE PROTOCOLOS Y EST�NDARES.                                                        *
        ************************************************************************************************************************
        *   VENTAJAS DE LA UTILIZACI�N DE REDES:                                                                               *
        *      - REDUCE COSTES.                                                                                                *
        *      - PODEMOS CREAR GRUPOS DE TRABAJO.                                                                              *
        *      - MEJORA LA ADMINISTRACI�N DE EQUIPOS Y APLICACIONES.                                                           *
        *      - MEJORA LA INTEGRIDAD DE LOS DATOS DEL SISTEMA.                                                                *
        *      - MEJORA LA SEGURIDAD DE LOS DATOS DEL SISTEMA.                                                                 *
        *      - SE FACILITA LA COMUNICACI�N.                                                                                  *
        *                                                                                                                      *
        ************************************************************************************************************************
        *  CLASIFICACI�N DE LOS SERVICIOS EN RED:                                                                              *
        *      - SERVICIOS DE ADMINISTRACI�N/CONFIGURACI�N.   ->  DHCP Y DNS.   -> ADMINISTRACI�N Y GESTI�N DE CONFIGURACIONES.*
        *      - SERVICIOS DE ACCESO REMOTO.                  ->  TELNET Y SSH. -> GESTIONAR CONEXIONES DE USUARIOS REMOTOS.   *
        *      - SERVICIOS DE FICHEROS.                       ->  FTP.          -> CON GRANDES CANTIDADES DE ALMACENAMIENTO.   *
        *      - SERVICIOS DE IMPRESI�N.                                        -> IMPRESI�N DE DOCUMENTOS DE FORMA REMOTA.    *
        *      - SERVICIOS DE INFORMACI�N.                    ->  HTTP.         -> EN FUNCI�N DE SU CONTENIDO.                 *
        *      - SERVICIOS DE COMUNICACI�N.                   ->  SMTP.         -> COMUNICACI�N A TRAV�S DE MENSAJES.          *
        *                                                                                                                      *
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
        *   EN EL MODELO TCP/IP:                                                                                               *
        *       - CAPA DE APLICACI�N:      ->  REPRESENTA LOS DATOS PARA EL USUARIO Y EL CONTROL DE CODIFICACI�N Y DE DI�LOGO. *
        *       - CAPA DE TRANSPORTE:      ->  ADMITE LA COMUNICACI�N ENTRE DISTINTOS DISPOSITIVOS DE DISTINTAS REDES.         *
        *       - CAPA DE INTERNET:        ->  DETERMINA LA MEJOR RUTA A TRAV�S DE LA RED.                                     *
        *       - CAPA DE ACCESO A LA RED: ->  CONTROLA LOS DISPOSITIVOS DEL HARDWARE Y LOS MEDIOS QUE FORMAN LA RED.          *
        *                                                                                                                      *
        *       * FUNCIONA SOBRE EL MODELO CLIENTE/SERVIDOR:                                                                   *
        *              - CLIENTE:   -->  ES EL PROGRAMA EJECUTADO POR EL USUARIO Y QUE SOLICITA UN SERVIO AL SERVIDOR.         *
        *              - SERVIDOR:  -->  ES EL PROGRAMA QUE SE EJECUTA EN LA M�QUINA SERVIDOR                                  *
        *                                Y QUE OFRECE UNO O VARIOS SERVICIOS A UNO O VARIOS CLIENTES.                          *
        *                                                                                                                      *
        ************************************************************************************************************************
        *   EN EL MODELO OSI, LAS CAPAS QUE CORRESPONDEN A LA DE APLICACI�N DEL MODELO TCP/IP, SON:                            *
        *      - CAPA DE APLICACI�N:       ->  COMUNICADOR, SE ENTIENDE CON EL USUARIO FINAL. PROCESO DE APLICACI�N.           *
        *      - CAPA DE PRESENTACI�N:     ->  TRADUCTOR, INTERPRETA EL SIGNIFICADO DE LA INFORMACI�N.                         *
        *      - CAPA DE SESI�N:           ->  ADMINISTRADOR, GESTIONA EL DI�LOGO ENTRE LAS APLICACIONES.                      *
        *                                                                                                                      *
        ************************************************************************************************************************
        *   LOS DATOS UNA VEZ CODIFICADOS POR EL PROTOCOLO CORRESPONDIENTE LLEGAR�N A LA CAPA DE TRANSPORTE.                   *
        *      - CAPA DE TRANSPORTE:       ->  CONEXI�N DE EXTREMO A EXTREMO.                                                  *
        *                                      LOS PROTOCOLOS TCP O UDP PERMITIR�N ENVIAR LOS DATOS.                           *
        *                                                                                                                      *
        ************************************************************************************************************************
        *   EN LA CAPA DE APLICACI�N DEL MODELO TCP/IP y DEL MODELO OSI:                                                       *
        *      - ES LA QUE SE ENCUENTRA EN EL NIV�L SUPERIOR. ES DONDE EMPIEZA TODO.                                           *
        *      - ES DONDE LOS PROGRAMAS VAN A IMPLEMENTAR LA FORMA DE COMUNICARSE CON LOS OTROS PROGRAMAS.                     *
        *      - ES LA QUE DEFINE LOS PROTOCOLOS QUE SE VAN A UTILIZAR EN LAS APLICACIONES QUE NECESITEN INTERCAMBIAR DATOS.   *
        *      - ES LA QUE CONTIENE LOS PROTOCOLOS RELACIONADOS CON LOS SERVICIOS DE RED.                                      *
        *      - ES LA QUE CONTIENE LOS PROTOCOLOS DE COMUNICACI�N.                                                            *
        *      - EL N�MERO DE PROTOCOLOS AUMENTA JUNTO A LOS NUEVOS SERVICIOS QUE SE DEMANDEN.                                 *
        *                                                                                                                      *
        ************************************************************************************************************************
        *   ALGUNOS PROTOCOLOS DE LA CAPA DE APLICACI�N DEL MODELO TCP/IP:                                                     *
        *      - FTP    -> FILE TRANSFER PROTOCOL         -> SE ENCARGA DE LA TRANSFERENCIA DE FICHEROS.                       *
        *      - TELNET -> TELETYPE NETWWORK              -> PERMITE PODER ACCEDER DE FORMA REMOTA A UN ORDENADOR Y MANEJARLO. *
        *      - SMTP   -> SIMPLE MAIL TRANSFER PROTOCOL  -> POSIBILITA ENVIAR Y RECIBIR CORREOS ELECTR�NICOS.                 *
        *      - HTTP   -> HIPERTEXT TRANSFER PROTOCOL    -> HABILITA LA NAVEGACI�N POR INTERNET.                              *
        *      - SSH    -> SECURE SHELL                   -> GESTION SEGURA Y REMOTA DE UN ORDENADOR. VERSI�N SEGURA DE TELNET.*
        *      - NNTP   -> NETWORK NEW TRANSPORT PROTOCOL -> ENV�O DE NOTICIAS POR LA RED.                                     *
        *      - IRC    -> INTERNET RELAY CHAT            -> POSIBILITA CHATEAR V�A INTERNET.                                  *
        *      - DNS    -> DOMAIN NAME SYSTEM             -> PERMITE RESOLVER DIRECCIONES DE RED.                              *
        *      - DHCP   -> DYNAMIC HOST CONFIGURATION     -> ASIGNA DIN�MICAMENTE UNA DIRECCI�N IP.                            *
        *      - SSH    -> SECURE SHELL                   -> INT�RPRETE DE �RDENES SEGURO.                                     *
        *      - SFTP   -> SECURE FILE TRANSFER PROTOCOL  -> SE ENCARGA DE LA TRANSFERENCIA DE FICHEROS ENCRIPTADOS.           *
        *                                                                                                                      *
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
        *   SE ENCARGA DE TRADUCIR LAS DIRECCIONES IP A NOMBRES DE DOMINIO Y VICEVERSA.                                        *
        *   TODOS LOS DISPOSITIVOS CONECTADOS POR TCP/IP SE VAN A IDENTIFICAR MEDIANTE UNA DIRECCI�N DE RED IP. FORMATO IPv4.  *
        *        - LAS IPv4 SE COMPONEN DE CUATRO N�MEROS, CADA UNO DE ELLOS DEL 0 AL 255, Y SEPARADOS POR UN PUNTO.           *
        *        - LOS ORDENADORES USAN ESTOS N�MEROS PARA COMUNICARSE ENTRE S� MEDIANTE LOS DIFERENTES NODOS.                 *
        *                                                                                                                      *
        *   TODOS LOS EQUIPOS USAN UNA DIRECCI�N PARA CONECTARSE CON SIGO MISMO, (LOOPBACK):           localhost  O  127.0.0.1 *
        *   ADEM�S DE ESO TENDR�N UNA DIRECCI�N IP PARA COMUNICARSE CON LOS DEM�S EQUIPOS DEL TIPO:              192.168.0.234 *
        *   DESDE TU EQUIPO SOLICITAMOS UNA BUSQUEDA DE UNA DIRECCI�N WEB POR SU NOMBRE DEL TIPO:               www.google.com *
        *   TU EQUIPO SE CONECTA AL ROUTER, QUE TIENE CONFIGURADO LA DIRECCI�N IP DEL SERVIDOR DNS GLOBAL:             8.8.8.8 *
        *   EL ROUTER SE CONECTA AL SERVIDOR DNS, Y LE MANDA EL NOMBRE WEB QUE NECESITAMOS TRADUCIR A IP.                      *
        *   EL SERVIDOR DNS LE DEVUELVE LA IP DEL SITIO BUSCADO:                                                 142.250.184.3 *
        *   UNA VEZ CON LA IP DEL SITIO BUSCADO SE ESTABLECE LA CONEXI�N CLIENTE SERVIDOR.                                     *
        *                                                                                                                      *
        *   EL SERVICIO DNS SE ENCARGA DE IDENTIFICAR A UN NODO MEDIANTE UNA DIRECCI�N IP.                                     *
        *   EL SERVICIO DNS PERMITE ASIGNAR NOMBRES DE DOMINIO A UN NODO. M�S F�CIL DE RECORDAR.                               *
        *   EL SERVICIO DNS SE PODR� USAR EN CUALQUIER DISPOSITIVO QUE SE CONECTE A LA RED.                                    *
        *   PODREMOS UNAR EL NOMBRE DE DOMINIO O SU DIRECCI�N IP INDISTINTAMENTE PARA ACCEDER A UN NODO EN RED.                *
        *                                                                                                                      *
        ************************************************************************************************************************
        *   VENTAJAS DEL SERVICIO DNS:                                                                                         *
        *       - POSIVILITA QUE VARIOS NOMBRES DE DOMINIO COMPARTAN UNA MISMA IP.                                             *
        *       - POSIVILITA QUE VARIAS IP COMPARTAN EL MISMO NOMBRE DE DOMINIO.                                               *
        *       - POSIVILITA QUE UN NODO PUEDA CAMBIAR SU NOMBRE DE DOMINIO SIN CAMBIAR SU IP.                                 *
        *                                                                                                                      *
        ************************************************************************************************************************
        *   EL SERVIDOR DNS:                                                                                                   *
        *       - USA UNA BASE DE DATOS DISTRIBUIDA, SEPARADA EN DIFERENTES ELEMENTO EN LA RED, POR TEMAS DE SEGURIDAD.        *
        *       - SE ENCARGA DE ALMACENAR TODA LA INFORMACI�N ASOCIADA A NOMBRES DE DOMINIO.                                   *
        *                                                                                                                      *
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_04 =  """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_04 + """
        **********************************************************************************************************************************
        *   HOY EN D�A, UNA DE LAS FUNCIONALIDADES M�S USADAS EN LAS REDES ES LA DE TRANSFERIR FICHEROS.                       *
        *   EL PROTOCOLO FTP PROPORCIONA ESTE SERVICIO DE TRANSFERENCIA.                                                       *
        *   SUS FUNCIONALIDADES DEFINEN UN EST�NDAR EN LA TRANSFERENCIA DE FICHEROS EN LAS REDES TCP/IP.                       *
        *                                                                                                                      *
        ************************************************************************************************************************
        *   LOS PRINCIPIOS FUNDAMENTALES DEL PROTOCOLO FTP SON:                                                                *
        *        - PERMITE INTERCAMBIAR FICHEROS ENTRE ORDENADORES REMOTOS INTERCONECTADOS EN UNA RED.                         *
        *        - PERMITE TRANSMITIR LOS FICHEROS A ALTA VELOCIDAD.                                                           *
        *                 - LA TRANSFERENCIA SE REALIZA EN TEXTO PLANO. -> MAYOR VELOCIDAD.                                    *
        *                 - LA SEGURIDAD ES BAJA. -> NO EST� CODIFICADA.                                                       *
        *                                                                                                                      *
        *   EL PROBLEMA DE SEGURIDAD SER� SOLUCIONADO CON LA ENCRIPTACI�N DE LA INFORMACI�N: PROTOCOLO SFTP.                   *
        *   EL PROTOCOLO DE TRANSFERENCIA DE FICHEROS SEGUTO SFTP, SE USA JUNTO AL PROTOCOLO SSH.                              *
        *                                                                                                                      *
        ************************************************************************************************************************
        *   EL PROTOCOLO FTP USA EL:                                                                                           *
        *                 - PUERTO 20  ->  TRANSMISI�N DE DATOS.                                                               *
        *                 - PUERTO 21  ->  TRANSMISI�N DE �RDENES.                                                             *
        *                                                                                                                      *
        ************************************************************************************************************************
        *   OTRAS CARACTER�STICAS DEL PROTOCOLO FTP:                                                                           *
        *                 - PERMITE CONECTAR USUARIOS EN REMOTO AL SERVIDOR FTP.                                               *
        *                 - HAY UN L�MITE EN EL ACCESO AL SISTEMA DE ARCHIVOS. -> SISTEMA DE PRIVILEGIOS DE USUARIOS.          *
        *                 - TIENE DOS MODOS DE CONEXI�N:                                                                       *
        *                         - MODO ACTIVO: -> HAR� DOS CONEXIONES DISTINTAS.                                             *
        *                         - MODO PASIVO: -> NO LO HAR�.                                                                *
        *                                                                                                                      *
        ************************************************************************************************************************
        *   FILEZILLA:                                                                                                         *
        *                 - VERSI�N CLIENTE PARA TRANSFERIR ARCHIVOS.                                                          *
        *                 - VERSI�N SERVER PARA COMPARTIR ARCHIVOS.                                                            *
        *                                                                                                                      *
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
        *   EL CORREO ELECTR�NICO PERMITE ENVIAR Y RECIBIR MENSAJES CON O SIN ARCHIVOS ADJUNTOS DE FORMA R�PIDA.               *
        *   ES EL PROTOCOLO SMPT ES EL QUE POSIBILITA ESTA FUNCIONALIDAD.                                                      *
        *   SE ENCUENTRA EN LA CAPA DE APLICACIONES Y SIGUE EL MODELO CLIENTE/SERVIDOR.                                        *
        *            - TENEMOS QUE TENER UN SERVIDOR DE CORREO ELECTR�NICO.                                                    *
        *                    - CREAR� CUENTAS PARA LOS USUARIOS.                                                               *
        *                    - TENDR� UN BUZON PARA ALMACENAR LOS MENSAJES.                                                    *
        *            - TENEMOS QUE TENER UN CLIENTE DE CORREO ELECTR�NICO. (LO QUE INSTALAMOS EN MUESTRAS M�QUINAS)            *
        *                    - SON LOS ENCARGADOS DE DESCARGAR Y ELABORAR LOS CORREOS ELECT�NICOS.                             *
        *                                                                                                                      *
        ************************************************************************************************************************
        *   LOS PROTOCOLOS POP3 E IMAP:                                                                                        *
        *   EL PROTOCOLO SMTP USA EL PUERTO 25.                                                                                *
        *   SMPT ES EL ENCARGADO DE REALIZAR EL TRANSPORTE DEL CORREO DESDE LA M�QUINA DEL USUARIO (CLIENTE) AL SERVIDOR.      *
        *           - EL SERVIDOR ALMACENA EL CORREO PARA QUE EL DESTINATARIO PUEDA ACEDER A �L.                               *
        *                 - EL DESTINATARIO TIENE DOS OPCIONES:                                                                *
        *                         - DESCARGAR EL CORREO EN SU M�QUINA MEDIANTE EL PROTOCOLO POP3.                              *
        *                         - CONSULTAR EN EL SERVIDOR MEDIANTE EL PROTOCOLO IMAP.                                       *
        *                                                                                                                      *
        ************************************************************************************************************************
        *   ALGUNOS COMANDOS DEL PROTOCOLO SMTP:                                                                               *
        *                 - HELLO:         -> SE USA PARA ABRIR UNA SESI�N CON EL SERVIDOR.                                    *
        *                 - MAIL FROM:     -> SE USA PARA INDICAR QUI�N ES EL EMISOR DEL CORREO.                               *
        *                                                                                                                      *
        ************************************************************************************************************************
        *   SMTP - POP3 - IMAP --> NOS PERMITEN TAMBI�N ENVIAR CUALQUIER TIPO DE DOCUMENTO DIGITALIZADO.                       *
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
        *   EL PROTOCOLO HTTP ES EL ENCARGADO DE QUE PODAMOS NAVEGAR POR INTERNET DE FORMA CORRECTA.                           *
        *   EL PROTOCOLO HTTP EST� COMPUESTO POR UNA NORMAS QUE POSIBILITAN:                                                   *
        *            - UNA COMUNICACI�N ENTRE CLIENTE Y SERVIDOR.                                                              *
        *            - TRANSFERENCIA DE INFORMACI�N ENTRE CLIENTE Y SERVIDOR EN FORMA DE P�GINAS HTML.                         *
        *                                                                                                                      *
        ************************************************************************************************************************
        *   ALGUNAS REGLAS DEL PROTOCOLO HTTP SON:                                                                             *
        *                                                                                                                      *
        *      - HTTP SIGUE EL MODELO DE PETICI�N-RESPUESTA QUE SE APLICA EL SERVIDOR AL CLIENTE.                              *
        *              - ES DECIR, EL SERVIDOR S�LO RESPONDE ANTE PETICIONES DEL CLIENTE.                                      *
        *      - EL PUERTO QUE UTILIZA ES EL 80. (POSIBILIDAD DE CAMBIARLO).                                                   *
        *      - AL CLIENTE SE LE DENOMINA COMO AGENTE DEL USUARIO. USER AGENT.                                                *
        *      - SE DENOMINA 'RECURSO' A TODA LA INFORMACI�N QUE SE TRANSMITE.                                                 *
        *              - CADA RECURSO SE IDENTIFICA  POR UNA URL (UNIFORM RESOURCE LOCATOR).DEL TIPO: http://wwww.google.es    *
        *              - LOS RECURSOS TAMBI�N PUEDEN SER FICHEROS, CONSULTAS A BD, RESULTADOS DE OPERACI�N DE UN PROGRAMA...   *
        *      - EL PROTOCOLO HTTP NO TIENE ESTADO. NO RECORDAR� NADA DE LA CONEXI�N ANTERIOR.                                 *
        *              - UNA SOLUCI�N ES GUARDAR ESA INFORMACI�N EN LAS COOKIES. (NO PERTENECE AL HTTP)                        *
        *                                                                                                                      *
        ************************************************************************************************************************
        *   HTTP FUNCIONA DE LA FORMA:                                                                                         *
        *                                                                                                                      *
        *       - EL USUARIO ACCEDE A UNA URL. PUEDE INDICAR EL PUERTO DE LA URL.                                              *
        *       - EL EQUIPO CLIENTE DESCOMPONDR� LA INFORMACI�N DE LA URL:                                                     *
        *                - NOMBRE DE DOMINIO.                                                                                  *
        *                - DIRECCI�N IP.                                                                                       *
        *                - PUERTO.                                                                                             *
        *       - EL CLIENTE ESTABLECE UNA CONEXI�N CON EL SERVIDOR.                                                           *
        *       - EL SERVIDOR CONTESTA AL CLIENTE Y ENV�A EL C�DIGO HTML.                                                      *
        *       - EL CLIENTE VISUALIZA EL HTML EN UN NAVEGADOR Y CIERRA LA CONEXI�N PERDIENDO EL ESTADO.                       *
        *                                                                                                                      *
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
        *   COMUNICACI�N:                                                                                                      *
        *                                                                                                                      *
        *      - ES EN LA CAPA DE APLICACI�N DEL MODELO OSI LA QUE SE VA A COMUNICAR CON LA CAPA DE TRANSPORTE.                *
        *      - LA COMUNICACI�N SER�N TODOS LOS DATOS CODIFICADOS POR UN PROTOCOLO ADECUADO                                   *
        *        QUE PASAR� DE CAPA EN CAPA, AGREGANDOS LA INFORMACI�N NECESARIA HASTA LLEGAR A LA CAPA DE TRANSPORTE.         *
        *      - CUALQUIER PROTOCOLO DE LA CAPA DE APLICACI�N SE VA A COMUNICAR CON LA CAPA                                    *
        *        DE TRANSPORTE MEDIANTE UNA API IMPLEMENTADA MEDIANTE SOCKET.                                                  *
        *      - LOS SOCKET SON LA REPRESENTACI�N QUE NOS PROPORCIONA EL LENGUAJE DE PROGRAMACI�N JAVA                         *
        *        DE UNA CONEXI�N PARA LA TRANSMISI�N DE INFORMACI�N EN RED.                                                    *
        *                                                                                                                      *
        ************************************************************************************************************************
        *   PASOS PARA CREACI�N DE UNA COMUNICACI�N MEDIANTE SOCKETS:                                                          *
        *                                                                                                                      *
        *      - SE CREAN LOS SOCKET DEL SERVIDOR Y EL CLIENTE.                                                                *
        *      - EL SERVIDOR ESTABLECE UN PUERTO DE ESCUCHA.                                                                   *
        *      - EL CLIENTE SE CONECTA AL SERVIDOR MEDIANTE EL PUERTO DE ESCUCHA.                                              *
        *      - EL SERVIDOR ACEPTA LA CONEXI�N DEL CLIENTE.                                                                   *
        *      - SE CREAN LOS FLUJOS DE DATOS Y SE REALIZA EL INTERCAMBIO DE INFORMACI�N.                                      *
        *            - SER�N FLUJOS DE ENTRADA Y DE SALIDA ENTRE CLIENTE Y SERVIDOR.                                           *
        *      - SE CIERRAN LAS CONEXIONES TANTO EL SOCKET DEL SERVIDOR COMO EL SOCKET DEL CLIENTE.                            *
        *                                                                                                                      *
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
        *                                                                                                                      *
        *  ipconfig               tracert www.google.es        telnet 192.168.0.181                                            *
        *  ipconfig/all           ipconfig/displaydns                                                                          *
        *                                                                                                                      *
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
                case "9" -> {
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