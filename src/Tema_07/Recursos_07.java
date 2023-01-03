package Tema_07;

import static Principal_Main.Main.esperar;
import static Principal_Main.Main.meterEspacios;
import static Tema_07.T_07.*;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Recursos_07 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_07 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        ************************************************************************************************************************
                                       
            - UN PROTOCOLO ES UN CONJUNTO FORMAL DE EST�NDARES Y NORMAS.
              ESTOS RIGEN TANTO EL FORMATO COMO EL CONTROL DE LA INTERACCI�N
              ENTRE DISTINTOS DISPOSITIVOS DENTRO DE UNA RED O SISTEMA DE COMUNICACI�N.
                                       
            - UNO DE LOS PROTOCOLOS QUE ADQUIRI� MUCHA POPULARIDAD POR LOS PROBLEMAS QUE RESOLV�A, 
              ERA EL PROTOCOLO DE CONTROL DE TRANSMISI�N (TCP) / PROTOCOLO DE INTERNET (IP).
              ESTOS PROTOCOLOS DAR�N NOMBRE A UN MODELO DE COMUNICAC�N, EL MODELO TCP/IP.                         
              EL MODELO TCP/IP UTILIZABA EL CONCEPTO DE DIVIDIR LA RED EN CAPAS, LAYERS, 
              ESTANDO LA COMUNICACI�N ENTRE DICHAS CAPAS CONTROLADA POR PROTOCOLOS EN CADA UNA DE LAS CAPAS.
                                       
            - LA ORGANIZACI�N INTERNACIONAL PARA LA ESTANDARIZACI�N (ISO) EMPEZ� A ESTUDIAR LA MANERA DE ARREGLAR DE ARREGLAR
              DE FORMA UNIFICADA Y COM�N ESTOS PROBLEMAS, INVESTIGANDO CU�LES ERAN LAS MEJORES FORMAS QUE YA SE ESTABAN APLICANDO,
              Y DEFINIENDO OTRAS NUEVAS, PARA CONSEGUIR QUE LAS REDES SE COMUNICARAN ENTRE S�.
              CREARON UNA SERIE DE REGLAS, QUE SE ESTANDARIZAR�AN BAJO EL NOMBRE DE ...   
                                       
                    --> MODELO DE INTERCONEXI�N DE SISTEMAS ABIERTOS (OSI) <--  MODELO OSI
                                       
              ... QUE DICTABAN C�MO DEB�AN FUNCIONAR LAS REDES Y C�MO DEB�AN DE SER SUS COMUNICACIONES, HACIENDO QUE LA INTERCONEXI�N
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
                                       
            - EL MODELO OSI EST� FORMADO POR SIETE CAPAS QUE DIVIDEN EL FUNCIONAMIENTO Y ESTADOS 
              POR LOS QUE DEBEN PASAR LOS DATOS PARA VIAJAR DE UNA RED A OTRA.
                                       
           7    - CAPA DE APLICACI�N:
                        - ENCARGADA DE ACCEDER A LOS SERVICIOS QUE PROVEEN LAS DEM�S CAPAS.
                          AQU� ES DONDE SE DEFINEN LOS PROTOCOLOS QUE USAREMOS.
                                       
           6    - CAPA DE PRESENTACI�N:
                        - SER� LA RESPONSABLE DE LA PRESENTACI�N DE LA INFORMACI�N.
                          AQU� SE TRATAN TEMAS COMO SEM�NTICA Y SINTAXIS DE LOS PAQUETES QUE SE TRANSMITEN.
                                       
           5    - CAPA DE SESI�N:
                        - SU COMETIDO PASA POR MANTENER LA CONEXI�N ENTRE DOS EQUIPOS,
                          REANUD�NDOLA EN CASO DE INTERRUPCI�N.
                                       
           4    - CAPA DE TRANSPORTE:
                        - COMO SU NOMBRE INDICA, LLEVAR� A CABO EL TRANSPORTE DE LOS DATOS.
                                       
           3    - CAPA DE RED:
                        - ESTA CAPA ENRUTAR� LAS REDES. 
                          SU OBJETIVO PRINCIPAL ES HACER QUE LOS DATOS LLEGUEN DESDE SU ORIGEN A SU DESTINO.
                                       
           2    - CAPA DE ENLACE DE DATOS:
                        - SER� LA ENCARGADA DE REALIZAR EL DIRECCIONAMIENTO F�SICO DE LOS DATOS QUE SE ENV�EN.
                          DETECTAR� ERRORES, CONTROLAR� EL FLUJO Y HAR� QUE LOS PAQUETES LLEGUEN ORDENADOS.
                                       
           1    - CAPA F�SICA:
                        - ESTA CAPA SER� LA ENCARGADA DE MANEJAR LA TOPOLIG�A DE LA RED Y LAS CONEXIONES DEL ORDENADOR.
                          PODEMOS DECIR QUE GESTIONA TODO EL HARDWARE NECESARIO.
                                       
