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
    @Value("${app.name}")
    private String appName;
    @Value("${app.description}")
    private String appDescription;

    public String getHost() {
        return host;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getAppName() {
        return appName;
    }

    public String getAppDescription() {
        return appDescription;
    }
}
