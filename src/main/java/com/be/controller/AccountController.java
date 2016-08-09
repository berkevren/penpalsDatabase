package com.be.controller;

import com.be.business.AccountBusiness;
import com.be.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    public Account singIn(@RequestParam("email") String email, @RequestParam("password") String password){

        return accountBusiness.signIn(email, password);
    }

}
