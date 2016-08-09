package com.be.business;

import com.be.domain.Account;
import com.be.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by jaeger on 02.08.2016.
 */
@Service
public class AccountBusiness
{

    @Autowired
    private AccountRepository accountRepository;

    public void addAccount(Account account)
    {
        accountRepository.save(account);
    }

    public Account signIn(String email,String password)
    {

        Account account = accountRepository.findByEmailAndPassword(email, password);
        return account;


    }

}
