package service;
import javax.mail.*;
import javax.mail.internet.InternetAddress;

import java.util.Properties;
import javax.mail.internet.MimeMessage;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Message.RecipientType;


public class SendOTPService {
    public SendOTPService() {
    }

    public static void sendOTP(String email, String genOTP) {
        String to = email;
        String from = "kingranikomal23@gmail.com";
        String host = "smtp.gmail.com";
        Properties properties = System.getProperties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");
        Session session = Session.getInstance(properties, new javax.mail.Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, "oufqmrywtnglsszc");
            }
        });
        session.setDebug(true);

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(RecipientType.TO, new InternetAddress(to));
            message.setSubject("File Enc ka OTP");
            message.setText("Your One time Password for File Enc app is " + genOTP);
            System.out.println("sending...");
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException var8) {
            var8.printStackTrace();
        }

    }
}
