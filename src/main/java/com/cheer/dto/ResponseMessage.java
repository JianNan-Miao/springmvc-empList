package com.cheer.dto;

import org.springframework.stereotype.Component;


public class ResponseMessage {
     private String code;
     private  String message;

    public ResponseMessage(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResponseMessage() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResponseMessage{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
