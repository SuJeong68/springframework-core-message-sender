package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MessageSendServiceTest {
    @Test
    void testMessageSendService() {
        MessageSender messageSender = mock(MessageSender.class);
        MessageSendService messageSendService = new MessageSendService();
        messageSendService.setMessageSender(messageSender);
        messageSendService.setName("Test..");

        User user = new User("user001", "010-..");
        String message = "Test Message...";
        when(messageSender.sendMessage(user, message)).thenReturn(true);

        boolean testRes = messageSendService.doSendMessage(user, message);
        Assertions.assertThat(testRes).isEqualTo(true);

//        테스트 방법..
//        Mockito.verify(messageSender, Mockito.times(1)).sendMessage(any(User.class), any(String.class));
    }
}
