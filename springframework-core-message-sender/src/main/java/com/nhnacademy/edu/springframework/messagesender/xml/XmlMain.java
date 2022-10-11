package com.nhnacademy.edu.springframework.messagesender.xml;

import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/beans.xml");

        User user = new User("email@google.com", "010-1234-5678");

        context.getBean("SmsMessageSender", MessageSender.class).sendMessage(user, "This is SmsMessage.");
        context.getBean("SmsMessageSender", MessageSender.class).sendMessage(user, "This is SmsMessage.");
        System.out.println("-----------------------------------------------------------------");
        context.getBean("EmailMessageSender", MessageSender.class).sendMessage(user, "This is EmailMessage.");
        context.getBean("EmailMessageSender", MessageSender.class).sendMessage(user, "This is EmailMessage.");

        context.close();
    }
}
