package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.stereotype.Component;

@Component
public class SmsMessageSender implements MessageSender {
    public SmsMessageSender() {
        System.out.println("+ SmsMessageSender is created.");
    }

    @Override
    public void init() {
        System.out.println("+ init method called in SmsMessageSender.");
    }

    @Override
    public void close() {
        System.out.println("- SMSMessageSender cleanup called!!");
    }

    @Override
    public boolean sendMessage(User user, String message) {
        System.out.println("SMS Message Sent to " + user.getPhoneNumber() + " : " + message);
        return true;
    }
}
