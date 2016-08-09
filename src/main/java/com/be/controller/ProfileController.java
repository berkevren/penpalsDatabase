package com.be.controller;

import com.be.business.ProfileBusiness;
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

   /* @GetMapping(value = "/findFriend")
    @ResponseBody
    public List<Profile> findFriend(@RequestParam("nation") String nation, @RequestParam("gender") String gender, @RequestParam("age1") int age1, @RequestParam("age2") int age2)
    {
        return profileBusiness.findByNationAndGenderAndAge(nation, gender);
    }*/

   /* @GetMapping(value = "findBirthDate")
    @ResponseBody
    public Profile findByBirthDate(@RequestParam("date")String date)
    {
        return profileBusiness.findByBirthDate(date);
    }*/
}
