package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class MessageSendService {

    private MessageSender messageSender;

    @Value("${from}")
    private String name;

    public MessageSendService() {}

    public MessageSendService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void setMessageSender(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean doSendMessage(User user, String message) {
        System.out.println("From : " + this.name);
        messageSender.sendMessage(user, message);
        return true;
    }
}
