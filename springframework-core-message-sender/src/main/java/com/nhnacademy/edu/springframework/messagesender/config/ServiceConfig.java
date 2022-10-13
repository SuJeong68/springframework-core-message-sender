package com.nhnacademy.edu.springframework.messagesender.config;

import com.nhnacademy.edu.springframework.messagesender.service.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.SmsMessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class ServiceConfig {
    @Autowired
    private MainConfig mainConfig;

//    @Autowired
//    private SmsMessageSender smsMessageSender;
//    @Autowired
//    private EmailMessageSender emailMessageSender;

    @Bean
    public MessageSendService smsMessageSendService() {
        return new MessageSendService(mainConfig.smsMessageSender());
    }

    @Bean
    public MessageSendService emailMessageSendService() {
        return new MessageSendService(mainConfig.emailMessageSender());
    }

}
