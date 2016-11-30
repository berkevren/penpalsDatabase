package com.be.business;

import com.be.domain.Inbox;
import com.be.repository.InboxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jaeger on 15/08/16.
 */
@Service
public class InboxBusiness
{
    @Autowired
    InboxRepository inboxRepository;


}
