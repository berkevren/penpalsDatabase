package com.be.business;

import com.be.domain.Profile;
import com.be.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    /* public List<Profile> findByNationAndGenderAndAge(String nation, String gender, int age1, int age2)
     {
            return profileRepository.findByNationAndGenderAndAge(nation, gender, age1, age2);
     }*/

     /*public Profile findByBirthDate(String date)
     {
         return  profileRepository.findByBirthDate(date);
     }*/

}
