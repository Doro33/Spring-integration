package com.example.ayande.filter;

import com.example.ayande.exception.AyandeShebaException;
import com.example.ayande.exception.ShebaNumberException;
import com.example.converttest.exception.UrlException;
import org.springframework.stereotype.Service;

@Service("ayandeValidator")
public class AyandeValidator {

    private final String VALID_URL = "http://localhost/ayande/sheba/";

    public String urlValidation(String url) {
        System.out.println("url checking: "+ url);
        if (url == null || !url.startsWith(VALID_URL))
            throw new UrlException();
        return url;
    }

    public String shebaValidation(String shebaNumber) {
        if (!shebaNumber.matches("^IR\\d{24}$"))
            throw new ShebaNumberException();

        String bankCode = shebaNumber.substring(4, 7);
        if (!bankCode.equals("062"))
            throw new AyandeShebaException();

        return shebaNumber;
    }
}
