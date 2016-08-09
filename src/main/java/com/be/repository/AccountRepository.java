package com.be.repository;

import com.be.domain.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by jaeger on 02.08.2016.
 */
public interface AccountRepository extends MongoRepository<Account,String>
{
    Account findByEmailAndPassword(String email, String password);

}
