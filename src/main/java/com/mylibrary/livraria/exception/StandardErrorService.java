package com.mylibrary.livraria.exception;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.awt.*;
import java.io.Serializable;
import java.time.Instant;

public class StandardErrorService implements Serializable {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;

    public StandardErrorService(){

    }

    public StandardErrorService(Instant timedtamp, Integer status, String error, String message, String path) {
        this.timestamp = timedtamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    public Instant getTimedtamp() {
        return timestamp;
    }

    public void setTimedtamp(Instant timedtamp) {
        this.timestamp = timedtamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
