package com.be.controller;

import com.be.business.ProfileBusiness;
import com.be.domain.Account;
import com.be.domain.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by jaeger on 08.08.2016.
 */
@Controller
@RequestMapping("profile")
public class ProfileController
{
    @Autowired
    ProfileBusiness profileBusiness;

    /*@RequestMapping(value = "matchPeople")
    @ResponseBody
    public List<Profile> matchPeople(Profile profile)
    {
        System.out.println(profile.getFirstName());
        return profileBusiness.matchPeople(profile);
    }*/

    @GetMapping(value = "matchPeople")
    @ResponseBody
    public List<Profile> matchPeople(@RequestParam("nation") String nation, @RequestParam("gender") String gender)
    {
        Profile profile = new Profile();
        profile.setNation(nation);
        profile.setGender(gender);
        return profileBusiness.matchPeople(profile);
    }
}
