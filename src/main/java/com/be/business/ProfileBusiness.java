package com.be.business;

import com.be.domain.Account;
import com.be.domain.Profile;
import com.be.repository.AccountRepository;
import com.be.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by jaeger on 08.08.2016.
 */
@Service
public class ProfileBusiness
{

    @Autowired
    ProfileRepository profileRepository;

    public List<Profile> matchPeople(Profile profile)
    {
        return profileRepository.findAll(Example.of(profile));
    }


}
