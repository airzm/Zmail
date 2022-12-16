package it.unito.clientzmail.model;

import java.util.ArrayList;
import java.util.List;

public class Email {
     private String sender;
     private String recivers;
     private String subject;
     private String mailText;
     public Email(String sender,String recivers,String subject, String mailText){
         this.sender=sender;
         this.recivers = recivers;
         this.subject = subject;
         this.mailText = mailText;
     }
    @Override
    public String toString() {
        return String.join("-",List.of(this.sender,this.subject));
    }
}
