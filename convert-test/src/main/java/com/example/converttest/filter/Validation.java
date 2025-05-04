package com.example.converttest.filter;

import com.example.converttest.exception.IdException;
import com.example.converttest.exception.UrlException;
import org.springframework.stereotype.Service;

@Service("validator")
public class Validation {

    private final String VALID_URL = "http://localhost:8080/my-endpoint/";

    public String urlValidation(String url) {
        System.out.println("step 2, we are checking url: "+url);
        if (url == null || !url.startsWith(VALID_URL))
            throw new UrlException();
        return url;
    }

    public String idValidator(String url) {
        String id = url.substring(VALID_URL.length());
        System.out.println("step 3, we are checking id: " +id);
        if (!id.matches("^(?:[1-9][0-9]{0,2}|1000)$"))
            throw new IdException();
        return id;
    }
}