HOST ORIGEN -> 7 -> 6 -> 5 -> 4 -> 3 -> 2 -> 1 ->ENLACE F�SICO-INTERNET-ENLACE F�SICO -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> HOST DESTINO
                                       
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
                                       
            - EL PROTOCOLO M�S COM�N ES EL DICTADO POR EL MODELO TCP/IP, EL CUAL CONSTA DE LAS SIGUIENTES CUATRO CAPAS:
                                       
           4    - CAPA DE APLICACI�N:
                        -ESTA CAPA EST� COMPUESTA POR APLICACIONES DE RED, LAS CUALES USAR�N LOS NIVELES M�S INFERIORES
                         PARA PODER TRANSFERIR MENSAJES ENTRE ELLAS MISMAS. ALGUNOS EJEMPLOS DE PROTOCOLOS QUE TRABAJAN
                         EN ESTA CAPA SON LOS SIGUIENTES, QUE DEPENDEN DE LA APLICACI�N USADA:
                                       
                        - HTTP   -> HIPERTEXT TRANSFER PROTOCOL    -> HABILITA LA NAVEGACI�N POR INTERNET.
                                    APLICACIONES DE NAVEGACI�N WEB.
                                    DEFINE LA FORMA DE COMUNICACI�N ENTRE LOS SERVIDORES Y LOS NAVEGADORES WEB.
                                       
                        - SMTP   -> SIMPLE MAIL TRANSFER PROTOCOL  -> POSIBILITA ENVIAR Y RECIBIR CORREOS ELECTR�NICOS.
                                    APLICACIONES DE CORREO ELECTR�NICO.
                                    DEFINE LA MANERA EN LA QUE SE GESTIONA EL CORREO ELECTR�NICO.
                                       
                        - DNS    -> DOMAIN NAME SYSTEM             -> PERMITE RESOLVER DIRECCIONES DE RED.
                                    TRADUCCI�N DE NOMBRE DE DISPOSITIVO - DIRECCIONES IP.
                                    QUE TRADUCE A DIRECCIONES IP, LOS NOMBRES DE LOS DISPOSITIVOS EN LA RED, Y VICEVERSA.
                                       
                        - FTP    -> FILE TRANSFER PROTOCOL         -> SE ENCARGA DE LA TRANSFERENCIA DE FICHEROS.
                                    APLICACIONES PARA TRANSFERIR FICHEROS.
                                    POSIBILITA EL ENV�O DE FICHEROS POR LA RED.
                                                                     
                        - NFS    -> NETWORK FILE SYSTEM            -> PERMITE COMPARTIR FICHEROS EN RED.
                                    APLICACIONES DE RED.
                                    POSIBILITA TRABAJAR CON FICHEROS REMOTOS COMO SI SE TRATARA DE LOCALES.
 
                        - TELNET -> TELETYPE NETWWORK              -> PERMITE PODER ACCEDER DE FORMA REMOTA A UN ORDENADOR Y MANEJARLO.
                                    POSIBILITA LA CONEXI�N REMOTA DE TERMINALES.
                                       
                        ALGUNOS PROTOCOLOS M�S DE LA CAPA DE APLICACI�N DEL MODELO TCP/IP:
                        
                        - SSH    -> SECURE SHELL                   -> GESTION SEGURA Y REMOTA DE UN ORDENADOR. VERSI�N SEGURA DE TELNET.
                        - NNTP   -> NETWORK NEW TRANSPORT PROTOCOL -> ENV�O DE NOTICIAS POR LA RED.
                        - IRC    -> INTERNET RELAY CHAT            -> POSIBILITA CHATEAR V�A INTERNET. 
                        - DHCP   -> DYNAMIC HOST CONFIGURATION     -> ASIGNA DIN�MICAMENTE UNA DIRECCI�N IP.
                        - SFTP   -> SECURE FILE TRANSFER PROTOCOL  -> SE ENCARGA DE LA TRANSFERENCIA DE FICHEROS ENCRIPTADOS.
                                       
           3    - CAPA DE TRANSPORTE:
                        - ESTA CAPA EST� COMPUESTA POR TODOS AQUELLOS ELEMENTOS SOFTWARE CUYA FUNCI�N ES CREAR EL CANAL DE COMUNICACI�N,
                          DESCOMPONER EL MENSAJE QUE HAYAMOS ENVIADO EN DIFERENTES PAQUETES Y GESTIONAR LA TRANSMISI�N DEL MISMO ENTRE
                          EL EMISOR Y EL RECEPTOR.
                        - AQU� ES DONDE ACTUAR�N LOS PROTOCOLOS TCP Y UDP.
                                       
           2    - CAPA DE INTERNET:
                        - ESTA CAPA EST� COMPUESTA POR TODOS AQUELLOS ELEMENTOS SOFTWARE ENCARGADOS DE DIRIGIR LOS PAQUETES POR LA RED.
                          SE ASEGURA QUE LOS PAQUETES LLEGUEN A SU DESTINO.
                                       
           1    - CAPA DE RED:
                        LLAMADA TAMBI�N INTERFAZ DE RED, LA FORMAN TODOS AQUELLOS ELEMENTOS HARDWARE DE COMUNICACIONES,
                        TARJETAS DE RED, CABLES, ETC... Y ES LA ENCARGADA DE TRASMITIR TODOS LOS PAQUETES DE INFORMACI�N.
                        DEBEMOS TENER EN CUENTA QUE LOS TODOS LOS PROTOCOLOS TIENEN QUE CONOCER LOS DETALLES F�SICOS 
                        DE LA RED PARA UN CORRECTO ENV�O DE LOS PAQUETES.
                                       
                HOST ORIGEN -> 4 -> 3 -> 2 -> 1 ->ENLACE F�SICO-INTERNET-ENLACE F�SICO -> 1 -> 2 -> 3 -> 4 -> HOST DESTINO
                                       
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
                   7  *      CAPA DE APLICACI�N     *                             *                             *
                      *******************************       HTTP  TELNET          *                             *
                   6  *     CAPA DE PRESENTACI�N    *                             *      CAPA DE APLICACI�N     *  4
                      *******************************        FTP  SMTP            *                             *
                   5  *        CAPA DE SESI�N       *                             *                             *
                      ******************************* - - - - - - - - - - - - - - *******************************
                   4  *      CAPA DE TRANSPORTE     *         TCP  UDP            *      CAPA DE TRANSPORTE     *  3
                      ******************************* - - - - - - - - - - - - - - *******************************
                   3  *         CAPA DE RED         *     IP  ICMP  ARP  IGMP     *       CAPA DE INTERNET      *  2
                      ******************************* - - - - - - - - - - - - - - *******************************
                   2  *   CAPA DE ENLACE DE DATOS   *       DEVICE  DRIVER        *                             *
                      *******************************                             *         CAPA DE RED         *  1
                   1  *         CAPA F�SICA         *             NIC             *                             *
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
                                       
            - EL PROTOCOLO DE CONTROL DE TRANSMISI�N (TCP)/PROTOCOLO DE INTERNET (IP)
              SE USA POPULARMENTE EN LA DESCRIPCI�N DE LA RED Y ES M�S ANTIGUO QUE EL MODELO OSI.
                                       
            - EL MODELO DE INTERCONEXI�N DE SISTEMAS ABIERTOS (OSI),
              ES COM�NMENTE UTILIZADO PARA LA DESCRIPCI�N DE LAS COMUNICACIONES DE RED.
                                       
            - EL MODELO OSI ES SOLO UN MODELO CONCEPTUAL: SE UTILIZA PRINCIPALMENTE PARA DESCRIBIR, DISCUTIR
              Y COMPRENDER FUNCIONES DE RED INDIVIDUALES.
                                       
            - TCP/IP EST� DISE�ADO PARA RESOLVER UN CONJUNTO ESPEC�FICO DE PROBLEMAS,
              NO PARA FUNCIONAR COMO UNA DESCRIPCI�N DE GENERACI�N PARA TODAS LAS COMUNICACIONES DE RED COMO EL MODELO OSI.
                                       
            - EL MODELO OSI ES GEN�RICO, INDEPENDIENTE DEL PROTOCOLO, PERO LA MAYOR�A DE PROTOCOLOS Y SISTEMAS SE ADHIEREN A �L.
                                       
            - EL MODELO TCP/IP SE BASA EN PROTOCOLOS EST�NDAR QUE INTERNET HA DESARROLLADO.
                                       
            - NO TODAS LAS CAPAS DEL MODELO OSI SE UTILIZAN EN APLICACIONES M�S SIMPLES. SI BIEN LAS CAPAS 1, 2 Y 3 SON
              OBLIGATORIAS PARA CUALQUIER COMUNICACI�N DE DATOS, LA APLICACI�N PUEDE USAR ALGUNA CAPA DE INTERFAZ �NICA
              PARA LA APLICACI�N EN LUGAR DE LAS CAPAS SUPERIORES HABITUALES EN EL MODELO.
                                       
            - NO DEBEMOS CONFUNDIR EL MODELO TCP/IP CON EL PROTOCOLO TCP, QUE ES UN PROTOCOLO DE TRANSPORTE,
              Y POR TANTO PUEDE PERTENECER A AMBOS MODELOS.
                                       
            - EN EL MODELO TCP/IP PODR�AMOS TENER DISTINTOS PROTOCOLOS, SMTP, HTTP, FTP, ETC...

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
              LO RELACIONADO CON LA TRANSFERENCIA DE DATOS Y CORRECI�N DE ERRORES DE ESTOS, 
              ENTRE EL EMISOR Y EL RECEPTOR DE LA COMUNICACI�N.
                                       
            - LA MISI�N DE ESTA CAPA ES PROPORCIONAR UN TRANSPORTE DE INFORMACI�N CONFIABLE ENTRE EL EMISOR Y EL RECEPTOR,
              QUE SEA TOTALMENTE INDEPENDIENTE DE LA CAPA F�SICA QUE SE EST� UTILIZANDO EN LA MISMA.
                                       
            - ESTO PUEDE REALIZARSE MEDIANTE EL PROTOCOLO TCP.
                    - TCP ES UN PROTOCOLO ORIENTADO A LA CONEXI�N PORQUE CREA UN FLUJO DE TRANSMISI�N ORIGEN-DESTINO,
                      GARANTIZANDO LA ENTREGA DE INFORMACI�N SIN ERRORES.
                                       
            - FUNCIONAMIENTO:
                    1. ESTE PROTOCOLO DIVIDE EL MENSAJE QUE SE QUIERE ENVIAR EN PAQUETES, ENVIANDOLOS POR EL CANAL DE COMUNICAC�N.
                    2. A ESTOS PAQUETES LES IR� ASIGNANDO UN N�MERO.
                    3. ESOS N�MEROS PERMITEN RECONSTRUIR EL MENSAJE, UNA VEZ LLEGAN LOS PAQUETES A DESTINO, VOLVIENDO A TENER
                       DE UNA PIEZA EL MENSAJE QUE SE ENVI�.
                                       
            - TCP TAMBI�N CONTROLA EL FLUJO DEL CANAL DE COMUNICACI�N:
              CONTROLAR LA CANTIDAD DE TR�FICO, HACIENDO QUE LA RED NO SE SATURE 
              Y EVITANDO QUE UN RECEPTOR LENTO EN EL PROCESO DE RECEPCI�N DE PAQUETES QUEDE SATURADO POR UN EMISOR M�S R�PIDO.
                                       
            - TCP ES UN PROTOCOLO FIABLE:
              VA A GARANTIZAR LA LLEGADA DE LOS PAQUETES AL RECEPTOR.
                                       
            - AL CONTAR CON TODAS ESTAS CARACTER�STICAS, EL PROTOCOLO TCP NO ES SENCILLO DE IMPLEMENTAR,
              YA QUE TIENE QUE CUBRIR MUCHOS ASPECTOS EN EL TRANSPORTE DE LA INFORMACI�N.
                                       
            EJEMPLOS QUE USAN TCP SON:  HTTP, FTP, TELNET, ETC... 
                                       
            - DATAGRAMA: FRAGMENTO DE INFORMACI�N - NO HAY N�MERO DE ORDEN.     - LO USA EL PROTOCOLO UDP.
            - PAQUETE:   FRAGMENTO DE INFORMACI�N - INCLUYE UN N�MERO DE ORDEN. - LO USA EL PROTOCOLO TCP.
                                       
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
              UDP ES UN PROTOCOLO NO ORIENTADO A LA CONEXI�N, PORQUE NO INCLUYE NING�N MECANISMO PARA LA SINCRONIZACI�N EN EL
              ENV�O DE MENSAJES ENTRE EMISOR Y RECEPTOR.
                                       
            - FUNCIONAMIENTO:
                    1. DIVIDIR EL MENSAJE QUE SE QUIERE ENVIAR EN DATAGRAMAS, ENVI�NDOLOS POR EL CANAL DE COMUNICACI�N,
                       SIN INCLUIR NINGUNA MEDIDA DE CONTROL NI DE LLEGADA, NI DE FLUJO.
                    2. EN UDP NO HAY UNA NUMERACI�N DE CADA DATAGRAMA.
                    3. AL NO HABER NUMERACI�N, NO SE PUEDE UNIR LOS DATAGRAMAS Y RECONSTRUIR EL MENSAJE ORIGINAL.
                       AL NO HABER NINGUNA MEDIDA DE CONTROL, EN PRINCIPO SE DESCONOCE SI EL MENSAJE HA LLEGADO O NO.
                                       
            - ESTE PROTOCOLO NO ES FIABLE: NO GARANTIZA LA LLEGADA DE TODOS Y CADA UNO
              DE LOS DATAGRAMAS ENVIADOS POR EL EMISOR DEL MENSAJE AL RECEPTOR.
                                       
            - NO REALIZA NING�N TIPO DE CONTROL DE FLUJO EN LAS COMUNICACIONES.
                                       
            - AL NO REALIZAR NING�N CONTROL DE FLUJO NI DE ERRORES,
              EL PROTOCOLO UDP ES MUCHO M�S R�PIDO QUE TCP EN LA TRANSMISI�N,
              Y TAMBI�N MUCHO MENOS COMPLEJO DE IMPLEMENTAR.
                                       
            - SE USA EN APLICACIONES EN QUE ES M�S IMPORTANTE LA VELOCIDAD DE ENTREGA DEL MENSAJE, QUE LA LLEGADA Y ORDEN.
              POR EJEMPLO EN APLICACIONES EN TIEMPO REAL, STREAMING, O TRANSMISI�N DE VOZ.
              NO SE INTERRUMPE LA TRANSMISI�N AL PERDER ALG�N DATAGRAMA, CON TCP LAS TRANSMISIONES SE PARAR�AN AL PERDER
              ALG�N PAQUETE, NO RECOBRANDO LA TRANSMISI�N HASTA QUE LLEGASE, HACIENDO LA COMUNICACI�N A SALTOS.
                                       
            PROTOCOLOS QUE NO NECESITAN ASIGNACI�N DE CONTROL DE SECUENCIA NI DE FLUJO:
                                       
                    - BOOTP  --> BOOT STRAP PROTOCOL  --> PROTOCOLO DE ARRANQUE.
                            ES UN PROTOCOLO DE RED UDP UTILIZADO POR LOS CLIENTES DE RED 
                            PARA OBTENER SU DIRECCI�N IP AUTOM�TICAMENTE.
                                      
                    - DHCP   --> DYNAMIC HOST CONFIGURATION --> PROTOCOLO DE CONFIGURACI�N DIN�MICA DE HOST.
                            ES EL PROTOCOLO CLIENTE/SERVIDOR QUE PROPORCIONA AUTOM�TICAMENTE UN HOST DE PROTOCOLO DE INTERNET IP
                            CON SUS DIRECCI�N IP Y OTRA CONFIGURACI�N RELACIONADA, M�SCARA DE SUBRED, PUERTA DE ENLACE.
                            ES QUIEN ASIGNA LAS DIRECCIONES IP EN  UNA RED.
                            FU� DESARROLLADO COMO EXTENSI�N DE BOOTP.
                                       
                    - DNS    --> DOMAIN NAME SYSTEM --> SISTEMA DE NOMBRES DE DOMINIO.
                            ES UN SISTEMA DE NOMENCLATURA FER�RQUICO DESCENTRALIZADO PARA DISPOSITIVOS CONECTADOS A REDES IP
                            COMO INTERNET O UNA RED PRIVADA. ES QUIEN TRADUCE LOS NOMBRES EN DIRECCIONES IP.
                                       
            TENER EN CUENTA QUE EL HECHO DE QUE EL PROTOCOLO UDP EN LA CAPA DE TRANSPORTE NO INCLUYA MECANISMOS DE CONTROL DE
            LLEGADA, NO QUIERE DECIR QUE OTROS COMPONENTES A OTRO NIVEL, POR EJEMPLO DE APLICACI�N, SI LO HAGAN.
                                       
            - DATAGRAMA: FRAGMENTO DE INFORMACI�N - NO HAY N�MERO DE ORDEN.     - LO USA EL PROTOCOLO UDP.
            - PAQUETE:   FRAGMENTO DE INFORMACI�N - INCLUYE UN N�MERO DE ORDEN. - LO USA EL PROTOCOLO TCP.
                                      
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
        *  MODELO DE CONEXI�N              *   ORIENTADO A LA CONEXI�N - UNO A UNO   *NO ORIENTADO A LA CONEXI�N - UNO A MUCHOS*
        ************************************************************************************************************************
        *  TRANSFERENCIA DE DATOS          *              ORDENADA                   *               DESORDENADA               *
        ************************************************************************************************************************
        *  FIABILIDAD                      *               FIABLE                    *                 NO FIABLE               *
        ************************************************************************************************************************
        *  CONTROL DE FLUJO                *         CONTROL DE SATURACI�N           *                SIN CONTROL              *
        ************************************************************************************************************************
        *  SOBRECARGA (VER NOTA)           *          INTENSIVA EN RECURSOS          *                  LIGERA                 *
        ************************************************************************************************************************
        *  COMPLEJIDAD                     *            M�S ALTA QUE UDP             *             M�S BAJA QUE TCP            *
        ************************************************************************************************************************
        *  VELOCIDAD                       *            M�S BAJA QUE UDP             *             M�S ALTA QUE TCP            *
        ************************************************************************************************************************

            - LA SOBRECARGA (OVERHEAD) SE REFIERE A SI, ADEM�S DE LA INFORMACI�N QUE SE DESEA TRANSMITIR,
              SE A�ADEN ELEMENTOS ADICIONALES PROPIOS DEL PROTOCOLO, POR EJEMPLO PARA EL N�MERO DE ORDEN,
              CONTROL DE LA LLEGADA O N�MERO DE PAQUETE, CONTROL DE FLUJO, ETC...

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
                                       
            - PARA LOGRAR QUE LA INFORMACI�N VAYA DE UN EXTREMO A OTRO DE LA COMUNICACI�N,
              DEBEMOS UTILIZAR LA CAPA DE RED Y POR EJEMPLO UTILIZANDO EL PROTOCOLO TCP O EL UDP,
              ENVIAR ESOS PAQUETES O DATAGRAMAS A LA DIRECCI�N IP DEL DESTINATARIO.
                                       
            - SIN EMBARGO, CON ESTO NO ES SUFICIENTE, YA QUE TENDREMOS QUE INDICAR DE UNA MANERA M�S ESPEC�FICA
              A D�NDE EN CONCRETO, POR EJEMPLO, A QU� APLICACI�N DE TODAS LOS QUE PUEDA HABER EN ESA DIRECCI�N IP,
              VAN DIRIGIDOS DICHOS PAQUETES.
              PARA ESTO, PODEMOS DEFINIR UNA SERIE DE DIRECCIONES DE TRANSPORTE EN LAS QUE LOS PROCESOS DE NUESTRAS
              APLICACIONES PUEDAN ESTAR DE FORMA CONSTANTE A LA ESCUCHA, POR SI LLEGA ALG�N PAQUETE O DATAGRAMA.
              ESTO ES LO QUE CONOCEMOS COMO PUERTOS.
                                       
            - LA GRAN MAYOR�A DE LOS PUERTOS SE VA A ASIGNAR DE FORMA ALEATORIA, SIN NING�N TIPO DE ORDEN,
              SIMPLEMENTE SE ASIGNAR� EL PRIMERO QUE SE ENCUENTRE LIBRE.
                                       
            - SIN EMBARGO, HAY CIERTAS APLICACIONES QUE S� TIENEN UN PUERTO YA ASIGNADO PARA SU FUNCIONAMIENTO,
              LOS CUALES NO PODR�N SER USADOS EN LAS ASIGNACIONES ALEATORIAS O EN ASIGNACIONES MANUALES QUE HAGAMOS NOSOTROS,
              YA QUE ESO LLEVAR�A A DIVERSOS ERRORES EN LA TRANSMISI�N DE LA INFORMACI�N A TRAV�S DE LA RED.
                                       
            - LA AUTORIDAD DE ASIGNACI�N DE N�MEROS DE INTERNET (IANA: INTERNET ASSIGNED NUMBERS AUTHORITY),
              ES QUIEN SE ENCARGA DE ASIGNAR LOS PUERTOS PREDEFINIDOS A LAS APLICACIONES QUE AS� LO NECESITEN.
              LA IANA TIENE DEFINIDOS LOS SIGUIENTES RANGOS DE PUERTOS:
                                       
                    - PUERTOS CONOCIDOS:       0 <--> 1023
                            EST�N RESERVADOS PARA APLICACIONES EST�NDAR.
                            PUERTO 21 --> PROTOCOLO FTP
                            PUERTO 80 --> PROTOCOLO HTTP
                                                 
                    - PUERTOS REGISTRADOS:  1024 <--> 49151
                            EST�N ASIGNADOS PARA SERVICIOS O APLICACIONES ESPEC�FICAS.
                            ESTE SER� EL RANGO DE PUERTOS QUE DEBEMOS UTILIZAR PARA DESARROLLAR NUESTRAS APLICACIONES.
                            PUETO 8080 --> TOMCAT DE SPRINGBOOT.
                                                  
                    - PUERTOS DIN�MICOS:   49152 <--> 65535
                            NO REGISTRADOS PARA NING�N SERVICIO, (PUERTOS PRIVADOS)
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
                                       
                    netstat -?                 --> INFORMACI�N DEL COMANDO netstat. MUESTRA ESTAD�STICAS DE LA RED.

                    netstat -a                 --> NOS MUESTRA TODOS LOS PUERTOS QUE SE EST�N ESCUCHANDO EN TU ORDENADOR.

                    netstat -ao                --> NOS MUESTRA ADEM�S LA DIRECCI�N IP Y EL N�MERO DE PROCESO.

                    netstat -ao | find "3306"  --> NOS MUESTRA LOS HILOS Y QUI�N EST� ESCUCNDO ESTE PUERTO.

                    ipconfig                   --> NOS MUESTRA NUESTRA DIRECCI�N IP EN LA RED LOCAL.
                                       
                    nslookup -?                --> INFORMACI�N DEL COMANDO nslookup. MUESTRA IP REMOTAS.

                    nslookup www.google.com    --> NOS MUESTRA LA DIRECCI�N IP DE ESE SERVIDOR.
                                       
            - USAREMOS EL PROGRAMA WIRESHARK:
                                       
                    - NOS MUESTRA EL TR�FICO EN LA RED. LO PONDREMOS A CAPTURAR EL TR�FICO IP.
                                       
                    - EN UN NAVEGADOR:
                            - CONECTAREMOS A LA P�GINA WEB http://www.techpanda.org
                                    - USUARIO: admin@google.com
                                    - CLAVE:   Password2010
                                       
                    - EN WIRESHARK: 
                            - PULSAR STOP: CUADRADO ROJO.                  
                            - EN LA VENTANA DE ESPECIFICACI�N DEL FILTRO DE VISUALIZACI�N PONER --> http
                            - EN EL VISUALIZADOR DE PAQUETES, BUSCAR EL MENSAJE --> HTTP POST.
                            - PODR�S VER LA CLAVE ENVIADA EN ESA P�GINA WEB.

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
                    - ESTA CLASE NOS VA A PERMITIR ENCONTRAR UN NOMBRE DE DOMINIO A PARTIR DE SI DIRECCI�N IP, Y VICEVERSA.
                      LOS OBJETOS DE ESTA CLASE TENDR�N DOS ELEMENTOS:
                            - NOMBRE DEL EQUIPO.
                            - DIRECCI�N IP.
                                       
            - Socket:
                    - ESTA CLASE REALIZA O IMPLEMENTA LA COMUNICACI�N BIDIRECCIONAL ENTRE UN
                      PROGRAMA CLIENTE Y OTRO PROGRAMA SERVIDOR.
                      VA A PERMITIR TANTO EL ENV�O COMO LA RECEPCI�N DE MENSAJES.
                      SI USAMOS OBJETOS DE ESTA CLASE, NUESTROS PROGRAMAS JAVA PODR�N COMUNICARSE A TRAV�S DE LA RED
                      DE FORMA INDEPENDIENTE DE LA PLATAFORMA.
                            - ESTA CLASE SE UTILIZAR� PARA CLIENTES TCP.
                                       
            - ServerSoket:
                    - NOS AYUDAR� A IMPLEMENTAR UN SOCKET QUE PUEDE SER UTILIZADO POR LOS SERVIDORES PARA ESCUCHAR
                      Y ACEPTAR PETICIONES DE CONEXI�N DE CLIENTES.
                            - ESTA CLASE SE UTILIZAR� PARA SERVIDORES TCP Y UDP.
                                       
            - DatagramSocket:
                    - CON ELLA PODREMOS IMPLEMENTAR CLIENTES QUE USEN DATAGRAMAS, SIENDO NO FIABLES Y NO ORDENABLES.
                      ESTA CLASE OFRECE UNA COMUNICACI�N MUY R�PIDA,
                      YA QUE NO HAY QUE ESTABLECER LA CONEXI�N ENTRE CLIENTE Y SERVIDOR.
                            - ESTA CLASE SE UTILIZAR� CLIENTES UDP.                            
                                       
            - DatagramPacket:
                    - REPRESENTAR� UN DATAGRAMA, Y CONTIENE TODA LA INFORMACI�N NECESARIA POR EL MISMO:
                            - LONGITUD DEL PAQUETE.
                            - DIRECCIONES IP.
                            - N�MERO DE PUERO.
                                       
            - MulticastSocket:
                    - UTILIZADA PARA CREAR UNA VERSI�N 'MULTICAST' DE LA CLASE DatagramSocket.
                    - MEDIANTE ESTA CLASE PODREMOS ENVIAR MENSAJES A M�LTIPLES CLIENTES O SERVIDORES.

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
        *  ServerSoket         * CREACI�N              *  
        *                      * DE SERVIDORES             E N   C O N S T R U C C I � N

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
                System.out.print("Seleccione una opci�n: ");
                menu = teclaStr.nextLine();
                switch (menu) {
                   
                    case "0" -> {}
                    default -> {
                            meterEspacios(25);
                            System.out.println("\n  ��� LA OPCI�N NO ES CORRECTA !!!");
                            meterEspacios(15);
                            esperar(1500);
                            }
                }
            }  catch (Exception e) {
                System.out.println("Error: " + e.toString());
                System.out.println("MENSAJE " + e.getMessage());
                System.out.println("La Excepci�n es: " + e.getClass());
            }
        } while (!"0".equals(menu));   
    }
}