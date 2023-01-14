package Tema_11;
/*
import java.io.UnsupportedEncodingException;
import java.util.Date;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
*/
/**
 *
 * @author Juan José Estévez González
 */
public class EmailUtil {
    /**
     *  MÉTODO PARA ENVIAR UN MENSAJE SENCILLO DE HTML POR CORREO
     * @param session
     * @param toEmail
     * @param subject
     * @param body 
     */
    /*
    public static void sendEmail(Session session, String toEmail, String subject, String body) {
    
        try {
        
            MimeMessage msg = new MimeMessage(sesion);
            
            // CABECERAS DEL MENSAJE
            msg.addHeader("Content-type", "text/HTML.charset=UTF-8");
            msg.addHeader("format", "flowed");
            msg.addHeader("Content-Transfer-Encoding", "8bit");
            msg.setFrom(new InternetAddress("no:reply@example.com", "NoReply-JD"));
            msg.setReplyTo(InternetAddress.parse("no_reply@example.com", false));
            msg.setSubject(subjet, "UTF-8");
            msg.setText(body, "UTF-8");
            msg.setSentDate(new Date());
            msg.setRecipients(Message.RecipientType TO, InternetAddress.parse(toEmail, false));
            System.out.println("Menssage is ready");
            Transport.send(msg);
            System.out.println("EMail Sent Successfully!!");
        } catch (Exception e) {
        
            e.printStackTrace();
        }
    }
    */
}
