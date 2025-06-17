package com.example.security.Utils;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "application")
@Data
@RequiredArgsConstructor
public class AplicationProps
{
    private List<String> allowedOrigin;

    @Bean
    public  List<String> getAllowedOrigin() {
        Integer number=0;
    for (String origin : allowedOrigin)
        ++number;
        System.out.println("number:"+number);
        return allowedOrigin;
    }
}
