package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhn.dooray.client.DoorayHook;
import com.nhn.dooray.client.DoorayHookSender;
import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.web.client.RestTemplate;

public class DoorayMessageSender implements MessageSender {
    @Override
    public boolean sendMessage(User user, String message) {
        new DoorayHookSender(new RestTemplate(), "https://hook.dooray.com/services/3036349505739914786/3371740733259172017/cdnzcggTTWmx2GtusEMUJw")
                .send(DoorayHook.builder()
                        .botName("이수정")
                        .text("안녕하세요:)")
                        .build());
        return true;
    }

    @Override
    public void init() {
        System.out.println("Init DoorayMessageSender...");
    }

    @Override
    public void close() {
        System.out.println("Close DoorayMessageSender...");
    }
}
