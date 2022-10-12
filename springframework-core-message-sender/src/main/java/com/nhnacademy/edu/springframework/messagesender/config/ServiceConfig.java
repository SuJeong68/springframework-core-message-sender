package com.nhnacademy.edu.springframework.messagesender.config;

import com.nhnacademy.edu.springframework.messagesender.service.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.service.SmsMessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class ServiceConfig {
    @Autowired
    private SmsMessageSender smsMessageSender;
    @Autowired
    private EmailMessageSender emailMessageSender;

    @Bean
    public MessageSendService smsMessageSendService() {
        return new MessageSendService(smsMessageSender);
    }

    @Bean
    public MessageSendService emailMessageSendService() {
        return new MessageSendService(emailMessageSender);
    }

}
