package Tema_12;

import static Principal_Main.Main.*;
import static Tema_12.T_12.*;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Recursos_12 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_12 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        **********************************************************************************************************************************
        
            UN SERVICIO WEB, O WEB SERVICE, ES UN 'PROGRAMA' QUE PROPORCIONA UNA FORMA DE COMUNICACI�N ENTRE APLICACIONES SOFTWARE
            QUE SE EST�N EJECUTANDO EN DISTINTAS PLATAFORMAS.
                         
            LO FORMAN COMPONENTES DE APLICACIONES DISTRIBUIDAS,
            ESTOS COMPONENTES:
                         
                    - DEBEN ESTAR DISPONIBLES DE FORMA EXTERNA.
                         
                    - SON ACCESIBLES MEDIANTE UNA SERIE DE PROTOCOLOS WEB EST�NDAR.
                            - SOAP (SIMPLE OBJECT ACCESS PROTOCOL).
                         
                    - EST�N DESARROLLADOS EN LENGUAJE DE PROGRAMACI�N INDEPENDIENTES
                      DE LA PLATAFORMA EN LA QUE SE EJECUTEN PARA EL INTERCAMBIO DE MENSAJES.
                            - EL LENGUAJE DE PROGRAMACI�N DE LA PLATAFORMA
                              NO TIENE PORQU� SER EL MISMO QUE EL DE LOS SERVICIOS WEB.
                         
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
        
            - ACCESO WEB:
                    - SE DEBE PODER ACCEDER A ELLOS A TRAV�S DE LA WEB:
                      UTILIZAN EL PROTOCOLO HTTP Y EL LENGUAJE XML.
                         
            - COMUNICACI�N ENTRE SERVICIO WEB Y CLIENTE:
                    - EL USO DE XML COMO FORMATO DE INTERCAMBIO DE DATOS,
                      PERMITE LA COMUNICACI�N ENTRE AMBOS.
                         
            - FUNCIONES:
                    - LOS SERVICIOS WEB REALIZAN UNA SERIE DE FUNCIONES BIEN DEFINIDAS.
                    - DEBEN DE CONTENER UNA DESCRIPCI�N DE ELLOS MISMOS,
                      PARA QUE UNA APLICACI�N CONOZCA F�CILMENTE CU�L ES LA FUNCI�N DEL SERVICIO WEB.
                         
            - LOCALIZACI�N:
                    - LOS SERVICIOS WEB HAN DE PODER LOCALIZARSE, ES DECIR,
                      DEBE EXISTIR ALG�N MECANISMO QUE PERMITA ENCONTRAR UN SERVICIO WEB
                      QUE REALICE UNA DETERMINADA FUNCI�N.
                         
            - INDEPENDENCIA:
                    - LOS SERVICIOS WEB SON COMPONENTES INDEPENDIENTES QUE SE PUEDEN INTEGRAR,
                      FORMANDO SISTEMAS DISTRIBUIDOS COMPLEJOS.
                         
            - INTEROPERATIBILIDAD:
                    - LOS SERVICIOS WEB OFRECEN INTEROPERABILIDAD.
                      EL HECHO DE USAR HTTP Y XML HACE QUE SEA POSIBLE
                      QUE DISTINTAS APLICACIONES PUEDAN UTILIZAR LOS SERVIDORES WEB. 
                         
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
        
            INFORMACI�N DE SERVICIO WEB: --> https://es.wikipedia.org/wiki/Servicio_web
                         
            LA ARQUITECTURA DE LOS SERVICIOS WEB SOAP - SIMPLE OBJECT ACCESS PROTOCOL - PROTOCOLO DE ACCESO SIMPLE DE OBJETOS.
            TIENE VARIOS COMPONENTES PRINCIPALES:
                         
                    - SOAP (SIMPLE OBJECT ACCESS PROTOCOL):
                            PROTOCOLOS SOBRE LOS QUE SE ESTABLECE EL INTERCAMBIO.
                         
                    - UDDI (UNIVERSAL DESCRIPTION, DISCOVEY AND INTEGRATION):
                            PROTOCOLO PARA PUBLICAR LA INFORMACI�N DE LOS SERVICIOS WEB.
                            PERMITE COMPROBAR QU� SERVICIOS WEB EST�N DISPONIBLES.
                         
                    - WSDL (WEB SERVICES DESCRIPTION LANGUAGE):
                            ES EL LENGUAJE DE LA INTERFAZ P�BLICA PARA LOS SERVICIOS WEB.
                            ES UNA DESCRIPCI�N BASADA EN XML DE LOS REQUISITOS FUNCIONALES
                            NECESARIOS PARA ESTABLECER UNA COMUNICACI�N CON LOS SERVICIOS WEB.
                         
                    - DERVICE PROVIDER:   -->  PROVEEDOR DE SERVICIOS WEB.
                         
                    - SERVICE BROKER:     -->  PUBLICADOR DE SERVICIOS.
                         
                    - SERVICE REQUESTER:  -->  SOLICITANTE DE SERVICIOS WEB.

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

            EL FLUJO ES EL SIGUIENTE:

                    1.- EL SERVICIO WEB SE INICIA:
                                EL PUBLICADOR DEL SERVICIO 'SERVICE BROKER'
                                ES EL QUE VA A ATENDER PRIMERO A LOS SOLICITANTES DE LOS SERVICIOS WEB 'SERVICE REQUESTER'.
                                PARA ELLO NECESITA INFORMACI�N DEL PROVEEDOR DEL SERVICIOS WEB 'SERVICE PROVIDER'.

                                EL PROVEEDOR DE SERVICIOS WEB 'SERVICE PROVIDER'
                                ENV�A AL PUBLICADOR DEL SERVICIO WEB 'SERVICE BROKER'
                                UN FICHERO 'WSDL' CON LA DEFINICI�N DEL SERVICIO WEB,
                                ES UNA DESCRIPCI�N DE TODOS LOS SERVICIOS WEB
                                DISPONIBLES POR EL PROVEEDOR DE SERVICIOS WEB 'SERVICE PROVIDER'.

                    2.- SE REALIZA UNA PETICI�N:
                                EL QUE PIDE EL SERVICIO WEB 'SERVICE REQUESTER' ES EL QUE HACE UNA PETICI�N DE SERVICIO,
                                CONTACTA CON EL PUBLICADOR DEL SERVICIO WEB 'SERVICE BROKER'
                                Y DESCUBRE QUI�N ES EL PROVEEDOR DEL SERVICIO WEB 'SERVICE PROVIDER' --> PROTOCOLO 'WSDL'
                                Y OBTIENE INFORMACI�N SOBRE EL SERVICIO WEB --> FICHERO 'WSDL'
                                �C�MO FUNCIONA? �QU� SERVICIOS OFRECE? �QU� DATOS LE TENGO QUE PASAR? ...
                                Y CONTACTA CON EL PROVEEDOR DEL SERVICIO WEB 'SERVICE PROVIDER' --> PROTOCOLO 'SOAP'.                        

                    3.- ESTABLECEN LA COMUNICACI�N                    
                                YA PUEDE EL SOLICITANTE DE SERVICIOS WEB 'SERVICE REQUESTER'
                                COMUNICARSE CON EL PROVEEDOR DE SERVICIOS WEB 'SERVICE PROVIDER'
                                UTILIZANDO EL PROTOCOLO 'SOAP'.

                                EL PROVEEDOR DEL SERVICIO WEB 'SERVICE PROVIDER' VALIDA LA PETICI�N DE SERVICIO
                                Y ENV�A EL DATO ESTRUCTURADO EN FORMATO 'XML'
                                AL SOLICITANTE DE SERVICIOS WEB 'SERVICE REQUESTER'
                                UTILIZANDO EL PROTOCOLO 'SOAP'.
                                EL FICHERO 'XML' ES VALIDADO DE NUEVO
                                POR EL SOLICITANTE DE SERVICIOS WEB 'SERVICE REQUESTER'
                                UTILIZANDO UN FICHERO 'XSD'.

            EL 'SERVICE BROKER' CON EL 'UDDI' HACE DE INTERMEDIARIO
            AL PASRLE EL 'WSDL' CON LA INFORMACI�N DE LOS SERVICIOS
            DESDE EL 'SERVICE PROVIDER' HASTA EL 'SERVICE REQUESTER'.
            UNA VEZ QUE EL 'SERVICE PROVIDER' DISPONE DE ESA INFORMACI�N
            SE ESTABLECE EL INTERCAMBIO DE SERVICIOS ENTRE EL EL 'SERVICE REQUESTER'
            Y EL 'SERVICE PROVIDER' USANDO EL PROTOCOLO 'SOAP'.

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
        
            LAS ORGANIZACIONES QUE DEFINEN LOS EST�NDARES QUE HAN DE SEGUIR LOS SERVICIOS WEB SON:
                         
                * W3C:
                        https://www.w3.org/standards/
                        EL CONSORCIO PARA LA WORLD WIDE WEB ...
                        FUNDADA EN OCTUBRE DE 1994 CON EL OBJETIVO DE LLEVAR INTERNET A SU M�XIMO POTENCIAL.
                        DESARROLLARON PROTOCOLOS DE USO COM�N QUE HAN MARCADO LA EVOLUCI�N
                        Y HAN ASEGURADO LA INTEROPERABILIDAD DE INTERNET.
                        ALGUNOS DE ESTOS PROTOCOLOS SON: HTML, HTTP, XML, SOAP, WS, ETC.
                           
                * OASIS:
                        https://www.oasis-open.org/
                        ORGANIZATION FOR THE ADVANCEMENT OF STRUCTURED INFORMATION STANDARDS.
                        ORGANIZACI�N PARA EL AVANCE DE EST�NDARES DE INFORMACI�N ESTRUCTURADA.
                        CONSORCIO SIN FINES DE LUCRO PARA IMPULSO DEL DESARROLLO, CONVERGENCIA
                        Y ADOPCI�N DE EST�NDARES ABIERTOS EN LA SOCIEDAD DE LA INFORMACI�N GLOBAL.
                        PROMUEVE EL CONSENSO DE LA INDUSTRIA Y HA PRODUCIDO NORMAS INTERNACIONALES PARA:
                                - ARQUITECTURA ORIENTADA A SERVICIOS (SOA, SERVICE ORIENTED ARCHITECTURE).
                                - FUNCIONES Y CALIDAD DE SERVICIOS WEB.
                                - SEGURIDAD DE LA WEB.
                                - CLOUD COMPUTING.
                                - PUBLICACI�N ELECTR�NICA DE DOCUMENTOS.
                                - ETC.
                        - BENEFICIOS DE LOS EST�NDARES OASIS ABIERTOS:
                                - REDUCIR COSTES.
                                - FOMENTAR LA INNOVACI�N.
                                - PROTEGER EL DERECHO DE LIBRE ELECCI�N DE LA TECNOLOG�A.
                                - ETC.
                         
                * JCP:
                        https://jcp.org/
                        JAVA COMMUNITY PROCESS.
                        ESTA ORGANIZACI�N TRABAJA CON CADA VERSI�N DE JAVA,
                        INCLUYENDO UN CONJUNTO DE ESPECIFICACIONES DE DIFERENTES TECNOLOG�AS,
                        DEFINIDAS POR ESTE MISMO ORGANISMO, Y QUE SON NOMBRADAS COMO JSR,
                        JAVA SPECIFICATION REQUEST, PETICI�N DE ESPECIFICACI�N DE JAVA,
                        SEGUIDAS DE UN N�MERO. ALGUNOS EJEMPLOS:
                                - JSR 370: DEFINE LA API JAX-RS 2.1.
                                - JSR 224: DEFINE LA API JAX-WS 2.0 PARA SERVICIOS WEB BASADOS EN XML.
                                - JSR 342: DEFINE LAS ESPECIFICACIONES PARA JAVA EE 7.
                                - JSR 366: DEFINE LAS ESPECIFICACIONES PARA JAVA EE 8.
                         
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
        
            OTRO ESTANDAR QUE SE USA EN LOS SERVICIOS WED ES REST:
                         
            REST:   REPRESENTATIONAL STATE TRANSFER.
                    ES UNA ALTERNATIVA M�S SIMPLE QUE SOAP.
                    REST ES USADA POR GRANDES PROVEEDORES WEB 2.0:
                            - YAHOO.
                            - GOOGLE.
                            - AMAZON.
                            - FACEBOOK.
                            - ETC.
                    USADA EN APLICACIONES M�VILES POR SUS VENTAJAS:
                            - MEJORA LOS TIEMPOS DE RESPUESTA.
                            - REDUCCI�N DE SOBRECARGA TANTO EN CLIENTES COMO EN SERVIDORES.
                            - MAYOR ESTABILIDAD FRENTE A FUTUROS CAMBIOS.
                            - MAYOR SENCILLEZ EN EL DESARROLLO DE CLIENTES,
                              QUE SOLO TIENEN QUE SER CAPACES DE REALIZAR INTERACCIONES HTTP Y CODIFICAR INFORMACI�N EN XML.
                    ESTE ESTILO DE ARQUITECTURA DE SERVICIOS WEB REST, HACIENDO USO DE ESE PROTOCOLO HTTP,
                    PROPORCIONA UNA API QUE UTILIZA CADA UNO DE SUS M�TODOS (GET, POST, PUT, DELETE, ETC).
                         
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
        
            LA ARQUITECTURA SOA ES UNA TECNOLOG�A QUE NOS PERMITE EL DISE�O DE APLICACIONES BASADAS EN PETICIONES A UN SERVICIO.
            DE ESTA FORMA PODEMOS CREAR PEQUE�OS ELEMENTOS SOFTWWARE:
                    - REUTILIZABLES.
                    - INDEPENDIENTES DEL LENGUAJE CON EL QUE FUERON CREADOS.
                         
            ESTO HA SERVIDO PARA DAR LUGAR A UN NUEVO TIPO DE PROGRAMACI�N,
            LA LLAMADA SaaS: SOFTWARE AS SERVICE - FOFTWARE COMO SERVICIO.
                         
                    - LAS APLICACIONES SaaS NO SE DISE�AN PARA SER INSTALADAS EN EL ORDENADOR DEL CLIENTE.
                      COMO OCURRE EN LA PROGRAMACI�N DE APLICACIONES CL�SICA.
                         
                    - LAS APLICACIONES SaaS SE INSTALAN EN UN SERVIDOR AL QUE LOS CLIENTES REALIZAN UNA SERIE DE PETICIONES.
                         
            DE ESTE MODO TENEMOS UN SERVICIO QUE EST� DISPONIBLE DESDE CUALQUIER PUNTO CON ACCESO A INTERNET.
                         
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
                       
            LOS SERVICIOS WEB SON EL PUNTO FUERTE DE LAS APLICACIONES SOA,
            DEBIDO A QUE LA TECNOLOG�A SOA TRABAJA CON UN CONJUNTO DE CARACTER�STICAS
            QUE HACEN POSIBLE QUE SE EJECUTEN LOS SERVICIOS WEB A LA PERFECCI�N.
                         
            EXISTEM DOS TIPOS DE ARQUITECTURAS SOA ORIENTADAS A OBJETOS:
                         
                    * SOA TRADICIONAL:
                            ARQUITECTURA ORIENTADA A SERVICIOS TRADICIONALES.
                            UTILIZA LOS PRINCIPIOS Y LAS TECNOLOG�AS B�SICAS DE LOS SERVICIOS WEB,
                            PUDIENDO UTILIZAR:
                                    - SOAP COMO LENGUAJE DE INTERCAMBIO DE DATOS.
                                    - WSDL COMO LENGUAJE PARA LA DESCRIPCI�N DE LOS SERVICIOS UTILIZADOS.
                                    - UDDI PARA LA PUBLICACI�N DE LOS SERVICIOS.
                            ESTAS ARQUITECTURAS SON MUY UTILIZADAS, PERO NO INCLUYEN ALGUNAS
                            CARACTER�STICAS B�SICAS COMO:
                                    - SEGURIDAD.
                                    - TRANSACCIONALIDAD.
                                        TODO LO QUE TIENE QUE VER CON ALMACENAR INFORMACI�N
                                        PARA QUE SEA PERSISTENTE ENTRE DIFERENTES CONEXIONES.
                                    - GARANT�A DE ENTREGA.
                                    - DIRECCIONAMIENTO.
                                    - ETC.
                         
                    * SOA DE SEGUNDA GENERACI�N:
                            ARQUITECTURA ORIENTADA A SERVICIOS DE SEGUNDA GENERACI�N.
                            UN SERVIDOR SOA DE SEGUNDA GENERACI�N CONSIGUE AMPLIAR
                            LA FUNCIONALIDAD DE LOS ANTERIORES.
                            PARA ELLO, SE A�ADEN NUEVAS CARACTER�STICAS QUE BUSCAN MEJORAR LA
                            CALIDAD DEL SERVICIO SEG�N LOS EST�NDARES WS --> SERVICIOS WEB,
                            APROBADOS POR OASIS.
                            ALGUNAS DE ESTAS CARACTER�STICAS QUE SE MEJORAN SON:
                                    - POL�TICA DE SEGURIDAD
                                    - TRANSACCI�N.
                                    - GESTI�N.
                                    - ETC.
                         
            EN LA ACTUALIDAD, SE RECIBEN ACTUALIZACIONES FRECUENTES EN LAS CARACTER�STICAS DE LOS SERVICIOS SOA,
            ESTO ES DEBIDO A QUE CONSTANTEMENTE EST�N SALIENDO A LUZ:
                    - NUEVAS FORMAS DE REALIZAR TRANSACCIONES DE DATOS.
                    - NUEVOS FALLOS DE SEGURIDAD.
                    - ETC.
                         
            LOS SERVICIOS SOA, SEG�N LA FUENTE, NOS LOS PODEMOS ENCONTRAR TAMBI�N COMO SOAP -> SIMPLE OBJET ACCESS PROTOCOL.
                         
            NO DEBEMOS CONFUNDIR SOA CON SOAP:
                    - SOA - SERVICES ORIENTED ARCHITECTURE. ES EL MODELO DE LA ARQUITECTURA.
                    - SOAP - SIMPLE OBJECT ACCESS PROTOCOL. ES UNA FORMA DE COMUNICACI�N, UN PROTOCOLO, QUE SE PERMITE EN SOA.                    
                         
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
        
            SON APLICACIONES CON DISTINTOS COMPONENTES QUE SE EJECUTAN EN ENTORNOS SEPARADOS,
            NORMALMENTE EN DIFERENTES PLATAFORMAS CONECTADAS A TRAV�S DE UNA RED.
                         
            LAS APLICACIONES DISTRIBUIDAS PUEDEN TENER DISTINTO N�MERO DE NIVELES:
                         
                    - DOS NIVELES:
                            * CLIENTE.
                            * SERVIDOR.
                         
                    - TRES NIVELES:
                            * CLIENTE.
                            * MIDDLEWARE (O SOFTWARE DE CONECTIVIDAD).
                            * SERVIDOR.
                         
                    - MULTINIVEL: CUATRO O M�S:
                            * CLIENTE.
                            * WEB O DE PRESENTACI�N.
                            * EMPRESARIAL O DE NEGOCIO.
                            * DE ACCESO A DATOS.
                         
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
        
            CON JAVA SE PUEDEN CREAR P�GINAS WEB,
            AUNQUE SER�A M�S CORRECTO INDICAR QUE SON SERVICIOS WEB,
            NO P�GINAS WEB EN S�.
                         
                    REQUISITOS:

                            * UN SERVIDOR WEB:
                                    - EN EL QUE SE 'ALOJA' EL SERVICIO WEB.
                                            SI EL SERVICIO WEB NO SE ALOJA EN EL SERVIDOR WEB...
                                                - EL SERVIDOR WEB DEBE SER ACCESIBLE POR SERVICIO WEB.
                                                  ES DECIR, EL SERVIDOR WEB DEBE PODER LLEGAR AL C�DIGO/EJECUCI�N
                                                  DEL SERVICIO WEB PUBLICADO.
                                    EJEMPLO: TOMCAT, GLASSFISH, ETC.

                            * EL C�DIGO DEL SERVICIO WEB:
                                    EL C�DIGO DEBE SER PUBLICADO Y LEVANTADO EN EL SERVIDOR.

                            * EL CLIENTE:
                                    QUE EN ESTE CASO ACTIVAR�, INVOCAR� AL SERVICIO WEB, MEDIANTE UNA P�GINA WEB JSP.
                         
            JSP: JAVA SERVER PAGES.
                ES UNA TECNOLOG�A BASADA EN JAVA DEL LADO DEL SERVIDOR QUE IMPLICA EL PROCESAMIENTO Y LA COMPILACI�N DE P�GINAS .jsp
                EN C�DIGO DE BYTES DE JAVA POR UN MOTOR DEL LADO DEL SERVIDOR Y SERVIRLAS COMO APPLETS DE JAVA, PARA SER EJECUTADAS
                POR UNA 'M�QUINA VIRTUAL' DE JAVA DEL LADO DEL CLIENTE. NO SE DEBE CONFUNDIR CON JAVASCRIPT.
                         
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
                case "11" -> {
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