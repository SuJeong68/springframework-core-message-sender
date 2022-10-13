package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.service.DoorayMessageSender;

public class DoorayMain {
    public static void main(String[] args) {
        DoorayMessageSender doorayMessageSender = new DoorayMessageSender();

        User user = new User("test..", "010-..");
        doorayMessageSender.sendMessage(user, "Test message..");
    }
}
