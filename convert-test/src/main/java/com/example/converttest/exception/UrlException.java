package com.example.converttest.exception;

import org.springframework.stereotype.Component;

@Component
public class UrlException extends IllegalStateException{
    public UrlException() {
        super("invalid url.");
    }
}
