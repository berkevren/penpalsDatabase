package com.be.repository;

import com.be.config.AppConfig;
import com.be.domain.Account;
import com.be.domain.AccountStatus;
import com.be.domain.Profile;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
public class AccountRepositoryTest
{
    @Autowired
    private AccountRepository accountRepository;




   @Test
    public void registerAccount()
    {
        Account account = new Account()
                .setEmail("angela@email.com")
                .setPassword("123456")
                .setAccountStatus(AccountStatus.VERIFIED)
                .setProfile(new Profile()
                        .setFirstName("Angela")
                        .setGender("Female")
                        .setBirthdate("1/1/1987")
                        .setNation("United States"));
        account.setId(UUID.randomUUID().toString());
        account.setNew(true);
        accountRepository.save(account);
    }


    @Test
    public void addAccount()
    {

        Account account = new Account()
            .setEmail("angela@email.com")
            .setPassword("123456")
            .setAccountStatus(AccountStatus.VERIFIED)
            .setProfile(new Profile()
                    .setFirstName("Angela")
                    .setGender("Female")
                    .setBirthdate("1/04/1987")
                    .setNation("United States"));
        account.setId(UUID.randomUUID().toString());
        account.setNew(true);
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForObject("http://192.168.2.146:8081/account/addAccount",account,Account.class);

    }

    @Test
    public void login()
    {
        RestTemplate restTemplate = new RestTemplate();
        String url = new String("http://192.168.2.146:8081/account/signIn?email=eren@email.com&password=123");
        restTemplate.getForObject(url,Account.class);
        System.out.println("Login Successful");
    }

    @Test
    public void genderFind()
    {
        RestTemplate restTemplate = new RestTemplate();
        String url = new String("http://192.168.2.146:8081/account/findGender?gender=Male&nation=Turkish&birthdate=18/05/1994");
        Account[] accounts = restTemplate.getForObject(url,Account[].class);
        System.out.println(accounts.length);
    }

    @Test
    public void idFinder()
    {
        RestTemplate restTemplate = new RestTemplate();
        String url = new String("http://192.168.2.146:8081/account/idControl?id=5d4b7502-31ad-4045-8358-7f61a9207784");
        Account account = restTemplate.getForObject(url,Account.class);
        System.out.println(account.getProfile().getFirstName());
    }

    @Test
    public void date()
    {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {

            Date date = formatter.parse("18/05/1990");
            Date date2 = formatter.parse("18/05/2000");
            Date dateBirth = formatter.parse("18/05/1995");
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            int year = cal.get(Calendar.YEAR);
            cal.setTime(date2);
            int year2 = cal.get(Calendar.YEAR);
            cal.setTime(dateBirth);
            int yearBirth = cal.get(Calendar.YEAR);
            if(year<=yearBirth && year2>=yearBirth)
            {
                System.out.println("Olabilir ");
            }
            else
            {
                System.out.println("Olmayadabilir");
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void findForMatch()
    {
        RestTemplate restTemplate = new RestTemplate();
        String url = new String("http://192.168.2.146:8081/account/findForMatch?gender=Male&nation=Turkish&firstDate=18/5/1990&secondDate=18/5/2000&birthdate=18/5/1995");
        Account[] accounts = restTemplate.getForObject(url,Account[].class);
        System.out.println(accounts.length);
    }

    @Test
    public void queryExample()
    {
        Profile profile = new Profile();
        profile.setFirstName("Eren");
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withIgnorePaths("birthdate")
                .withIncludeNullValues();
        Example<Profile> example = Example.of(profile,matcher);
        System.out.println(example.toString());
    }



}