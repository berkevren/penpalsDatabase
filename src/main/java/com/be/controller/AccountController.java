package com.be.controller;

import com.be.business.AccountBusiness;
import com.be.domain.Account;
import com.be.domain.AccountStatus;
import com.be.domain.Message;
import com.be.domain.Profile;
import com.be.transport.response.GenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * Created by jaeger on 02.08.2016.
 */

@Controller
@RequestMapping("account")
public class AccountController
{

    @Autowired
    AccountBusiness accountBusiness;

    @PostMapping(value = "addAccount")
    @ResponseBody
    public void addAccount(@RequestBody Account account)
    {
         accountBusiness.addAccount(account);
    }

    @GetMapping(value = "signIn")
    @ResponseBody
    public GenericResponse signIn(@RequestParam("email") String email, @RequestParam("password") String password){

        Account account = accountBusiness.signIn(email, password);

        if(account == null){
            return new GenericResponse()
                    .setStatus(1);
        }else{
            return new GenericResponse()
                    .setStatus(0)
                    .setData(account);
        }
    }






}
