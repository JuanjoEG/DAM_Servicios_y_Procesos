package Tema_07;

import static Principal_Main.Main.esperar;
import static Principal_Main.Main.meterEspacios;
import static Tema_07.T_07.*;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class Recursos_07 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_07 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        ************************************************************************************************************************
                                       
            - UN PROTOCOLO ES UN CONJUNTO FORMAL DE ESTÁNDARES Y NORMAS.
              ESTOS RIGEN TANTO EL FORMATO COMO EL CONTROL DE LA INTERACCIÓN
              ENTRE DISTINTOS DISPOSITIVOS DENTRO DE UNA RED O SISTEMA DE COMUNICACIÓN.
                                       
            - UNO DE LOS PROTOCOLOS QUE ADQUIRIÓ MUCHA POPULARIDAD POR LOS PROBLEMAS QUE RESOLVÍA, 
              ERA EL PROTOCOLO DE CONTROL DE TRANSMISIÓN (TCP) / PROTOCOLO DE INTERNET (IP).
              ESTOS PROTOCOLOS DARÁN NOMBRE A UN MODELO DE COMUNICACÓN, EL MODELO TCP/IP.                         
              EL MODELO TCP/IP UTILIZABA EL CONCEPTO DE DIVIDIR LA RED EN CAPAS, LAYERS, 
              ESTANDO LA COMUNICACIÓN ENTRE DICHAS CAPAS CONTROLADA POR PROTOCOLOS EN CADA UNA DE LAS CAPAS.
                                       
            - LA ORGANIZACIÓN INTERNACIONAL PARA LA ESTANDARIZACIÓN (ISO) EMPEZÓ A ESTUDIAR LA MANERA DE ARREGLAR DE ARREGLAR
              DE FORMA UNIFICADA Y COMÚN ESTOS PROBLEMAS, INVESTIGANDO CUÁLES ERAN LAS MEJORES FORMAS QUE YA SE ESTABAN APLICANDO,
              Y DEFINIENDO OTRAS NUEVAS, PARA CONSEGUIR QUE LAS REDES SE COMUNICARAN ENTRE SÍ.
              CREARON UNA SERIE DE REGLAS, QUE SE ESTANDARIZARÍAN BAJO EL NOMBRE DE ...   
                                       
                    --> MODELO DE INTERCONEXIÓN DE SISTEMAS ABIERTOS (OSI) <--  MODELO OSI
                                       
              ... QUE DICTABAN CÓMO DEBÍAN FUNCIONAR LAS REDES Y CÓMO DEBÍAN DE SER SUS COMUNICACIONES, HACIENDO QUE LA INTERCONEXIÓN
              DE ELLAS FUERA SENCILLA, AL TRABAJAR TODAS DE LA MISMA FORMA.
                                      
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    
    private static String recurso_02 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_02 + """
        ************************************************************************************************************************
                                       
            - EL MODELO OSI ESTÁ FORMADO POR SIETE CAPAS QUE DIVIDEN EL FUNCIONAMIENTO Y ESTADOS 
              POR LOS QUE DEBEN PASAR LOS DATOS PARA VIAJAR DE UNA RED A OTRA.
                                       
           7    - CAPA DE APLICACIÓN:
                        - ENCARGADA DE ACCEDER A LOS SERVICIOS QUE PROVEEN LAS DEMÁS CAPAS.
                          AQUÍ ES DONDE SE DEFINEN LOS PROTOCOLOS QUE USAREMOS.
                                       
           6    - CAPA DE PRESENTACIÓN:
                        - SERÁ LA RESPONSABLE DE LA PRESENTACIÓN DE LA INFORMACIÓN.
                          AQUÍ SE TRATAN TEMAS COMO SEMÁNTICA Y SINTAXIS DE LOS PAQUETES QUE SE TRANSMITEN.
                                       
           5    - CAPA DE SESIÓN:
                        - SU COMETIDO PASA POR MANTENER LA CONEXIÓN ENTRE DOS EQUIPOS,
                          REANUDÁNDOLA EN CASO DE INTERRUPCIÓN.
                                       
           4    - CAPA DE TRANSPORTE:
                        - COMO SU NOMBRE INDICA, LLEVARÁ A CABO EL TRANSPORTE DE LOS DATOS.
                                       
           3    - CAPA DE RED:
                        - ESTA CAPA ENRUTARÁ LAS REDES. 
                          SU OBJETIVO PRINCIPAL ES HACER QUE LOS DATOS LLEGUEN DESDE SU ORIGEN A SU DESTINO.
                                       
           2    - CAPA DE ENLACE DE DATOS:
                        - SERÁ LA ENCARGADA DE REALIZAR EL DIRECCIONAMIENTO FÍSICO DE LOS DATOS QUE SE ENVÍEN.
                          DETECTARÁ ERRORES, CONTROLARÁ EL FLUJO Y HARÁ QUE LOS PAQUETES LLEGUEN ORDENADOS.
                                       
           1    - CAPA FÍSICA:
                        - ESTA CAPA SERÁ LA ENCARGADA DE MANEJAR LA TOPOLIGÍA DE LA RED Y LAS CONEXIONES DEL ORDENADOR.
                          PODEMOS DECIR QUE GESTIONA TODO EL HARDWARE NECESARIO.
                                       
HOST ORIGEN -> 7 -> 6 -> 5 -> 4 -> 3 -> 2 -> 1 ->ENLACE FÍSICO-INTERNET-ENLACE FÍSICO -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> HOST DESTINO
                                       
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    
    private static String recurso_03 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_03 + """
        ************************************************************************************************************************
                                       
            - EL PROTOCOLO MÁS COMÚN ES EL DICTADO POR EL MODELO TCP/IP, EL CUAL CONSTA DE LAS SIGUIENTES CUATRO CAPAS:
                                       
           4    - CAPA DE APLICACIÓN:
                        -ESTA CAPA ESTÁ COMPUESTA POR APLICACIONES DE RED, LAS CUALES USARÁN LOS NIVELES MÁS INFERIORES
                         PARA PODER TRANSFERIR MENSAJES ENTRE ELLAS MISMAS. ALGUNOS EJEMPLOS DE PROTOCOLOS QUE TRABAJAN
                         EN ESTA CAPA SON LOS SIGUIENTES, QUE DEPENDEN DE LA APLICACIÓN USADA:
                                       
                        - HTTP   -> HIPERTEXT TRANSFER PROTOCOL    -> HABILITA LA NAVEGACIÓN POR INTERNET.
                                    APLICACIONES DE NAVEGACIÓN WEB.
                                    DEFINE LA FORMA DE COMUNICACIÓN ENTRE LOS SERVIDORES Y LOS NAVEGADORES WEB.
                                       
                        - SMTP   -> SIMPLE MAIL TRANSFER PROTOCOL  -> POSIBILITA ENVIAR Y RECIBIR CORREOS ELECTRÓNICOS.
                                    APLICACIONES DE CORREO ELECTRÓNICO.
                                    DEFINE LA MANERA EN LA QUE SE GESTIONA EL CORREO ELECTRÓNICO.
                                       
                        - DNS    -> DOMAIN NAME SYSTEM             -> PERMITE RESOLVER DIRECCIONES DE RED.
                                    TRADUCCIÓN DE NOMBRE DE DISPOSITIVO - DIRECCIONES IP.
                                    QUE TRADUCE A DIRECCIONES IP, LOS NOMBRES DE LOS DISPOSITIVOS EN LA RED, Y VICEVERSA.
                                       
                        - FTP    -> FILE TRANSFER PROTOCOL         -> SE ENCARGA DE LA TRANSFERENCIA DE FICHEROS.
                                    APLICACIONES PARA TRANSFERIR FICHEROS.
                                    POSIBILITA EL ENVÍO DE FICHEROS POR LA RED.
                                                                     
                        - NFS    -> NETWORK FILE SYSTEM            -> PERMITE COMPARTIR FICHEROS EN RED.
                                    APLICACIONES DE RED.
                                    POSIBILITA TRABAJAR CON FICHEROS REMOTOS COMO SI SE TRATARA DE LOCALES.
 
                        - TELNET -> TELETYPE NETWWORK              -> PERMITE PODER ACCEDER DE FORMA REMOTA A UN ORDENADOR Y MANEJARLO.
                                    POSIBILITA LA CONEXIÓN REMOTA DE TERMINALES.
                                       
                        ALGUNOS PROTOCOLOS MÁS DE LA CAPA DE APLICACIÓN DEL MODELO TCP/IP:
                        
                        - SSH    -> SECURE SHELL                   -> GESTION SEGURA Y REMOTA DE UN ORDENADOR. VERSIÓN SEGURA DE TELNET.
                        - NNTP   -> NETWORK NEW TRANSPORT PROTOCOL -> ENVÍO DE NOTICIAS POR LA RED.
                        - IRC    -> INTERNET RELAY CHAT            -> POSIBILITA CHATEAR VÍA INTERNET. 
                        - DHCP   -> DYNAMIC HOST CONFIGURATION     -> ASIGNA DINÁMICAMENTE UNA DIRECCIÓN IP.
                        - SFTP   -> SECURE FILE TRANSFER PROTOCOL  -> SE ENCARGA DE LA TRANSFERENCIA DE FICHEROS ENCRIPTADOS.
                                       
           3    - CAPA DE TRANSPORTE:
                        - ESTA CAPA ESTÁ COMPUESTA POR TODOS AQUELLOS ELEMENTOS SOFTWARE CUYA FUNCIÓN ES CREAR EL CANAL DE COMUNICACIÓN,
                          DESCOMPONER EL MENSAJE QUE HAYAMOS ENVIADO EN DIFERENTES PAQUETES Y GESTIONAR LA TRANSMISIÓN DEL MISMO ENTRE
                          EL EMISOR Y EL RECEPTOR.
                        - AQUÍ ES DONDE ACTUARÁN LOS PROTOCOLOS TCP Y UDP.
                                       
           2    - CAPA DE INTERNET:
                        - ESTA CAPA ESTÁ COMPUESTA POR TODOS AQUELLOS ELEMENTOS SOFTWARE ENCARGADOS DE DIRIGIR LOS PAQUETES POR LA RED.
                          SE ASEGURA QUE LOS PAQUETES LLEGUEN A SU DESTINO.
                                       
           1    - CAPA DE RED:
                        LLAMADA TAMBIÉN INTERFAZ DE RED, LA FORMAN TODOS AQUELLOS ELEMENTOS HARDWARE DE COMUNICACIONES,
                        TARJETAS DE RED, CABLES, ETC... Y ES LA ENCARGADA DE TRASMITIR TODOS LOS PAQUETES DE INFORMACIÓN.
                        DEBEMOS TENER EN CUENTA QUE LOS TODOS LOS PROTOCOLOS TIENEN QUE CONOCER LOS DETALLES FÍSICOS 
                        DE LA RED PARA UN CORRECTO ENVÍO DE LOS PAQUETES.
                                       
                HOST ORIGEN -> 4 -> 3 -> 2 -> 1 ->ENLACE FÍSICO-INTERNET-ENLACE FÍSICO -> 1 -> 2 -> 3 -> 4 -> HOST DESTINO
                                       
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_04 =  """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_04 + """
        ************************************************************************************************************************
                                        
                      *******************************                             *******************************
                      *         MODELO OSI          *                             *        MODELO TCP/IP        *
                      *******************************                             *******************************
                                        
                                        
                  *********************************** - - - - - - - - - - - - - - ***********************************
                   7  *      CAPA DE APLICACIÓN     *                             *                             *
                      *******************************       HTTP  TELNET          *                             *
                   6  *     CAPA DE PRESENTACIÓN    *                             *      CAPA DE APLICACIÓN     *  4
                      *******************************        FTP  SMTP            *                             *
                   5  *        CAPA DE SESIÓN       *                             *                             *
                      ******************************* - - - - - - - - - - - - - - *******************************
                   4  *      CAPA DE TRANSPORTE     *         TCP  UDP            *      CAPA DE TRANSPORTE     *  3
                      ******************************* - - - - - - - - - - - - - - *******************************
                   3  *         CAPA DE RED         *     IP  ICMP  ARP  IGMP     *       CAPA DE INTERNET      *  2
                      ******************************* - - - - - - - - - - - - - - *******************************
                   2  *   CAPA DE ENLACE DE DATOS   *       DEVICE  DRIVER        *                             *
                      *******************************                             *         CAPA DE RED         *  1
                   1  *         CAPA FÍSICA         *             NIC             *                             *
                  *********************************** - - - - - - - - - - - - - - ***********************************
                                        
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_05 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_05 + """
        ************************************************************************************************************************
                                       
            - EL PROTOCOLO DE CONTROL DE TRANSMISIÓN (TCP)/PROTOCOLO DE INTERNET (IP)
              SE USA POPULARMENTE EN LA DESCRIPCIÓN DE LA RED Y ES MÁS ANTIGUO QUE EL MODELO OSI.
                                       
            - EL MODELO DE INTERCONEXIÓN DE SISTEMAS ABIERTOS (OSI),
              ES COMÚNMENTE UTILIZADO PARA LA DESCRIPCIÓN DE LAS COMUNICACIONES DE RED.
                                       
            - EL MODELO OSI ES SOLO UN MODELO CONCEPTUAL: SE UTILIZA PRINCIPALMENTE PARA DESCRIBIR, DISCUTIR
              Y COMPRENDER FUNCIONES DE RED INDIVIDUALES.
                                       
            - TCP/IP ESTÁ DISEÑADO PARA RESOLVER UN CONJUNTO ESPECÍFICO DE PROBLEMAS,
              NO PARA FUNCIONAR COMO UNA DESCRIPCIÓN DE GENERACIÓN PARA TODAS LAS COMUNICACIONES DE RED COMO EL MODELO OSI.
                                       
            - EL MODELO OSI ES GENÉRICO, INDEPENDIENTE DEL PROTOCOLO, PERO LA MAYORÍA DE PROTOCOLOS Y SISTEMAS SE ADHIEREN A ÉL.
                                       
            - EL MODELO TCP/IP SE BASA EN PROTOCOLOS ESTÁNDAR QUE INTERNET HA DESARROLLADO.
                                       
            - NO TODAS LAS CAPAS DEL MODELO OSI SE UTILIZAN EN APLICACIONES MÁS SIMPLES. SI BIEN LAS CAPAS 1, 2 Y 3 SON
              OBLIGATORIAS PARA CUALQUIER COMUNICACIÓN DE DATOS, LA APLICACIÓN PUEDE USAR ALGUNA CAPA DE INTERFAZ ÚNICA
              PARA LA APLICACIÓN EN LUGAR DE LAS CAPAS SUPERIORES HABITUALES EN EL MODELO.
                                       
            - NO DEBEMOS CONFUNDIR EL MODELO TCP/IP CON EL PROTOCOLO TCP, QUE ES UN PROTOCOLO DE TRANSPORTE,
              Y POR TANTO PUEDE PERTENECER A AMBOS MODELOS.
                                       
            - EN EL MODELO TCP/IP PODRÍAMOS TENER DISTINTOS PROTOCOLOS, SMTP, HTTP, FTP, ETC...

        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_06 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_06 + """
        ************************************************************************************************************************
                                       
            - EN LA CAPA DE TRANSPORTE DEL MODELO TCP/IP Y EN LA CAPA DE TRANSPORTE DEL MODELO OSI, ES DONDE SE REALIZA TODO
              LO RELACIONADO CON LA TRANSFERENCIA DE DATOS Y CORRECIÓN DE ERRORES DE ESTOS, 
              ENTRE EL EMISOR Y EL RECEPTOR DE LA COMUNICACIÓN.
                                       
            - LA MISIÓN DE ESTA CAPA ES PROPORCIONAR UN TRANSPORTE DE INFORMACIÓN CONFIABLE ENTRE EL EMISOR Y EL RECEPTOR,
              QUE SEA TOTALMENTE INDEPENDIENTE DE LA CAPA FÍSICA QUE SE ESTÉ UTILIZANDO EN LA MISMA.
                                       
            - ESTO PUEDE REALIZARSE MEDIANTE EL PROTOCOLO TCP.
                    - TCP ES UN PROTOCOLO ORIENTADO A LA CONEXIÓN PORQUE CREA UN FLUJO DE TRANSMISIÓN ORIGEN-DESTINO,
                      GARANTIZANDO LA ENTREGA DE INFORMACIÓN SIN ERRORES.
                                       
            - FUNCIONAMIENTO:
                    1. ESTE PROTOCOLO DIVIDE EL MENSAJE QUE SE QUIERE ENVIAR EN PAQUETES, ENVIANDOLOS POR EL CANAL DE COMUNICACÓN.
                    2. A ESTOS PAQUETES LES IRÁ ASIGNANDO UN NÚMERO.
                    3. ESOS NÚMEROS PERMITEN RECONSTRUIR EL MENSAJE, UNA VEZ LLEGAN LOS PAQUETES A DESTINO, VOLVIENDO A TENER
                       DE UNA PIEZA EL MENSAJE QUE SE ENVIÓ.
                                       
            - TCP TAMBIÉN CONTROLA EL FLUJO DEL CANAL DE COMUNICACIÓN:
              CONTROLAR LA CANTIDAD DE TRÁFICO, HACIENDO QUE LA RED NO SE SATURE 
              Y EVITANDO QUE UN RECEPTOR LENTO EN EL PROCESO DE RECEPCIÓN DE PAQUETES QUEDE SATURADO POR UN EMISOR MÁS RÁPIDO.
                                       
            - TCP ES UN PROTOCOLO FIABLE:
              VA A GARANTIZAR LA LLEGADA DE LOS PAQUETES AL RECEPTOR.
                                       
            - AL CONTAR CON TODAS ESTAS CARACTERÍSTICAS, EL PROTOCOLO TCP NO ES SENCILLO DE IMPLEMENTAR,
              YA QUE TIENE QUE CUBRIR MUCHOS ASPECTOS EN EL TRANSPORTE DE LA INFORMACIÓN.
                                       
            EJEMPLOS QUE USAN TCP SON:  HTTP, FTP, TELNET, ETC... 
                                       
            - DATAGRAMA: FRAGMENTO DE INFORMACIÓN - NO HAY NÚMERO DE ORDEN.     - LO USA EL PROTOCOLO UDP.
            - PAQUETE:   FRAGMENTO DE INFORMACIÓN - INCLUYE UN NÚMERO DE ORDEN. - LO USA EL PROTOCOLO TCP.
                                       
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_07 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_07 + """
        ************************************************************************************************************************
                                       
            - OTRO PROTOCOLO DE LA CAPA DE TRANSPORTE ES EL PROTOCOLO DE DATAGRAMAS DE USUARIO -> UDP -> USER DATAGRAM PROTOCOL.
              UDP ES UN PROTOCOLO NO ORIENTADO A LA CONEXIÓN, PORQUE NO INCLUYE NINGÚN MECANISMO PARA LA SINCRONIZACIÓN EN EL
              ENVÍO DE MENSAJES ENTRE EMISOR Y RECEPTOR.
                                       
            - FUNCIONAMIENTO:
                    1. DIVIDIR EL MENSAJE QUE SE QUIERE ENVIAR EN DATAGRAMAS, ENVIÁNDOLOS POR EL CANAL DE COMUNICACIÓN,
                       SIN INCLUIR NINGUNA MEDIDA DE CONTROL NI DE LLEGADA, NI DE FLUJO.
                    2. EN UDP NO HAY UNA NUMERACIÓN DE CADA DATAGRAMA.
                    3. AL NO HABER NUMERACIÓN, NO SE PUEDE UNIR LOS DATAGRAMAS Y RECONSTRUIR EL MENSAJE ORIGINAL.
                       AL NO HABER NINGUNA MEDIDA DE CONTROL, EN PRINCIPO SE DESCONOCE SI EL MENSAJE HA LLEGADO O NO.
                                       
            - ESTE PROTOCOLO NO ES FIABLE: NO GARANTIZA LA LLEGADA DE TODOS Y CADA UNO
              DE LOS DATAGRAMAS ENVIADOS POR EL EMISOR DEL MENSAJE AL RECEPTOR.
                                       
            - NO REALIZA NINGÚN TIPO DE CONTROL DE FLUJO EN LAS COMUNICACIONES.
                                       
            - AL NO REALIZAR NINGÚN CONTROL DE FLUJO NI DE ERRORES,
              EL PROTOCOLO UDP ES MUCHO MÁS RÁPIDO QUE TCP EN LA TRANSMISIÓN,
              Y TAMBIÉN MUCHO MENOS COMPLEJO DE IMPLEMENTAR.
                                       
            - SE USA EN APLICACIONES EN QUE ES MÁS IMPORTANTE LA VELOCIDAD DE ENTREGA DEL MENSAJE, QUE LA LLEGADA Y ORDEN.
              POR EJEMPLO EN APLICACIONES EN TIEMPO REAL, STREAMING, O TRANSMISIÓN DE VOZ.
              NO SE INTERRUMPE LA TRANSMISIÓN AL PERDER ALGÚN DATAGRAMA, CON TCP LAS TRANSMISIONES SE PARARÍAN AL PERDER
              ALGÚN PAQUETE, NO RECOBRANDO LA TRANSMISIÓN HASTA QUE LLEGASE, HACIENDO LA COMUNICACIÓN A SALTOS.
                                       
            PROTOCOLOS QUE NO NECESITAN ASIGNACIÓN DE CONTROL DE SECUENCIA NI DE FLUJO:
                                       
                    - BOOTP  --> BOOT STRAP PROTOCOL  --> PROTOCOLO DE ARRANQUE.
                            ES UN PROTOCOLO DE RED UDP UTILIZADO POR LOS CLIENTES DE RED 
                            PARA OBTENER SU DIRECCIÓN IP AUTOMÁTICAMENTE.
                                      
                    - DHCP   --> DYNAMIC HOST CONFIGURATION --> PROTOCOLO DE CONFIGURACIÓN DINÁMICA DE HOST.
                            ES EL PROTOCOLO CLIENTE/SERVIDOR QUE PROPORCIONA AUTOMÁTICAMENTE UN HOST DE PROTOCOLO DE INTERNET IP
                            CON SUS DIRECCIÓN IP Y OTRA CONFIGURACIÓN RELACIONADA, MÁSCARA DE SUBRED, PUERTA DE ENLACE.
                            ES QUIEN ASIGNA LAS DIRECCIONES IP EN  UNA RED.
                            FUÉ DESARROLLADO COMO EXTENSIÓN DE BOOTP.
                                       
                    - DNS    --> DOMAIN NAME SYSTEM --> SISTEMA DE NOMBRES DE DOMINIO.
                            ES UN SISTEMA DE NOMENCLATURA FERÁRQUICO DESCENTRALIZADO PARA DISPOSITIVOS CONECTADOS A REDES IP
                            COMO INTERNET O UNA RED PRIVADA. ES QUIEN TRADUCE LOS NOMBRES EN DIRECCIONES IP.
                                       
            TENER EN CUENTA QUE EL HECHO DE QUE EL PROTOCOLO UDP EN LA CAPA DE TRANSPORTE NO INCLUYA MECANISMOS DE CONTROL DE
            LLEGADA, NO QUIERE DECIR QUE OTROS COMPONENTES A OTRO NIVEL, POR EJEMPLO DE APLICACIÓN, SI LO HAGAN.
                                       
            - DATAGRAMA: FRAGMENTO DE INFORMACIÓN - NO HAY NÚMERO DE ORDEN.     - LO USA EL PROTOCOLO UDP.
            - PAQUETE:   FRAGMENTO DE INFORMACIÓN - INCLUYE UN NÚMERO DE ORDEN. - LO USA EL PROTOCOLO TCP.
                                      
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_08 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_08 + """
        ************************************************************************************************************************
                                       
        ************************************************************************************************************************
        *                                  *              T C P                      *                 U D P                   *
        ************************************************************************************************************************
        *  ESTRUCTURA                      *        PAQUETES (SEGMENTOS)             *               DATAGRAMAS                *
        ************************************************************************************************************************
        *  MODELO DE CONEXIÓN              *   ORIENTADO A LA CONEXIÓN - UNO A UNO   *NO ORIENTADO A LA CONEXIÓN - UNO A MUCHOS*
        ************************************************************************************************************************
        *  TRANSFERENCIA DE DATOS          *              ORDENADA                   *               DESORDENADA               *
        ************************************************************************************************************************
        *  FIABILIDAD                      *               FIABLE                    *                 NO FIABLE               *
        ************************************************************************************************************************
        *  CONTROL DE FLUJO                *         CONTROL DE SATURACIÓN           *                SIN CONTROL              *
        ************************************************************************************************************************
        *  SOBRECARGA (VER NOTA)           *          INTENSIVA EN RECURSOS          *                  LIGERA                 *
        ************************************************************************************************************************
        *  COMPLEJIDAD                     *            MÁS ALTA QUE UDP             *             MÁS BAJA QUE TCP            *
        ************************************************************************************************************************
        *  VELOCIDAD                       *            MÁS BAJA QUE UDP             *             MÁS ALTA QUE TCP            *
        ************************************************************************************************************************

            - LA SOBRECARGA (OVERHEAD) SE REFIERE A SI, ADEMÁS DE LA INFORMACIÓN QUE SE DESEA TRANSMITIR,
              SE AÑADEN ELEMENTOS ADICIONALES PROPIOS DEL PROTOCOLO, POR EJEMPLO PARA EL NÚMERO DE ORDEN,
              CONTROL DE LA LLEGADA O NÚMERO DE PAQUETE, CONTROL DE FLUJO, ETC...

        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_09 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_09 + """
        ************************************************************************************************************************
                                       
            - PARA LOGRAR QUE LA INFORMACIÓN VAYA DE UN EXTREMO A OTRO DE LA COMUNICACIÓN,
              DEBEMOS UTILIZAR LA CAPA DE RED Y POR EJEMPLO UTILIZANDO EL PROTOCOLO TCP O EL UDP,
              ENVIAR ESOS PAQUETES O DATAGRAMAS A LA DIRECCIÓN IP DEL DESTINATARIO.
                                       
            - SIN EMBARGO, CON ESTO NO ES SUFICIENTE, YA QUE TENDREMOS QUE INDICAR DE UNA MANERA MÁS ESPECÍFICA
              A DÓNDE EN CONCRETO, POR EJEMPLO, A QUÉ APLICACIÓN DE TODAS LOS QUE PUEDA HABER EN ESA DIRECCIÓN IP,
              VAN DIRIGIDOS DICHOS PAQUETES.
              PARA ESTO, PODEMOS DEFINIR UNA SERIE DE DIRECCIONES DE TRANSPORTE EN LAS QUE LOS PROCESOS DE NUESTRAS
              APLICACIONES PUEDAN ESTAR DE FORMA CONSTANTE A LA ESCUCHA, POR SI LLEGA ALGÚN PAQUETE O DATAGRAMA.
              ESTO ES LO QUE CONOCEMOS COMO PUERTOS.
                                       
            - LA GRAN MAYORÍA DE LOS PUERTOS SE VA A ASIGNAR DE FORMA ALEATORIA, SIN NINGÚN TIPO DE ORDEN,
              SIMPLEMENTE SE ASIGNARÁ EL PRIMERO QUE SE ENCUENTRE LIBRE.
                                       
            - SIN EMBARGO, HAY CIERTAS APLICACIONES QUE SÍ TIENEN UN PUERTO YA ASIGNADO PARA SU FUNCIONAMIENTO,
              LOS CUALES NO PODRÁN SER USADOS EN LAS ASIGNACIONES ALEATORIAS O EN ASIGNACIONES MANUALES QUE HAGAMOS NOSOTROS,
              YA QUE ESO LLEVARÍA A DIVERSOS ERRORES EN LA TRANSMISIÓN DE LA INFORMACIÓN A TRAVÉS DE LA RED.
                                       
            - LA AUTORIDAD DE ASIGNACIÓN DE NÚMEROS DE INTERNET (IANA: INTERNET ASSIGNED NUMBERS AUTHORITY),
              ES QUIEN SE ENCARGA DE ASIGNAR LOS PUERTOS PREDEFINIDOS A LAS APLICACIONES QUE ASÍ LO NECESITEN.
              LA IANA TIENE DEFINIDOS LOS SIGUIENTES RANGOS DE PUERTOS:
                                       
                    - PUERTOS CONOCIDOS:       0 <--> 1023
                            ESTÁN RESERVADOS PARA APLICACIONES ESTÁNDAR.
                            PUERTO 21 --> PROTOCOLO FTP
                            PUERTO 80 --> PROTOCOLO HTTP
                                                 
                    - PUERTOS REGISTRADOS:  1024 <--> 49151
                            ESTÁN ASIGNADOS PARA SERVICIOS O APLICACIONES ESPECÍFICAS.
                            ESTE SERÁ EL RANGO DE PUERTOS QUE DEBEMOS UTILIZAR PARA DESARROLLAR NUESTRAS APLICACIONES.
                            PUETO 8080 --> TOMCAT DE SPRINGBOOT.
                                                  
                    - PUERTOS DINÁMICOS:   49152 <--> 65535
                            NO REGISTRADOS PARA NINGÚN SERVICIO, (PUERTOS PRIVADOS)
                            SU USO ES ATENDER A CONEXIONES TEMPORALES ENTRE APLICACIONES.
                                       
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_10 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_10 + """
        ************************************************************************************************************************
                                       
            - USAREMOS EL CMD PARA PRACTICAR ESTOS COMANDOS:                                       
                                       
                    netstat -?                 --> INFORMACIÓN DEL COMANDO netstat. MUESTRA ESTADÍSTICAS DE LA RED.

                    netstat -a                 --> NOS MUESTRA TODOS LOS PUERTOS QUE SE ESTÁN ESCUCHANDO EN TU ORDENADOR.

                    netstat -ao                --> NOS MUESTRA ADEMÁS LA DIRECCIÓN IP Y EL NÚMERO DE PROCESO.

                    netstat -ao | find "3306"  --> NOS MUESTRA LOS HILOS Y QUIÉN ESTÁ ESCUCNDO ESTE PUERTO.

                    ipconfig                   --> NOS MUESTRA NUESTRA DIRECCIÓN IP EN LA RED LOCAL.
                                       
                    nslookup -?                --> INFORMACIÓN DEL COMANDO nslookup. MUESTRA IP REMOTAS.

                    nslookup www.google.com    --> NOS MUESTRA LA DIRECCIÓN IP DE ESE SERVIDOR.
                                       
            - USAREMOS EL PROGRAMA WIRESHARK:
                                       
                    - NOS MUESTRA EL TRÁFICO EN LA RED. LO PONDREMOS A CAPTURAR EL TRÁFICO IP.
                                       
                    - EN UN NAVEGADOR:
                            - CONECTAREMOS A LA PÁGINA WEB http://www.techpanda.org
                                    - USUARIO: admin@google.com
                                    - CLAVE:   Password2010
                                       
                    - EN WIRESHARK: 
                            - PULSAR STOP: CUADRADO ROJO.                  
                            - EN LA VENTANA DE ESPECIFICACIÓN DEL FILTRO DE VISUALIZACIÓN PONER --> http
                            - EN EL VISUALIZADOR DE PAQUETES, BUSCAR EL MENSAJE --> HTTP POST.
                            - PODRÁS VER LA CLAVE ENVIADA EN ESA PÁGINA WEB.

        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_11 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_11 + """
        ************************************************************************************************************************
                                       
            - InetAddress:
                    - ESTA CLASE NOS VA A PERMITIR ENCONTRAR UN NOMBRE DE DOMINIO A PARTIR DE SI DIRECCIÓN IP, Y VICEVERSA.
                      LOS OBJETOS DE ESTA CLASE TENDRÁN DOS ELEMENTOS:
                            - NOMBRE DEL EQUIPO.
                            - DIRECCIÓN IP.
                                       
            - Socket:
                    - ESTA CLASE REALIZA O IMPLEMENTA LA COMUNICACIÓN BIDIRECCIONAL ENTRE UN
                      PROGRAMA CLIENTE Y OTRO PROGRAMA SERVIDOR.
                      VA A PERMITIR TANTO EL ENVÍO COMO LA RECEPCIÓN DE MENSAJES.
                      SI USAMOS OBJETOS DE ESTA CLASE, NUESTROS PROGRAMAS JAVA PODRÁN COMUNICARSE A TRAVÉS DE LA RED
                      DE FORMA INDEPENDIENTE DE LA PLATAFORMA.
                            - ESTA CLASE SE UTILIZARÁ PARA CLIENTES TCP.
                                       
            - ServerSoket:
                    - NOS AYUDARÁ A IMPLEMENTAR UN SOCKET QUE PUEDE SER UTILIZADO POR LOS SERVIDORES PARA ESCUCHAR
                      Y ACEPTAR PETICIONES DE CONEXIÓN DE CLIENTES.
                            - ESTA CLASE SE UTILIZARÁ PARA SERVIDORES TCP Y UDP.
                                       
            - DatagramSocket:
                    - CON ELLA PODREMOS IMPLEMENTAR CLIENTES QUE USEN DATAGRAMAS, SIENDO NO FIABLES Y NO ORDENABLES.
                      ESTA CLASE OFRECE UNA COMUNICACIÓN MUY RÁPIDA,
                      YA QUE NO HAY QUE ESTABLECER LA CONEXIÓN ENTRE CLIENTE Y SERVIDOR.
                            - ESTA CLASE SE UTILIZARÁ CLIENTES UDP.                            
                                       
            - DatagramPacket:
                    - REPRESENTARÁ UN DATAGRAMA, Y CONTIENE TODA LA INFORMACIÓN NECESARIA POR EL MISMO:
                            - LONGITUD DEL PAQUETE.
                            - DIRECCIONES IP.
                            - NÚMERO DE PUERO.
                                       
            - MulticastSocket:
                    - UTILIZADA PARA CREAR UNA VERSIÓN 'MULTICAST' DE LA CLASE DatagramSocket.
                    - MEDIANTE ESTA CLASE PODREMOS ENVIAR MENSAJES A MÚLTIPLES CLIENTES O SERVIDORES.

        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_12 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_12 + """
        ************************************************************************************************************************
                                       
        ************************************************************************************************************************                               
        *   CLASE              *   UTILIDAD            *                   
        ************************************************************************************************************************
        *  ServerSoket         * CREACIÓN              *  
        *                      * DE SERVIDORES             E N   C O N S T R U C C I Ó N

        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    
    public static void recurso(String opcion) {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            
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
            }
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                switch (menu) {
                   
                    case "0" -> {}
                    default -> {
                            meterEspacios(25);
                            System.out.println("\n  ¡¡¡ LA OPCIÓN NO ES CORRECTA !!!");
                            meterEspacios(15);
                            esperar(1500);
                            }
                }
            }  catch (Exception e) {
                System.out.println("Error: " + e.toString());
                System.out.println("MENSAJE " + e.getMessage());
                System.out.println("La Excepción es: " + e.getClass());
            }
        } while (!"0".equals(menu));   
    }
}