package com.nhnacademy.edu.springframework.messagesender.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.nhnacademy.edu.springframework.messagesender")
@PropertySource("classpath:message.properties")
public class MainConfig {
    
//    @Bean
//    public MessageSender smsMessageSender() {
//        return new SmsMessageSender();
//    }
//
//    @Bean
//    public MessageSender emailMessageSender() {
//        return new EmailMessageSender();
//    }

}
