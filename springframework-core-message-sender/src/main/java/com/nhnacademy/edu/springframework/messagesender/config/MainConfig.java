package com.nhnacademy.edu.springframework.messagesender.config;

import com.nhnacademy.edu.springframework.messagesender.service.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.SmsMessageSender;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@EnableAspectJAutoProxy
//@ComponentScan("com.nhnacademy.edu.springframework.messagesender")
@PropertySource("classpath:message.properties")
public class MainConfig {

    @Bean
    public MessageSender smsMessageSender() {
        return new SmsMessageSender();
    }

    @Bean
    public MessageSender emailMessageSender() {
        return new EmailMessageSender();
    }

}
