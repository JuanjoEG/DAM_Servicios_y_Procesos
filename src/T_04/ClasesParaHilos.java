package T_04;

/**
 *
 * @author Juan José Estévez González
 */
public class ClasesParaHilos {
    
    public static void main(String[] args) {
        
        System.out.println("""
                           
            **************************************************************************
            *                            CLASES PARA HILOS                           *
            **************************************************************************
            *                                                                        *
            * Thread         CREAR HILOS CON CÓDIGO PARA QUE LO EJECUTEN.            *
            *                LAS CLASES QUE SEAN HILOS DEBERÁN HEREDAR DE ESTA.      *
            *                                                                        *
            * Runnable       INTERFAZ - PERMITE AÑADIR FUNCIONALIDAD DE HILO AL      *
            *                           IMPLEMENTARLA.                               *
            *                                                                        *
            * ThreadDeath    PERMITE MANEJAR Y NOTIFICAR ERRORES EN LOS HEBRAS.      *
            *                HEREDA DE Error.                                        *
            *                                                                        *
            * ThreadGroup    PERMITE MANEJAR UN GRUPO DE HILOS DE FORMA CONJUNTA.    *
            *                                                                        *
            **************************************************************************
                           
                           """);
        
        System.out.println("""
                           
            **************************************************************************
            *                       CLASE Thread - MÉTODOS                           *
            **************************************************************************
            *                                                                        *
            * new()        CREA UN HILO.                                             *
            *                                                                        *
            * start()      INDICA QUE ESTÁ LISTO PARA EJECUTARSE.                    *
            *                                                                        *
            * run()        EJECUTA EL HILO DE FORMA PARALELA.                        *
            *                                                                        *
            * sleep()      BLOQUEA EL HILO UN TIEMPO DETERMINADO EN ms.              *
            *              PARA SACARLO DEL ESTADO BLOQUEADO ANTES DEL TIEMPO        *
            *              USAMOS EL MÉTODO                                          *
            *                               interrupt().                             *
            *                                                                        *
            * wait()       HACE ESPERAR AL HILO A LA EJECUCIÓN DE OTRA TAREA.        *
            *              SE QUEDA EN ESTADO BLOQUEADO HASTA NUEVO AVISO.           *
            *                                                                        *
            *              notifyAll() -> DESBLOQUEA TODOS LOS PROCESOS.             *
            *              notify()   -> DESBLOQUEA EL PROCESO.                      *
            *                        SE LE PUEDES PASAR UN TIEMPO ms PARA QUE ACTUE. *
            *                                                                        *
            * getState()   DEVUELVE EL ESTADO DEL HILO.                              *
            *                                                                        *
            * isAlive()    BOOLEANO -> PARA SABER SI ESTÁ ...                        *
            *                                             VIVO -> true               *
            *                                       FINALIZADO -> false              *
            *                                                                        *
            * stop()       FINALIZA UN HILO. MUY PELIGROSO -> INTERBLOQUEO.          *
            *                                                                        *
            * join()       PLANIFICA LA EJECUCIÓN DE VARIOS HILOS.                   *
            *              NOS PERMITE ESPERAR A LA FINALIZACIÓN DE UN HILO.         *
            *              SE LE PUEDES PASAR UN TIEMPO ms PARA QUE ACTUE.           *
            *                                                                        *
            * getPriority() OBTENEMOS LA PRIORIDAD DE UN HILO.   (1 - 10)            *
            *                                                                        *
            * setPriority() CAMBIAMOS LA PRIORIDAD DE UN HILO.                       *
            *                                                                        *
            *               Thread.MIN_PRIORITY  --> 1                               *
            *               Thread.NORM_PRIORITY --> 5   POR DEFECTO                 *
            *               Thread.MAX_PRIORITY  --> 10                              *
            *                                                                        *
            * yield()  PASA UN HILO DE EJECUTANDOSE A LISTO PARA EJECUTAR.           *
            *          CEDE EL PROCESADOR A OTRO HILO QUE TIENE LA MISMA PRIORIDAD.  *
            *          QUEREMOS QUE SE EQUILIBREN LAS EJECUCIONES DE LOS HILOS.      *
            *          NO SIEMPRE SE CONSIGUE, EL S.O. ES EL QUE MANDA.              *
            *          SE USAN CON HILOS QUE TIENEN LA MISMA PRIORIDAD.              *
            *                                                                        *
            **************************************************************************
                           
                           """);
    }
    
    
    
}
