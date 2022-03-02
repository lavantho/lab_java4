package lab3_bai5;

import java.io.UnsupportedEncodingException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class sendMail {
	 public static void sendCode(String email,String text,String content) throws MessagingException, UnsupportedEncodingException {
	      
	        Properties mailServerProperties;
	        Session getMailSession;
	        MimeMessage mailMessage;

	        // Step1: setup Mail Server
	        mailServerProperties = System.getProperties();
	        mailServerProperties.put("mail.smtp.port", "587");
	        mailServerProperties.put("mail.smtp.auth", "true");
	        mailServerProperties.put("mail.smtp.starttls.enable", "true");

	        // Step2: get Mail Session
	        getMailSession = Session.getDefaultInstance(mailServerProperties, null);
	        mailMessage = new MimeMessage(getMailSession);

	        mailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(email)); 

	      mailMessage.setText(text);
	      mailMessage.setSubject(content);
	        Transport transport = getMailSession.getTransport("smtp");

	       
	        transport.connect("smtp.gmail.com", "lavantho0508@gmail.com", "tholvph13911");
	        transport.sendMessage(mailMessage, mailMessage.getAllRecipients());
	        transport.close();
	    }
}
