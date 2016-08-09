package com.be.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by jaeger on 02.08.2016.
 */

@Accessors(chain = true)
@Document(collection = "Message")
public class Message
{
    @Getter
    @Setter
    private String title;

    @Getter
    @Setter
    private String content;

    @Getter
    @Setter
    private Date messageDate;

    @Getter
    @Setter
    private Account sender;

    @Getter
    @Setter
    private Account receiver;

    @Getter
    @Setter
    private MessageStatus messageStatus;

}
