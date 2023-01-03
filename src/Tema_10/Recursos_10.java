package Tema_10;

import static Principal_Main.Main.esperar;
import static Principal_Main.Main.meterEspacios;
import static Tema_10.T_10.*;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class Recursos_10 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_10 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        ************************************************************************************************************************

            LOS SOCKETS SON UN MECANISMO DE COMUNICACIÓN ENTRE APLICACIONES,
            UTILIZADO EN REDES DE COMUNICACIÓN.
                         
            SON CADA UNO DE LOS 'LADOS' DE UNA CONEXIÓN BIDIRECCIONAL ENTRE DOS PROGRAMAS QUE SE ESTÁN EJECUTANDO EN RED.
                         
                - REPRESENTAN LOS EXTREMOS DEL CANAL DE COMUNICACIÓN QUE NECESITAMOS.
                         
                - SE IDENTIFICAN MEDIANTE:
                        - UNA DIRECCIÓN IP.
                        - UN PUERTO EN EL QUE TRANSMITIRÁN.
                         
            EXISTEN SOCKETS EN LOS DIFERENTES LENGUAJES DE PROGRAMACIÓN (JAVA, C++, PYTHON)
            Y ADEMÁS CON NOMBRES MUY PARECIDOS.
                         
                                            T I P O S   D E   S O K E T S:
                *********************************************************************************************************
                *                     *           SOCKETS TCP                  *           SOCKETS UDP                  *
                *                     *       ORIENTADOS A CONEXIÓN            *      NO ORIENTADOS A CONEXIÓN          *
                *********************************************************************************************************
                *********************************************************************************************************
                *                     * ESTABLECER UNA COMUNICACIÓN EN RED     * ESTABLECER UNA COMUNICACIÓN EN RED     * 
                *    UTILIZACIÓN      * UTILIZANDO EL PROTOCOLO TCP.           * UTILIZANDO EL PROTOCOLO UDP.           *
                *                     * ESTA CONEXIÓN NO COMENZARÁ HASTA QUE   *                                        *
                *                     * LOS DOS SOCKETS ESTÉN CONECTADOS       *                                        *
                *********************************************************************************************************
                *                     *                                        *                                        *
                * FORMA DE TRANSMITIR *                BYTES                   *              DATAGRAMAS                *
                *   LA INFORMACIÓN    *             (EN PAQUETES)              *          (INFO DE BAJO NIVEL)          *
                *                     *                                        *                                        *
                *********************************************************************************************************
                *                     * SEGÚN EL 'LADO' DE LA CONEXIÓN:        * PARA LAS APLICACIONES QUE UTILIZAN     *
                *     CLASES JAVA     *   - SOCKET(CLIENTE):                   * SOCKETS UDP PODEMOS UTILIZAR LAS       *
                *                     *     TRANSMISIÓN Y RECEPCIÓN DE DATOS.  * CLASES EN JAVA DatagramSocket.         *
                *                     *   - SERVERSOCKET(SERVIDOR):            *                                        *
                *                     *     SU ÚNICA TAREA SERÁ ESPERAR A QUE  * LOS SOCKETS UDP SON MUCHO MÁS RÁPIDOS  *
                *                     *     UN CLIENTE DESEE ESTABLECER UNA    * QUE LOS TCP, AUNQUE MENOS SEGUROS.     *
                *                     *     CONEXIÓN CON EL SERVIDOR.          *                                        *
                *********************************************************************************************************
                         
        TCP TIENE QUE CONECTAR, SI LA RED ESTÁ CONGESTIONADA TENDRÁ QUE ESPERAR Y ENVÍA TODO DE FORMA ORDENADA.
        UDP NO CONECTA, NO LE IMPORTA SI LA RED ESTÁ CONGESTIONADA Y NO SE PREOCUPA DEL ORDEN.
        PARA VER LOS SOCKETS LEVANTADOS DE TU MÁQUINA, EN EL CMD -->  netstat -a
                                       
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
                         
            PARA CREAR APLICACIONES QUE USEN SOCKETS EN JAVA,
            TENEMOS QUE:
                1. CREAR O ABRIR LOS SOCKETS, TANTO EN EL CLIENTE COMO EN EL SERVIDOR.
                2. CREAR LOS FLUJOS DE ENTRADA O SALIDA TANTO EN EL CLIENTE COMO EN EL SERVIDOR.
                3. CERRAR LOS FLUJOS Y LOS SOCKETS.
                         
            PARA CAPTURAR LOS POSIBLES ERRORES EN LAS TRANSMISIONES EN LA RED DE INFORMACIÓN,
            GESTIONAREMOS LAS EXCEPCIONES MEDIANTE EL BLOQUE   --->   try-catch.
                         
            PARA PROGRAMARLO EN JAVA, HABITUALMENTE SE HARÁ EN UNA CLASE QUE HARÁ DE SERVIDOR;
            EN DICHA CLASE:
                         
                1. CREAREMOS UN CONSTRUCTOR CON TODA LA FUNCIONALIDAD QUE DESEEMOS.
                         
                2. CREAREMOS UN MÉTODO main EN EL QUE IMPLEMENTAREMOS NUESTRO SERVIDOR.
                         
                3. PARA IMPLEMENTAR EL SERVIDOR, CREAREMOS UN OBJETO DE LA CLASE   --->   ServerSocket
                         
                   - ESPECIFICANDO EN QUÉ NÚMERO DE PUERTO ESTARÁ ESCUCHANDO EL SERVIDOR.
                         
                4. PARA QUE EL SERVIDOR SE QUEDE A LA ESPERA DE CONEXIONES,
                   PODREMOS CREAR UN BUCLE INFINITO PARA ATENDER A TODOS LOS CLIENTES QUE SE CONECTEN AL SERVIDOR.
                         
                        - LA CONEXIÓN (OBTENCIÓN) DE LOS CLIENTES SE HARÁ MEDIANTE EL MÉTODO   --->   accept()
                          QUE DEVOLVERÁ EL CLIENTE CONECTADO.
                         
                5. CREAR LOS FLUJOS DE ENTRADA Y DE SALIDA PARA PODER LLEVAR A CABO LA COMUNICACIÓN, MEDIANTE LOS MÉTODOS
                         
                        - DE ENTRADA   --->   readUTF()
                        - DE SALIDA    --->   writeUTF()
                         
                6. POR ÚLTIMO, DEBEREMOS DE CERRAR EL SOCKET.
                        
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

            import java.io.DataOutputStream;
            import java.io.IOException;
            import java.io.OutputStream;
            import java.net.ServerSocket;
            import java.net.Socket;
                         
            public class ServidorTCP {

                private static final int PUERTO = 6000;
                private static final int MAX_CLIENTES = 3;

                public ServidorTCP() {
                    try {
                                                                                    // Creo el socket servidor que escucha
                                                                                    // en el puerto 6000
                        ServerSocket skServidor = new ServerSocket(PUERTO);
                        System.out.println("Escucho el puerto " + PUERTO);
                                                                                    // Escucho a un cierto número de clientes
                        for (int numCli = 0; numCli < MAX_CLIENTES; numCli++) {
                                                                                    // Escucho a un cliente
                            Socket skCliente = skServidor.accept();
                                                                                    // Cuando escucha un cliente da un aviso
                            System.out.println("Sirvo al cliente " + numCli);
                                                                                    // Obtiene el flujo de salida del cliente
                                                                                    // (Mensajes que envía al cliente)
                            OutputStream aux = skCliente.getOutputStream();
                            DataOutputStream flujo = new DataOutputStream(aux);
                                                                                    // Manda un mensaje al cliente
                            flujo.writeUTF("Hola cliente " + numCli);
                                                                                    // Cierro el socket servidor
                            skCliente.close();
                        }
                        System.out.println("Demasiados clientes por hoy.");
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                }

                                                                                    // Método main del servidor
                public static void main(String[] args) {
                                                                                    // Creo un servidor
                    new ServidorTCP();
                }
            }
                         
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_04 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_04 + """
        ************************************************************************************************************************
                       
            PARA CREAR APLICACIONES QUE USEN SOCKETS EN JAVA, EN EL LADO CLIENTE,
            TENEMOS QUE:
                1. CREAR UN SOCKET Y CONECTAR CON EL SERVIDOR MEDIANTE SU IP Y PUERTO.
                2. CREAR LOS FLUJOS DE ENTRADA O SALIDA.
                3. UNA VEZ TERMINADA LA COMUNICACIÓN, CERRAR LOS FLUJOS Y LOS SOCKETS.

            PARA CAPTURAR LOS POSIBLES ERRORES EN LAS TRANSMISIONES EN LA RED DE INFORMACIÓN,
            GESTIONAREMOS LAS EXCEPCIONES MEDIANTE EL BLOQUE   --->   try-catch.
                         
            A LA HORA DE PROGRAMARLO,
            HABITUALMENTE SE CREARÁ UNA CLASE QUE ACTUARÁ COMO CLIENTE QUE SE CONECTARÁ AL SERVIDOR;
            EN DICHA CLASE:
                                                  
                1. CREAREMOS UN CONSTRUCTOR CON TODA LA FUNCIONALIDAD QUE DESEEMOS.

                2. CREAREMOS UN MÉTODO main EN EL QUE IMPLEMENTAREMOS NUESTRO CLIENTE.

                3. PARA IMPLEMENTAR EL CLIENTE, CREAREMOS UN OBJETO DE LA CLASE   --->   Socket
                         
                   - CON LA DIRECCIÓN HOST EN LA QUE SE ALOJA EL SERVIDOR, (localhost --> SI ES LA MISMA MÁQUINA)
                   - Y ESPECIFICANDO EN QUÉ NÚMERO DE PUERTO ESTARÁ ESCUCHANDO EL SERVIDOR.

                4. CUANDO EL SERVIDOR ACEPTE AL CLIENTE:
                         
                    -  CREAR LOS FLUJOS DE ENTRADA Y DE SALIDA PARA PODER LLEVAR A CABO LA COMUNICACIÓN,
                       MEDIANTE LOS MÉTODOS:

                            - DE ENTRADA   --->   readUTF()
                            - DE SALIDA    --->   writeUTF()

                5. POR ÚLTIMO, DEBEREMOS DE CERRAR EL SOCKET.
                         
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
                       
            import java.io.DataInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.net.Socket;

            public class ClienteTCP {

                private static final String HOST = "localhost";
                private static final int PUERTO = 6000;

                public ClienteTCP() {
                    try {
                                                                                    // Creo el socket cliente que escucha en la
                                                                                    // máquina localhost y en el puerto 6000
                        Socket skCliente = new Socket(HOST, PUERTO);
                                                                                    // Obtengo el flujo de entrada del cliente creado
                                                                                    // (Mensajes que recibe el cliente del servidor)
                        InputStream aux = skCliente.getInputStream();
                        DataInputStream flujo = new DataInputStream(aux);
                                                                                    // Saco por pantalla el mensaje recibido del servidor
                        System.out.print("Mensaje recibido del servidor: ");
                        System.out.println(flujo.readUTF());
                                                                                    // Cierro el socket
                        skCliente.close();
                    } catch (IOException ex) {
                        System.out.println("Error en el cliente: " + ex.toString());
                    }
                }

                                                                                    // Método main del cliente
                public static void main(String[] args) {
                                                                                    // Creo un cliente
                    new ClienteTCP();
                }
            }
                         
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
                       
            1.- EJECUTAMOS EL SERVIDOR TCP. (TENDRÁ LIMITADO EL SERVICIO A 3 CLIENTES).
                MENSAJE SERVIDOR  -->  Escucho el puerto 5903
                         
            2.- EJECUTO EL CLIENTE TCP.
                MENSAJE CLIENTE   -->  Mensaje recibido del servidor: Hola cliente 0
                MENSAJE SERVIDOR  -->  Escucho el puerto 5903
                                       Sirvo al cliente 0
                         
            3.- ABRIMOS EL PROGRAMA   The Wireshark Network Analyzer.
                EN EL CASO DE TRABAJAR EN LOCAL,
                SELECCIONAMOS QUE BUSQUE EL TRÁFICO INTERNO   Adapter for loopback traffic capture.
                
            4.- EJECUTO EL CLIENTE OTRA VEZ.
                MENSAJE CLIENTE   -->  Mensaje recibido del servidor: Hola cliente 1
                MENSAJE SERVIDOR  -->  Escucho el puerto 5903
                                       Sirvo al cliente 0
                                       Sirvo al cliente 1
                         
            5.- EN EL Wireshark PONEMOS:   --->   tcp.port==5903
               
                    - VEREMOS 9 PAQUETES CREADOS PARA ESA COMUNICACIÓN.
                      DE TIPOS: 2 DE SYN, 4 DE ACK, 1 DE PSH Y 2 DE FIN.
                         
                    - SI PINCHAMOS SOBRE EL PAQUETE PSH,
                      PODREMOS VER EL MENSAJE   --->   Hola cliente 1
                         
                    - SI PINCHAMOS CON EL BOTÓN DERECHO SOBRE EL PAQUETE PSH,
                      SEGUIR -> SECUENCIA TCP -> SE ABRE UNA VENTANA
                      PODREMOS VER EL MENSAJE   --->   ..Hola cliente 1
                         
                    - YA PODEMOS PARAR EL Wireshark, CON EL STOP,
                      Y DESPUÉS CERRARLO.
                         
            6.- FINALMENTE EJECUTO EL CLIENTE OTRA VEZ.
                MENSAJE CLIENTE   -->  Mensaje recibido del servidor: Hola cliente 2
                MENSAJE SERVIDOR  -->  Escucho el puerto 5903
                                       Sirvo al cliente 0
                                       Sirvo al cliente 1
                                       Sirvo al cliente 2
                                       Demasiados clientes por hoy.
                         
            AL ATENDER AL ÚLTIMO CLIENTE EL SERVIDOR TERMINARÁ SU EJECUCIÓN.
                         
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
                
            LOS SOCKETS UDP SON MÁS SENCILLOS DE IMPLEMENTAR QUE LOS TCP,
            POR LAS CARACTERÍSTICAS DEL PROTOCOLO UDP, QUE NO ES UN PROTOCOLO ORIENTADO A CONEXIÓN.
                         
                    - SIMPLEMENTE DEBEREMOS CREAR EL SOCKET Y ENVIAR O RECIBIR MENSAJES.
                         
            PARA ENVIAR O RECIBIR DATOS A TRAVÉS DE UNA CONEXIÓN UDP, UTILIZAREMOS:
                         
                    LA CLASE DatagramPacket:
                        PARA REPRESENTAR LOS DATAGRAMAS CON LOS QUE ENVIAMOS O RECIBIMOS 'PAQUETES' --> DATAGRAMAS.

                        UN DATAGRAMA ES UN ARRAY DE BYTES,
                        ENVIADO --> A UN PUERTO UDP CONCRETO --> DE UNA DIRECCIÓN IP.

                        UN DATAGRAMA TIENE LA SIGUIENTE FORMA:  -->  | ARRAY DE BYTES | LONGITUD | IP DESTINO | PUERTO DESTINO |

                    LA CLASE DatagramPacket TIENE LOS MÉTODOS:

                        - getData()    -->  DEVUELVE EL ARRAY DE BYTES QUE CONTIENE LOS DATOS.
                        - getLenght()  -->  DEVUELVE LA LONGITUD DEL MENSAJE A ENVIAR O RECIBIR.
                        - getPort()    -->  DEVUELVE EL PUERTO DE ENVÍO/RECEPCIÓN DEL PAQUETE.
                        - getAddress() -->  DEVUELVE LA DIRECCIÓN DEL HOST REMOTO DE ENVÍO/RECEPCIÓN.
                         
            CREAMOS LOS SOCKET UDP CON LA CLASE DatagramSocket CON LOS MÉTODOS:
                         
                        - send(datagrama)     -->  PERMITE ENVIAR DATAGRAMAS.
                        - receive(datagrama)  -->  RECIBE DATAGRAMAS.
                        - close()             -->  CIERRA EL SOCKET.
                        - getLocalPort()      -->  DEVUELVE EL PUERTO DONDE ESTÁ CONECTADO EL SOCKET.
                        - getPort()           -->  DEVUELVE EL PUERTO DONDE PROCEDE EL SOCKET.                         
                         
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
                       
            UTILIZAMOS SOCKETS UDP, NO ES NECESARIO REALIZAR NINGÚN TIPO DE CONEXIÓN;
            ESTO 'COMPLICA' UN POCO LA DIFERENCIACIÓN ENTRE QUIÉN ES EL CLIENTE Y QUIÉN ES EL SERVIDOR:
                         
                - CONSIDERAMOS SERVIDOR UDP AL QUE --> ESPERA UN MENSAJE Y LO RESPONDE.
                - CONSIDERAMOS CLIENTE  UDP AL QUE --> INICIA LA COMUNICACIÓN.
                         
            PARA CAPTURAR LOS POSIBLES ERRORES EN LAS TRANSMISIONES EN LA RED DE INFORMACIÓN,
            GESTIONAREMOS LAS EXCEPCIONES MEDIANTE EL BLOQUE   --->   try-catch.
                         
            PARA PROGRAMARLO EN JAVA, HABITUALMENTE SE HARÁ EN UNA CLASE QUE HARÁ DE SERVIDOR UDP;
            EN DICHA CLASE:

                1. CREAREMOS UN CONSTRUCTOR CON TODA LA FUNCIONALIDAD QUE DESEEMOS.

                2. CREAREMOS UN MÉTODO main EN EL QUE IMPLEMENTAREMOS NUESTRO SERVIDOR.

                3. PARA IMPLEMENTAR EL SERVIDOR,
                   PARA PODER CREAR EL SOCKET Y LOS MENSAJES DATAGRAMAS,
                         
                            - HAY QUE ESPECIFICAR EL PUERTO DONDE ESCUCHARÁ EL SERVIDOR.
                            - HAY QUE CREAR UN ARRAY DEL TIPO BYTE PARA LOS DATOS.
                          
                            UTILIZAREMOS LAS CLASES:   --->   DatagramSocket
                                                       --->   DatagramPacket
                         
                4. HABRÁ QUE PROGRAMAR QUE EL SERVIDOR ESPERE LA RECEPCIÓN DE UN MENSAJE,
                                                  
                            UTILIZAREMOS EL MÉTODO:    --->   receive
                      
                    PODRÁ RESPONDER AL MENSAJE CON EL MÉTODO:   --->   send
                         
            NO ES NECESARIO CERRAR LA CONEXIÓN, YA QUE NO EXCISTE.
                         
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
                         
            import java.io.IOException;
            import java.net.DatagramPacket;
            import java.net.DatagramSocket;

            public class ServidorUDP {

                private static final int PUERTO = 6789;

                public ServidorUDP() {
                    try {
                        DatagramSocket socketUDP = new DatagramSocket(PUERTO);
                        byte[] bufer = new byte[1000];
                        System.out.println("Escucho el puerto " + PUERTO);
                                                                                        // Creo un bucle infinito para atender a todos los clientes que se conecten sin límite
                        while (true) {
                                                                                        // Construimos el DatagramPacket para recibir peticiones
                            DatagramPacket peticion = new DatagramPacket(bufer,
                                    bufer.length);
                                                                                        // Leemos una petición del DatagramSocket
                            socketUDP.receive(peticion);
                                                                                        // Otengo el mensaje del cliente
                            String mensajerecibido = new String(peticion.getData());
                            System.out.print("Datagrama recibido del host: "
                                    + peticion.getAddress());
                            System.out.print(" desde el puerto remoto: "
                                    + peticion.getPort());
                            System.out.println(" con el mensaje: "
                                    + mensajerecibido);
                                                                                        // Construimos el DatagramPacket para enviar la respuesta
                            String mensajerespuesta = "Hola cliente "
                                    + mensajerecibido;
                            DatagramPacket respuesta
                                    = new DatagramPacket(mensajerespuesta.getBytes(),
                                            mensajerespuesta.length(),
                                            peticion.getAddress(), peticion.getPort());
                                                                                        // Enviamos la respuesta, que es un eco
                            socketUDP.send(respuesta);
                        }
                    } catch (IOException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
                                                                                        // Método main del servidor
                public static void main(String[] args) {
                                                                                        // Creo un servidor
                    new ServidorUDP();
                }
            }
                         
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
                       
            HEMOS CONCRETADO QUE ... CONSIDERAMOS CLIENTE  UDP AL QUE --> INICIA LA COMUNICACIÓN.
                         
            PARA CAPTURAR LOS POSIBLES ERRORES EN LAS TRANSMISIONES EN LA RED DE INFORMACIÓN,
            GESTIONAREMOS LAS EXCEPCIONES MEDIANTE EL BLOQUE   --->   try-catch.
                         
            A LA HORA DE PROGRAMARLO,
            HABITUALMENTE SE CREARÁ UNA CLASE QUE ACTUARÁ COMO CLIENTE EN LA APLICACIÓN;
            EN DICHA CLASE:

                1. CREAREMOS UN CONSTRUCTOR CON TODA LA FUNCIONALIDAD QUE DESEEMOS.

                2. CREAREMOS UN MÉTODO main EN EL QUE IMPLEMENTAREMOS NUESTRO CLIENTE UDP.
                         
                3. PARA IMPLEMENTAR EL CLIENTE UDP,
                    PARA PODER CREAR EL SOCKET Y LOS MENSAJES DATAGRAMAS,

                            - HAY QUE ESPECIFICAR EL PUERTO DONDE ESTÁ ESCUCHANDO EL SERVIDOR.
                            - HAY QUE ESPECIFICAR LA DIRECCIÓN HOST DONDE ESTÁ EL SERVIDOR.  (localhost --> SI ES LA MISMA MÁQUINA)
                            - HAY QUE CREAR UN ARRAY DEL TIPO BYTE PARA LOS DATOS.

                            UTILIZAREMOS LAS CLASES:   --->   DatagramSocket
                                                       --->   DatagramPacket

                4. DEBEREMOS ENVIAR UN MENSAJE AL SERVIDOR,

                            UTILIZAREMOS EL MÉTODO:    --->   send 

                    PODRÁ RECIBIR UN MENSAJE CON EL MÉTODO:   --->   receive

            NO ES NECESARIO CERRAR LA CONEXIÓN, YA QUE NO EXCISTE.
                         
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

            import java.io.IOException;
            import java.net.DatagramPacket;
            import java.net.DatagramSocket;
            import java.net.InetAddress;
            import java.util.Random;

            public class ClienteUDP {

                private static final int PUERTO = 6789;
                private static final String HOST = "localhost";
                private Random aleatorio;

                public ClienteUDP() {
                    try {
                                                                                        // Creo el mensaje a enviar al servidor con un número aleatorio
                        aleatorio = new Random();
                        int numerocliente = aleatorio.nextInt(100) + 1;
                        String mensajeenviar = String.valueOf(numerocliente);
                                                                                        // Creo el socket UDP
                        DatagramSocket socketUDP = new DatagramSocket();
                        byte[] mensaje = mensajeenviar.getBytes();
                                                                                        // Obtengo la dirección del host
                        InetAddress hostServidor = InetAddress.getByName(HOST);
                                                                                        // Construimos un datagrama para enviar el mensaje al servidor
                        DatagramPacket peticion
                                = new DatagramPacket(mensaje, mensajeenviar.length(),
                                        hostServidor,
                                        PUERTO);
                                                                                        // Enviamos el datagrama
                        socketUDP.send(peticion);
                                                                                        // Construimos el DatagramPacket que contendrá la respuesta
                        byte[] bufer = new byte[1000];
                        DatagramPacket respuesta = new DatagramPacket(bufer,
                                bufer.length);
                        socketUDP.receive(respuesta);
                                                                                        // Enviamos la respuesta del servidor a la salida estandar
                        System.out.println("Respuesta: " + new String(respuesta.getData()));
                                                                                        // Cerramos el socket
                        socketUDP.close();
                    } catch (IOException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
                                                                                        // Método main del cliente
                public static void main(String[] args) {
                                                                                        // Creo un cliente
                    new ClienteUDP();
                }
            }

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
                         
            1.- EJECUTAMOS EL SERVIDOR UDP. (NO TENDRÁ LIMITADO EL SERVICIO DE CLIENTES).
                MENSAJE SERVIDOR  -->  Escucho el puerto 6789

            2.- EJECUTO EL CLIENTE UDP.
                MENSAJE CLIENTE   -->  Respuesta: Hola cliente 48
                MENSAJE SERVIDOR  -->  Escucho el puerto 6789
                                       Datagrama recibido del host: /127.0.0.1 desde el puerto remoto: 58560 con el mensaje: 48

            3.- ABRIMOS EL PROGRAMA   The Wireshark Network Analyzer.
                EN EL CASO DE TRABAJAR EN LOCAL,
                SELECCIONAMOS QUE BUSQUE EL TRÁFICO INTERNO   Adapter for loopback traffic capture.

            4.- EJECUTO EL CLIENTE OTRA VEZ.
                MENSAJE CLIENTE   -->  Respuesta: Hola cliente 97
                MENSAJE SERVIDOR  -->  Escucho el puerto 6789
                                       Datagrama recibido del host: /127.0.0.1 desde el puerto remoto: 58560 con el mensaje: 48
                                       Datagrama recibido del host: /127.0.0.1 desde el puerto remoto: 58859 con el mensaje: 97

            5.- EN EL Wireshark PONEMOS:   --->   udp.port==6789

                    - VEREMOS 2 PAQUETES CREADOS PARA ESA COMUNICACIÓN.
                      DE TIPO UDP LOS DOS.

                    - SI PINCHAMOS CON EL BOTÓN DERECHO SOBRE UN PAQUETE UDP,
                      SEGUIR -> SECUENCIA UDP -> SE ABRE UNA VENTANA
                      PODREMOS VER EL MENSAJE   --->   97Hola cliente
                                                       97....(LONGITUD DE 1000)....

                    - YA PODEMOS PARAR EL Wireshark, CON EL STOP,
                      Y DESPUÉS CERRARLO.

            6.- FINALMENTE PARA DETENER EL SERVIDOR UDP,
                EN ESTE CASO CON BUCLE INFINITO,
                TENGO QUE DETENERLO PARANDO LA EJECUCIÓN DE FORMA FORZADA.
                         
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