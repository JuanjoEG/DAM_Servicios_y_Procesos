package Tema_12;

import static Principal_Main.Main.*;
import static Tema_12.T_12.*;

/**
 *
 * @author Juan José Estévez González
 */

public class Recursos_12 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_12 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        **********************************************************************************************************************************
        
            UN SERVICIO WEB, O WEB SERVICE, ES UN 'PROGRAMA' QUE PROPORCIONA UNA FORMA DE COMUNICACIÓN ENTRE APLICACIONES SOFTWARE
            QUE SE ESTÁN EJECUTANDO EN DISTINTAS PLATAFORMAS.
                         
            LO FORMAN COMPONENTES DE APLICACIONES DISTRIBUIDAS,
            ESTOS COMPONENTES:
                         
                    - DEBEN ESTAR DISPONIBLES DE FORMA EXTERNA.
                         
                    - SON ACCESIBLES MEDIANTE UNA SERIE DE PROTOCOLOS WEB ESTÁNDAR.
                            - SOAP (SIMPLE OBJECT ACCESS PROTOCOL).
                         
                    - ESTÁN DESARROLLADOS EN LENGUAJE DE PROGRAMACIÓN INDEPENDIENTES
                      DE LA PLATAFORMA EN LA QUE SE EJECUTEN PARA EL INTERCAMBIO DE MENSAJES.
                            - EL LENGUAJE DE PROGRAMACIÓN DE LA PLATAFORMA
                              NO TIENE PORQUÉ SER EL MISMO QUE EL DE LOS SERVICIOS WEB.
                         
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
                    - SE DEBE PODER ACCEDER A ELLOS A TRAVÉS DE LA WEB:
                      UTILIZAN EL PROTOCOLO HTTP Y EL LENGUAJE XML.
                         
            - COMUNICACIÓN ENTRE SERVICIO WEB Y CLIENTE:
                    - EL USO DE XML COMO FORMATO DE INTERCAMBIO DE DATOS,
                      PERMITE LA COMUNICACIÓN ENTRE AMBOS.
                         
            - FUNCIONES:
                    - LOS SERVICIOS WEB REALIZAN UNA SERIE DE FUNCIONES BIEN DEFINIDAS.
                    - DEBEN DE CONTENER UNA DESCRIPCIÓN DE ELLOS MISMOS,
                      PARA QUE UNA APLICACIÓN CONOZCA FÁCILMENTE CUÁL ES LA FUNCIÓN DEL SERVICIO WEB.
                         
            - LOCALIZACIÓN:
                    - LOS SERVICIOS WEB HAN DE PODER LOCALIZARSE, ES DECIR,
                      DEBE EXISTIR ALGÚN MECANISMO QUE PERMITA ENCONTRAR UN SERVICIO WEB
                      QUE REALICE UNA DETERMINADA FUNCIÓN.
                         
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
        
            INFORMACIÓN DE SERVICIO WEB: --> https://es.wikipedia.org/wiki/Servicio_web
                         
            LA ARQUITECTURA DE LOS SERVICIOS WEB SOAP - SIMPLE OBJECT ACCESS PROTOCOL - PROTOCOLO DE ACCESO SIMPLE DE OBJETOS.
            TIENE VARIOS COMPONENTES PRINCIPALES:
                         
                    - SOAP (SIMPLE OBJECT ACCESS PROTOCOL):
                            PROTOCOLOS SOBRE LOS QUE SE ESTABLECE EL INTERCAMBIO.
                         
                    - UDDI (UNIVERSAL DESCRIPTION, DISCOVEY AND INTEGRATION):
                            PROTOCOLO PARA PUBLICAR LA INFORMACIÓN DE LOS SERVICIOS WEB.
                            PERMITE COMPROBAR QUÉ SERVICIOS WEB ESTÁN DISPONIBLES.
                         
                    - WSDL (WEB SERVICES DESCRIPTION LANGUAGE):
                            ES EL LENGUAJE DE LA INTERFAZ PÚBLICA PARA LOS SERVICIOS WEB.
                            ES UNA DESCRIPCIÓN BASADA EN XML DE LOS REQUISITOS FUNCIONALES
                            NECESARIOS PARA ESTABLECER UNA COMUNICACIÓN CON LOS SERVICIOS WEB.
                         
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
                                PARA ELLO NECESITA INFORMACIÓN DEL PROVEEDOR DEL SERVICIOS WEB 'SERVICE PROVIDER'.

                                EL PROVEEDOR DE SERVICIOS WEB 'SERVICE PROVIDER'
                                ENVÍA AL PUBLICADOR DEL SERVICIO WEB 'SERVICE BROKER'
                                UN FICHERO 'WSDL' CON LA DEFINICIÓN DEL SERVICIO WEB,
                                ES UNA DESCRIPCIÓN DE TODOS LOS SERVICIOS WEB
                                DISPONIBLES POR EL PROVEEDOR DE SERVICIOS WEB 'SERVICE PROVIDER'.

                    2.- SE REALIZA UNA PETICIÓN:
                                EL QUE PIDE EL SERVICIO WEB 'SERVICE REQUESTER' ES EL QUE HACE UNA PETICIÓN DE SERVICIO,
                                CONTACTA CON EL PUBLICADOR DEL SERVICIO WEB 'SERVICE BROKER'
                                Y DESCUBRE QUIÉN ES EL PROVEEDOR DEL SERVICIO WEB 'SERVICE PROVIDER' --> PROTOCOLO 'WSDL'
                                Y OBTIENE INFORMACIÓN SOBRE EL SERVICIO WEB --> FICHERO 'WSDL'
                                ¿CÓMO FUNCIONA? ¿QUÉ SERVICIOS OFRECE? ¿QUÉ DATOS LE TENGO QUE PASAR? ...
                                Y CONTACTA CON EL PROVEEDOR DEL SERVICIO WEB 'SERVICE PROVIDER' --> PROTOCOLO 'SOAP'.                        

                    3.- ESTABLECEN LA COMUNICACIÓN                    
                                YA PUEDE EL SOLICITANTE DE SERVICIOS WEB 'SERVICE REQUESTER'
                                COMUNICARSE CON EL PROVEEDOR DE SERVICIOS WEB 'SERVICE PROVIDER'
                                UTILIZANDO EL PROTOCOLO 'SOAP'.

                                EL PROVEEDOR DEL SERVICIO WEB 'SERVICE PROVIDER' VALIDA LA PETICIÓN DE SERVICIO
                                Y ENVÍA EL DATO ESTRUCTURADO EN FORMATO 'XML'
                                AL SOLICITANTE DE SERVICIOS WEB 'SERVICE REQUESTER'
                                UTILIZANDO EL PROTOCOLO 'SOAP'.
                                EL FICHERO 'XML' ES VALIDADO DE NUEVO
                                POR EL SOLICITANTE DE SERVICIOS WEB 'SERVICE REQUESTER'
                                UTILIZANDO UN FICHERO 'XSD'.

            EL 'SERVICE BROKER' CON EL 'UDDI' HACE DE INTERMEDIARIO
            AL PASRLE EL 'WSDL' CON LA INFORMACIÓN DE LOS SERVICIOS
            DESDE EL 'SERVICE PROVIDER' HASTA EL 'SERVICE REQUESTER'.
            UNA VEZ QUE EL 'SERVICE PROVIDER' DISPONE DE ESA INFORMACIÓN
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
        
            LAS ORGANIZACIONES QUE DEFINEN LOS ESTÁNDARES QUE HAN DE SEGUIR LOS SERVICIOS WEB SON:
                         
                * W3C:
                        https://www.w3.org/standards/
                        EL CONSORCIO PARA LA WORLD WIDE WEB ...
                        FUNDADA EN OCTUBRE DE 1994 CON EL OBJETIVO DE LLEVAR INTERNET A SU MÁXIMO POTENCIAL.
                        DESARROLLARON PROTOCOLOS DE USO COMÚN QUE HAN MARCADO LA EVOLUCIÓN
                        Y HAN ASEGURADO LA INTEROPERABILIDAD DE INTERNET.
                        ALGUNOS DE ESTOS PROTOCOLOS SON: HTML, HTTP, XML, SOAP, WS, ETC.
                           
                * OASIS:
                        https://www.oasis-open.org/
                        ORGANIZATION FOR THE ADVANCEMENT OF STRUCTURED INFORMATION STANDARDS.
                        ORGANIZACIÓN PARA EL AVANCE DE ESTÁNDARES DE INFORMACIÓN ESTRUCTURADA.
                        CONSORCIO SIN FINES DE LUCRO PARA IMPULSO DEL DESARROLLO, CONVERGENCIA
                        Y ADOPCIÓN DE ESTÁNDARES ABIERTOS EN LA SOCIEDAD DE LA INFORMACIÓN GLOBAL.
                        PROMUEVE EL CONSENSO DE LA INDUSTRIA Y HA PRODUCIDO NORMAS INTERNACIONALES PARA:
                                - ARQUITECTURA ORIENTADA A SERVICIOS (SOA, SERVICE ORIENTED ARCHITECTURE).
                                - FUNCIONES Y CALIDAD DE SERVICIOS WEB.
                                - SEGURIDAD DE LA WEB.
                                - CLOUD COMPUTING.
                                - PUBLICACIÓN ELECTRÓNICA DE DOCUMENTOS.
                                - ETC.
                        - BENEFICIOS DE LOS ESTÁNDARES OASIS ABIERTOS:
                                - REDUCIR COSTES.
                                - FOMENTAR LA INNOVACIÓN.
                                - PROTEGER EL DERECHO DE LIBRE ELECCIÓN DE LA TECNOLOGÍA.
                                - ETC.
                         
                * JCP:
                        https://jcp.org/
                        JAVA COMMUNITY PROCESS.
                        ESTA ORGANIZACIÓN TRABAJA CON CADA VERSIÓN DE JAVA,
                        INCLUYENDO UN CONJUNTO DE ESPECIFICACIONES DE DIFERENTES TECNOLOGÍAS,
                        DEFINIDAS POR ESTE MISMO ORGANISMO, Y QUE SON NOMBRADAS COMO JSR,
                        JAVA SPECIFICATION REQUEST, PETICIÓN DE ESPECIFICACIÓN DE JAVA,
                        SEGUIDAS DE UN NÚMERO. ALGUNOS EJEMPLOS:
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
                    ES UNA ALTERNATIVA MÁS SIMPLE QUE SOAP.
                    REST ES USADA POR GRANDES PROVEEDORES WEB 2.0:
                            - YAHOO.
                            - GOOGLE.
                            - AMAZON.
                            - FACEBOOK.
                            - ETC.
                    USADA EN APLICACIONES MÓVILES POR SUS VENTAJAS:
                            - MEJORA LOS TIEMPOS DE RESPUESTA.
                            - REDUCCIÓN DE SOBRECARGA TANTO EN CLIENTES COMO EN SERVIDORES.
                            - MAYOR ESTABILIDAD FRENTE A FUTUROS CAMBIOS.
                            - MAYOR SENCILLEZ EN EL DESARROLLO DE CLIENTES,
                              QUE SOLO TIENEN QUE SER CAPACES DE REALIZAR INTERACCIONES HTTP Y CODIFICAR INFORMACIÓN EN XML.
                    ESTE ESTILO DE ARQUITECTURA DE SERVICIOS WEB REST, HACIENDO USO DE ESE PROTOCOLO HTTP,
                    PROPORCIONA UNA API QUE UTILIZA CADA UNO DE SUS MÉTODOS (GET, POST, PUT, DELETE, ETC).
                         
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
        
            LA ARQUITECTURA SOA ES UNA TECNOLOGÍA QUE NOS PERMITE EL DISEÑO DE APLICACIONES BASADAS EN PETICIONES A UN SERVICIO.
            DE ESTA FORMA PODEMOS CREAR PEQUEÑOS ELEMENTOS SOFTWWARE:
                    - REUTILIZABLES.
                    - INDEPENDIENTES DEL LENGUAJE CON EL QUE FUERON CREADOS.
                         
            ESTO HA SERVIDO PARA DAR LUGAR A UN NUEVO TIPO DE PROGRAMACIÓN,
            LA LLAMADA SaaS: SOFTWARE AS SERVICE - FOFTWARE COMO SERVICIO.
                         
                    - LAS APLICACIONES SaaS NO SE DISEÑAN PARA SER INSTALADAS EN EL ORDENADOR DEL CLIENTE.
                      COMO OCURRE EN LA PROGRAMACIÓN DE APLICACIONES CLÁSICA.
                         
                    - LAS APLICACIONES SaaS SE INSTALAN EN UN SERVIDOR AL QUE LOS CLIENTES REALIZAN UNA SERIE DE PETICIONES.
                         
            DE ESTE MODO TENEMOS UN SERVICIO QUE ESTÁ DISPONIBLE DESDE CUALQUIER PUNTO CON ACCESO A INTERNET.
                         
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
            DEBIDO A QUE LA TECNOLOGÍA SOA TRABAJA CON UN CONJUNTO DE CARACTERÍSTICAS
            QUE HACEN POSIBLE QUE SE EJECUTEN LOS SERVICIOS WEB A LA PERFECCIÓN.
                         
            EXISTEM DOS TIPOS DE ARQUITECTURAS SOA ORIENTADAS A OBJETOS:
                         
                    * SOA TRADICIONAL:
                            ARQUITECTURA ORIENTADA A SERVICIOS TRADICIONALES.
                            UTILIZA LOS PRINCIPIOS Y LAS TECNOLOGÍAS BÁSICAS DE LOS SERVICIOS WEB,
                            PUDIENDO UTILIZAR:
                                    - SOAP COMO LENGUAJE DE INTERCAMBIO DE DATOS.
                                    - WSDL COMO LENGUAJE PARA LA DESCRIPCIÓN DE LOS SERVICIOS UTILIZADOS.
                                    - UDDI PARA LA PUBLICACIÓN DE LOS SERVICIOS.
                            ESTAS ARQUITECTURAS SON MUY UTILIZADAS, PERO NO INCLUYEN ALGUNAS
                            CARACTERÍSTICAS BÁSICAS COMO:
                                    - SEGURIDAD.
                                    - TRANSACCIONALIDAD.
                                        TODO LO QUE TIENE QUE VER CON ALMACENAR INFORMACIÓN
                                        PARA QUE SEA PERSISTENTE ENTRE DIFERENTES CONEXIONES.
                                    - GARANTÍA DE ENTREGA.
                                    - DIRECCIONAMIENTO.
                                    - ETC.
                         
                    * SOA DE SEGUNDA GENERACIÓN:
                            ARQUITECTURA ORIENTADA A SERVICIOS DE SEGUNDA GENERACIÓN.
                            UN SERVIDOR SOA DE SEGUNDA GENERACIÓN CONSIGUE AMPLIAR
                            LA FUNCIONALIDAD DE LOS ANTERIORES.
                            PARA ELLO, SE AÑADEN NUEVAS CARACTERÍSTICAS QUE BUSCAN MEJORAR LA
                            CALIDAD DEL SERVICIO SEGÚN LOS ESTÁNDARES WS --> SERVICIOS WEB,
                            APROBADOS POR OASIS.
                            ALGUNAS DE ESTAS CARACTERÍSTICAS QUE SE MEJORAN SON:
                                    - POLÍTICA DE SEGURIDAD
                                    - TRANSACCIÓN.
                                    - GESTIÓN.
                                    - ETC.
                         
            EN LA ACTUALIDAD, SE RECIBEN ACTUALIZACIONES FRECUENTES EN LAS CARACTERÍSTICAS DE LOS SERVICIOS SOA,
            ESTO ES DEBIDO A QUE CONSTANTEMENTE ESTÁN SALIENDO A LUZ:
                    - NUEVAS FORMAS DE REALIZAR TRANSACCIONES DE DATOS.
                    - NUEVOS FALLOS DE SEGURIDAD.
                    - ETC.
                         
            LOS SERVICIOS SOA, SEGÚN LA FUENTE, NOS LOS PODEMOS ENCONTRAR TAMBIÉN COMO SOAP -> SIMPLE OBJET ACCESS PROTOCOL.
                         
            NO DEBEMOS CONFUNDIR SOA CON SOAP:
                    - SOA - SERVICES ORIENTED ARCHITECTURE. ES EL MODELO DE LA ARQUITECTURA.
                    - SOAP - SIMPLE OBJECT ACCESS PROTOCOL. ES UNA FORMA DE COMUNICACIÓN, UN PROTOCOLO, QUE SE PERMITE EN SOA.                    
                         
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
            NORMALMENTE EN DIFERENTES PLATAFORMAS CONECTADAS A TRAVÉS DE UNA RED.
                         
            LAS APLICACIONES DISTRIBUIDAS PUEDEN TENER DISTINTO NÚMERO DE NIVELES:
                         
                    - DOS NIVELES:
                            * CLIENTE.
                            * SERVIDOR.
                         
                    - TRES NIVELES:
                            * CLIENTE.
                            * MIDDLEWARE (O SOFTWARE DE CONECTIVIDAD).
                            * SERVIDOR.
                         
                    - MULTINIVEL: CUATRO O MÁS:
                            * CLIENTE.
                            * WEB O DE PRESENTACIÓN.
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
        
            CON JAVA SE PUEDEN CREAR PÁGINAS WEB,
            AUNQUE SERÍA MÁS CORRECTO INDICAR QUE SON SERVICIOS WEB,
            NO PÁGINAS WEB EN SÍ.
                         
                    REQUISITOS:

                            * UN SERVIDOR WEB:
                                    - EN EL QUE SE 'ALOJA' EL SERVICIO WEB.
                                            SI EL SERVICIO WEB NO SE ALOJA EN EL SERVIDOR WEB...
                                                - EL SERVIDOR WEB DEBE SER ACCESIBLE POR SERVICIO WEB.
                                                  ES DECIR, EL SERVIDOR WEB DEBE PODER LLEGAR AL CÓDIGO/EJECUCIÓN
                                                  DEL SERVICIO WEB PUBLICADO.
                                    EJEMPLO: TOMCAT, GLASSFISH, ETC.

                            * EL CÓDIGO DEL SERVICIO WEB:
                                    EL CÓDIGO DEBE SER PUBLICADO Y LEVANTADO EN EL SERVIDOR.

                            * EL CLIENTE:
                                    QUE EN ESTE CASO ACTIVARÁ, INVOCARÁ AL SERVICIO WEB, MEDIANTE UNA PÁGINA WEB JSP.
                         
            JSP: JAVA SERVER PAGES.
                ES UNA TECNOLOGÍA BASADA EN JAVA DEL LADO DEL SERVIDOR QUE IMPLICA EL PROCESAMIENTO Y LA COMPILACIÓN DE PÁGINAS .jsp
                EN CÓDIGO DE BYTES DE JAVA POR UN MOTOR DEL LADO DEL SERVIDOR Y SERVIRLAS COMO APPLETS DE JAVA, PARA SER EJECUTADAS
                POR UNA 'MÁQUINA VIRTUAL' DE JAVA DEL LADO DEL CLIENTE. NO SE DEBE CONFUNDIR CON JAVASCRIPT.
                         
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