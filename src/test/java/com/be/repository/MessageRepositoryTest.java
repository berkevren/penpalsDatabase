package com.be.repository;

import com.be.domain.Account;
import com.be.domain.Message;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by jaeger on 15/08/16.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageRepositoryTest
{
    @Autowired
    MessageRepository messageRepository;

    @Autowired
    AccountRepository accountRepository;

    @Test
    public void sendMessageTest()
    {
        RestTemplate restTemplate = new RestTemplate();
        String url = new String("http://192.168.2.146:8081/account/signIn?email=berk@email.com&password=123");
        Account account = restTemplate.getForObject(url,Account.class);
        String url2 = new String("http://192.168.2.146:8081/account/signIn?email=eren@email.com&password=123");
        Account account2 = restTemplate.getForObject(url2,Account.class);
        Message message = new Message()
                .setContent("Efe'yi artık sabahları almıcam sen efe'ye söyleme gene de")
                .setSenderID(account.getId())
                .setFirstName(account.getProfile().getFirstName())
                .setReceiverID(account2.getId());
        message.setNew(true);
        RestTemplate restTemplateMes = new RestTemplate();
        restTemplateMes.postForObject("http://192.168.2.146:8081/message/sendMessage",message,Message.class);
        System.out.println(message.getContent());

    }

    @Test
    public void listMessages()
    {
        RestTemplate restTemplate = new RestTemplate();
        String url = new String("http://192.168.2.146:8081/message/listMessages?receiver=5d4b7502-31ad-4045-8358-7f61a9207784");
        Message[] messages = restTemplate.getForObject(url,Message[].class);
        System.out.println(messages.length);
    }
}
