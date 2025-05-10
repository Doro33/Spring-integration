package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:convertContext.xml", "classpath:error-resolver.xml", "classpath:shebaContext.xml"})
public class ConvertTestApplication {

    public static void main(String[] args) {
         SpringApplication.run(ConvertTestApplication.class, args);
    }
}