package com.nhnacademy.edu.springframework.messagesender;

public class Main {
    public static void sendSmsMessage(User user, String message) {
        System.out.println("SMS Message Sent to ${phoneNumber} : ${message}");
    }

    public static void sendEmailMessage(User user, String message) {
        System.out.println("Email Message Sent to ${email} : ${message}");
    }

    public static void main(String args[]) {
        sendSmsMessage(new User("email@google.com", "010-1234-5678"), "Hello!!");
    }
}
