package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.service.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.service.SmsMessageSender;

public class Main {
    public static void main(String args[]) {
        User user = new User("email@google.com", "010-1234-5678");
        String message = "Hello!!";

        new MessageSendService(new SmsMessageSender()).doSendMessage(user, message);
        new MessageSendService(new EmailMessageSender()).doSendMessage(user, message);
    }
}
