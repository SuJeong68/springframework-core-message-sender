package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.config.MainConfig;
import com.nhnacademy.edu.springframework.messagesender.config.ServiceConfig;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSendService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class, ServiceConfig.class);

        MessageSendService smsMessageSendService = MessageSendService.class.cast(context.getBean("smsMessageSendService"));
        MessageSendService emailMessageSendService = MessageSendService.class.cast(context.getBean("emailMessageSendService"));

        User user = new User("------@google.com", "010-0000-0000");
        smsMessageSendService.doSendMessage(user, "This is SMS");
        emailMessageSendService.doSendMessage(user, "This is Email.");

        context.close();
    }
}
