package com.example.ayande.activator;

import com.example.ayande.dto.AyandeDto;
import org.springframework.stereotype.Service;

@Service("shebaService")
public class ShebaService {

    public static AyandeDto makeAyandeDtoBySheba(String sheba) {
        String accountNumber = sheba.substring(13);
        return new AyandeDto(accountNumber, sheba);
    }

    public String findShebaFromUrl(String url) {
        final String VALID_URL = "http://localhost/ayande/sheba/";
        return url.substring(VALID_URL.length());
    }
}
