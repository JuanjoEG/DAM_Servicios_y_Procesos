package Tema_11;
/*
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
*/
/**
 *
 * @author Juan José Estévez González
 */
public class TLSEmail {    
    /**
     *                          EL SERVIDOR DE CORREO SALIENTE (SMTP)
     *                          REQUIERE TLS O SSL: smtp.gmail.com (USA AUTENTICACIÓN)
     *                          PUERTO PARA TLS/STARTTLS: 587
     */    
    public static void main(String[] args) {
        /*
        final String fromEmail = "myemailid@gmail.com";                         // REQUIERE UN ID VÁLIDO DE GMAIL
        final String password = "mypassword";                                   // CLAVE PARA EL ID DE GMAIL
        final String toEmail = "myemail@yahoo.com";                             // PUEDE SER CUALQUIER CUENTA VÁLIDA DE EMAIL
        
        System.out.println("TLSEmail Iniciot");
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");                 // SMTP HOST
        props.put("mail.smtp.port", "587");                            // TLS PUERTO
        props.put("mail.auth", "true");                                // ACTIVA AUTENITACION
        props.put("mail.smtp.starttls.enable", "true");                // PERMITE STARTTLS
        
        Authenticator auth = new Authenticator() {                              // CREA EL OBJETO Authenticator PARA PASAR COMO PARÁMETRO Session getInstance        
        
            // override the getPasswordAuthentication method
            protected PasswordAuthentication getPasswordAuthentication() {            
                return new PasswordAuthentication(fromEmail, password);
            }            
        };
        Session session = Session.getInstance(props, auth);
        EmailUtil.sendEmail(session, toEmail, "Asunto test correo TLS", "Texto de prueba TLS");
        */
    }
}