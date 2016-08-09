package com.be.repository;

import com.be.config.AppConfig;
import com.be.domain.Account;
import com.be.domain.AccountStatus;
import com.be.domain.Profile;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.UUID;
public class AccountRepositoryTest
{
    @Autowired
    private AccountRepository accountRepository;


 /*   @Test
    public void registerAccount()
    {
        Account account = new Account()
                .setEmail("berk@email.com")
                .setPassword("123456")
                .setAccountStatus(AccountStatus.VERIFIED)
                .setProfile(new Profile()
                        .setFirstName("Berk")
                        .setGender("Male")
                        .setBirthdate("01/01/2003")
                        .setNation("Turkish"));
        account.setId(UUID.randomUUID().toString());
        account.setNew(true);
        accountRepository.save(account);
    }


    @Test
    public void addAccount()
    {
        Account account = new Account()
            .setEmail("oguzhan@email.com")
            .setPassword("123456")
            .setAccountStatus(AccountStatus.VERIFIED)
            .setProfile(new Profile()
                    .setFirstName("Oğuzhan")
                    .setGender("Male")
                    .setBirthdate("18/05/1994")
                    .setNation("Turkish"));
        account.setId(UUID.randomUUID().toString());
        account.setNew(true);
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForObject("http://192.168.2.146:8081/account/addAccount",account,Account.class);
    }*/

    @Test
    public void login()
    {
        RestTemplate restTemplate = new RestTemplate();
        String url = new String("http://192.168.2.146:8081/account/signIn?email=eren@email.com&password=123456");
        restTemplate.getForObject(url,Account.class);
        System.out.println("Login Successful");
    }

    @Test
    public void findDate()
    {
        RestTemplate restTemplate = new RestTemplate();
        String url = new String("http://192.168.2.146:8081/profile/findBirthDate?date=2/7/2016");
        restTemplate.getForObject(url,Account.class);
        System.out.println("Kayit Bulundu");
    }

}