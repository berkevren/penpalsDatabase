package com.be.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by jaeger on 02.08.2016.
 */

@Accessors(chain = true)
@Document(collection = "Message")
public class Message extends BaseModel
{

    @Getter
    @Setter
    private String content;

    @Getter
    @Setter
    private Date messageDate;

    @Getter
    @Setter
    private String senderID;

    @Getter
    @Setter
    private String receiverID;

    @Getter
    @Setter
    private MessageStatus messageStatus;

    @Getter
    @Setter
    private String firstName;

}
