package Tema_13;

import static Principal_Main.Main.*;
import static Tema_13.T_13.*;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
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
                    EL HECHO DE ESTAR LIBRE DE TODO DA�O.
                         
            EN INFORM�TICA, LA SEGURIDAD ES IMPOSIBLE DE CONSEGUIR,
            ES DECIR, NING�N PROGRAMA SOFTWARE VA A ESTAR AL 100% SEGURO ANTE AMENAZAS,
            YA QUE D�A A D�A SURGEN NUEVOS TIPOS DE RIESGOS QUE DESCONOCEMOS.
                         
            NO OBSTANTE, EN LOS SISTEMAS INFORM�TICOS,
            SEAN CUAL SEAN SU COMPOSICI�N:
                    - PROGRAMAS.
                    - APLICACIONES.
                    - WEBS.
                    - SISTEMAS OPERATIVOS.
                    - ETC.
                    PODEMOS DECIR QUE SON SEGUROS, O QUE SE PUEDEN ACERCAR A DISPONER DE LA M�XIMA SEGURIDAD,
                    SIEMPRE Y CUANDO CUMPLAN LAS SIGUIENTES CARACTER�STICAS:
                         
                            - CONFIDENCIALIDAD:
                                    ESTA CARACTER�STICA VA A REQUERIR QUE 
                                    �NICAMENTE LAS PERSONAS AUTORIZADAS ACCEDAN AL SISTEMA.
                         
                            - INTEGRIDAD:
                                    REQUERIR� QUE �NICAMENTE LAS PERSONAS AUTORIZADAS
                                    PUEDAN MODIFICAR LA INFORMACI�N EXISTENTE EN EL SISTEMA,
                                    ENTENDIENDO POR MODIFICACI�N DE LA INFORMACI�N LA:
                                            - ESCRITURA.
                                            - LECTURA.
                                            - MODIFICACI�N.
                                            - CREACI�N.
                                            - ENV�O DE MENSAJES.
                         
                            - NO REPUDIO:
                                    ESTA CUESTI�N HAR� QUE UN USUARIO NO PUEDA NEGAR QUE HA ENVIADO UN MENSAJE.
                                    CON EL NO REPUDIO SE VA A PROTEGER AL RECEPTOR DEL MENSAJE
                                    SI EL EMISOR NIEGA QUE HA ENVIADO DICHO MENSAJE. 
                                    UNA FORMA DE NO REPUDIO SON LAS:
                                            - FIRMAS DIGITALES.
                                            - CERTIFICADOS DIGITALES.
                         
                            - DISPONIBILIDAD:
                                    REQUERIR� QUE TODOS LOS RECURSOS DEL SISTEMA
                                    EST�N SIEMPRE DISPONIBLES PARA EL USO DE LOS USUARIOS AUTORIZADOS.
                         
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
            TODAS LAS EMPRESAS DEBEN TENER OBLIGATORIAMENTE UNA POL�TICA DE SEGURIDAD
            FIRMEMENTE ESTABLECIDA.
                         
                  * LA FUNCI�N DE LA POL�TICA NO ES OTRA QUE LA DE DEJAR CLARO CU�LES SON
                    LAS RESPONSABILIDADES Y REGLAS A SEGUIR PARA EVITAR AMENAZAS.
                         
            EXISTEN UNA SERIE DE ORGANISMOS OFICIALES A NIVEL MUNDIAL,
            QUE SON LOS ENCARGADOS DE ASEGURAR LOS SERVICIOS DE PREVENCI�N DE RIESGOS
            Y DE LA ASISTENCIA A LOS TRATAMIENTOS DE CUALQUIER POSIBLE INCIDENCIA.
                         
                  * UNO DE ELLOS ES EL:  -->  COMPUTER EMERGENCY RESPONSE TEAM COORDINATION CENTER
                    CENTRO DE COORDINACI�N DEL EQUIPO DE RESPUESTA DE EMERGENCIAS INFORM�TICAS --> CERT
                        https://sei.cmu.edu/about/divisions/cert/index.cfm
                    DEL SOFTWARE ENGINEERING INSTITUTE DE LA UNIVERSIDAD CARNEGIE MELLON,
                    EL CUAL ES UN CENTRO DE ALERTA Y REACCI�N FRENTE A LOS ATAQUES INFORM�TICOS.

                  * EN ESPA�A TENEMOS EL INSTITUTO NACIONAL DE CIBERGURIDAD, O POR SUS SIGLAS, INCIBE.
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
                    ES UNA CONDICI�N DEL ENTORNO DE UN SISTEMA DE INFORMACI�N,
                    QUE UNA VEZ DADA UNA OPORTUNIDAD, PUEDE PRODUCIR UNA VIOLACI�N DE SEGURIDAD EN EL SISTEMA. 
                         
            LAS CONDICIONES DEL ENTORNO PUEDEN REFERIRSE TANTO A PERSONAS, COMO A M�QUINAS QUE REALICEN UN ATAQUE.
                
            DESDE EL PUNTO DE VISTA DE LA INFORM�TICA,
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
                            LA AMENAZA PUEDE PROVENIR DE CUALQUIER PUNTO DE LA RED A�N SIN TENER SALIDA A INTERNET.
                         
                    * AMENAZAS POR EL EFECTO:
                            ESTE TIPO DE AMENAZAS PUEDEN SER:
                                    - ROBOS DE INFORMACI�N.
                                    - ANULACI�N DE LOS SISTEMAS INFORM�TICOS
                                    - SUPLANTACI�N DE IDENTIDAD.
                                    - ROBO DE DINERO.
                                    - VENTA DE DATOS PERSONALES.
                                    - DESTRUCCI�N DE INFORMACI�N.
                                    - ESTAFAS.
                                    - ETC.
                         
                    * AMENAZAS POR EL M�DIO UTILIZADO:
                            ESTAS PUEDEN SER: 
                                    - VIRUS.
                                    - INGENIER�A SOCIAL.
                                    - ATAQUES DE DENEGACI�N DE SERVICIO.
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
                         
                    * INTERRUPCI�N:
                            EN ESTE GRUPO TENEMOS TODAS LAS AMENAZAS QUE CONSIGUEN DESTRUIR RECURSOS DEL SISTEMA INFORM�TICO,
                            PUDIENDO DEJARLO TOTALMENTE INSERVIBLE, PROVOCANDO AS� GRANDES P�RDIDAS DE INFORMACI�N Y,
                            POSIBLEMENTE, DE DINERO.
                            (EL INTRUSO BLOQUEA LOS MENSAJES DEL EMISOR. EL RECEPTOR NO RECIBE NADA.)
                                                    
                    * INTERCEPCI�N:
                            EN ESTE GRUPO TENEMOS TODAS LAS AMENAZAS QUE CONSIGUEN ACCEDER A UN RECURSO DE OTRA PERSONA,
                            PUDIENDO LUCRARSE DEL MISMO PIDIENDO UN RESCATE POR LOS DATOS ROBADOS.
                            (EL INTRUSO COPIA LOS MENSAJES DEL EMISOR. EL EMISOR Y RECEPTOR SE COMUNICAN SIN PROBLEMA.)
                         
                    * MODIFICACI�N:
                            EN ESTE GRUPO TENEMOS TODAS LAS AMENAZAS QUE INTENTAN ACCEDER A UN RECURSO DE OTRA PERSONA,
                            PUDIENDO LLEGAR A MODIFICARLO.
                            (EL INTRUSO CAMBIA EL MENSAJE DEL EMISOR. EL RECEPTOR RECIBE UN MENSAJE DIFERENTE.)
                            
                    * FABRICACI�N:
                            EN ESTE GRUPO TENEMOS TODAS LAS AMENAZAS QUE IMPLIQUEN UN ATAQUE CONTRA LA AUTENTICIDAD DE LOS DATOS,
                            INSERTADOS DATOS FALTOS EN LOS ORIGINALES.
                                    - AS� SUPLANTA O FABRICA ELEMENTOS EN UN SISTEMA DE INFORMACI�N,
                                      COMO PUEDE SER UNA IP, DIRECCI�N DE CORREO O CUALQUIER  OTRA COSA QUE SE ASEMEJE A SITIOS OFICIALES.
                                    - EN ESTOS CASOS EL USUARIO RECIBE DE MANERA CONFIADA INFORMACI�N FALSA.
                            (EL INTRUSO ENV�A EL MENSAJE AL RECEPTOR. EL EMISOR NO ENV�A NADA.)
                         
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
        
            UN VIRUS INFORM�TICO ES UN SISTEMA DE SOFTWARE DA�INO,
            ESCRITO INTENCIONADAMENTE PARA ENTRAR EN UNA COMPUTADORA SIN PERMISO O CONOCIMIENTO DEL USUARIO.
            TIENE LA CAPACIDAD DE REPLICARSE A S� MISMO, CONTINUANDO AS� SU PROPAGACI�N.
                         
            ALGUNOS VIRUS NO HACEN MUCHO M�S QUE REPLICARSE,
            MIENTRAS QUE OTROS PUEDEN CAUSAR GRAVES DA�OS O AFECTAR NEGATIVAMENTE EL RENDIMIENTO DE UN SISTEMA.
                         
            UN VIRUS NUNCA DEBE SER CONSIDERADO COMO INOFENSIVO Y DEJARLO EN UN SISTEMA SIN TOMAR MEDIDAS.
                         
                    1.- VIRUS DE ACCI�N DIRECTA:
                            EL OBJETIVO PRINCIPAL DE ESTOS TIPOS DE VIRUS INFORM�TICOS ES REPLICARSE Y ACTUAR CUANDO SON EJECUTADOS.
                            CUANDO SE CUMPLE UNA CONDICI�N ESPEC�FICA,
                            EL VIRUS SE PONDR� EN ACCI�N PARA INFECTAR A LOS FICHEROS EN EL DIRECTORIO O CARPETA
                            QUE SE ESPECIFICA EN EL ARCHIVO  -->  autoexec.bat
                         
                    2.- VIRUS DE SOBRESCRITURA:
                            ESTOS TIPOS DE VIRUS INFORM�TICOS SE CARECTERIZAN POR EL HECHO DE QUE
                            BORRAN LA INFORMACI�N CONTENIDA EN LOS FICHEROS QUE INFECTAN,
                            HACI�NDOLOS PARCIAL O TOTALMENTE IN�TILES.
                            UNA VEZ INFECTADOS, EL VIRUS REMPLAZA EL CONTENIDO DEL FICHERO SIN CAMBIAR SU TAMA�O.
                         
                    3.- VIRUS DE SECTOR DE ARRANQUE:
                            ESTE TIPO DE VIRUS AFECTA AL SECTOR DE ARRANQUE DEL DISCO DURO.
                            SE TRATA DE UNA PARTE CRUCIAL DEL DISCO EN LA QUE SE EN CUENTRA LA INFORMACI�N
                            QUE HACE POSIBLE ARRANCAR EL ORDENADOR DESDE DISCO.
                         
                    4.- VIRUS POLIM�RFICO:
                            ESTOS TIPOS DE VIRUS INFORM�TICOS SE ENCRIPTAN O CODIFICAN DE UNA MANERA DIFERNTE,
                            UTILIZANDO DIFERENTES ALGORITMOS Y CLAVES DE CIFRADO CADA VEZ QUE INFECTAN UN SISTEMA.
                            ESTO HACE IMPOSIBLE QUE EL SOFTWARE ANTIVIRUS LOS ENCUENTRE UTILIZANDO B�SQUEDAS DE CADENA O FIRMA
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
            ESTO SE CONSIGUE A TRAV�S DE LAS EXCEPCIONES.
                         
            EN PROGRAMACI�N,
            UNA EXCEPCI�N ES UN EVENTO QUE PODR�A OCURRIR EN TIEMPO DE EJECUCI�N,
            Y QUE INTERRUMPE EL FLUJO NORMAL DE LAS INSTRUCCIONES DE LA MISMA,
            PROVOCANDO QUE LA APLICACI�N SE DETUVIERA.
                         
            SI ANALIZAMOS ESTO DESDE EL PUNTO DE VISTA DE LA SEGURIDAD,
            PODEMOS VER QUE PARA LUCHAR CONTRA LAS EJECUCIONES NO DESEADAS, LO MEJOR ES CAPTURAR ESTAS EXCEPCIONES,
            PODEMOS UTILIZAR UN BLOQUE TRY-CATCH, LANZANDO UNA EXCEPCI�N QUE PARE EL PROCESO NO DESEADO.
                         
            COMO SABEMOS, EN EL LENGUAJE DE PROGRAMACI�N JAVA PODEMOS ENCONTRAR VARIOS TIPOS DE EXCEPCIONES:
                         
                    * Error:
                            ESTAS SON EXCEPCIONES QUE VAN A INDICAR PROBLEMAS MUY GRAVES,
                            LOS CUALES POR NORMA GENERAL NO SUELEN SER RECUPERABLES
                            Y QUE NO DEBEN CASI NUNCA SER CAPTURADAS.
                         
                    * Exception:
                            ESTAS SON EXCEPCIONES QUE NO SON DEFINITIVAS,
                            PERO QUE VAMOS A PODER DETECTAR EN TIEMPO DE CODIFICACI�N.
                         
                    * RuntimeException:
                            ESTAS SON EXCEPCIONES QUE SE DAN DURANTE EL TIEMPO DE EJECUCI�N DEL PROGRAMA O APLICACI�N.
                         
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
        
            YA SABEMOS QUE TODOS LOS SISTEMAS INFORM�TICOS EST�N EXPUESTOS A SER ATACADOS DE UNA FORMA U OTRA,
            Y QUE NO HAY UNA FORMA DE ESTAR LIBRE AL 100% DE ESTA POSIBILIDAD,
            AUNQUE SI CUMPLIMOS CON CIERTOS REQUISITOS DE SEGURIDAD,
            COMO LOS VISTOS ANTERIORMENTE,
            PODREMOS INTERPONER OBST�CULOS Y QUE A LOS ATACANTES NO LES RESULTE F�CIL ATACARNOS.
                         
            LOS ATAQUES A LOS SISTEMAS INFORM�TICOS LOS PODEMOS DEFINIR COMO CIBERATAQUES.
            ES MUY IMPORTANTE TENER EN CUENTA QUE HOY EN D�A, ALGUNOS CIBERATAQUES,
            DEPENDIENDO DE D�NDE SE REALICE, A QUI�N O CU�NDO,
            PUEDEN LLEGAR A FORMAR PARTE DE UNA GUERRA INFORM�TICA O DE UN ATAQUE DE CIBERTERRORISMO.
                         
            LOS ATAQUES QUE PODEMOS RECIBIR SE PUEDEN CLASIFICAR EN DOS GRANDES GRUPOS PRINCIPALMENTE:
                         
                    * ATAQUES PASIVOS:
                            ESTA CATEGOR�A ENGLOBA A LOS TIPOS DE ATAQUES EN LOS QUE EL ATACANTE NO NECESITA ALTERAR LA COMUNICACI�N,
                            �STE �NICAMENTE SE DEDICAR� ESCUCHAR O MONITORIZAR EL TR�FICO DE INFORMACI�N EN LA RED
                            PARA INTENTAR OBTENER INFORMACI�N QUE EST� SIENDO TRANSMITIDA.
                            A ESTE TIPO DE ATAQUES SE LES SUELE DAR USO PARA INTENTAR VER EL TR�FICO DE RED,
                            PUDIENDO CONSEGUIR DE ESTA FORMA CREDENCIALES DE ACCESO, COMO USUARIOS Y CONTRASE�AS,
                            P�GINAS WEB QUE EST�N SIENDO VISITADAS, ETC.
                         
                    * ATAQUES ACTIVOS:
                            ESTA CATEGOR�A ENGLOBA A LOS TIPOS DE ATAQUES EN LOS QUE EL ATACANTE
                            REALIZA ALG�N TIPO DE MODIFICACI�N DE LOS DATOS QUE EST�N SIENDO TRANSMITIDOS EN LA RED,
                            O INCLUSO PUDIENDO LLEGAR A CREAR UN FLUJO DE DATOS FALSO QUE SE TRANSMITIR� POR LA RED
                            COMO SI DE UN VERDADERO SE TRATASE.
                            
                            LOS OBJETIVOS DE ESTOS ATAQUES SON:
                         
                                    1.- INTENTAR UNA SUPLANTACI�N DE IDENTIDAD,
                                        HACI�NDOSE PASAR EL ATACANTE POR EL USUARIO SUPLANTADO.
                         
                                    2.- UNA REACTUACI�N,
                                        PUDIENDO REENVIAR UNA SERIE DE MENSAJES DETERMINADOS PARA PRODUCIR UN EFECTO NO DESEADO.
                        
                                    3.- ATAQUES DE DENEGACI�N DE SERVICIO,
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
        
            LAS VULNERABILIDADES DEL SOFTWARE SURGIERON EN EL MISMO MOMENTO EN EL QUE SURGI� INTERNET,
            Y A�N A D�A DE HOY SIGUE SIENDO UNO DE LOS MAYORES PROBLEMAS A LOS QUE NOS DEBEMOS ENFRENTAR.
                         
            �STAS SON UN FALLO O HUECO EN LA SEGURIDAD DE UN SOFTWARE O SISTEMA INFORM�TICO,
            QUE HA SIDO DETECTADO POR ALG�N OTRO SISTEMA, O PERSONA QUE MONITORIZA ESE SISTEMA MALICIOSO,
            EL CUAL, PUEDE SER UTILIZADO PARA ENTRAR EN EL SISTEMA DESTINO DE FORMA NO AUTORIZADA,
            PUDIENDO REALIZAR OPERACIONES INDESEADAS.
                         
            EL MAYOR INCONVENIENTE DE LAS VULNERABILIDADES DE SOFTWARE RESIDE EN LA DIFICULTAD EN LA FORMA EN LA QUE SON DETECTADAS.
            DE HECHO, CUANDO SE TRATA DE UN PROGRAMA CON UNA GRAN ENVERGADURA,
            LAS AUDITOR�AS DE VULNERABILIDADES NORMALMENTE SON ENCARGADAS A EMPRESAS EXTERNAS
            QUE SE DEDICAN A BUSCAR FALLOS DE SOFTWARE, LAS CUALES, CUENTAN CON EXPERTOS EN LA MATERIA.
                         
            CUANDO SE CREA UNA APLICACI�N SOFTWARE,
            ANTES DE LANZARLA AL MERCADO SE HACE UN ESTUDIO METICULOSO
            EN EL QUE SE INTENTAN DESCUBRIR TODOS LOS FALLOS DE SEGURIDAD DE LA MISMA,
            PUDIENDO IDENTIFICARLOS Y SOLUCIONARLOS SIN HABER PUESTO LA APLICACI�N EN PRODUCCI�N.
                         
            EN ESTE PROCESO SE PUEDEN DESCUBRIR UNA GRAN CANTIDAD DE FALLOS DE SEGURIDAD,
            PERO DESGRACIADAMENTE, ESTOS NO SER�N TODOS LOS QUE SURGIR�N,
            POR LO QUE A�N CON LA APLICACI�N EN EL MERCADO,
            SE DEBER� SEGUIR CON ESTE PROCESO ININTERRUMPIDAMENTE,
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
        
            COMO EN ESTE M�DULO ESTAMOS CENTRADOS EN EL LENGUAJE DE PROGRAMACI�N JAVA,
            VAMOS A VER LOS DOS PILARES DE LA SEGURIDAD EN LOS QUE SE BASA �STE:
                         
                    * SEGURIDAD INTERNA DE LA APLICACI�N:
                            ESTO SE REFIERE A QUE CUANDO SE PROGRAME UNA APLICACI�N
                            HAN DE SEGUIRSE UNOS CRITERIOS DE TRATAMIENTO DE ERRORES.
                            UN EJEMPLO SER�AN LOS BLOQUES TRY-CATCH-FINALLY PARA EL TRATAMIENTO DE EXCEPCIONES.
                         
                    * POL�TICAS DE ACCESO:
                            LAS POL�TICAS DE ACCESO SE REFIEREN
                            A LAS ACCIONES QUE PUEDE REALIZAR LA APLICACI�N EN NUESTRO EQUIPO,
                            ES DECIR, EL HECHO DE DAR O NO PERMISO A LA APLICACI�N
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
        
            EN EL �MBITO DE LA SEGURIDAD INFORM�TICA EXISTEN LO QUE SE DENOMINAN:
                         
            * POL�TICAS DE SEGURIDAD:
                    LAS CUALES, LAS PODEMOS DEFINIR COMO UNA SERIE DE DOCUMENTOS DE MUY ALTO NIVEL
                    QUE VAN A SER FUNDAMENTALES PARA LLEVAR A CABO EL COMPROMISO CON LA CIBERSEGURIDAD.
                         
                    ESTOS CONTIENEN LA DEFINICI�N DE LA SEGURIDAD DE LA INFORMACI�N,
                    Y LAS MEDIDAS A ADOPTAR TANTO POR LA EMPRESA, TRABAJADORES,
                    AS� COMO EL DEPARTAMENTO DE SISTEMAS,
                    PARA APLICAR TODOS LOS PROCEDIMIENTOS NECESARIOS QUE GARANTICEN
                    QUE EL TRABAJO SE DESARROLLA EN UN ENTORNO SEGURO. 
                         
                    LAS POL�TICAS DE SEGURIDAD POR S� SOLAS NO SON SUFICIENTES
                    Y DEBEN DE SER UTILIZADAS CON OTRAS MEDIDAS QUE VAN A DEPENDER DE LAS MISMAS,
                    COMO PUEDEN SER LOS OBJETIVOS DE SEGURIDAD Y LOS PROCESOS.
                         
                    LAS POL�TICAS DE SEGURIDAD DEBEN SER F�CILMENTE ACCESIBLES
                    PARA QUE TODO EL PERSONAL DE LA EMPRESA EST� AL TANTO DE SU EXISTENCIA
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
                    SI NO SE CONTROLA QUE EL USUARIO PUEDA IMTRODUCIR M�S DATOS DE LOS PREVISTOS,
                    PUEDE SUCEDER QUE EL USUARIO INTRODUZCA C�DIGO MALICIOSO EN LA MEMORIA,
                    O SI CAPTURA INCORRECTAMENTE LA EXCEPCI�N, QUE SE MUESTREN DATOS SENSIBLES DEL PROGRAMA.
                         
            UNO DE LOS FALLOS DE SEGURIDAD M�S COMUNES SE TRATA DE LOS CONOCIDOS COMO BUFFER OVERFLOW,
            LOS CUALES, SE PRODUCEN CUANDO SE DESBORDA EL TAMA�O DE UNA DETERMINADA VARIABLE.

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
                    strcpy(str, "AAAAAAAAAAAAAAAAAAAAAA");                -->   CARGA EN MEMORIA M�S DE 10 BYTES.
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
                
                    SI INTRODUCIMOS M�S DE 15 CARACTERES, 
                            - SIN COMPROBAR EL TAMA�O RESERVADO EN MEMORIA PARA LAS VARIABLES.
                            - SIN CAPTURAR LAS EXCEPCIONES.
                    SE SOBRESCRIBE LA PILA EN MEMORIA RESERVADO EN MEMORIA PARA LAS VARIABLES,
                    MACHACANDO LA PARTE DE C�DIGO DONDE SE VERIFICA LA CLAVE.
                    PROVOCANDO LA INTRUSI�N DEL USUARIO DE FORMA INDIBIDA.
                         
            EJEMPLO DE VULNERABILIDAD POR BUFFER OVERFLOW EN JAVA:
                         
                    public class Overflow {
                        
                        public static void main(String[] args) {
                         
                            int datosImportantes = 1;
                            int[] buffer = new int[10];                   -->   RESERVO UN ARRAY DE 10 ENTEROS
                         
                            for (int i=0; i<15; i++)
                                buffer[i] = 7;
                         
                            System.out.println("Overflow despu�s del buffer ");
                            System.out.println("Datos Importantes = " + datosImportantes);
                        }
                    }
                    
                    EN FUNCI�N DEL IDE Y COMPILADOR JAVA QUE SE HAYA UTILIZADO, SI NO SE DETECTA QUE PUEDE PRODUCIRSE LA EXCEPCI�N:
                            
                            Exception in thread "main"
                            java.lang.ArrayIndexOutOfBoundsException: 10
                                at Overflow.main(Overflow.java:9)
                    
                    TAMBI�N SEG�N EL ENTORNO DE EJECUCI�N DE JAVA, SE PODR�A LLEGAR A PERDER INFORMACI�N RELEVANTE,
                    Y MOSTRAR EN PANTALLA INFORMACI�N NO DESEADA AL MOSTRAR LA EXCEPCI�N -> VOLCADO DE LA PILA, 
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
        
            PARA EVITAR PARTE DE ESTOS ERRORES PODEMOS USAR LA VALIDACI�N DE DATOS MEDIANTE EXPRESIONES REGULARES,
            LA CUAL NOS VA A PERMITIR:

                    1.- MANTENER LA CONSISTENCIA DE LOS DATOS,
                        PUDIENDO COMPROBAR QUE LOS DATOS INSERTADOS CUMPLEN CIERTOS REQUISITOS.

                    2.- EVITAR DESBORDAMIENTOS DE MEMORIA BUFFER OVERFLOW,
                        PUDIENDO COMPROBAR LA LONGITUD DE LOS CAMPOS.    
                                           
            PARA PODER USAR LAS EXPRESIONES REGULARES, JAVA USA LA BIBLIOTECA  -->  java.util.regex
            LA CUAL NOS VA A PERMITIR USAR LA CLASE   --->   Pattern
            QUE PERMITE LA DEFINICI�N DE EXPRESIONES REGULARES.
                         
            CON LAS EXPRESIONES REGULARES VAMOS A PODER ESPECIFICAR
            LO QUE QUEREMOS QUE EL USUARIO TENGA QUE INTRODUCIR EN LAS ENTRADAS DE NUESTROS PROGRAMAS.
                         
                    ENTRE CORCHETES  [ ]     -->  EL CONJUNTO DE CARACTERES QUE EST� PERMITIDO.
                    ENTRE CORCHETES  [^ ]    -->  EL CONJUNTO DE CARACTERES QUE NO EST� PERMITIDO.
                    ENTRE LLAVES     { }     -->  EL N�MERO DE CARACTERES.
                         
            PARA LA VALIDACI�N DE ENTRADA PODEMOS UTILIZAR LOS SIGUIENTES ELEMENTOS Y OPERADORES:
                         
                .                   UN PUNTO INDICA CUALQUIER CAR�CTER.
                ^expresi�n          EL ^ INDICA EL PRINCIPIO DEL STRING.
                expresi�n$          EL $ INDICA EL FINAL DEL STRING.
                x                   EL CAR�CTER x
                [abc]               LOS CARACTERES a, b, O c.
                [a-z]               UNA LETRA MIN�SCULA.
                [A-Z]               UNA LETRA MAY�SCULA.
                [a-Za-z]            UNA LETRA MIN�SCULA O MAY�SCULA.
                [0-9]               UN N�MERO ENTRE 0 Y 9.
                [A-Za-z0-9]         UNA LETRA MIN�SCULA, MAY�SCULA O UN N�MERO.
                [A-Za-z0-9_]        UNA LETRA MIN�SCULA, MAY�SCULA, UN N�MERO O EL CAR�CTER _.
                [a-z]{2}            DOS LETRAS MIN�SCULAS.
                [a-z]{2,5}          ENTRE DOS Y CINCO LETRAS MIN�SCULAS.
                [a-z]{2,}           M�S DE 2 LETRAS MIN�SCULAS.
                hola|adios          SOLO SE PUEDEN INTRODUCIR LAS PALABRAS HOLA O ADI�S. | FUNCIONA COMO LA OPERACI�N OR.
                AB                  SOLO SE PUEDEN INTRODUCIR DOS EXPRESIONES. CONCATENACI�N. ESTA ES LA OPERACI�N AND.
                e(n|l)campo         LOS DELIMITADORES () PERMITEN HACER EXPRESIONES M�S COMPLEJAS.
                                    EN EL EJEMPLO SE DEBE INTRODUCIR EL TEXTO "EN CAMPO" O "EL CAMPO".
                         
                \\d                 D�GITO. EQUIVALE A [0-9]
                \\D                 NO D�GITO. EQUIVALE A [^0-9]
                \\s                 ESPACIO EN BLANCO. EQUIVALE A [\\t\\n\\x0b\\r\\f]
                \\S                 NO ESPACIO EN BLANCO. EQUIVALE A [^\\s]
                \\w                 UNA LETRA MIN�SCULA, MAY�SCULA, UN N�MERO O EL CAR�CTER _. EQUIVALE A [A-Za-z0-9_]
                \\W                 EQUIVALE A [^\\w]
                \\b                 L�MITE DE UNA PALABRA.
                         
                {X}                 INDICA QUE LO QUE VA JUSTO ANTES DE LAS LLAVES SE REPITE X VECES.
                {X,Y}               INDICA QUE LO QUE VA JUSTO ANTES DE LAS LLAVES SE REPITE M�NIMO X VECES Y M�XIMO Y VECES.
                {X,}                INDICA QUE LO QUE VA JUSTO ANTES DE LAS LLAVES SE REPITE M�NIMO X VECES Y SIN UN M�XIMO DE VECES.
                *                   INDICA UN M�NIMO DE 0 VECES Y SIN UN M�XIMO DE VECES. EQUIVALE A   --> {0,}
                +                   INDICA UN M�NIMO DE 1 VECES Y SIN UN M�XIMO DE VECES. EQUIVALE A   --> {1,}
                ?                   INDICA UN M�NIMO DE 0 VECES Y UN M�XIMO DE 1 VECES. EQUIVALE A     --> {0,1}
                         
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