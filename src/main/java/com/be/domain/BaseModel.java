package com.be.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;

import java.util.Date;

/**
 * Created by jaeger on 02.08.2016.
 */
public class BaseModel implements Persistable<String>
{

    @Id
    @Getter
    @Setter
    private String id;

    @CreatedDate
    @Getter
    @Setter
    private Date createdDate;

    @Transient
    @Setter
    private boolean isNew = false;


    public boolean isNew() {
        return isNew;
    }
}
