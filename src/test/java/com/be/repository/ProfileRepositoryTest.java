package com.be.repository;

import com.be.domain.Account;
import com.be.domain.Profile;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.UUID;

import static org.junit.Assert.assertEquals;

/**
 * Created by jaeger on 10/08/16.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProfileRepositoryTest
{
    @Autowired
    private ProfileRepository profileRepository;

    @Test
    public void findDate2()
    {
        RestTemplate restTemplate = new RestTemplate();
        String url = new String("http://192.168.2.146:8081/profile/findBirthdate?birthdate=2/7/2016");
        restTemplate.getForObject(url,Profile.class);
        System.out.println("+++");
    }

    @Test
    public void findFirstName()
    {
        RestTemplate restTemplate = new RestTemplate();

        Account profile = restTemplate.getForObject("http://192.168.2.146:8081/profile/findProfile?name=eren@email.com",Account.class);

        System.out.println(profile.getProfile().getFirstName());
    }


    @Test
    public void testExampleQuery(){

        Profile profile = new Profile();
        profile.setId(UUID.randomUUID().toString());
        profile.setFirstName("Vladimir");
        profile.setCountry("Russia");
        profile.setBirthdate("18/5/1987");
        //profile.setGender("Male");

        profileRepository.save(profile);

       /* Profile example = new Profile();
        example.setFirstName("eren");

        List<Profile> pList = profileRepository.findAll(Example.of(example));
        assertEquals(1, pList.size());

        Profile exCity = new Profile();
        exCity.setCity("Ankara");

        pList = profileRepository.findAll(Example.of(exCity));
        assertEquals(2, pList.size());*/
    }

    @Test
    public void testMatch()
    {
        Profile profile2 = new Profile()
                .setFirstName("Ali")
                .setBirthdate("15/7/1957");
        profile2.setId(UUID.randomUUID().toString());
        RestTemplate restTemplate = new RestTemplate();
        String url = new String("http://192.168.2.146:8081/profile/matchPeople");
        Profile[] profile = restTemplate.postForObject(url,profile2,Profile[].class);
        System.out.println(profile.length);
    }

    @Test
    public void testMatch2()
    {
        RestTemplate restTemplate = new RestTemplate();
        String url = new String("http://192.168.2.146:8081/profile/matchPeople?nation=Turkey&gender=Male");
        Profile[] profiles = restTemplate.getForObject(url,Profile[].class);
        System.out.println(profiles.length);
    }
}
