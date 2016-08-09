package com.be.repository;

import com.be.domain.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by jaeger on 08.08.2016.
 */
public interface ProfileRepository extends MongoRepository<Profile,String>
{
    /*public List<Profile> findByNationAndGenderAndAge(String nation, String gender, int age1, int age2);*/

    /*public Profile findByBirthDate(String date);*/
}
