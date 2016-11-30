package com.be.business;

import com.be.domain.Account;
import com.be.domain.Message;
import com.be.domain.Profile;
import com.be.repository.AccountRepository;
import com.be.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class AccountBusiness
{

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    ProfileRepository profileRepository;

    public void addAccount(Account account)
    {
        String uuid = UUID.randomUUID().toString();
        account.setId(uuid);
        account.getProfile().setId(uuid);
        profileRepository.save(account.getProfile());
        accountRepository.save(account);
    }

    public Account signIn(String email,String password)
    {
        Account account = accountRepository.findByEmailAndPassword(email, password);
        return account;
    }




}
