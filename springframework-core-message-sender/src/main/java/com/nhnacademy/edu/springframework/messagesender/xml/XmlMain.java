package com.nhnacademy.edu.springframework.messagesender.xml;

import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/beans.xml");

        MessageSendService service = context.getBean("messageSendService", MessageSendService.class);

        User user = new User("------@google.com", "010-0000-0000");
        service.doSendMessage(user, "This is SMS.");

//        context.getBean("SmsMessageSender", MessageSender.class).sendMessage(user, "This is SmsMessage.");
//        context.getBean("SmsMessageSender", MessageSender.class).sendMessage(user, "This is SmsMessage.");
//        System.out.println("-----------------------------------------------------------------");
//        context.getBean("EmailMessageSender", MessageSender.class).sendMessage(user, "This is EmailMessage.");
//        context.getBean("EmailMessageSender", MessageSender.class).sendMessage(user, "This is EmailMessage.");

        context.close();
    }
}
