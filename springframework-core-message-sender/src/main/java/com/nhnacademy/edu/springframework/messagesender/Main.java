package com.nhnacademy.edu.springframework.messagesender;

public class Main {
    public static void main(String args[]) {
        new MessageSendService(new SmsMessageSender()).doSendMessage();
        new MessageSendService(new EmailMessageSender()).doSendMessage();
    }
}
