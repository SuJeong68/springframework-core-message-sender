package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;

public interface MessageSender {
    public boolean sendMessage(User user, String message);
    public void init();
    public void close();
}
