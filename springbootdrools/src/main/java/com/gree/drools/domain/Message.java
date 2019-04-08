package com.gree.drools.domain;

import lombok.Data;

/**
 * create by sfz
 * time : 2019/04/08
 */

@Data
public class Message {
    public static final Integer HELLO = 0;
    public static final Integer GOODBYE = 1;

    private String message;
    private Integer status;

    @Override
    public String toString() {
        return "Message{" +
                "message='" + message + '\'' +
                ", status=" + status +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
