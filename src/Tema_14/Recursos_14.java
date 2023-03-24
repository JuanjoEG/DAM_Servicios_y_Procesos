package Tema_14;

import static Principal_Main.Main.*;
import static Tema_14.T_14.*;

/**
 *
 * @author Juan José Estévez González
 */

public class Recursos_14 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_14 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        **********************************************************************************************************************************
        
            EN ESTA UNIDAD VAMOS A TRATAR EL CONCEPTO DE CRIPTOGRAFÍA,
            ALGO MUY IMPORTANTE CUANDO HABLAMOS DE LA SEGURIDAD DE LA INFORMACIÓN DE NUESTRAS APLICACIONES.
                         
            VAMOS A VER CÓMO SE REALIZA EL PROCESO DE ENCRIPTADO DE LA INFORMACIÓN,
            ADEMÁS DE ESTUDIAR LOS DOS MODELOS MÁS COMUNES DE LA CRIPTOGRAFÍA:
                    - EL MODELO DE CLAVE PRIVADA.
                    - EL MODELO DE CLAVE PÚBLICA.
                         
            POR ÚLTIMO,
            VAMOS A APRENDER CÓMO SE PUEDE APLICAR LA CRIPTOGRAFÍA
            A LOS PROGRAMAS QUE DESARROLLEMOS MEDIANTE LAS FIRMAS DIGITALES
            Y LOS CERTIFICADOS DIGITALES, MEDIANTE FUNCIONES HASH.
                         
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
        
            LA PALABRA CRIPTOGRAFÍA PROVIENE DEL GRIEGO:
                    - 'CRIPTO' QUE SIGNIFICA SECRETO.
                    - 'GRAFÍA' QUE SIGNIFICA ESCRITURA.
                         
            POR LO QUE LA PALABRA CRIPTOGRAFÍA SIGNIFICA --> ESCRITURA SECRETA.
                         
            LA CRIPTOGRAFÍA FUE CREADA Y ESTÁ SIENDO UTILIZADA (ENTRE OTROS USOS)
            PARA PODER ENVIAR INFORMACIÓN CONFIDENCIAL O MENSAJES PRIVADOS A CIERTAS PERSONAS U ORGANIZACIONES.
                         
            LOS PASOS A SEGUIR PARA PODER APLICAR LA CRIPTOGRAFÍA A UN MENSAJE SON LOS SIGUIENTES:
                         
                    1.- SE ESCRIBE EL MENSAJE 'NORMAL',
                        ES DECIR, SIN ENCRIPTAR.
                         
                    2.- SE UTILIZAN TÉCNICAS DE ENCRIPTADO,
                        MÁS O MENOS SOFISTICADAS PARA CODIFICA EL MENSAJE DESEADO.
                         
                    3.- SE PUEDE ENVIAR EL MENSAJE YA ENCRIPTADO POR UNA LÍNEA DE COMUNICACIONES SEGURAS, O NO SEGURAS.
                        SI ESTAMOS EN EL SEGUNDO CASO, EL MENSAJE ENVIADO PUEDE SER INTERCEPTADO.
                        ESTO NO ENTRAÑARÍA NINGÚN PELIGRO INICIALMENTE, YA QUE ESTARÍA ENCRIPTADO.
                        NO OBSTANTE, SI EL MÉTODO DE ENCRIPTACIÓN LLEVADO A CABO ES CONOCIDO O DESCIFRADO
                        POR EL ENTE QUE LO INTERCEPTA, LA INFORMACIÓN QUEDARÍA AL DESCUBIERTO.
                         
                    4.- CUANDO EL RECEPTOR RECIBA EL MENSAJE,
                        APLICARÁ LA TÉCNICA DE DESENCRIPTADO PARA PODER VER EL MENSAJE ORIGINAL.
                         
            JUNTO A LA CRIPTOGRAFÍA PODEMOS DESTACAR EL CRIPTOANÁLISIS,
            QUE ES UNA CIENCIA QUE SE DEDICA A ESTUDIAR LA FORTALEZA O ROBUSTEZ
            QUE TIENEN LOS SISTEMAS CRIPTOGRÁFICOS, PUDIENDO COMPROBAR CÓMO DE SEGUROS SON EN REALIDAD.
                         
            MEDIANTE EL CRIPTOANÁLISIS SE ESTÁN MEJORANDO DÍA A DÍA LOS SISTEMAS CRIPTOGRÁFICOS.
                         
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
        
            EXISTEN DIFERENTES TIPOS DE CRIPTOGRAFÍAS:
                         
                    * CRIPTOGRAFÍA SIMÉTRICA.
                         
                    * CRIPTOGRAFÍA DE CLAVE PÚBLICA O CRIPTOGRAFÍA ASIMÉTRICA.
                         
                    * CRIPTOGRAFÍA CON UMBRAL.
                         
                    * CRIPTOGRAFÍA BASADA EN IDENTIDAD.
                         
                    * CRIPTOGRAFÍA BASADA EN CERTIFICADOS.
                         
                    * CRIPTOGRAFÍA SIN CERTIFICADOS.
                         
                    * CRIPTOGRAFÍA DE CLAVE AISLADA.
                         
            LOS TIPOS DE CRIPTOGRAFÍA MÁS UTILIZADOS EN UN ENTORNO PROFESIONAL,
            SON LOS DE CRIPTOGRAFÍA SIMÉTRICA Y ASIMÉTRICA,
            QUE SON LOS QUE VAMOS A ESTUDIAR MÁS ADELANTE EN ESTA UNIDAD.
                         
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
        
            ALGUNAS DE LAS PRINCIPALES TECNOLOGÍAS
            REFERENTES A LA SEGURIDAD DE LA INFORMACIÓN EN INFORMÁTICA SON:
                         
                    * CORTAFUEGOS.
                         
                    * ADMINISTRACIÓN DE CUENTAS DE USUARIOS.
                         
                    * DETECCIÓN Y PREVENCIÓN DE INTRUSOS.
                         
                    * ANTIVIRUS.
                         
                    * INFRAESTRUCTURA DE LLAVE PUBLICA.
                         
                    * CAPAS DE SOCKET SEGURA (SSL).
                         
                    * CONEXIÓN ÚNICA "SINGLE SIGN ON - SSO".
                         
                    * BIOMÉTRICA.
                         
                    * CIFRADO.
                         
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
        
            BLOCKCHAIN:
                         
                    UNA DE LAS APLICACIONES MÁS EMERGENTES DE LA CRIPTOGRAFÍA,
                    Y SOBRE LA QUE MÁS SE PUEDE ESTAR INNOVANDO EN LA ACTUALIDAD,
                    ES EL CONCEPTO DE LA CADENA DE BLOQUES BLOCKCHAIN,
                    YA QUE ÉSTE, UTILIZA DIFERENTES TIPOS DE CRIPTOGRAFÍA
                    PARA GARANTIZAR LA SEGURIDAD DE LAS TRANSACCIONES.
                         
                    https://www.welivesecurity.com/la-es/2022/05/13/blockchain-que-es-como-funciona-y-como-se-esta-usando-en-el-mercado/
                         
                    EN PRIMER LUGAR,
                    SE UTILIZA EL TIPO DE --> CRIPTOGRAFÍA HASH:
                            MEDIANTE LA CUAL, SE PUEDEN CONVERTIR GRANDES CANTIDADES DE INFORMACIÓN
                            EN UNA COMBINACIÓN DE LETRAS Y NÚMEROS ÚNICA, Y MUY DIFÍCIL DE IMITAR.
                         
                            CON ESTO QUEREMOS DECIR QUE BÁSICAMENTE SE VAN A RESUMIR ENORMES CANTIDADES DE INFORMACIÓN,
                            PUDIÉNDOSE COMPROBAR RÁPIDA Y FÁCILMENTE,
                            QUE TODOS LOS PROCESOS REALIZADOS POR LOS NODOS DE LA BLOCKCHAIN COINCIDAN.
                         
                            POR OTRA PARTE,
                            EL USAR UN CÓDIGO HASH NOS VA A PERMITIR LA CREACIÓN DE LAS CLAVES PÚBLICAS Y PRIVADAS,
                            CON LAS QUE SE RECIBEN Y ENVÍAN CRIPTOMONEDAS.
                         
                            CÓMO FUNCIONA BLOCKCHAIN PASO A PASO:
                                                     
                                    1.- UN USUARIO SOLICITA UNA TRANSACCIÓN.
                                    2.- SE CREA UN BLOQUE QUE REPRESENTA LA TRANSACCIÓN.
                                    3.- EL BLOQUE SE DIFUNDE A TODOS LOS NODOS DE LA RED.
                                    4.- TODOS LOS NODOS VALIDAN EL BLOQUE Y LA TRANSACCIÓN.
                                    5.- EL BLOQUE SE AÑADE A LA CADENA.
                                    6.- LA TRANSACCIÓN SE VERIFICA Y SE EJECUTA.
                         
                    DENTRO DE LOS DATOS DE LA CADENA BLOCKCHAIN,
                    SON UTILIZADAS DIFERENTES CAPAS DE CRIPTOGRAFÍA,
                    QUE SOLAMENTE PUEDEN SER RESUELTOS POR ORDENADORES DE UNA POTENCIA CONSIDERABLE,
                    O POR UN GRAN GRUPO DE ORDENADORES TRABAJANDO AL MISMO TIEMPO.
                         
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
        
            YA EN OTRO ÁMBITO,
            CONCRETAMENTE EN LA COTIDIANEIDAD DE NUESTRO DÍA A DÍA,
            UNO DE LOS USOS MÁS COMUNES QUE TIENE LA CRIPTOGRAFÍA ESTÁ EN INTERNET.
                         
            SSL:
                    CUANDO ACCEDEMOS A UN SITIO WEB DENOMINADO COMO HTTPS
                    (FÁCILMENTE VISIBLE EN EL APARTADO DE LA URL DE NUESTRO NAVEGADOR FAVORITO),
                    ÉSTE UTILIZA EL PROTOCOLO DE SEGURIDAD DENOMINADO SSL (QUE ESTUDIAREMOS EN LA SIGUIENTE UNIDAD),
                    POR SUS SIGLAS EN INGLÉS, SECURE SOCKETS LAYER.
                     
                    ESTE PROTOCOLO SE ENCARGAR DE CIFRAR TODOS LOS DATOS QUE EL USUARIO
                    PUEDA ENVIAR AL SERVIDOR UTILIZANDO DIFERENTES ALGORITMOS CRIPTOGRÁFICOS.
                         
                    UN ÚLTIMO EJEMPLO DEL USO DE LA CRIPTOGRAFÍA
                    ESTÁ EN EL USO DE CUALQUIER SISTEMA FINANCIERO VIRTUAL, COMO PUEDE SER PAYPAL.
                         
                    CÓMO FUNCIONA SSL PASO A PASO:
                                                                         
                            1.- EL NAVEGADOR WEB SOLICITA AL SITIO WEB QUE SE IDENTIFIQUE.
                            2.- EL SITIO WEB PRESENTA UN CERTIFICADO SSL/TLS PARA IDENTIFICARSE.
                            3.- SE REALIZAN PRUEBAS PARA VERIFICAR LA VALIDEZ DEL CERTIFICADO.
                            4.- EL CERTIFICADO ES VÁLIDO.
                            5.- EL USUARIO ENVÍA LA CLAVE SIMÉTRICA DE LA SESIÓN, CIFRADA CON LA CLAVE PÚBLICA DEL SERVIDOR WEB.
                            6.- LA COMUNICACIÓN ES SEGURA.
                         
            ASÍ QUE RECUERDA,
            CADA VEZ QUE ...
                    ACCEDAS A DETERMINADAS PÁGINAS WEBS.
                    REALICES UNA COMPRA ONLINE ... 
            ESTÁS HACIENDO USO DE TODO EL POTENCIAL QUE NOS OFRECE LA CRIPTOGRAFÍA.
                         
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
        
            SISTEMAS DE CONTROL DE ACCESO EN LAS APLICACIONES:
            UNA DE LAS TAREAS MÁS COMUNES AL CREAR UNA APLICACIÓN O UNA PÁGINA WEB,
            ES TENER QUE PROGRAMAR LOS CONTROLES DE ACCESO DE LOS USUARIOS A LAS MISMAS.
                         
            ESTOS ACCESOS NUNCA DEBEN IMPLEMENTARSE EN TEXTO PLANO,
            YA QUE CON UN SIMPLE ANALIZADOR DE TRÁFICO DE RED COMO Wireschark
            PODRÍAMOS OBTENER LAS CLAVES DE ACCESO DE UNA FORMA EXTREMADAMENTE SECILLA.
                         
            LAS CLAVES DE ACCESO DEBEN ESTAR ENCRIPTADAS EN LA BASE DE DATOS DE USUARIO DE LA APLICACIÓN,
            CONSIGUIENDO ASÍ DOS BENEFICIOS DE FORMA SIMULTÁNEA:
                         
                    * AL ESTAR ESAS CLAVES ENCRIPTADAS EN LA BASE DE DATOS,
                      SI ALGUIEN CONSIGUE ENTRAR A ELLA NO PODRÁ OBTENERLAS.
                         
                    * ESTAMOS DOTANDO DE UNA ALTA SEGURIDAD A LOS ACCESOS DE LOS USUARIOS.
                         
            PARA REALIZAR ESTOS ACCESOS PODRÍAMOS SEGUÍR LOS SIGUIENTES PASOS:
                         
                    1.- OBTENER LA CLAVE QUE INTRODUCE EL USUARIO.
                         
                            usuario = obtenerUsuario();
                            clave = obtenerClave();
                         
                    2.- ENCRIPTARLA.
                         
                            clavesegura = encriptar(clave);
                         
                    3.- ENVIARLA YA ENCRIPTADA POR PETICIÓN SEGURA HTTPS
                        PARA COMPROBAR SI EL LOGIN ES CORRECTO.
                         
                            if comprobarAcceso(usuario, clavesegura) {
                         
                                4.- SI EL ACCESO ES OK --> ENTRAMOS AL SISTEMA.
                         
                            } else {
                         
                                5.- SI EL ACCESO NO ES OK --> MOSTRAMOS UN ERROR.
                         
                            }
                         
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
        
            LA ENCRIPTACIÓN O EL CIFRADO DE LA INFORMACIÓN:
                         
                    * ES EL PROCESO POR EL QUE LA INFORMACIÓN O LOS DATOS QUE SE DESEAN PROTEGER SON CODIFICADOS,
                      DANDO LUGAR A UN TEXTO QUE PARECE SER ALEATORIO, O SIN SENTIDO PARA LOS HUMANOS.
                         
            LA DESENCRIPTACIÓN:
                         
                    * ES LA OPERACIÓN INVERSA A LA ENCRIPTACIÓN, MEDIANTE LA CUAL,
                      LOS DATOS ENCRIPTADOS SE TRANSFORMAN MEDIANTE LAS TÉCNICAS INVERSAS DEL ALGORITMO UTILIZADO,
                      PARA ENCRIPTARLOS EN EL TEXTO ORIGINAL.
                         
            ES IMPORTANTE CONOCER LOS SIGUIENTES CONCEPTOS BÁSICOS PARA PODER HABLAR DE CRIPTOGRAFÍA Y ENCRIPTACIÓN:
                         
                    - TEXTO PLANO:
                            SE REFIERE AL TEXTO ORIGINAL, SIN APLICAR NINGÚN ALGORITMO DE ENCRIPTACIÓN.
                         
                    - TEXTO CIFRADO:
                            SE REFIERE AL TEXTO RESULTADO DE APLICAR EL ALGORITMO DE ENCRIPTACIÓN AL TEXTO ORIGINAL.
                         
                    - ALGORITMO DE CIFRADO: (ALGORITMO CRIPTOGRÁFICO).
                            ES EL ALGORITMO QUE UTILIZAREMOS PARA PODER ENCRIPTAR O CIFRAR EL TEXTO PLANO
                            PARA DAR LUGAR AL TEXTO CIFRADO.
                            JUNTO AL ALGORITMO DE CIFRADO EXISTE UNA CLAVE.
                         
                    - CLAVE:
                            CADENA DE CARACTERES QUE SERÁN LA BASE PARA EL ALGORITMO DE CIFRADO,
                            Y QUE PERMITIRÁN PASAR DEL TEXTO PLANO AL CIFRADO.
                            CADA CLAVE DIFERENTE PROPORCIONARÁ COMO SALIDA UN TEXTO CIFRADO DIFERENTE.
                            ESTA CLAVE PUEDE SER SIMÉTRICA O ASIMÉTRICA.
                         
            COMO RESUMEN PODEMOS DECIR QUE EL PROCESO DE ENCRIPTADO DE LA INFORMACIÓN
            SE PUEDE REPRESENTAR MEDIANTE LA SIGUIENTE FÓRMULA:
                         
                            ********************************
                            *   CIFRADO -->  F_K (M) = C   *
                            ********************************
                         
                    - F: ES EL ALGORITMO, FUNCIÓN, QUE VAMOS A UTILIZAR PARA CIFRAR LA INFORMACIÓN.
                    - K: SERÁ LA CLAVE DE CIFRADO.
                    - M: SERÁ EL MENSAJE QUE QUEREMOS CIFRAR.
                    - C: SERÁ EL TEXTO YA CIFRADO.
                         
            ASPECTOS RELEVANTES EN LOS ALGORITMOS DE ENCRIPTACIÓN:
                         
                    * LONGITUD DE LA CADENA:
                            LA CADENA ENCRIPTADA MÁS LARGA SERÁ LA MÁS COMPLICADA DE REVERTIR EN CASO DE ATAQUE.
                         
                    * TIPOS DE CARACTERES USADOS:
                            UNA ENCRIPTACIÓN SERÁ MÁS SEGURA SI USA DIFERENTES TIPOS DE CARACTERES,
                            COMO PUEDEN SER LETRAS MINUSCULAS Y MAYÚSCULAS, NÚMEROS Y SÍMBOLOS ESPECIALES.
                         
                    * TIEMPO DE ENCRIPTADO:
                            EL TIEMPO QUE SE SE TARDA EN ENCRIPTAR LA INFORMACIÓN TAMBIÉN ES MUY IMPORTANTE,
                            YA QUE PODEMOS TENER UNA INFORMACIÓN MUY SEGURA,
                            PERO TARDAR EN ENCRIPTARSE MUCHO TIEMPO, LO CUAL NO ES ACONSEJABLE.
                         
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
        
            LAS PROPIEDADES QUE SON MÁS DESEABLES EN UN SISTEMA CRIPTOGRÁFICO FUERON ENUNCIADAS POR AUGUSTE KERCKHOFFS EN 1883.
                         
            SON LAS SIGUIENTES:
                         
                    1.- SI EL SISTEMA ES TEÓRICAMENTE IRROMPIBLE, EN LA PRACTICA AL MENOS, SÍ DEBE SERLO.
                         
                    2.- LA EFECTIVIDAD DEL SISTEMA NO DEBE DEPENDER DE QUE SU DISEÑO SEA SECRETO.
                         
                    3.- LA CLAVE DEBE SER FÁCILMENTE MEMORIZABLE, DE MANERA QUE NO HAYA QUE ESCRIBIRLA.
                         
                    4.- LOS SISTEMAS CRIPTOGRÁFICOS DEBEN DAR RESULTADOS ALFANUMÉRICOS.
                         
                    5.- EL SISTEMA DE CRIPTOGRAFÍA DEBE SER OPERADO POR UNA ÚNICA PERSONA.
                         
                    6.- EL SISTEMA DEBE SER FÁCIL DE UTILIZAR.
                         
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
        
            CRIPTOGRAFÍA DE CLAVE PRIVADA O SIMÉTRICA:
                    ES UN MÉTODO DE ENCRIPTADO QUE UTILIZA UNA CLAVE QUE ES SECRETA,
                    LA CUAL SOLO PUEDEN CONOCER EL EMISOR Y EL RECEPTOR.
                    ESTE TIPO DE CRIPTOGRAFÍA ES MUY APROPIADA SI QUEREMOS GARANTIZAR LA CONFIDENCIALIDAD.
                         
            A ESTE TIPO DE CRIPTOGRAFÍA SE LA DENOMINA SIMÉTRICA PORQUE LA CLAVE DE ENCRIPTADO Y DESENCRIPTADO ES EXACTAMENTE LA MISMA.
                         
            PODEMOS DECIR QUE LAS PRINCIPALES CARACTERÍSTICAS DE LA CRIPTOGRAFÍA SIMÉTRICA SON:
                         
                    * LA CLAVE ES SECRETA,
                      DEBIENDO CONOCERLA SOLO LAS PARTES INVOLUCRADAS EN LA COMUNICACIÓN,
                      ES DECIR, EL EMISOR Y EL RECEPTOR.
                         
                    * SE UTILIZA LA MISMA CLAVE PARA CIFRAR Y PARA DESCIFRAR LOS MENSAJES DE LA COMUNICACIÓN.
                         
                    * ESTOS ALGORITMOS DE CIFRADO SUELEN SER MUY RÁPIDOS Y NO SUELEN AUMENTAR EL TAMAÑO DEL MENSAJE,
                      ES DEBIDO A ESTO QUE SON MUY APROPIADOS PARA ENCRIPTAR GRANDES CANTIDADES DE TEXTO.
                         
            LA CRIPTOGRAFÍA DE CLAVE PRIVADA TAMBIÉN TIENE UNA SERIE DE INCONVENIENTES,
            PUDIENDO DESTACAR LOS SIGUIENTES:
                         
                    * COMO LA CLAVE DE CIFRADO Y DESCIFRADO ES LA MISMA,
                      EN EL MOMENTO DEL ENVÍO DE ÉSTA POR PARTE DEL EMISOR AL RECEPTOR,
                      ESTE MENSAJE PUEDE SER INTERCEPTADO Y UNA PERSONA NO DESEADA PUEDE HACERSE CON ELLA.
                         
                    * COMO LAS CLAVES SE UTILIZAN EN UNA ÚNICA COMUNICACIÓN,
                      SI SE DESEAN COMUNICAR VARIAS PERSONAS,
                      DEBERÁ HABER UNA CLAVE PARA CADA COMBINACIÓN DE PERSONAS DIFERENTES QUE VAYAN A COMUNICARSE,
                      GENERANDO ASÍ UNA ENORME CANTIDAD DE CLAVES.
                         
            UNA ALTERNATIVA PARA SOLUCIONAR LOS PROBLEMAS DE DISTRIBUCIÓN DE CLAVES Y TODO LO QUE SE DERIVA DE ELLO,
            PUEDEN SER LA CRIPTOGRAFÍA ASIMÉTRICA Y LA CRIPTOGRAFÍA HÍBRIDA QUE ESTUDIAREMOS A CONTINUACIÓN.
                         
            UN EJEMPLO PRÁCTICO DONDE SE UTILIZABA ESTE TIPO DE CRIPTOGRAFÍA FUE LA MÁQUINA ENIGMA,
            UTILIZADA POR LA ALEMANIA NAZI EN LA SEGUNDA GUERRA MUNDIAL PARA CIFRAR SUS COMUNICACIONES.
                         
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
        
            CRIPTOGRAFÍA DE CLAVE PÚBLICA O ASIMÉTRICA:
                    SURGIÓ PARA SOLUCIONAR EL PROBLEMA DE DISTRIBUCIÓN DE CLAVES QUE SUFRÍA LA CRIPTOGRAFÍA DE CLAVE PRIVADA,
                    PERMITIENDO ASÍ TANTO AL EMISOR COMO AL RECEPTOR
                    PODER PONER EN COMÚN UNAS CLAVES MEDIANTE UN CANAL (INCLUSO NO SEGURO) DE COMUNICACIÓN.
                         
            A ESTE TIPO DE CRIPTOGRAFÍA SE LE DENOMINA ASIMÉTRICA
            PORQUE LAS CLAVES DE ENCRIPTADO Y DESENCRIPTADO SON DIFERENTES,
            A DIFERENCIA DE LA CRIPTOGRAFÍA DE CLAVE PRIVADA.
                         
            PODEMOS LISTAR LAS CARACTERÍSTICAS MÁS IMPORTANTES DE ESTE TIPO DE CRIPTOGRAFÍA:
                         
                    - TANTO EMISOR COMO RECEPTOR TIENEN EN SU PODER UN PAR DE CLAVES,
                      UNA QUE ES PÚBLICA, QUE ES CONOCIDA POR TODO EL MUNDO
                      Y QUE EL HECHO DE CONOCERLA NO IMPLICA CONOCER NINGÚN TIPO DE INFORMACIÓN SOBRE LA CLAVE PRIVADA INVERSA,
                      Y OTRA QUE ES PRIVADA, QUE LA CONOCE ÚNICAMENTE SU POSEEDOR.
                         
                    - TODAS LAS PAREJAS DE CLAVES SIRVEN ÚNICAMENTE CON ELLAS MISMAS,
                      ES DECIR, QUE SON COMPLEMENTARIAS,
                      Y EL PROCESO NO FUNCIONARÁ SI ALGUNA DE ELLAS ES CAMBIADA.
                         
                    - LAS CLAVES DE ENCRIPTADO Y DESENCRIPTADO ÚNICAMENTE SE PUEDEN GENERAR UNA VEZ,
                      DE ESTA FORMA, ES PRÁCTICAMENTE IMPOSIBLE QUE DOS PERSONAS OBTENGAN LAS MISMAS CLAVES.
                         
                    - CUANDO UN MENSAJE ES CIFRADO CON LA CLAVE PÚBLICA,
                      ÚNICAMENTE SE VA A PODER DESCIFRAR CON LA CLAVE PRIVADA QUE SEA LA INVERSA A ESA CLAVE PÚBLICA.
                         
                    - CUANDO CIFRAMOS UN MENSAJE CON LA CLAVE PRIVADA,
                      ESTAMOS DEMOSTRANDO QUE NOSOTROS HEMOS SIDO QUIENES HEMOS CIFRADO DICHO MENSAJE.
                         
            LA GRAN VENTAJA QUE OFRECE ESTE TIPO DE CRIPTOGRAFÍA ES QUE YA NO EXISTE EL PROBLEMA DE LA DISTRIBUCIÓN DE CLAVES.
                         
            LA CRIPTOGRAFÍA DE CLAVE PÚBLICA TAMBIÉN TIENE ALGUNOS INCONVENIENTES:
                         
                    - ESTOS ALGORITMOS SON ALGO MÁS LENTOS.
                         
                    - HAY QUE PODER GARANTIZAR QUE LA CLAVE PÚBLICA ES REALMENTE DE QUIEN DICE SER.
                         
            LO MÁS ÓPTIMO SERÍA UTILIZAR UNA COMBINACIÓN DE CRIPTOGRAFÍA DE CLAVE PÚBLICA Y DE CLAVE PRIVADA,
            LO QUE SE CONOCE COMO CRIPTOGRAFÍA HÍBRIDA.
                         
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
        
            FIRMA DIGITAL:
                    LAS FIRMAS DIGITALES SON EL EQUIVALENTE A LAS FIRMAS PERSONALES,
                    PERO EN UN ENTORNO TECNOLÓGICO, ES DECIR,
                    SU OBJETIVO ES IDENTIFICAR AL FIRMANTE INEQUÍVOCAMENTE,
                    PERO EN LUGAR DE HACERLO EN PAPEL, SE LLEVARÍA A CABO DE FORMA DIGITAL.
                         
                    LAS FIRMAS DIGITALES ESTÁN BASADAS EN CRIPTOGRAFÍA DE CLAVE PÚBLICA Y RESUMEN DE MENSAJES HASH.
                         
                            https://latam.kaspersky.com/blog/que-es-un-hash-y-como-funciona/2806/
                      
            HASH FUNCTION:
                    UNA FUNCIÓN RESUMEN, EN INGLÉS,
                    CONVIERTE UNO O VARIOS ELEMENTOS DE ENTRADA A UNA FUNCIÓN EN OTRO ELEMENTO.
                    TAMBIÉN SE LAS CONOCE COMO FUNCIÓN EXTRACTO, DEL INGLÉS DIGEST FUNCTION,
                    FUNCIÓN DE EXTRACTADO O EXTRACCIÓN.
                         
            MESSAGE-DIGEST ALGORITHM:
                    UN RESUMEN DE MENSAJES (MESSAGE-DIGEST ALGORITHM, EN INGLÉS)
                    ES UN ALGORITMO QUE PARA ENCRIPTAR,
                    TOMA COMO ENTRADA UN MENSAJE CON UNA LONGITUD VARIABLE
                    Y LO CONVIERTE EN UN RESUMEN DE UNA LONGITUD FIJA.
                    ALGUNOS ALGORITMOS DE ESTE TIPO SON:
                            - MD5: ABREVIATURA DE MESSAGE-DIGEST ALGORITHM 5.
                            - SHA: SECURE HASH ALGORITHM.
                         
            CERTIFICADOS DIGITALES:
                    OTRO ELEMENTO MÁS QUE INTERVIENE EN EL PROCESO DE CRIPTOGRAFÍA SON LOS CERTIFICADOS DIGITALES.
                    ÉSTOS SE DISEÑARON PARA RESOLVER EL PROBLEMA DE LA CONFIANZA
                    QUE HAN DE DEPOSITAR LAS DOS PARTES INVOLUCRADAS EN LA COMUNICACIÓN, ES DECIR,
                    UN CERTIFICADO DIGITAL ES UN DOCUMENTO ELECTRÓNICO
                    FIRMADO POR UN TERCERO (ENTIDAD CERTIFICADORA)
                    QUE DA FE DE LOS DATOS DE LA FIRMA DIGITAL EMPLEADA.
                         
                    DE FORMA GENÉRICA, PODEMOS DECIR QUE VIENEN A SER COMO EL NOTARIO DE LA FIRMA DIGITAL.
                         
            ENTIDAD CERTIFICADORA:
                    ES UNA ORGANIZACIÓN QUE SE RESPONSABILIZA DE LA VERACIDAD DE LOS DATOS DE LOS FIRMANTES DIGITALES,
                    Y, POR TANTO, DE LA EMISIÓN Y VALIDEZ DE LOS CERTIFICADOS OPORTUNOS.
                         
                    CREÁNDOLOS Y APORTANDO MECANISMOS QUE PERMITAN PODER REVOCARLOS, SUSPENDERLOS, Y COMPROBAR SU VALIDEZ.
                         
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
        
            EXTRAPOLANDO TODOS ESTOS CONCEPTOS A UN ENTORNO DE PROGRAMACIÓN:
                         
            PODEMOS DESTACAR QUE EN JAVA SE USA LA CLASE  --------------------->  MessageDigest
                         
            EN EL MÉTODO ------------------------------------------------------>  getInstance() 
                    ES DONDE PODREMOS INDICAR CUALQUIERA
                    DE LOS ALGORITMOS LISTADOS ANTERIORMENTE
                    PARA CIFRAR EL MENSAJE CON UNA FUNCIÓN HASH.
                         
            Y LOS ALGORITMOS QUE PODEMOS EMPLEAR SON:

                    * MD2.
                    * MD5.
                    * SHA-1.
                    * SHA-256.
                    * SHA-384.
                    * SHA-512.

            CADA VEZ QUE VAYAMOS A ENCRIPTAR UN TEXTO 
            DEBEREMOS CONTROLAR LA EXCEPCIÓN ---------------------------------->  NoSuchAlgorithmException
            MEDIANTE UN BLOQUE try-catch.

            EL MÉTODO --------------------------------------------------------->  digest()
            DEVUELVE UN ARRAY DE BYTES,
            POR LO QUE PARA DETERMINADAS OPERACIONES CON ESE RESULTADO,
            HABRÁ QUE TRANSFORMAR ESE RESULTADO A OTRO TIPO DE DATOS.
            POR EJEMPLO, PARA MOSTRARLO POR PANTALLA.
                         
            public static void main(String[] args) {

                try {                                                           // TENEMOS QUE CONTROLAR LA EXCEPCIÓN NoSuchAlgorithmException
                    Scanner teclado = new Scanner(System.in, "UTF-8");
                    System.out.println("Introduce la contraseña a cifrar:");
                    String mi_contr = teclado.nextLine();

                    MessageDigest md_1 = MessageDigest.getInstance("SHA-256");  // CREAMOS UNA INSTANCIA DE MessageDigest CON EL TIPO DE CIFRADO SHA-256
                    md_1.update(mi_contr.getBytes());                           // CON EL MÉTODO update CODIFICAMOS mi_contr USANDO EL CIFRADO DE md_1
                    byte[] byteData_1 = md_1.digest();                          // EL RESULTADO SERÁ CON LA FUNCIÓN digest, Y VENDRÁ DADO EN UN ARRAY DE TIPO BYTE.
                    StringBuilder sb_1 = new StringBuilder();                   // MEDIANTE UN StringBuilder VAMOS A TRADUCIR EL TEXTO CIFRADO, YA QUE VIENE DADO EN BYTE.
                    for (int i = 0; i < byteData_1.length; i++) {               // DE ESTA FORMA LO VAMOS A PASAR A STRING.
                        sb_1.append(Integer.toString((byteData_1[i] & 0xff) + 0x100,16).substring(1));
                    }                                                           // LO MOSTRAMOS.
                    System.out.println("**********************************************");
                    System.out.println("*   Contraseña -> " + mi_contr);
                    System.out.println("*   SHA-256    -> " + sb_1.toString());
                    System.out.println("**********************************************");

                }  catch (NoSuchAlgorithmException error) {
                    System.out.println("Error: " + error.toString());
                }
            }
                              
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
        
            UNA FUNCIÓN HASH, --> RESUMEN
                    RESUME EL PARÁMETRO QUE SE LE PASA COMO ENTRADA, --> TEXTO O FICHERO.
                    A UNA CADENA DE BYTES DE UN TAMAÑO FIJO DETERMINADO.
                         
                    ADEMÁS, NO PUEDE HABER DOS ENTRADAS DIFERENTES QUE TENGAN EL MISMO RESULTADO DE LA FUNCIÓN HASH.
                         
                    POR ESTE MOTIVO, APLICANDO ESTAS FUNCIONES A FICHEROS, Y COMPARANDO LOS RESULTADOS,
                    PODEMOS GARANTIZAR SI UN FICHERO HA SIDO MODIFICADO O NO.
                         
            EL PROPIO SISTEMA OPERATIVO WINDOWS INCLUYE EN SUS ÚLTIMAS VERSIONES, LA UTILIDAD DE LINEA DE COMANDO  -->  certutil
            CON LA QUE PODEMOS OBTENER LOS RESÍMENES HASH DE LOS FICHEROS, Y HACER ESTA COMPROBACIÓN.
                         
            EL COMANDO certutil PUEDE OBTENER RESÚMENES HASH UTILIZANDO DIFERENTES ALGORITMOS,
            UNO DE LOS PARÁMETROS DEL COMANDO ES EL ALGORITMO QUE SE QUIERE UTILIZAR.  
                         
            EN EL CMD ESCRIBO:
                         
                    > certutil -hashfile mifichero.txt MD5
                         
                    MD5 HASH DE MIFICHERO.TXT:
                    a4d85789e1efa17bdd71828725df97e4
                    CertUtil: -hashfile comando completado correctamente.
                         
                    SI VOLVEMOS A EJECUTAR EL MISMO COMANDO PERO EN OTRO MOMENTO,
                    PODREMOS SABER SI EL FICHERO HA SIDO MODIFICADO O NO, 
                    COMPARANDO LOS RESULTADOS.
                         
            CUANDO DESCARGAMOS UN PROGRAMA DE UNA PÁGINA WEB,
            UTILIZANDO FUNCIONES HASH PODEMOS VERIFICAR 
            SI LOS PROGRAMAS QUE NOS HEMOS DESCARGADO SON LOS MISMOS
            QUE PUBLICÓ EL FABRICANTE O PROGRAMADOR.
                         
                    CHECKSUM:
                            EL FABRICANTE O PROGRAMADOR APLICA UNA FUNCIÓN HASH A SU PROGRAMA.
                            PARA OBTENER UN RESUMEN QUE SE USARÁ COMO FIRMA DIGITAL.
                         
                    CERTUTIL:
                            NOSOTROSNOS LO DESCARGAMOS Y UTILIZANDO CERTUTIL
                            PODEMOS OBTENER EL HASH CON EL MISMO ALGORITMO,
                            Y DEBEMOS OBTENER EL MISMO RESULTADO.
                         
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
                case "15" -> {
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