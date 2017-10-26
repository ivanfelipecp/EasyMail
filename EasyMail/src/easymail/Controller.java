/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easymail;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author Ivan
 */
public class Controller {
    private Mail m;

    public Controller(Mail m) {
        this.m = m;
    }
    
    public String sendMail(){
        try{
            Properties p = new Properties();
            p.put("mail.smtp.host","smtp.gmail.com");
            p.setProperty("mail.smtp.starttls.enable","true");
            p.setProperty("mail.smtp.port","587");
            p.setProperty("mail.smtp.user",this.m.getUser());
            p.setProperty("mail.smtp.auth","true");
            
            Session s = Session.getDefaultInstance(p,null);
            BodyPart text = new MimeBodyPart();
            text.setText(this.m.getMessage());
            BodyPart attached = new MimeBodyPart();
            
            if(!this.m.getPath().equals("")){
                attached.setDataHandler(new DataHandler(new FileDataSource(this.m.getPath())));
                attached.setFileName(this.m.getFilename());
            }
            
            MimeMultipart m = new MimeMultipart();
            m.addBodyPart(text);
            if(!this.m.getPath().equals("")){
                m.addBodyPart(attached);
            }
            MimeMessage msg = new MimeMessage(s);
            msg.setFrom(new InternetAddress(this.m.getUser()));
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(this.m.getTo()));
            msg.setSubject(this.m.getSubject());
            msg.setContent(m);
            
            Transport t = s.getTransport("smtp");
            t.connect(this.m.getUser(),this.m.getPassword());
            t.sendMessage(msg, msg.getAllRecipients());
            t.close();
            return "done";
            
        }
        catch(Exception e){
            return("Error "+e.toString());
        }
    }
}
