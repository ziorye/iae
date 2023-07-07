package day0707.email;

import jakarta.mail.*;
import jakarta.mail.internet.*;

import java.util.Properties;

public class SimpleEmail {
    public static void main(String [] args) throws Exception {
        Properties prop = new Properties();
        prop.put("mail.smtp.host", "localhost");
        prop.put("mail.smtp.port", "1025");
        Session session = Session.getInstance(prop);

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("from@gmail.com"));
        message.setRecipients(
                Message.RecipientType.TO, InternetAddress.parse("to@gmail.com,to2@gmail.com"));

        message.setSubject("Mail Subject");

        String msg = "This is my first email using JavaMailer";
        /*
        String msgStyled = "This is my <b style='color:red;'>bold-red email</b> using JavaMailer";
         */

        MimeBodyPart mimeBodyPart = new MimeBodyPart();
        mimeBodyPart.setContent(msg, "text/html; charset=utf-8");

        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(mimeBodyPart);

        message.setContent(multipart);

        Transport.send(message);

        System.out.println("Sent message successfully....");
    }
}
