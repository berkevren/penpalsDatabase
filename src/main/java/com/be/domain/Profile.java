package com.be.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

/**
 * Created by jaeger on 02.08.2016.
 */
@Accessors(chain = true)
@Document(collection = "Profile")
public class Profile extends BaseModel
{

    @Getter
    @Setter
    private String firstName;

    @Getter
    @Setter
    private String gender;

    @Getter
    @Setter
    private String birthdate;

    @Getter
    @Setter
    private String nation;

    @Getter
    @Setter
    private String country;

    @Getter
    @Setter
    private String city;

    @Getter
    @Setter
    private List<String> language;

    @Getter
    @Setter
    private String profilePicture;

    @Getter
    @Setter
    private List<String> hoby;

    @Getter
    @Setter
    private String description;

    @Getter
    @Setter
    private OnlineStatus onlineStatus;

    @Getter
    @Setter
    private String firstDate;

    @Getter
    @Setter
    private String secondDate;


}
