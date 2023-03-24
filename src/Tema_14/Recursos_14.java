package Tema_14;

import static Principal_Main.Main.*;
import static Tema_14.T_14.*;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Recursos_14 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_14 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        **********************************************************************************************************************************
        
            EN ESTA UNIDAD VAMOS A TRATAR EL CONCEPTO DE CRIPTOGRAF�A,
            ALGO MUY IMPORTANTE CUANDO HABLAMOS DE LA SEGURIDAD DE LA INFORMACI�N DE NUESTRAS APLICACIONES.
                         
            VAMOS A VER C�MO SE REALIZA EL PROCESO DE ENCRIPTADO DE LA INFORMACI�N,
            ADEM�S DE ESTUDIAR LOS DOS MODELOS M�S COMUNES DE LA CRIPTOGRAF�A:
                    - EL MODELO DE CLAVE PRIVADA.
                    - EL MODELO DE CLAVE P�BLICA.
                         
            POR �LTIMO,
            VAMOS A APRENDER C�MO SE PUEDE APLICAR LA CRIPTOGRAF�A
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
        
            LA PALABRA CRIPTOGRAF�A PROVIENE DEL GRIEGO:
                    - 'CRIPTO' QUE SIGNIFICA SECRETO.
                    - 'GRAF�A' QUE SIGNIFICA ESCRITURA.
                         
            POR LO QUE LA PALABRA CRIPTOGRAF�A SIGNIFICA --> ESCRITURA SECRETA.
                         
            LA CRIPTOGRAF�A FUE CREADA Y EST� SIENDO UTILIZADA (ENTRE OTROS USOS)
            PARA PODER ENVIAR INFORMACI�N CONFIDENCIAL O MENSAJES PRIVADOS A CIERTAS PERSONAS U ORGANIZACIONES.
                         
            LOS PASOS A SEGUIR PARA PODER APLICAR LA CRIPTOGRAF�A A UN MENSAJE SON LOS SIGUIENTES:
                         
                    1.- SE ESCRIBE EL MENSAJE 'NORMAL',
                        ES DECIR, SIN ENCRIPTAR.
                         
                    2.- SE UTILIZAN T�CNICAS DE ENCRIPTADO,
                        M�S O MENOS SOFISTICADAS PARA CODIFICA EL MENSAJE DESEADO.
                         
                    3.- SE PUEDE ENVIAR EL MENSAJE YA ENCRIPTADO POR UNA L�NEA DE COMUNICACIONES SEGURAS, O NO SEGURAS.
                        SI ESTAMOS EN EL SEGUNDO CASO, EL MENSAJE ENVIADO PUEDE SER INTERCEPTADO.
                        ESTO NO ENTRA�AR�A NING�N PELIGRO INICIALMENTE, YA QUE ESTAR�A ENCRIPTADO.
                        NO OBSTANTE, SI EL M�TODO DE ENCRIPTACI�N LLEVADO A CABO ES CONOCIDO O DESCIFRADO
                        POR EL ENTE QUE LO INTERCEPTA, LA INFORMACI�N QUEDAR�A AL DESCUBIERTO.
                         
                    4.- CUANDO EL RECEPTOR RECIBA EL MENSAJE,
                        APLICAR� LA T�CNICA DE DESENCRIPTADO PARA PODER VER EL MENSAJE ORIGINAL.
                         
            JUNTO A LA CRIPTOGRAF�A PODEMOS DESTACAR EL CRIPTOAN�LISIS,
            QUE ES UNA CIENCIA QUE SE DEDICA A ESTUDIAR LA FORTALEZA O ROBUSTEZ
            QUE TIENEN LOS SISTEMAS CRIPTOGR�FICOS, PUDIENDO COMPROBAR C�MO DE SEGUROS SON EN REALIDAD.
                         
            MEDIANTE EL CRIPTOAN�LISIS SE EST�N MEJORANDO D�A A D�A LOS SISTEMAS CRIPTOGR�FICOS.
                         
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
        
            EXISTEN DIFERENTES TIPOS DE CRIPTOGRAF�AS:
                         
                    * CRIPTOGRAF�A SIM�TRICA.
                         
                    * CRIPTOGRAF�A DE CLAVE P�BLICA O CRIPTOGRAF�A ASIM�TRICA.
                         
                    * CRIPTOGRAF�A CON UMBRAL.
                         
                    * CRIPTOGRAF�A BASADA EN IDENTIDAD.
                         
                    * CRIPTOGRAF�A BASADA EN CERTIFICADOS.
                         
                    * CRIPTOGRAF�A SIN CERTIFICADOS.
                         
                    * CRIPTOGRAF�A DE CLAVE AISLADA.
                         
            LOS TIPOS DE CRIPTOGRAF�A M�S UTILIZADOS EN UN ENTORNO PROFESIONAL,
            SON LOS DE CRIPTOGRAF�A SIM�TRICA Y ASIM�TRICA,
            QUE SON LOS QUE VAMOS A ESTUDIAR M�S ADELANTE EN ESTA UNIDAD.
                         
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
        
            ALGUNAS DE LAS PRINCIPALES TECNOLOG�AS
            REFERENTES A LA SEGURIDAD DE LA INFORMACI�N EN INFORM�TICA SON:
                         
                    * CORTAFUEGOS.
                         
                    * ADMINISTRACI�N DE CUENTAS DE USUARIOS.
                         
                    * DETECCI�N Y PREVENCI�N DE INTRUSOS.
                         
                    * ANTIVIRUS.
                         
                    * INFRAESTRUCTURA DE LLAVE PUBLICA.
                         
                    * CAPAS DE SOCKET SEGURA (SSL).
                         
                    * CONEXI�N �NICA "SINGLE SIGN ON - SSO".
                         
                    * BIOM�TRICA.
                         
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
                         
                    UNA DE LAS APLICACIONES M�S EMERGENTES DE LA CRIPTOGRAF�A,
                    Y SOBRE LA QUE M�S SE PUEDE ESTAR INNOVANDO EN LA ACTUALIDAD,
                    ES EL CONCEPTO DE LA CADENA DE BLOQUES BLOCKCHAIN,
                    YA QUE �STE, UTILIZA DIFERENTES TIPOS DE CRIPTOGRAF�A
                    PARA GARANTIZAR LA SEGURIDAD DE LAS TRANSACCIONES.
                         
                    https://www.welivesecurity.com/la-es/2022/05/13/blockchain-que-es-como-funciona-y-como-se-esta-usando-en-el-mercado/
                         
                    EN PRIMER LUGAR,
                    SE UTILIZA EL TIPO DE --> CRIPTOGRAF�A HASH:
                            MEDIANTE LA CUAL, SE PUEDEN CONVERTIR GRANDES CANTIDADES DE INFORMACI�N
                            EN UNA COMBINACI�N DE LETRAS Y N�MEROS �NICA, Y MUY DIF�CIL DE IMITAR.
                         
                            CON ESTO QUEREMOS DECIR QUE B�SICAMENTE SE VAN A RESUMIR ENORMES CANTIDADES DE INFORMACI�N,
                            PUDI�NDOSE COMPROBAR R�PIDA Y F�CILMENTE,
                            QUE TODOS LOS PROCESOS REALIZADOS POR LOS NODOS DE LA BLOCKCHAIN COINCIDAN.
                         
                            POR OTRA PARTE,
                            EL USAR UN C�DIGO HASH NOS VA A PERMITIR LA CREACI�N DE LAS CLAVES P�BLICAS Y PRIVADAS,
                            CON LAS QUE SE RECIBEN Y ENV�AN CRIPTOMONEDAS.
                         
                            C�MO FUNCIONA BLOCKCHAIN PASO A PASO:
                                                     
                                    1.- UN USUARIO SOLICITA UNA TRANSACCI�N.
                                    2.- SE CREA UN BLOQUE QUE REPRESENTA LA TRANSACCI�N.
                                    3.- EL BLOQUE SE DIFUNDE A TODOS LOS NODOS DE LA RED.
                                    4.- TODOS LOS NODOS VALIDAN EL BLOQUE Y LA TRANSACCI�N.
                                    5.- EL BLOQUE SE A�ADE A LA CADENA.
                                    6.- LA TRANSACCI�N SE VERIFICA Y SE EJECUTA.
                         
                    DENTRO DE LOS DATOS DE LA CADENA BLOCKCHAIN,
                    SON UTILIZADAS DIFERENTES CAPAS DE CRIPTOGRAF�A,
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
        
            YA EN OTRO �MBITO,
            CONCRETAMENTE EN LA COTIDIANEIDAD DE NUESTRO D�A A D�A,
            UNO DE LOS USOS M�S COMUNES QUE TIENE LA CRIPTOGRAF�A EST� EN INTERNET.
                         
            SSL:
                    CUANDO ACCEDEMOS A UN SITIO WEB DENOMINADO COMO HTTPS
                    (F�CILMENTE VISIBLE EN EL APARTADO DE LA URL DE NUESTRO NAVEGADOR FAVORITO),
                    �STE UTILIZA EL PROTOCOLO DE SEGURIDAD DENOMINADO SSL (QUE ESTUDIAREMOS EN LA SIGUIENTE UNIDAD),
                    POR SUS SIGLAS EN INGL�S, SECURE SOCKETS LAYER.
                     
                    ESTE PROTOCOLO SE ENCARGAR DE CIFRAR TODOS LOS DATOS QUE EL USUARIO
                    PUEDA ENVIAR AL SERVIDOR UTILIZANDO DIFERENTES ALGORITMOS CRIPTOGR�FICOS.
                         
                    UN �LTIMO EJEMPLO DEL USO DE LA CRIPTOGRAF�A
                    EST� EN EL USO DE CUALQUIER SISTEMA FINANCIERO VIRTUAL, COMO PUEDE SER PAYPAL.
                         
                    C�MO FUNCIONA SSL PASO A PASO:
                                                                         
                            1.- EL NAVEGADOR WEB SOLICITA AL SITIO WEB QUE SE IDENTIFIQUE.
                            2.- EL SITIO WEB PRESENTA UN CERTIFICADO SSL/TLS PARA IDENTIFICARSE.
                            3.- SE REALIZAN PRUEBAS PARA VERIFICAR LA VALIDEZ DEL CERTIFICADO.
                            4.- EL CERTIFICADO ES V�LIDO.
                            5.- EL USUARIO ENV�A LA CLAVE SIM�TRICA DE LA SESI�N, CIFRADA CON LA CLAVE P�BLICA DEL SERVIDOR WEB.
                            6.- LA COMUNICACI�N ES SEGURA.
                         
            AS� QUE RECUERDA,
            CADA VEZ QUE ...
                    ACCEDAS A DETERMINADAS P�GINAS WEBS.
                    REALICES UNA COMPRA ONLINE ... 
            EST�S HACIENDO USO DE TODO EL POTENCIAL QUE NOS OFRECE LA CRIPTOGRAF�A.
                         
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
            UNA DE LAS TAREAS M�S COMUNES AL CREAR UNA APLICACI�N O UNA P�GINA WEB,
            ES TENER QUE PROGRAMAR LOS CONTROLES DE ACCESO DE LOS USUARIOS A LAS MISMAS.
                         
            ESTOS ACCESOS NUNCA DEBEN IMPLEMENTARSE EN TEXTO PLANO,
            YA QUE CON UN SIMPLE ANALIZADOR DE TR�FICO DE RED COMO Wireschark
            PODR�AMOS OBTENER LAS CLAVES DE ACCESO DE UNA FORMA EXTREMADAMENTE SECILLA.
                         
            LAS CLAVES DE ACCESO DEBEN ESTAR ENCRIPTADAS EN LA BASE DE DATOS DE USUARIO DE LA APLICACI�N,
            CONSIGUIENDO AS� DOS BENEFICIOS DE FORMA SIMULT�NEA:
                         
                    * AL ESTAR ESAS CLAVES ENCRIPTADAS EN LA BASE DE DATOS,
                      SI ALGUIEN CONSIGUE ENTRAR A ELLA NO PODR� OBTENERLAS.
                         
                    * ESTAMOS DOTANDO DE UNA ALTA SEGURIDAD A LOS ACCESOS DE LOS USUARIOS.
                         
            PARA REALIZAR ESTOS ACCESOS PODR�AMOS SEGU�R LOS SIGUIENTES PASOS:
                         
                    1.- OBTENER LA CLAVE QUE INTRODUCE EL USUARIO.
                         
                            usuario = obtenerUsuario();
                            clave = obtenerClave();
                         
                    2.- ENCRIPTARLA.
                         
                            clavesegura = encriptar(clave);
                         
                    3.- ENVIARLA YA ENCRIPTADA POR PETICI�N SEGURA HTTPS
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
        
            LA ENCRIPTACI�N O EL CIFRADO DE LA INFORMACI�N:
                         
                    * ES EL PROCESO POR EL QUE LA INFORMACI�N O LOS DATOS QUE SE DESEAN PROTEGER SON CODIFICADOS,
                      DANDO LUGAR A UN TEXTO QUE PARECE SER ALEATORIO, O SIN SENTIDO PARA LOS HUMANOS.
                         
            LA DESENCRIPTACI�N:
                         
                    * ES LA OPERACI�N INVERSA A LA ENCRIPTACI�N, MEDIANTE LA CUAL,
                      LOS DATOS ENCRIPTADOS SE TRANSFORMAN MEDIANTE LAS T�CNICAS INVERSAS DEL ALGORITMO UTILIZADO,
                      PARA ENCRIPTARLOS EN EL TEXTO ORIGINAL.
                         
            ES IMPORTANTE CONOCER LOS SIGUIENTES CONCEPTOS B�SICOS PARA PODER HABLAR DE CRIPTOGRAF�A Y ENCRIPTACI�N:
                         
                    - TEXTO PLANO:
                            SE REFIERE AL TEXTO ORIGINAL, SIN APLICAR NING�N ALGORITMO DE ENCRIPTACI�N.
                         
                    - TEXTO CIFRADO:
                            SE REFIERE AL TEXTO RESULTADO DE APLICAR EL ALGORITMO DE ENCRIPTACI�N AL TEXTO ORIGINAL.
                         
                    - ALGORITMO DE CIFRADO: (ALGORITMO CRIPTOGR�FICO).
                            ES EL ALGORITMO QUE UTILIZAREMOS PARA PODER ENCRIPTAR O CIFRAR EL TEXTO PLANO
                            PARA DAR LUGAR AL TEXTO CIFRADO.
                            JUNTO AL ALGORITMO DE CIFRADO EXISTE UNA CLAVE.
                         
                    - CLAVE:
                            CADENA DE CARACTERES QUE SER�N LA BASE PARA EL ALGORITMO DE CIFRADO,
                            Y QUE PERMITIR�N PASAR DEL TEXTO PLANO AL CIFRADO.
                            CADA CLAVE DIFERENTE PROPORCIONAR� COMO SALIDA UN TEXTO CIFRADO DIFERENTE.
                            ESTA CLAVE PUEDE SER SIM�TRICA O ASIM�TRICA.
                         
            COMO RESUMEN PODEMOS DECIR QUE EL PROCESO DE ENCRIPTADO DE LA INFORMACI�N
            SE PUEDE REPRESENTAR MEDIANTE LA SIGUIENTE F�RMULA:
                         
                            ********************************
                            *   CIFRADO -->  F_K (M) = C   *
                            ********************************
                         
                    - F: ES EL ALGORITMO, FUNCI�N, QUE VAMOS A UTILIZAR PARA CIFRAR LA INFORMACI�N.
                    - K: SER� LA CLAVE DE CIFRADO.
                    - M: SER� EL MENSAJE QUE QUEREMOS CIFRAR.
                    - C: SER� EL TEXTO YA CIFRADO.
                         
            ASPECTOS RELEVANTES EN LOS ALGORITMOS DE ENCRIPTACI�N:
                         
                    * LONGITUD DE LA CADENA:
                            LA CADENA ENCRIPTADA M�S LARGA SER� LA M�S COMPLICADA DE REVERTIR EN CASO DE ATAQUE.
                         
                    * TIPOS DE CARACTERES USADOS:
                            UNA ENCRIPTACI�N SER� M�S SEGURA SI USA DIFERENTES TIPOS DE CARACTERES,
                            COMO PUEDEN SER LETRAS MINUSCULAS Y MAY�SCULAS, N�MEROS Y S�MBOLOS ESPECIALES.
                         
                    * TIEMPO DE ENCRIPTADO:
                            EL TIEMPO QUE SE SE TARDA EN ENCRIPTAR LA INFORMACI�N TAMBI�N ES MUY IMPORTANTE,
                            YA QUE PODEMOS TENER UNA INFORMACI�N MUY SEGURA,
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
        
            LAS PROPIEDADES QUE SON M�S DESEABLES EN UN SISTEMA CRIPTOGR�FICO FUERON ENUNCIADAS POR AUGUSTE KERCKHOFFS EN 1883.
                         
            SON LAS SIGUIENTES:
                         
                    1.- SI EL SISTEMA ES TE�RICAMENTE IRROMPIBLE, EN LA PRACTICA AL MENOS, S� DEBE SERLO.
                         
                    2.- LA EFECTIVIDAD DEL SISTEMA NO DEBE DEPENDER DE QUE SU DISE�O SEA SECRETO.
                         
                    3.- LA CLAVE DEBE SER F�CILMENTE MEMORIZABLE, DE MANERA QUE NO HAYA QUE ESCRIBIRLA.
                         
                    4.- LOS SISTEMAS CRIPTOGR�FICOS DEBEN DAR RESULTADOS ALFANUM�RICOS.
                         
                    5.- EL SISTEMA DE CRIPTOGRAF�A DEBE SER OPERADO POR UNA �NICA PERSONA.
                         
                    6.- EL SISTEMA DEBE SER F�CIL DE UTILIZAR.
                         
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
        
            CRIPTOGRAF�A DE CLAVE PRIVADA O SIM�TRICA:
                    ES UN M�TODO DE ENCRIPTADO QUE UTILIZA UNA CLAVE QUE ES SECRETA,
                    LA CUAL SOLO PUEDEN CONOCER EL EMISOR Y EL RECEPTOR.
                    ESTE TIPO DE CRIPTOGRAF�A ES MUY APROPIADA SI QUEREMOS GARANTIZAR LA CONFIDENCIALIDAD.
                         
            A ESTE TIPO DE CRIPTOGRAF�A SE LA DENOMINA SIM�TRICA PORQUE LA CLAVE DE ENCRIPTADO Y DESENCRIPTADO ES EXACTAMENTE LA MISMA.
                         
            PODEMOS DECIR QUE LAS PRINCIPALES CARACTER�STICAS DE LA CRIPTOGRAF�A SIM�TRICA SON:
                         
                    * LA CLAVE ES SECRETA,
                      DEBIENDO CONOCERLA SOLO LAS PARTES INVOLUCRADAS EN LA COMUNICACI�N,
                      ES DECIR, EL EMISOR Y EL RECEPTOR.
                         
                    * SE UTILIZA LA MISMA CLAVE PARA CIFRAR Y PARA DESCIFRAR LOS MENSAJES DE LA COMUNICACI�N.
                         
                    * ESTOS ALGORITMOS DE CIFRADO SUELEN SER MUY R�PIDOS Y NO SUELEN AUMENTAR EL TAMA�O DEL MENSAJE,
                      ES DEBIDO A ESTO QUE SON MUY APROPIADOS PARA ENCRIPTAR GRANDES CANTIDADES DE TEXTO.
                         
            LA CRIPTOGRAF�A DE CLAVE PRIVADA TAMBI�N TIENE UNA SERIE DE INCONVENIENTES,
            PUDIENDO DESTACAR LOS SIGUIENTES:
                         
                    * COMO LA CLAVE DE CIFRADO Y DESCIFRADO ES LA MISMA,
                      EN EL MOMENTO DEL ENV�O DE �STA POR PARTE DEL EMISOR AL RECEPTOR,
                      ESTE MENSAJE PUEDE SER INTERCEPTADO Y UNA PERSONA NO DESEADA PUEDE HACERSE CON ELLA.
                         
                    * COMO LAS CLAVES SE UTILIZAN EN UNA �NICA COMUNICACI�N,
                      SI SE DESEAN COMUNICAR VARIAS PERSONAS,
                      DEBER� HABER UNA CLAVE PARA CADA COMBINACI�N DE PERSONAS DIFERENTES QUE VAYAN A COMUNICARSE,
                      GENERANDO AS� UNA ENORME CANTIDAD DE CLAVES.
                         
            UNA ALTERNATIVA PARA SOLUCIONAR LOS PROBLEMAS DE DISTRIBUCI�N DE CLAVES Y TODO LO QUE SE DERIVA DE ELLO,
            PUEDEN SER LA CRIPTOGRAF�A ASIM�TRICA Y LA CRIPTOGRAF�A H�BRIDA QUE ESTUDIAREMOS A CONTINUACI�N.
                         
            UN EJEMPLO PR�CTICO DONDE SE UTILIZABA ESTE TIPO DE CRIPTOGRAF�A FUE LA M�QUINA ENIGMA,
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
        
            CRIPTOGRAF�A DE CLAVE P�BLICA O ASIM�TRICA:
                    SURGI� PARA SOLUCIONAR EL PROBLEMA DE DISTRIBUCI�N DE CLAVES QUE SUFR�A LA CRIPTOGRAF�A DE CLAVE PRIVADA,
                    PERMITIENDO AS� TANTO AL EMISOR COMO AL RECEPTOR
                    PODER PONER EN COM�N UNAS CLAVES MEDIANTE UN CANAL (INCLUSO NO SEGURO) DE COMUNICACI�N.
                         
            A ESTE TIPO DE CRIPTOGRAF�A SE LE DENOMINA ASIM�TRICA
            PORQUE LAS CLAVES DE ENCRIPTADO Y DESENCRIPTADO SON DIFERENTES,
            A DIFERENCIA DE LA CRIPTOGRAF�A DE CLAVE PRIVADA.
                         
            PODEMOS LISTAR LAS CARACTER�STICAS M�S IMPORTANTES DE ESTE TIPO DE CRIPTOGRAF�A:
                         
                    - TANTO EMISOR COMO RECEPTOR TIENEN EN SU PODER UN PAR DE CLAVES,
                      UNA QUE ES P�BLICA, QUE ES CONOCIDA POR TODO EL MUNDO
                      Y QUE EL HECHO DE CONOCERLA NO IMPLICA CONOCER NING�N TIPO DE INFORMACI�N SOBRE LA CLAVE PRIVADA INVERSA,
                      Y OTRA QUE ES PRIVADA, QUE LA CONOCE �NICAMENTE SU POSEEDOR.
                         
                    - TODAS LAS PAREJAS DE CLAVES SIRVEN �NICAMENTE CON ELLAS MISMAS,
                      ES DECIR, QUE SON COMPLEMENTARIAS,
                      Y EL PROCESO NO FUNCIONAR� SI ALGUNA DE ELLAS ES CAMBIADA.
                         
                    - LAS CLAVES DE ENCRIPTADO Y DESENCRIPTADO �NICAMENTE SE PUEDEN GENERAR UNA VEZ,
                      DE ESTA FORMA, ES PR�CTICAMENTE IMPOSIBLE QUE DOS PERSONAS OBTENGAN LAS MISMAS CLAVES.
                         
                    - CUANDO UN MENSAJE ES CIFRADO CON LA CLAVE P�BLICA,
                      �NICAMENTE SE VA A PODER DESCIFRAR CON LA CLAVE PRIVADA QUE SEA LA INVERSA A ESA CLAVE P�BLICA.
                         
                    - CUANDO CIFRAMOS UN MENSAJE CON LA CLAVE PRIVADA,
                      ESTAMOS DEMOSTRANDO QUE NOSOTROS HEMOS SIDO QUIENES HEMOS CIFRADO DICHO MENSAJE.
                         
            LA GRAN VENTAJA QUE OFRECE ESTE TIPO DE CRIPTOGRAF�A ES QUE YA NO EXISTE EL PROBLEMA DE LA DISTRIBUCI�N DE CLAVES.
                         
            LA CRIPTOGRAF�A DE CLAVE P�BLICA TAMBI�N TIENE ALGUNOS INCONVENIENTES:
                         
                    - ESTOS ALGORITMOS SON ALGO M�S LENTOS.
                         
                    - HAY QUE PODER GARANTIZAR QUE LA CLAVE P�BLICA ES REALMENTE DE QUIEN DICE SER.
                         
            LO M�S �PTIMO SER�A UTILIZAR UNA COMBINACI�N DE CRIPTOGRAF�A DE CLAVE P�BLICA Y DE CLAVE PRIVADA,
            LO QUE SE CONOCE COMO CRIPTOGRAF�A H�BRIDA.
                         
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
                    PERO EN UN ENTORNO TECNOL�GICO, ES DECIR,
                    SU OBJETIVO ES IDENTIFICAR AL FIRMANTE INEQU�VOCAMENTE,
                    PERO EN LUGAR DE HACERLO EN PAPEL, SE LLEVAR�A A CABO DE FORMA DIGITAL.
                         
                    LAS FIRMAS DIGITALES EST�N BASADAS EN CRIPTOGRAF�A DE CLAVE P�BLICA Y RESUMEN DE MENSAJES HASH.
                         
                            https://latam.kaspersky.com/blog/que-es-un-hash-y-como-funciona/2806/
                      
            HASH FUNCTION:
                    UNA FUNCI�N RESUMEN, EN INGL�S,
                    CONVIERTE UNO O VARIOS ELEMENTOS DE ENTRADA A UNA FUNCI�N EN OTRO ELEMENTO.
                    TAMBI�N SE LAS CONOCE COMO FUNCI�N EXTRACTO, DEL INGL�S DIGEST FUNCTION,
                    FUNCI�N DE EXTRACTADO O EXTRACCI�N.
                         
            MESSAGE-DIGEST ALGORITHM:
                    UN RESUMEN DE MENSAJES (MESSAGE-DIGEST ALGORITHM, EN INGL�S)
                    ES UN ALGORITMO QUE PARA ENCRIPTAR,
                    TOMA COMO ENTRADA UN MENSAJE CON UNA LONGITUD VARIABLE
                    Y LO CONVIERTE EN UN RESUMEN DE UNA LONGITUD FIJA.
                    ALGUNOS ALGORITMOS DE ESTE TIPO SON:
                            - MD5: ABREVIATURA DE MESSAGE-DIGEST ALGORITHM 5.
                            - SHA: SECURE HASH ALGORITHM.
                         
            CERTIFICADOS DIGITALES:
                    OTRO ELEMENTO M�S QUE INTERVIENE EN EL PROCESO DE CRIPTOGRAF�A SON LOS CERTIFICADOS DIGITALES.
                    �STOS SE DISE�ARON PARA RESOLVER EL PROBLEMA DE LA CONFIANZA
                    QUE HAN DE DEPOSITAR LAS DOS PARTES INVOLUCRADAS EN LA COMUNICACI�N, ES DECIR,
                    UN CERTIFICADO DIGITAL ES UN DOCUMENTO ELECTR�NICO
                    FIRMADO POR UN TERCERO (ENTIDAD CERTIFICADORA)
                    QUE DA FE DE LOS DATOS DE LA FIRMA DIGITAL EMPLEADA.
                         
                    DE FORMA GEN�RICA, PODEMOS DECIR QUE VIENEN A SER COMO EL NOTARIO DE LA FIRMA DIGITAL.
                         
            ENTIDAD CERTIFICADORA:
                    ES UNA ORGANIZACI�N QUE SE RESPONSABILIZA DE LA VERACIDAD DE LOS DATOS DE LOS FIRMANTES DIGITALES,
                    Y, POR TANTO, DE LA EMISI�N Y VALIDEZ DE LOS CERTIFICADOS OPORTUNOS.
                         
                    CRE�NDOLOS Y APORTANDO MECANISMOS QUE PERMITAN PODER REVOCARLOS, SUSPENDERLOS, Y COMPROBAR SU VALIDEZ.
                         
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
        
            EXTRAPOLANDO TODOS ESTOS CONCEPTOS A UN ENTORNO DE PROGRAMACI�N:
                         
            PODEMOS DESTACAR QUE EN JAVA SE USA LA CLASE  --------------------->  MessageDigest
                         
            EN EL M�TODO ------------------------------------------------------>  getInstance() 
                    ES DONDE PODREMOS INDICAR CUALQUIERA
                    DE LOS ALGORITMOS LISTADOS ANTERIORMENTE
                    PARA CIFRAR EL MENSAJE CON UNA FUNCI�N HASH.
                         
            Y LOS ALGORITMOS QUE PODEMOS EMPLEAR SON:

                    * MD2.
                    * MD5.
                    * SHA-1.
                    * SHA-256.
                    * SHA-384.
                    * SHA-512.

            CADA VEZ QUE VAYAMOS A ENCRIPTAR UN TEXTO 
            DEBEREMOS CONTROLAR LA EXCEPCI�N ---------------------------------->  NoSuchAlgorithmException
            MEDIANTE UN BLOQUE try-catch.

            EL M�TODO --------------------------------------------------------->  digest()
            DEVUELVE UN ARRAY DE BYTES,
            POR LO QUE PARA DETERMINADAS OPERACIONES CON ESE RESULTADO,
            HABR� QUE TRANSFORMAR ESE RESULTADO A OTRO TIPO DE DATOS.
            POR EJEMPLO, PARA MOSTRARLO POR PANTALLA.
                         
            public static void main(String[] args) {

                try {                                                           // TENEMOS QUE CONTROLAR LA EXCEPCI�N NoSuchAlgorithmException
                    Scanner teclado = new Scanner(System.in, "UTF-8");
                    System.out.println("Introduce la contrase�a a cifrar:");
                    String mi_contr = teclado.nextLine();

                    MessageDigest md_1 = MessageDigest.getInstance("SHA-256");  // CREAMOS UNA INSTANCIA DE MessageDigest CON EL TIPO DE CIFRADO SHA-256
                    md_1.update(mi_contr.getBytes());                           // CON EL M�TODO update CODIFICAMOS mi_contr USANDO EL CIFRADO DE md_1
                    byte[] byteData_1 = md_1.digest();                          // EL RESULTADO SER� CON LA FUNCI�N digest, Y VENDR� DADO EN UN ARRAY DE TIPO BYTE.
                    StringBuilder sb_1 = new StringBuilder();                   // MEDIANTE UN StringBuilder VAMOS A TRADUCIR EL TEXTO CIFRADO, YA QUE VIENE DADO EN BYTE.
                    for (int i = 0; i < byteData_1.length; i++) {               // DE ESTA FORMA LO VAMOS A PASAR A STRING.
                        sb_1.append(Integer.toString((byteData_1[i] & 0xff) + 0x100,16).substring(1));
                    }                                                           // LO MOSTRAMOS.
                    System.out.println("**********************************************");
                    System.out.println("*   Contrase�a -> " + mi_contr);
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
        
            UNA FUNCI�N HASH, --> RESUMEN
                    RESUME EL PAR�METRO QUE SE LE PASA COMO ENTRADA, --> TEXTO O FICHERO.
                    A UNA CADENA DE BYTES DE UN TAMA�O FIJO DETERMINADO.
                         
                    ADEM�S, NO PUEDE HABER DOS ENTRADAS DIFERENTES QUE TENGAN EL MISMO RESULTADO DE LA FUNCI�N HASH.
                         
                    POR ESTE MOTIVO, APLICANDO ESTAS FUNCIONES A FICHEROS, Y COMPARANDO LOS RESULTADOS,
                    PODEMOS GARANTIZAR SI UN FICHERO HA SIDO MODIFICADO O NO.
                         
            EL PROPIO SISTEMA OPERATIVO WINDOWS INCLUYE EN SUS �LTIMAS VERSIONES, LA UTILIDAD DE LINEA DE COMANDO  -->  certutil
            CON LA QUE PODEMOS OBTENER LOS RES�MENES HASH DE LOS FICHEROS, Y HACER ESTA COMPROBACI�N.
                         
            EL COMANDO certutil PUEDE OBTENER RES�MENES HASH UTILIZANDO DIFERENTES ALGORITMOS,
            UNO DE LOS PAR�METROS DEL COMANDO ES EL ALGORITMO QUE SE QUIERE UTILIZAR.  
                         
            EN EL CMD ESCRIBO:
                         
                    > certutil -hashfile mifichero.txt MD5
                         
                    MD5 HASH DE MIFICHERO.TXT:
                    a4d85789e1efa17bdd71828725df97e4
                    CertUtil: -hashfile comando completado correctamente.
                         
                    SI VOLVEMOS A EJECUTAR EL MISMO COMANDO PERO EN OTRO MOMENTO,
                    PODREMOS SABER SI EL FICHERO HA SIDO MODIFICADO O NO, 
                    COMPARANDO LOS RESULTADOS.
                         
            CUANDO DESCARGAMOS UN PROGRAMA DE UNA P�GINA WEB,
            UTILIZANDO FUNCIONES HASH PODEMOS VERIFICAR 
            SI LOS PROGRAMAS QUE NOS HEMOS DESCARGADO SON LOS MISMOS
            QUE PUBLIC� EL FABRICANTE O PROGRAMADOR.
                         
                    CHECKSUM:
                            EL FABRICANTE O PROGRAMADOR APLICA UNA FUNCI�N HASH A SU PROGRAMA.
                            PARA OBTENER UN RESUMEN QUE SE USAR� COMO FIRMA DIGITAL.
                         
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