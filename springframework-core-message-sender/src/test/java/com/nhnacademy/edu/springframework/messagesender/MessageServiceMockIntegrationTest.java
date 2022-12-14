package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.config.MainConfig;
import com.nhnacademy.edu.springframework.messagesender.config.ServiceConfig;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {MainConfig.class, ServiceConfig.class})
public class MessageServiceMockIntegrationTest {

    @Qualifier("smsMessageSendService")
    @InjectMocks /* mock 주입 */
    @Autowired
    private MessageSendService messageSendService;

    @Mock
    private MessageSender messageSender;

//    @BeforeEach
//    void init() {}

    @Test
    void testMessageSendService() {
        boolean actual = messageSendService.doSendMessage(new User("test001", "010-.."), "Integration Test.");
        assertThat(actual).isEqualTo(true);
    }
}
