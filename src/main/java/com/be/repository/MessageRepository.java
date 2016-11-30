package com.be.repository;

import com.be.domain.Account;
import com.be.domain.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import java.util.List;

/**
 * Created by jaeger on 15/08/16.
 */
public interface MessageRepository extends MongoRepository<Message,String>
{
    List<Message> findByReceiverID(String receiverID);
}
