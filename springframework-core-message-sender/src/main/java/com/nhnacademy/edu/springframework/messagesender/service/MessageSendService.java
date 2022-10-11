package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;

public class MessageSendService {
    private MessageSender smsMessageSender;
//    private MessageSender emailMessageSender;

    public MessageSendService() {}

    public MessageSendService(MessageSender smsMessageSender) {
        this.smsMessageSender = smsMessageSender;
//        this.emailMessageSender = emailMessageSender;
    }

    public void setSmsMessageSender(MessageSender smsMessageSender) {
        System.out.println("set by setSmsMessageSender.");
        this.smsMessageSender = smsMessageSender;
    }

    public void doSendMessage(User user, String message) {
        this.smsMessageSender.sendMessage(user, message);
//        this.emailMessageSender.sendMessage(user, message);
    }
}
