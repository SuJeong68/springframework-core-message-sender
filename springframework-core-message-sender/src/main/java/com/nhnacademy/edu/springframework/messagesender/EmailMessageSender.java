package com.nhnacademy.edu.springframework.messagesender;

public class EmailMessageSender implements MessageSender {
    @Override
    public void sendMessage(User user, String message) {
        System.out.println("Email Message Sent to ${email} : ${message}");
    }
}
