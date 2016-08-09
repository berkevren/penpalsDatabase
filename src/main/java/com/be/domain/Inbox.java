package com.be.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by jaeger on 02.08.2016.
 */
@Document(collection = "Inbox")
public class Inbox extends BaseModel
{
    @Getter
    @Setter
    private List<Message> messageList;
}
