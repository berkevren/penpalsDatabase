package com.be.transport.response;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Created by jaeger on 17/08/16.
 */
@Accessors(chain = true)
public class GenericResponse<T> {

    @Getter
    @Setter
    private int status;

    @Getter
    @Setter
    private String message;

    @Getter
    @Setter
    private T data;
}
