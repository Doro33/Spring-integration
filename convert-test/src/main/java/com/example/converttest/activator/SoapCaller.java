package com.example.converttest.activator;

import com.example.converttest.exception.ConnectionException;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;

@Component("soapCaller")
public class SoapCaller {
    public String callSoap(String id) throws ConnectionException {
        String url = "http://www.crcind.com/csp/samples/SOAP.Demo.cls?soap_method=FindPerson&id=" + id;
        try (InputStream response = new URL(url).openStream()) {
            return new String(response.readAllBytes(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new ConnectionException(e.getMessage());
        }
    }
}