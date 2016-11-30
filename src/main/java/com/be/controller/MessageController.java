package com.be.controller;

import com.be.business.MessageBusiness;
import com.be.domain.Account;
import com.be.domain.Message;
import com.be.domain.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by jaeger on 15/08/16.
 */
@Controller
@RequestMapping("message")
public class MessageController
{
    @Autowired
    MessageBusiness messageBusiness;

    @PostMapping(value = "sendMessage")
    @ResponseBody
    public void sendMessage(@RequestBody Message message)
    {
        messageBusiness.sendMessage(message);
    }

    @GetMapping(value = "listMessages")
    @ResponseBody
    public List<Message> listMessages(@RequestParam("receiver") String receiver)
    {
        return messageBusiness.listMessages(receiver);
    }
}
