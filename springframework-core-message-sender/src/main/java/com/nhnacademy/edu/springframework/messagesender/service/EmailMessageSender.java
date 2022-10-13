package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.stereotype.Component;

@Component
public class EmailMessageSender implements MessageSender {
    public EmailMessageSender() {
        System.out.println("+ EmailMessageSender is created.");
    }

    @Override
    public void init() {
        System.out.println("+ init method called in EmailMessageSender.");
    }

    @Override
    public void close() {
        System.out.println("- EmailMessageSender cleanup called!!");
    }

    @Override
    public boolean sendMessage(User user, String message) {
        System.out.println("Email Message Sent to " + user.getEmail() + " : " + message);
        return true;
    }
}
