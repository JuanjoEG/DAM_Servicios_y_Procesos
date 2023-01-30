package Tema_13;

import static Principal_Main.Main.*;
import static Tema_13.T_13.*;

/**
 *
 * @author Juan José Estévez González
 */

public class Recursos_13 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_13 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        **********************************************************************************************************************************
        
            PODEMOS DEFINIR SEGURIDAD COMO:
                    EL HECHO DE ESTAR LIBRE DE TODO DAÑO.
                         
            EN INFORMÁTICA, LA SEGURIDAD ES IMPOSIBLE DE CONSEGUIR,
            ES DECIR, NINGÚN PROGRAMA SOFTWARE VA A ESTAR AL 100% SEGURO ANTE AMENAZAS,
            YA QUE DÍA A DÍA SURGEN NUEVOS TIPOS DE RIESGOS QUE DESCONOCEMOS.
                         
            NO OBSTANTE, EN LOS SISTEMAS INFORMÁTICOS,
            SEAN CUAL SEAN SU COMPOSICIÓN:
                    - PROGRAMAS.
                    - APLICACIONES.
                    - WEBS.
                    - SISTEMAS OPERATIVOS.
                    - ETC.
                    PODEMOS DECIR QUE SON SEGUROS, O QUE SE PUEDEN ACERCAR A DISPONER DE LA MÁXIMA SEGURIDAD,
                    SIEMPRE Y CUANDO CUMPLAN LAS SIGUIENTES CARACTERÍSTICAS:
                         
                            - CONFIDENCIALIDAD:
                                    ESTA CARACTERÍSTICA VA A REQUERIR QUE 
                                    ÚNICAMENTE LAS PERSONAS AUTORIZADAS ACCEDAN AL SISTEMA.
                         
                            - INTEGRIDAD:
                                    REQUERIRÁ QUE ÚNICAMENTE LAS PERSONAS AUTORIZADAS
                                    PUEDAN MODIFICAR LA INFORMACIÓN EXISTENTE EN EL SISTEMA,
                                    ENTENDIENDO POR MODIFICACIÓN DE LA INFORMACIÓN LA:
                                            - ESCRITURA.
                                            - LECTURA.
                                            - MODIFICACIÓN.
                                            - CREACIÓN.
                                            - ENVÍO DE MENSAJES.
                         
                            - NO REPUDIO:
                                    ESTA CUESTIÓN HARÁ QUE UN USUARIO NO PUEDA NEGAR QUE HA ENVIADO UN MENSAJE.
                                    CON EL NO REPUDIO SE VA A PROTEGER AL RECEPTOR DEL MENSAJE
                                    SI EL EMISOR NIEGA QUE HA ENVIADO DICHO MENSAJE. 
                                    UNA FORMA DE NO REPUDIO SON LAS:
                                            - FIRMAS DIGITALES.
                                            - CERTIFICADOS DIGITALES.
                         
                            - DISPONIBILIDAD:
                                    REQUERIRÁ QUE TODOS LOS RECURSOS DEL SISTEMA
                                    ESTÉN SIEMPRE DISPONIBLES PARA EL USO DE LOS USUARIOS AUTORIZADOS.
                         
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
        
            PARA PODER TRATAR CUALQUIER PROBLEMA CON LA SEGURIDAD,
            TODAS LAS EMPRESAS DEBEN TENER OBLIGATORIAMENTE UNA POLÍTICA DE SEGURIDAD
            FIRMEMENTE ESTABLECIDA.
                         
                  * LA FUNCIÓN DE LA POLÍTICA NO ES OTRA QUE LA DE DEJAR CLARO CUÁLES SON
                    LAS RESPONSABILIDADES Y REGLAS A SEGUIR PARA EVITAR AMENAZAS.
                         
            EXISTEN UNA SERIE DE ORGANISMOS OFICIALES A NIVEL MUNDIAL,
            QUE SON LOS ENCARGADOS DE ASEGURAR LOS SERVICIOS DE PREVENCIÓN DE RIESGOS
            Y DE LA ASISTENCIA A LOS TRATAMIENTOS DE CUALQUIER POSIBLE INCIDENCIA.
                         
                  * UNO DE ELLOS ES EL:  -->  COMPUTER EMERGENCY RESPONSE TEAM COORDINATION CENTER
                    CENTRO DE COORDINACIÓN DEL EQUIPO DE RESPUESTA DE EMERGENCIAS INFORMÁTICAS --> CERT
                        https://sei.cmu.edu/about/divisions/cert/index.cfm
                    DEL SOFTWARE ENGINEERING INSTITUTE DE LA UNIVERSIDAD CARNEGIE MELLON,
                    EL CUAL ES UN CENTRO DE ALERTA Y REACCIÓN FRENTE A LOS ATAQUES INFORMÁTICOS.

                  * EN ESPAÑA TENEMOS EL INSTITUTO NACIONAL DE CIBERGURIDAD, O POR SUS SIGLAS, INCIBE.
                        https://www.incibe.es/
                         
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
        
            UNA AMENAZA DE SEGURIDAD:
                    ES UNA CONDICIÓN DEL ENTORNO DE UN SISTEMA DE INFORMACIÓN,
                    QUE UNA VEZ DADA UNA OPORTUNIDAD, PUEDE PRODUCIR UNA VIOLACIÓN DE SEGURIDAD EN EL SISTEMA. 
                         
            LAS CONDICIONES DEL ENTORNO PUEDEN REFERIRSE TANTO A PERSONAS, COMO A MÁQUINAS QUE REALICEN UN ATAQUE.
                
            DESDE EL PUNTO DE VISTA DE LA INFORMÁTICA,
            EXISTEN TRES TIPOS DE ELEMENTOS QUE SON LOS QUE PUEDEN SUFRIR AMENAZAS,
            LOS CUALES SON:
                    - EL HARDWARE.
                    - EL SOFTWARE.
                    - Y LOS DATOS.
            PARA CADA UNO DE ESTOS ELEMENTOS SE DEBEN CREAR MEDIDAS DE SEGURIDAD PARA NO PONERLOS EN RIESGO.
                         
            EXISTEN LOS SIGUIENTES TIPOS DE AMENAZAS:
                         
                    * AMENAZAS POR EL ORIGEN:
                            ESTAS SE DAN POR EL HECHO DE CONECTAR UN SISTEMA A CUALQUIER ENTORNO,
                            YA QUE ESTO PROPICIA QUE HAYA ATACANTES QUE PUEDAN ENTRAR EN NUESTRO SISTEMA
                            O ALTERAR EL FUNCIONAMIENTO NORMAL DE LA RED.
                            HAY QUE REMARCAR QUE NO POR NO ESTAR CONECTADOS A INTERNET SIGNIFIQUE QUE ESTAMOS A SALVO.
                            LA AMENAZA PUEDE PROVENIR DE CUALQUIER PUNTO DE LA RED AÚN SIN TENER SALIDA A INTERNET.
                         
                    * AMENAZAS POR EL EFECTO:
                            ESTE TIPO DE AMENAZAS PUEDEN SER:
                                    - ROBOS DE INFORMACIÓN.
                                    - ANULACIÓN DE LOS SISTEMAS INFORMÁTICOS
                                    - SUPLANTACIÓN DE IDENTIDAD.
                                    - ROBO DE DINERO.
                                    - VENTA DE DATOS PERSONALES.
                                    - DESTRUCCIÓN DE INFORMACIÓN.
                                    - ESTAFAS.
                                    - ETC.
                         
                    * AMENAZAS POR EL MÉDIO UTILIZADO:
                            ESTAS PUEDEN SER: 
                                    - VIRUS.
                                    - INGENIERÍA SOCIAL.
                                    - ATAQUES DE DENEGACIÓN DE SERVICIO.
                                    - PHISHING.
                                    - ETC.
                        
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
                   
        
            TODAS ESTAS AMENAZAS LAS PODEMOS CLASIFICAR PRINCIPALMENTE EN CUATRO GRANDES GRUPOS:
                         
                    * INTERRUPCIÓN:
                            EN ESTE GRUPO TENEMOS TODAS LAS AMENAZAS QUE CONSIGUEN DESTRUIR RECURSOS DEL SISTEMA INFORMÁTICO,
                            PUDIENDO DEJARLO TOTALMENTE INSERVIBLE, PROVOCANDO ASÍ GRANDES PÉRDIDAS DE INFORMACIÓN Y,
                            POSIBLEMENTE, DE DINERO.
                            (EL INTRUSO BLOQUEA LOS MENSAJES DEL EMISOR. EL RECEPTOR NO RECIBE NADA.)
                                                    
                    * INTERCEPCIÓN:
                            EN ESTE GRUPO TENEMOS TODAS LAS AMENAZAS QUE CONSIGUEN ACCEDER A UN RECURSO DE OTRA PERSONA,
                            PUDIENDO LUCRARSE DEL MISMO PIDIENDO UN RESCATE POR LOS DATOS ROBADOS.
                            (EL INTRUSO COPIA LOS MENSAJES DEL EMISOR. EL EMISOR Y RECEPTOR SE COMUNICAN SIN PROBLEMA.)
                         
                    * MODIFICACIÓN:
                            EN ESTE GRUPO TENEMOS TODAS LAS AMENAZAS QUE INTENTAN ACCEDER A UN RECURSO DE OTRA PERSONA,
                            PUDIENDO LLEGAR A MODIFICARLO.
                            (EL INTRUSO CAMBIA EL MENSAJE DEL EMISOR. EL RECEPTOR RECIBE UN MENSAJE DIFERENTE.)
                            
                    * FABRICACIÓN:
                            EN ESTE GRUPO TENEMOS TODAS LAS AMENAZAS QUE IMPLIQUEN UN ATAQUE CONTRA LA AUTENTICIDAD DE LOS DATOS,
                            INSERTADOS DATOS FALTOS EN LOS ORIGINALES.
                                    - ASÍ SUPLANTA O FABRICA ELEMENTOS EN UN SISTEMA DE INFORMACIÓN,
                                      COMO PUEDE SER UNA IP, DIRECCIÓN DE CORREO O CUALQUIER  OTRA COSA QUE SE ASEMEJE A SITIOS OFICIALES.
                                    - EN ESTOS CASOS EL USUARIO RECIBE DE MANERA CONFIADA INFORMACIÓN FALSA.
                            (EL INTRUSO ENVÍA EL MENSAJE AL RECEPTOR. EL EMISOR NO ENVÍA NADA.)
                         
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
        
            UN VIRUS INFORMÁTICO ES UN SISTEMA DE SOFTWARE DAÑINO,
            ESCRITO INTENCIONADAMENTE PARA ENTRAR EN UNA COMPUTADORA SIN PERMISO O CONOCIMIENTO DEL USUARIO.
            TIENE LA CAPACIDAD DE REPLICARSE A SÍ MISMO, CONTINUANDO ASÍ SU PROPAGACIÓN.
                         
            ALGUNOS VIRUS NO HACEN MUCHO MÁS QUE REPLICARSE,
            MIENTRAS QUE OTROS PUEDEN CAUSAR GRAVES DAÑOS O AFECTAR NEGATIVAMENTE EL RENDIMIENTO DE UN SISTEMA.
                         
            UN VIRUS NUNCA DEBE SER CONSIDERADO COMO INOFENSIVO Y DEJARLO EN UN SISTEMA SIN TOMAR MEDIDAS.
                         
                    1.- VIRUS DE ACCIÓN DIRECTA:
                            EL OBJETIVO PRINCIPAL DE ESTOS TIPOS DE VIRUS INFORMÁTICOS ES REPLICARSE Y ACTUAR CUANDO SON EJECUTADOS.
                            CUANDO SE CUMPLE UNA CONDICIÓN ESPECÍFICA,
                            EL VIRUS SE PONDRÁ EN ACCIÓN PARA INFECTAR A LOS FICHEROS EN EL DIRECTORIO O CARPETA
                            QUE SE ESPECIFICA EN EL ARCHIVO  -->  autoexec.bat
                         
                    2.- VIRUS DE SOBRESCRITURA:
                            ESTOS TIPOS DE VIRUS INFORMÁTICOS SE CARECTERIZAN POR EL HECHO DE QUE
                            BORRAN LA INFORMACIÓN CONTENIDA EN LOS FICHEROS QUE INFECTAN,
                            HACIÉNDOLOS PARCIAL O TOTALMENTE INÚTILES.
                            UNA VEZ INFECTADOS, EL VIRUS REMPLAZA EL CONTENIDO DEL FICHERO SIN CAMBIAR SU TAMAÑO.
                         
                    3.- VIRUS DE SECTOR DE ARRANQUE:
                            ESTE TIPO DE VIRUS AFECTA AL SECTOR DE ARRANQUE DEL DISCO DURO.
                            SE TRATA DE UNA PARTE CRUCIAL DEL DISCO EN LA QUE SE EN CUENTRA LA INFORMACIÓN
                            QUE HACE POSIBLE ARRANCAR EL ORDENADOR DESDE DISCO.
                         
                    4.- VIRUS POLIMÓRFICO:
                            ESTOS TIPOS DE VIRUS INFORMÁTICOS SE ENCRIPTAN O CODIFICAN DE UNA MANERA DIFERNTE,
                            UTILIZANDO DIFERENTES ALGORITMOS Y CLAVES DE CIFRADO CADA VEZ QUE INFECTAN UN SISTEMA.
                            ESTO HACE IMPOSIBLE QUE EL SOFTWARE ANTIVIRUS LOS ENCUENTRE UTILIZANDO BÚSQUEDAS DE CADENA O FIRMA
                            PORQUE SON DIFERENTES CADA VEZ.
                         
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
        
            DENTRO DE LAS AMENAZAS DE SEGURIDAD TENEMOS QUE EVITAR QUE SE PRODUZCAN EJECUCIONES NO DESEADAS.
            ESTO SE CONSIGUE A TRAVÉS DE LAS EXCEPCIONES.
                         
            EN PROGRAMACIÓN,
            UNA EXCEPCIÓN ES UN EVENTO QUE PODRÍA OCURRIR EN TIEMPO DE EJECUCIÓN,
            Y QUE INTERRUMPE EL FLUJO NORMAL DE LAS INSTRUCCIONES DE LA MISMA,
            PROVOCANDO QUE LA APLICACIÓN SE DETUVIERA.
                         
            SI ANALIZAMOS ESTO DESDE EL PUNTO DE VISTA DE LA SEGURIDAD,
            PODEMOS VER QUE PARA LUCHAR CONTRA LAS EJECUCIONES NO DESEADAS, LO MEJOR ES CAPTURAR ESTAS EXCEPCIONES,
            PODEMOS UTILIZAR UN BLOQUE TRY-CATCH, LANZANDO UNA EXCEPCIÓN QUE PARE EL PROCESO NO DESEADO.
                         
            COMO SABEMOS, EN EL LENGUAJE DE PROGRAMACIÓN JAVA PODEMOS ENCONTRAR VARIOS TIPOS DE EXCEPCIONES:
                         
                    * Error:
                            ESTAS SON EXCEPCIONES QUE VAN A INDICAR PROBLEMAS MUY GRAVES,
                            LOS CUALES POR NORMA GENERAL NO SUELEN SER RECUPERABLES
                            Y QUE NO DEBEN CASI NUNCA SER CAPTURADAS.
                         
                    * Exception:
                            ESTAS SON EXCEPCIONES QUE NO SON DEFINITIVAS,
                            PERO QUE VAMOS A PODER DETECTAR EN TIEMPO DE CODIFICACIÓN.
                         
                    * RuntimeException:
                            ESTAS SON EXCEPCIONES QUE SE DAN DURANTE EL TIEMPO DE EJECUCIÓN DEL PROGRAMA O APLICACIÓN.
                         
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
        
            YA SABEMOS QUE TODOS LOS SISTEMAS INFORMÁTICOS ESTÁN EXPUESTOS A SER ATACADOS DE UNA FORMA U OTRA,
            Y QUE NO HAY UNA FORMA DE ESTAR LIBRE AL 100% DE ESTA POSIBILIDAD,
            AUNQUE SI CUMPLIMOS CON CIERTOS REQUISITOS DE SEGURIDAD,
            COMO LOS VISTOS ANTERIORMENTE,
            PODREMOS INTERPONER OBSTÁCULOS Y QUE A LOS ATACANTES NO LES RESULTE FÁCIL ATACARNOS.
                         
            LOS ATAQUES A LOS SISTEMAS INFORMÁTICOS LOS PODEMOS DEFINIR COMO CIBERATAQUES.
            ES MUY IMPORTANTE TENER EN CUENTA QUE HOY EN DÍA, ALGUNOS CIBERATAQUES,
            DEPENDIENDO DE DÓNDE SE REALICE, A QUIÉN O CUÁNDO,
            PUEDEN LLEGAR A FORMAR PARTE DE UNA GUERRA INFORMÁTICA O DE UN ATAQUE DE CIBERTERRORISMO.
                         
            LOS ATAQUES QUE PODEMOS RECIBIR SE PUEDEN CLASIFICAR EN DOS GRANDES GRUPOS PRINCIPALMENTE:
                         
                    * ATAQUES PASIVOS:
                            ESTA CATEGORÍA ENGLOBA A LOS TIPOS DE ATAQUES EN LOS QUE EL ATACANTE NO NECESITA ALTERAR LA COMUNICACIÓN,
                            ÉSTE ÚNICAMENTE SE DEDICARÁ ESCUCHAR O MONITORIZAR EL TRÁFICO DE INFORMACIÓN EN LA RED
                            PARA INTENTAR OBTENER INFORMACIÓN QUE ESTÁ SIENDO TRANSMITIDA.
                            A ESTE TIPO DE ATAQUES SE LES SUELE DAR USO PARA INTENTAR VER EL TRÁFICO DE RED,
                            PUDIENDO CONSEGUIR DE ESTA FORMA CREDENCIALES DE ACCESO, COMO USUARIOS Y CONTRASEÑAS,
                            PÁGINAS WEB QUE ESTÁN SIENDO VISITADAS, ETC.
                         
                    * ATAQUES ACTIVOS:
                            ESTA CATEGORÍA ENGLOBA A LOS TIPOS DE ATAQUES EN LOS QUE EL ATACANTE
                            REALIZA ALGÚN TIPO DE MODIFICACIÓN DE LOS DATOS QUE ESTÁN SIENDO TRANSMITIDOS EN LA RED,
                            O INCLUSO PUDIENDO LLEGAR A CREAR UN FLUJO DE DATOS FALSO QUE SE TRANSMITIRÁ POR LA RED
                            COMO SI DE UN VERDADERO SE TRATASE.
                            
                            LOS OBJETIVOS DE ESTOS ATAQUES SON:
                         
                                    1.- INTENTAR UNA SUPLANTACIÓN DE IDENTIDAD,
                                        HACIÉNDOSE PASAR EL ATACANTE POR EL USUARIO SUPLANTADO.
                         
                                    2.- UNA REACTUACIÓN,
                                        PUDIENDO REENVIAR UNA SERIE DE MENSAJES DETERMINADOS PARA PRODUCIR UN EFECTO NO DESEADO.
                        
                                    3.- ATAQUES DE DENEGACIÓN DE SERVICIO,
                                        PUDIENDO DE ESTA FORMA APAGAR SITIOS WEB.
                         
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
        
            LAS VULNERABILIDADES DEL SOFTWARE SURGIERON EN EL MISMO MOMENTO EN EL QUE SURGIÓ INTERNET,
            Y AÚN A DÍA DE HOY SIGUE SIENDO UNO DE LOS MAYORES PROBLEMAS A LOS QUE NOS DEBEMOS ENFRENTAR.
                         
            ÉSTAS SON UN FALLO O HUECO EN LA SEGURIDAD DE UN SOFTWARE O SISTEMA INFORMÁTICO,
            QUE HA SIDO DETECTADO POR ALGÚN OTRO SISTEMA, O PERSONA QUE MONITORIZA ESE SISTEMA MALICIOSO,
            EL CUAL, PUEDE SER UTILIZADO PARA ENTRAR EN EL SISTEMA DESTINO DE FORMA NO AUTORIZADA,
            PUDIENDO REALIZAR OPERACIONES INDESEADAS.
                         
            EL MAYOR INCONVENIENTE DE LAS VULNERABILIDADES DE SOFTWARE RESIDE EN LA DIFICULTAD EN LA FORMA EN LA QUE SON DETECTADAS.
            DE HECHO, CUANDO SE TRATA DE UN PROGRAMA CON UNA GRAN ENVERGADURA,
            LAS AUDITORÍAS DE VULNERABILIDADES NORMALMENTE SON ENCARGADAS A EMPRESAS EXTERNAS
            QUE SE DEDICAN A BUSCAR FALLOS DE SOFTWARE, LAS CUALES, CUENTAN CON EXPERTOS EN LA MATERIA.
                         
            CUANDO SE CREA UNA APLICACIÓN SOFTWARE,
            ANTES DE LANZARLA AL MERCADO SE HACE UN ESTUDIO METICULOSO
            EN EL QUE SE INTENTAN DESCUBRIR TODOS LOS FALLOS DE SEGURIDAD DE LA MISMA,
            PUDIENDO IDENTIFICARLOS Y SOLUCIONARLOS SIN HABER PUESTO LA APLICACIÓN EN PRODUCCIÓN.
                         
            EN ESTE PROCESO SE PUEDEN DESCUBRIR UNA GRAN CANTIDAD DE FALLOS DE SEGURIDAD,
            PERO DESGRACIADAMENTE, ESTOS NO SERÁN TODOS LOS QUE SURGIRÁN,
            POR LO QUE AÚN CON LA APLICACIÓN EN EL MERCADO,
            SE DEBERÁ SEGUIR CON ESTE PROCESO ININTERRUMPIDAMENTE,
            MONITOREANDO DE FORMA CONTINUA EL PROGRAMA,
            Y LANZANDO ACTUALIZACIONES Y PARCHES QUE SOLVENTEN LOS NUEVOS FALLOS DE SEGURIDAD ENCONTRADOS.
                         
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
        
            COMO EN ESTE MÓDULO ESTAMOS CENTRADOS EN EL LENGUAJE DE PROGRAMACIÓN JAVA,
            VAMOS A VER LOS DOS PILARES DE LA SEGURIDAD EN LOS QUE SE BASA ÉSTE:
                         
                    * SEGURIDAD INTERNA DE LA APLICACIÓN:
                            ESTO SE REFIERE A QUE CUANDO SE PROGRAME UNA APLICACIÓN
                            HAN DE SEGUIRSE UNOS CRITERIOS DE TRATAMIENTO DE ERRORES.
                            UN EJEMPLO SERÍAN LOS BLOQUES TRY-CATCH-FINALLY PARA EL TRATAMIENTO DE EXCEPCIONES.
                         
                    * POLÍTICAS DE ACCESO:
                            LAS POLÍTICAS DE ACCESO SE REFIEREN
                            A LAS ACCIONES QUE PUEDE REALIZAR LA APLICACIÓN EN NUESTRO EQUIPO,
                            ES DECIR, EL HECHO DE DAR O NO PERMISO A LA APLICACIÓN
                            PARA QUE PUEDA UTILIZAR CIERTOS RECURSOS DEL SISTEMA.
                         
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
        
            EN EL ÁMBITO DE LA SEGURIDAD INFORMÁTICA EXISTEN LO QUE SE DENOMINAN:
                         
            * POLÍTICAS DE SEGURIDAD:
                    LAS CUALES, LAS PODEMOS DEFINIR COMO UNA SERIE DE DOCUMENTOS DE MUY ALTO NIVEL
                    QUE VAN A SER FUNDAMENTALES PARA LLEVAR A CABO EL COMPROMISO CON LA CIBERSEGURIDAD.
                         
                    ESTOS CONTIENEN LA DEFINICIÓN DE LA SEGURIDAD DE LA INFORMACIÓN,
                    Y LAS MEDIDAS A ADOPTAR TANTO POR LA EMPRESA, TRABAJADORES,
                    ASÍ COMO EL DEPARTAMENTO DE SISTEMAS,
                    PARA APLICAR TODOS LOS PROCEDIMIENTOS NECESARIOS QUE GARANTICEN
                    QUE EL TRABAJO SE DESARROLLA EN UN ENTORNO SEGURO. 
                         
                    LAS POLÍTICAS DE SEGURIDAD POR SÍ SOLAS NO SON SUFICIENTES
                    Y DEBEN DE SER UTILIZADAS CON OTRAS MEDIDAS QUE VAN A DEPENDER DE LAS MISMAS,
                    COMO PUEDEN SER LOS OBJETIVOS DE SEGURIDAD Y LOS PROCESOS.
                         
                    LAS POLÍTICAS DE SEGURIDAD DEBEN SER FÁCILMENTE ACCESIBLES
                    PARA QUE TODO EL PERSONAL DE LA EMPRESA ESTÉ AL TANTO DE SU EXISTENCIA
                    Y ENTIENDAN SU CONTENIDO.
                         
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
        
            UNA FORMA DE ENTRADA DE ERRORES EN NUESTRAS APLICACIONES QUE PUEDE AFECTAR A LA SEGURIDAD,
            SON LAS ENTRADAS DE DATOS QUE INTRODUCEN LOS USUARIOS,
            POR EJEMPLO, EN EL MOMENTO DEL CONTROL DE ACCESO A LOS SISTEMAS,
            O SIMPLEMENTE, CUANDO NOS ENCONTRAMOS DESARROLLANDO UN NUEVO PROGRAMA.
                         
            BUFFER OVERFLOW:
                    SI NO SE CONTROLA QUE EL USUARIO PUEDA IMTRODUCIR MÁS DATOS DE LOS PREVISTOS,
                    PUEDE SUCEDER QUE EL USUARIO INTRODUZCA CÓDIGO MALICIOSO EN LA MEMORIA,
                    O SI CAPTURA INCORRECTAMENTE LA EXCEPCIÓN, QUE SE MUESTREN DATOS SENSIBLES DEL PROGRAMA.
                         
            UNO DE LOS FALLOS DE SEGURIDAD MÁS COMUNES SE TRATA DE LOS CONOCIDOS COMO BUFFER OVERFLOW,
            LOS CUALES, SE PRODUCEN CUANDO SE DESBORDA EL TAMAÑO DE UNA DETERMINADA VARIABLE.

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
        
            EJEMPLO DE BUFFER OVERFLOW EN EL LENGUAJE C:
                         
                    main(){
                        chart str[10]                                     -->   RESERVA EN MEMORIA 10 BYTES PARA LA VARIABLE str.
                    strcpy(str, "AAAAAAAAAAAAAAAAAAAAAA");                -->   CARGA EN MEMORIA MÁS DE 10 BYTES.
                    }
                         
            EJEMPLO DE BUFFER OVERFLOW EN EL LENGUAJE C:
                         
                    #include <stdio.h>
                    #include <string.h>
                         
                    int main(void)
                    {
                        char buff[15];                                    -->   RESERVA EN MEMORIA 15 BYTES PARA UN BUFFER.
                        int pass = 0;                                     -->   TENGO UNA VARIABLE COMO LLAVE DE ENTRADA AL PROGRAMA.
                         
                        printf ("\n Introduce la clave : \n");
                        gets(buff);                                       -->   CAPTURA LO QUE EL USUARIO TECLEA.
                         
                        if(strcmp(buff, "Clave123"))                      -->   COMPARA LO QUE SE TECLEA CON UNA CADENA.
                        {
                            printf ("\n Clave incorrecta \n");
                        }
                        else
                        {
                            printf ("\n Clave correcta \n");
                            pass = 1;
                        }
                         
                        if(pass)                                          -->   SI LA VARIABLE ES 1 SE CONCEDEN PERMISOS.
                        {
                            printf ("\n Concedidos permisos Admin al usuario \n");
                        }
                        return 0;
                    }
                
                    SI INTRODUCIMOS MÁS DE 15 CARACTERES, 
                            - SIN COMPROBAR EL TAMAÑO RESERVADO EN MEMORIA PARA LAS VARIABLES.
                            - SIN CAPTURAR LAS EXCEPCIONES.
                    SE SOBRESCRIBE LA PILA EN MEMORIA RESERVADO EN MEMORIA PARA LAS VARIABLES,
                    MACHACANDO LA PARTE DE CÓDIGO DONDE SE VERIFICA LA CLAVE.
                    PROVOCANDO LA INTRUSIÓN DEL USUARIO DE FORMA INDIBIDA.
                         
            EJEMPLO DE VULNERABILIDAD POR BUFFER OVERFLOW EN JAVA:
                         
                    public class Overflow {
                        
                        public static void main(String[] args) {
                         
                            int datosImportantes = 1;
                            int[] buffer = new int[10];                   -->   RESERVO UN ARRAY DE 10 ENTEROS
                         
                            for (int i=0; i<15; i++)
                                buffer[i] = 7;
                         
                            System.out.println("Overflow después del buffer ");
                            System.out.println("Datos Importantes = " + datosImportantes);
                        }
                    }
                    
                    EN FUNCIÓN DEL IDE Y COMPILADOR JAVA QUE SE HAYA UTILIZADO, SI NO SE DETECTA QUE PUEDE PRODUCIRSE LA EXCEPCIÓN:
                            
                            Exception in thread "main"
                            java.lang.ArrayIndexOutOfBoundsException: 10
                                at Overflow.main(Overflow.java:9)
                    
                    TAMBIÉN SEGÚN EL ENTORNO DE EJECUCIÓN DE JAVA, SE PODRÍA LLEGAR A PERDER INFORMACIÓN RELEVANTE,
                    Y MOSTRAR EN PANTALLA INFORMACIÓN NO DESEADA AL MOSTRAR LA EXCEPCIÓN -> VOLCADO DE LA PILA, 
                    MOSTRAR LA VARIABLE datosImportantes QUE OCUPA PARTE DE LA MEMORIA.
                         
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
        
            PARA EVITAR PARTE DE ESTOS ERRORES PODEMOS USAR LA VALIDACIÓN DE DATOS MEDIANTE EXPRESIONES REGULARES,
            LA CUAL NOS VA A PERMITIR:

                    1.- MANTENER LA CONSISTENCIA DE LOS DATOS,
                        PUDIENDO COMPROBAR QUE LOS DATOS INSERTADOS CUMPLEN CIERTOS REQUISITOS.

                    2.- EVITAR DESBORDAMIENTOS DE MEMORIA BUFFER OVERFLOW,
                        PUDIENDO COMPROBAR LA LONGITUD DE LOS CAMPOS.    
                                           
            PARA PODER USAR LAS EXPRESIONES REGULARES, JAVA USA LA BIBLIOTECA  -->  java.util.regex
            LA CUAL NOS VA A PERMITIR USAR LA CLASE   --->   Pattern
            QUE PERMITE LA DEFINICIÓN DE EXPRESIONES REGULARES.
                         
            CON LAS EXPRESIONES REGULARES VAMOS A PODER ESPECIFICAR
            LO QUE QUEREMOS QUE EL USUARIO TENGA QUE INTRODUCIR EN LAS ENTRADAS DE NUESTROS PROGRAMAS.
                         
                    ENTRE CORCHETES  [ ]     -->  EL CONJUNTO DE CARACTERES QUE ESTÁ PERMITIDO.
                    ENTRE CORCHETES  [^ ]    -->  EL CONJUNTO DE CARACTERES QUE NO ESTÁ PERMITIDO.
                    ENTRE LLAVES     { }     -->  EL NÚMERO DE CARACTERES.
                         
            PARA LA VALIDACIÓN DE ENTRADA PODEMOS UTILIZAR LOS SIGUIENTES ELEMENTOS Y OPERADORES:
                         
                .                   UN PUNTO INDICA CUALQUIER CARÁCTER.
                ^expresión          EL ^ INDICA EL PRINCIPIO DEL STRING.
                expresión$          EL $ INDICA EL FINAL DEL STRING.
                x                   EL CARÁCTER x
                [abc]               LOS CARACTERES a, b, O c.
                [a-z]               UNA LETRA MINÚSCULA.
                [A-Z]               UNA LETRA MAYÚSCULA.
                [a-Za-z]            UNA LETRA MINÚSCULA O MAYÚSCULA.
                [0-9]               UN NÚMERO ENTRE 0 Y 9.
                [A-Za-z0-9]         UNA LETRA MINÚSCULA, MAYÚSCULA O UN NÚMERO.
                [A-Za-z0-9_]        UNA LETRA MINÚSCULA, MAYÚSCULA, UN NÚMERO O EL CARÁCTER _.
                [a-z]{2}            DOS LETRAS MINÚSCULAS.
                [a-z]{2,5}          ENTRE DOS Y CINCO LETRAS MINÚSCULAS.
                [a-z]{2,}           MÁS DE 2 LETRAS MINÚSCULAS.
                hola|adios          SOLO SE PUEDEN INTRODUCIR LAS PALABRAS HOLA O ADIÓS. | FUNCIONA COMO LA OPERACIÓN OR.
                AB                  SOLO SE PUEDEN INTRODUCIR DOS EXPRESIONES. CONCATENACIÓN. ESTA ES LA OPERACIÓN AND.
                e(n|l)campo         LOS DELIMITADORES () PERMITEN HACER EXPRESIONES MÁS COMPLEJAS.
                                    EN EL EJEMPLO SE DEBE INTRODUCIR EL TEXTO "EN CAMPO" O "EL CAMPO".
                         
                \\d                 DÍGITO. EQUIVALE A [0-9]
                \\D                 NO DÍGITO. EQUIVALE A [^0-9]
                \\s                 ESPACIO EN BLANCO. EQUIVALE A [\\t\\n\\x0b\\r\\f]
                \\S                 NO ESPACIO EN BLANCO. EQUIVALE A [^\\s]
                \\w                 UNA LETRA MINÚSCULA, MAYÚSCULA, UN NÚMERO O EL CARÁCTER _. EQUIVALE A [A-Za-z0-9_]
                \\W                 EQUIVALE A [^\\w]
                \\b                 LÍMITE DE UNA PALABRA.
                         
                {X}                 INDICA QUE LO QUE VA JUSTO ANTES DE LAS LLAVES SE REPITE X VECES.
                {X,Y}               INDICA QUE LO QUE VA JUSTO ANTES DE LAS LLAVES SE REPITE MÍNIMO X VECES Y MÁXIMO Y VECES.
                {X,}                INDICA QUE LO QUE VA JUSTO ANTES DE LAS LLAVES SE REPITE MÍNIMO X VECES Y SIN UN MÁXIMO DE VECES.
                *                   INDICA UN MÍNIMO DE 0 VECES Y SIN UN MÁXIMO DE VECES. EQUIVALE A   --> {0,}
                +                   INDICA UN MÍNIMO DE 1 VECES Y SIN UN MÁXIMO DE VECES. EQUIVALE A   --> {1,}
                ?                   INDICA UN MÍNIMO DE 0 VECES Y UN MÁXIMO DE 1 VECES. EQUIVALE A     --> {0,1}
                         
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
                case "14" -> {
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