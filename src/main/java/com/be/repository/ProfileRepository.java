package com.be.repository;

import com.be.domain.Account;
import com.be.domain.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import java.util.Date;
import java.util.List;

/**
 * Created by jaeger on 08.08.2016.
 */
public interface ProfileRepository extends MongoRepository<Profile,String>, QueryByExampleExecutor<Profile>
{

}
