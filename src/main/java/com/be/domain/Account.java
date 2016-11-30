package com.be.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by jaeger on 02.08.2016.
 */
@Accessors(chain = true)
@Document(collection = "Account")
public class Account extends BaseModel
{

    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private String password;

    @Getter
    @Setter
    @DBRef
    private Profile profile;

    @Getter
    @Setter
    private AccountStatus accountStatus;



}
