package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.config.MainConfig;
import com.nhnacademy.edu.springframework.messagesender.config.ServiceConfig;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class, ServiceConfig.class);

        MessageSendService smsMessageSendService = MessageSendService.class.cast(context.getBean("smsMessageSendService"));
        MessageSendService emailMessageSendService = MessageSendService.class.cast(context.getBean("emailMessageSendService"));

        User user = new User("------@google.com", "010-0000-0000");
        smsMessageSendService.doSendMessage(user, "This is SMS");
        emailMessageSendService.doSendMessage(user, "This is Email.");

//        MessageSender smsMessageSender  = MessageSender.class.cast(context.getBean("smsMessageSender"));
//        MessageSender emailMessageSender  = MessageSender.class.cast(context.getBean("emailMessageSender"));
//
//        User user = new User("------@google.com", "010-0000-0000");
//        smsMessageSender.sendMessage(user, "Test SMS...");
//        emailMessageSender.sendMessage(user, "Test Email...");

        context.close();
    }
}
