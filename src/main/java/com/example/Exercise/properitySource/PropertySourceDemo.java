package com.example.Exercise.properitySource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PropertySourceDemo {

    @Autowired
    private Environment environment;
//    @Value("${mail2.host}")
    private String host;
//    @Value("${mail2.email}")
    private String email;
//    @Value("${mail2.password}")
    private String password;
//    @Value("${app.name}")
    private String appName;
//    @Value("${app.description}")
    private String appDescription;

    public String getHost() {
        return environment.getProperty("mail2.host");
    }

    public String getEmail() {
        return environment.getProperty("mail2.email");
    }

    public String getPassword() {
        return environment.getProperty("mail2.password");
    }

    public String getAppName() {
        return environment.getProperty("app.name");
    }

    public String getAppDescription() {
        return environment.getProperty("app.description");
    }
}
