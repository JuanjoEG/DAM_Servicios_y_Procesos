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
             *   EJEMPLO DE CLIENTE HTTP SENCILLO:
             *   LA SALIDA QUE SE OBTIENE ES EL 'CÓDIGO FUENTE' DE LA PÁGINA.
             *
             * @author Juan José Estévez González
             */
            public class ClienteHTTP {

                public static void main(String[] args) {

                    try {

                        // SE ABRE LA CONEXIÓN
                        URL url = new URL("http://www.google.es");
                        URLConnection conexion = url.openConnection();
                        conexion.connect();

                        // LECTURA
                        InputStream is = conexion.getInputStream();
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));

                        // ARRAY DE 1000 CARACTERES PARA GUARDAR EL CÓDIGO FUENTE DE LA PÁGINA WEB.
                        char[] buffer = new char[1000];
                        int leido;

                        // MOSTRAMOS POR PANTALLA
                        while ((leido = br.read(buffer))>0) {            
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
                case "16" -> {
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