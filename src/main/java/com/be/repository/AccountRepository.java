package com.be.repository;

import com.be.domain.Account;
import com.be.domain.Message;
import com.be.domain.Profile;
import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import java.util.List;

/**
 * Created by jaeger on 02.08.2016.
 */
public interface AccountRepository extends MongoRepository<Account,String>
{
    Account findByEmailAndPassword(String email, String password);
    Account findByEmail(String firstName);
}
