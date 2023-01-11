package Tema_09;

import static Principal_Main.Main.*;
import static Tema_09.T_09.*;

/**
 *
 * @author Juan José Estévez González
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
        *      - UN SISTEMA DE TELECOMUNICACIONES INTERCONECTADO ENTRE SÍ                                                      *
        *        Y QUE TIENE LA FINALIDAD DE COMPARTIR INFORMACIÓN O RECURSOS.                                                 *
        ************************************************************************************************************************
        *   UN SERVICIO EN RED ES:                                                                                             *
        *      - UN PROGRAMA O SOFTWARE QUE VA A PROPORCIONAR UNA DETERMINADA FUNCIONALIDAD A NUESTRO SISTEMA,                 *
        *        ESTÁN BASADOS EN UNA SERIE DE PROTOCOLOS Y ESTÁNDARES.                                                        *
        ************************************************************************************************************************
        *   VENTAJAS DE LA UTILIZACIÓN DE REDES:                                                                               *
        *      - REDUCE COSTES.                                                                                                *
        *      - PODEMOS CREAR GRUPOS DE TRABAJO.                                                                              *
        *      - MEJORA LA ADMINISTRACIÓN DE EQUIPOS Y APLICACIONES.                                                           *
        *      - MEJORA LA INTEGRIDAD DE LOS DATOS DEL SISTEMA.                                                                *
        *      - MEJORA LA SEGURIDAD DE LOS DATOS DEL SISTEMA.                                                                 *
        *      - SE FACILITA LA COMUNICACIÓN.                                                                                  *
        *                                                                                                                      *
        ************************************************************************************************************************
        *  CLASIFICACIÓN DE LOS SERVICIOS EN RED:                                                                              *
        *      - SERVICIOS DE ADMINISTRACIÓN/CONFIGURACIÓN.   ->  DHCP Y DNS.   -> ADMINISTRACIÓN Y GESTIÓN DE CONFIGURACIONES.*
        *      - SERVICIOS DE ACCESO REMOTO.                  ->  TELNET Y SSH. -> GESTIONAR CONEXIONES DE USUARIOS REMOTOS.   *
        *      - SERVICIOS DE FICHEROS.                       ->  FTP.          -> CON GRANDES CANTIDADES DE ALMACENAMIENTO.   *
        *      - SERVICIOS DE IMPRESIÓN.                                        -> IMPRESIÓN DE DOCUMENTOS DE FORMA REMOTA.    *
        *      - SERVICIOS DE INFORMACIÓN.                    ->  HTTP.         -> EN FUNCIÓN DE SU CONTENIDO.                 *
        *      - SERVICIOS DE COMUNICACIÓN.                   ->  SMTP.         -> COMUNICACIÓN A TRAVÉS DE MENSAJES.          *
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
        *       - CAPA DE APLICACIÓN:      ->  REPRESENTA LOS DATOS PARA EL USUARIO Y EL CONTROL DE CODIFICACIÓN Y DE DIÁLOGO. *
        *       - CAPA DE TRANSPORTE:      ->  ADMITE LA COMUNICACIÓN ENTRE DISTINTOS DISPOSITIVOS DE DISTINTAS REDES.         *
        *       - CAPA DE INTERNET:        ->  DETERMINA LA MEJOR RUTA A TRAVÉS DE LA RED.                                     *
        *       - CAPA DE ACCESO A LA RED: ->  CONTROLA LOS DISPOSITIVOS DEL HARDWARE Y LOS MEDIOS QUE FORMAN LA RED.          *
        *                                                                                                                      *
        *       * FUNCIONA SOBRE EL MODELO CLIENTE/SERVIDOR:                                                                   *
        *              - CLIENTE:   -->  ES EL PROGRAMA EJECUTADO POR EL USUARIO Y QUE SOLICITA UN SERVIO AL SERVIDOR.         *
        *              - SERVIDOR:  -->  ES EL PROGRAMA QUE SE EJECUTA EN LA MÁQUINA SERVIDOR                                  *
        *                                Y QUE OFRECE UNO O VARIOS SERVICIOS A UNO O VARIOS CLIENTES.                          *
        *                                                                                                                      *
        ************************************************************************************************************************
        *   EN EL MODELO OSI, LAS CAPAS QUE CORRESPONDEN A LA DE APLICACIÓN DEL MODELO TCP/IP, SON:                            *
        *      - CAPA DE APLICACIÓN:       ->  COMUNICADOR, SE ENTIENDE CON EL USUARIO FINAL. PROCESO DE APLICACIÓN.           *
        *      - CAPA DE PRESENTACIÓN:     ->  TRADUCTOR, INTERPRETA EL SIGNIFICADO DE LA INFORMACIÓN.                         *
        *      - CAPA DE SESIÓN:           ->  ADMINISTRADOR, GESTIONA EL DIÁLOGO ENTRE LAS APLICACIONES.                      *
        *                                                                                                                      *
        ************************************************************************************************************************
        *   LOS DATOS UNA VEZ CODIFICADOS POR EL PROTOCOLO CORRESPONDIENTE LLEGARÁN A LA CAPA DE TRANSPORTE.                   *
        *      - CAPA DE TRANSPORTE:       ->  CONEXIÓN DE EXTREMO A EXTREMO.                                                  *
        *                                      LOS PROTOCOLOS TCP O UDP PERMITIRÁN ENVIAR LOS DATOS.                           *
        *                                                                                                                      *
        ************************************************************************************************************************
        *   EN LA CAPA DE APLICACIÓN DEL MODELO TCP/IP y DEL MODELO OSI:                                                       *
        *      - ES LA QUE SE ENCUENTRA EN EL NIVÉL SUPERIOR. ES DONDE EMPIEZA TODO.                                           *
        *      - ES DONDE LOS PROGRAMAS VAN A IMPLEMENTAR LA FORMA DE COMUNICARSE CON LOS OTROS PROGRAMAS.                     *
        *      - ES LA QUE DEFINE LOS PROTOCOLOS QUE SE VAN A UTILIZAR EN LAS APLICACIONES QUE NECESITEN INTERCAMBIAR DATOS.   *
        *      - ES LA QUE CONTIENE LOS PROTOCOLOS RELACIONADOS CON LOS SERVICIOS DE RED.                                      *
        *      - ES LA QUE CONTIENE LOS PROTOCOLOS DE COMUNICACIÓN.                                                            *
        *      - EL NÚMERO DE PROTOCOLOS AUMENTA JUNTO A LOS NUEVOS SERVICIOS QUE SE DEMANDEN.                                 *
        *                                                                                                                      *
        ************************************************************************************************************************
        *   ALGUNOS PROTOCOLOS DE LA CAPA DE APLICACIÓN DEL MODELO TCP/IP:                                                     *
        *      - FTP    -> FILE TRANSFER PROTOCOL         -> SE ENCARGA DE LA TRANSFERENCIA DE FICHEROS.                       *
        *      - TELNET -> TELETYPE NETWWORK              -> PERMITE PODER ACCEDER DE FORMA REMOTA A UN ORDENADOR Y MANEJARLO. *
        *      - SMTP   -> SIMPLE MAIL TRANSFER PROTOCOL  -> POSIBILITA ENVIAR Y RECIBIR CORREOS ELECTRÓNICOS.                 *
        *      - HTTP   -> HIPERTEXT TRANSFER PROTOCOL    -> HABILITA LA NAVEGACIÓN POR INTERNET.                              *
        *      - SSH    -> SECURE SHELL                   -> GESTION SEGURA Y REMOTA DE UN ORDENADOR. VERSIÓN SEGURA DE TELNET.*
        *      - NNTP   -> NETWORK NEW TRANSPORT PROTOCOL -> ENVÍO DE NOTICIAS POR LA RED.                                     *
        *      - IRC    -> INTERNET RELAY CHAT            -> POSIBILITA CHATEAR VÍA INTERNET.                                  *
        *      - DNS    -> DOMAIN NAME SYSTEM             -> PERMITE RESOLVER DIRECCIONES DE RED.                              *
        *      - DHCP   -> DYNAMIC HOST CONFIGURATION     -> ASIGNA DINÁMICAMENTE UNA DIRECCIÓN IP.                            *
        *      - SSH    -> SECURE SHELL                   -> INTÉRPRETE DE ÓRDENES SEGURO.                                     *
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
        *   TODOS LOS DISPOSITIVOS CONECTADOS POR TCP/IP SE VAN A IDENTIFICAR MEDIANTE UNA DIRECCIÓN DE RED IP. FORMATO IPv4.  *
        *        - LAS IPv4 SE COMPONEN DE CUATRO NÚMEROS, CADA UNO DE ELLOS DEL 0 AL 255, Y SEPARADOS POR UN PUNTO.           *
        *        - LOS ORDENADORES USAN ESTOS NÚMEROS PARA COMUNICARSE ENTRE SÍ MEDIANTE LOS DIFERENTES NODOS.                 *
        *                                                                                                                      *
        *   TODOS LOS EQUIPOS USAN UNA DIRECCIÓN PARA CONECTARSE CON SIGO MISMO, (LOOPBACK):           localhost  O  127.0.0.1 *
        *   ADEMÁS DE ESO TENDRÁN UNA DIRECCIÓN IP PARA COMUNICARSE CON LOS DEMÁS EQUIPOS DEL TIPO:              192.168.0.234 *
        *   DESDE TU EQUIPO SOLICITAMOS UNA BUSQUEDA DE UNA DIRECCIÓN WEB POR SU NOMBRE DEL TIPO:               www.google.com *
        *   TU EQUIPO SE CONECTA AL ROUTER, QUE TIENE CONFIGURADO LA DIRECCIÓN IP DEL SERVIDOR DNS GLOBAL:             8.8.8.8 *
        *   EL ROUTER SE CONECTA AL SERVIDOR DNS, Y LE MANDA EL NOMBRE WEB QUE NECESITAMOS TRADUCIR A IP.                      *
        *   EL SERVIDOR DNS LE DEVUELVE LA IP DEL SITIO BUSCADO:                                                 142.250.184.3 *
        *   UNA VEZ CON LA IP DEL SITIO BUSCADO SE ESTABLECE LA CONEXIÓN CLIENTE SERVIDOR.                                     *
        *                                                                                                                      *
        *   EL SERVICIO DNS SE ENCARGA DE IDENTIFICAR A UN NODO MEDIANTE UNA DIRECCIÓN IP.                                     *
        *   EL SERVICIO DNS PERMITE ASIGNAR NOMBRES DE DOMINIO A UN NODO. MÁS FÁCIL DE RECORDAR.                               *
        *   EL SERVICIO DNS SE PODRÁ USAR EN CUALQUIER DISPOSITIVO QUE SE CONECTE A LA RED.                                    *
        *   PODREMOS UNAR EL NOMBRE DE DOMINIO O SU DIRECCIÓN IP INDISTINTAMENTE PARA ACCEDER A UN NODO EN RED.                *
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
        *       - SE ENCARGA DE ALMACENAR TODA LA INFORMACIÓN ASOCIADA A NOMBRES DE DOMINIO.                                   *
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
        *   HOY EN DÍA, UNA DE LAS FUNCIONALIDADES MÁS USADAS EN LAS REDES ES LA DE TRANSFERIR FICHEROS.                       *
        *   EL PROTOCOLO FTP PROPORCIONA ESTE SERVICIO DE TRANSFERENCIA.                                                       *
        *   SUS FUNCIONALIDADES DEFINEN UN ESTÁNDAR EN LA TRANSFERENCIA DE FICHEROS EN LAS REDES TCP/IP.                       *
        *                                                                                                                      *
        ************************************************************************************************************************
        *   LOS PRINCIPIOS FUNDAMENTALES DEL PROTOCOLO FTP SON:                                                                *
        *        - PERMITE INTERCAMBIAR FICHEROS ENTRE ORDENADORES REMOTOS INTERCONECTADOS EN UNA RED.                         *
        *        - PERMITE TRANSMITIR LOS FICHEROS A ALTA VELOCIDAD.                                                           *
        *                 - LA TRANSFERENCIA SE REALIZA EN TEXTO PLANO. -> MAYOR VELOCIDAD.                                    *
        *                 - LA SEGURIDAD ES BAJA. -> NO ESTÁ CODIFICADA.                                                       *
        *                                                                                                                      *
        *   EL PROBLEMA DE SEGURIDAD SERÁ SOLUCIONADO CON LA ENCRIPTACIÓN DE LA INFORMACIÓN: PROTOCOLO SFTP.                   *
        *   EL PROTOCOLO DE TRANSFERENCIA DE FICHEROS SEGUTO SFTP, SE USA JUNTO AL PROTOCOLO SSH.                              *
        *                                                                                                                      *
        ************************************************************************************************************************
        *   EL PROTOCOLO FTP USA EL:                                                                                           *
        *                 - PUERTO 20  ->  TRANSMISIÓN DE DATOS.                                                               *
        *                 - PUERTO 21  ->  TRANSMISIÓN DE ÓRDENES.                                                             *
        *                                                                                                                      *
        ************************************************************************************************************************
        *   OTRAS CARACTERÍSTICAS DEL PROTOCOLO FTP:                                                                           *
        *                 - PERMITE CONECTAR USUARIOS EN REMOTO AL SERVIDOR FTP.                                               *
        *                 - HAY UN LÍMITE EN EL ACCESO AL SISTEMA DE ARCHIVOS. -> SISTEMA DE PRIVILEGIOS DE USUARIOS.          *
        *                 - TIENE DOS MODOS DE CONEXIÓN:                                                                       *
        *                         - MODO ACTIVO: -> HARÁ DOS CONEXIONES DISTINTAS.                                             *
        *                         - MODO PASIVO: -> NO LO HARÁ.                                                                *
        *                                                                                                                      *
        ************************************************************************************************************************
        *   FILEZILLA:                                                                                                         *
        *                 - VERSIÓN CLIENTE PARA TRANSFERIR ARCHIVOS.                                                          *
        *                 - VERSIÓN SERVER PARA COMPARTIR ARCHIVOS.                                                            *
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
        *   EL CORREO ELECTRÓNICO PERMITE ENVIAR Y RECIBIR MENSAJES CON O SIN ARCHIVOS ADJUNTOS DE FORMA RÁPIDA.               *
        *   ES EL PROTOCOLO SMPT ES EL QUE POSIBILITA ESTA FUNCIONALIDAD.                                                      *
        *   SE ENCUENTRA EN LA CAPA DE APLICACIONES Y SIGUE EL MODELO CLIENTE/SERVIDOR.                                        *
        *            - TENEMOS QUE TENER UN SERVIDOR DE CORREO ELECTRÓNICO.                                                    *
        *                    - CREARÁ CUENTAS PARA LOS USUARIOS.                                                               *
        *                    - TENDRÁ UN BUZON PARA ALMACENAR LOS MENSAJES.                                                    *
        *            - TENEMOS QUE TENER UN CLIENTE DE CORREO ELECTRÓNICO. (LO QUE INSTALAMOS EN MUESTRAS MÁQUINAS)            *
        *                    - SON LOS ENCARGADOS DE DESCARGAR Y ELABORAR LOS CORREOS ELECTÓNICOS.                             *
        *                                                                                                                      *
        ************************************************************************************************************************
        *   LOS PROTOCOLOS POP3 E IMAP:                                                                                        *
        *   EL PROTOCOLO SMTP USA EL PUERTO 25.                                                                                *
        *   SMPT ES EL ENCARGADO DE REALIZAR EL TRANSPORTE DEL CORREO DESDE LA MÁQUINA DEL USUARIO (CLIENTE) AL SERVIDOR.      *
        *           - EL SERVIDOR ALMACENA EL CORREO PARA QUE EL DESTINATARIO PUEDA ACEDER A ÉL.                               *
        *                 - EL DESTINATARIO TIENE DOS OPCIONES:                                                                *
        *                         - DESCARGAR EL CORREO EN SU MÁQUINA MEDIANTE EL PROTOCOLO POP3.                              *
        *                         - CONSULTAR EN EL SERVIDOR MEDIANTE EL PROTOCOLO IMAP.                                       *
        *                                                                                                                      *
        ************************************************************************************************************************
        *   ALGUNOS COMANDOS DEL PROTOCOLO SMTP:                                                                               *
        *                 - HELLO:         -> SE USA PARA ABRIR UNA SESIÓN CON EL SERVIDOR.                                    *
        *                 - MAIL FROM:     -> SE USA PARA INDICAR QUIÉN ES EL EMISOR DEL CORREO.                               *
        *                                                                                                                      *
        ************************************************************************************************************************
        *   SMTP - POP3 - IMAP --> NOS PERMITEN TAMBIÉN ENVIAR CUALQUIER TIPO DE DOCUMENTO DIGITALIZADO.                       *
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
        *   EL PROTOCOLO HTTP ESTÁ COMPUESTO POR UNA NORMAS QUE POSIBILITAN:                                                   *
        *            - UNA COMUNICACIÓN ENTRE CLIENTE Y SERVIDOR.                                                              *
        *            - TRANSFERENCIA DE INFORMACIÓN ENTRE CLIENTE Y SERVIDOR EN FORMA DE PÁGINAS HTML.                         *
        *                                                                                                                      *
        ************************************************************************************************************************
        *   ALGUNAS REGLAS DEL PROTOCOLO HTTP SON:                                                                             *
        *                                                                                                                      *
        *      - HTTP SIGUE EL MODELO DE PETICIÓN-RESPUESTA QUE SE APLICA EL SERVIDOR AL CLIENTE.                              *
        *              - ES DECIR, EL SERVIDOR SÓLO RESPONDE ANTE PETICIONES DEL CLIENTE.                                      *
        *      - EL PUERTO QUE UTILIZA ES EL 80. (POSIBILIDAD DE CAMBIARLO).                                                   *
        *      - AL CLIENTE SE LE DENOMINA COMO AGENTE DEL USUARIO. USER AGENT.                                                *
        *      - SE DENOMINA 'RECURSO' A TODA LA INFORMACIÓN QUE SE TRANSMITE.                                                 *
        *              - CADA RECURSO SE IDENTIFICA  POR UNA URL (UNIFORM RESOURCE LOCATOR).DEL TIPO: http://wwww.google.es    *
        *              - LOS RECURSOS TAMBIÉN PUEDEN SER FICHEROS, CONSULTAS A BD, RESULTADOS DE OPERACIÓN DE UN PROGRAMA...   *
        *      - EL PROTOCOLO HTTP NO TIENE ESTADO. NO RECORDARÁ NADA DE LA CONEXIÓN ANTERIOR.                                 *
        *              - UNA SOLUCIÓN ES GUARDAR ESA INFORMACIÓN EN LAS COOKIES. (NO PERTENECE AL HTTP)                        *
        *                                                                                                                      *
        ************************************************************************************************************************
        *   HTTP FUNCIONA DE LA FORMA:                                                                                         *
        *                                                                                                                      *
        *       - EL USUARIO ACCEDE A UNA URL. PUEDE INDICAR EL PUERTO DE LA URL.                                              *
        *       - EL EQUIPO CLIENTE DESCOMPONDRÁ LA INFORMACIÓN DE LA URL:                                                     *
        *                - NOMBRE DE DOMINIO.                                                                                  *
        *                - DIRECCIÓN IP.                                                                                       *
        *                - PUERTO.                                                                                             *
        *       - EL CLIENTE ESTABLECE UNA CONEXIÓN CON EL SERVIDOR.                                                           *
        *       - EL SERVIDOR CONTESTA AL CLIENTE Y ENVÍA EL CÓDIGO HTML.                                                      *
        *       - EL CLIENTE VISUALIZA EL HTML EN UN NAVEGADOR Y CIERRA LA CONEXIÓN PERDIENDO EL ESTADO.                       *
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
        *   COMUNICACIÓN:                                                                                                      *
        *                                                                                                                      *
        *      - ES EN LA CAPA DE APLICACIÓN DEL MODELO OSI LA QUE SE VA A COMUNICAR CON LA CAPA DE TRANSPORTE.                *
        *      - LA COMUNICACIÓN SERÁN TODOS LOS DATOS CODIFICADOS POR UN PROTOCOLO ADECUADO                                   *
        *        QUE PASARÁ DE CAPA EN CAPA, AGREGANDOS LA INFORMACIÓN NECESARIA HASTA LLEGAR A LA CAPA DE TRANSPORTE.         *
        *      - CUALQUIER PROTOCOLO DE LA CAPA DE APLICACIÓN SE VA A COMUNICAR CON LA CAPA                                    *
        *        DE TRANSPORTE MEDIANTE UNA API IMPLEMENTADA MEDIANTE SOCKET.                                                  *
        *      - LOS SOCKET SON LA REPRESENTACIÓN QUE NOS PROPORCIONA EL LENGUAJE DE PROGRAMACIÓN JAVA                         *
        *        DE UNA CONEXIÓN PARA LA TRANSMISIÓN DE INFORMACIÓN EN RED.                                                    *
        *                                                                                                                      *
        ************************************************************************************************************************
        *   PASOS PARA CREACIÓN DE UNA COMUNICACIÓN MEDIANTE SOCKETS:                                                          *
        *                                                                                                                      *
        *      - SE CREAN LOS SOCKET DEL SERVIDOR Y EL CLIENTE.                                                                *
        *      - EL SERVIDOR ESTABLECE UN PUERTO DE ESCUCHA.                                                                   *
        *      - EL CLIENTE SE CONECTA AL SERVIDOR MEDIANTE EL PUERTO DE ESCUCHA.                                              *
        *      - EL SERVIDOR ACEPTA LA CONEXIÓN DEL CLIENTE.                                                                   *
        *      - SE CREAN LOS FLUJOS DE DATOS Y SE REALIZA EL INTERCAMBIO DE INFORMACIÓN.                                      *
        *            - SERÁN FLUJOS DE ENTRADA Y DE SALIDA ENTRE CLIENTE Y SERVIDOR.                                           *
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