package com.be.repository;

import com.be.domain.Inbox;
import com.be.domain.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by jaeger on 15/08/16.
 */
public interface InboxRepository extends MongoRepository<Inbox,String>
{

}
