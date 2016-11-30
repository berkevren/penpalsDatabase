package com.be.business;

import com.be.domain.Account;
import com.be.domain.Message;
import com.be.domain.Profile;
import com.be.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by jaeger on 15/08/16.
 */
@Service
public class MessageBusiness
{
    @Autowired
    MessageRepository messageRepository;

    public void sendMessage(Message message)
    {
        message.setId(UUID.randomUUID().toString());
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        message.setCreatedDate(date);
        messageRepository.save(message);
    }

    public List<Message> listMessages(String receiver)
    {
       return messageRepository.findByReceiverID(receiver);
    }

}
