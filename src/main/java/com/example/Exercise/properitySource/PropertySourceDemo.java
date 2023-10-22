package com.example.Exercise.properitySource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertySourceDemo {
    @Value("${gmail.host}")
    private String host;
    @Value("${gmail.email}")
    private String email;
    @Value("${gmail.password}")
    private String password;
}
