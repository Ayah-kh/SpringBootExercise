package com.example.Exercise.properitySource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertySourceDemo {
    @Value("${mail2.host}")
    private String host;
    @Value("${mail2.email}")
    private String email;
    @Value("${mail2.password}")
    private String password;

    public String getHost() {
        return host;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
