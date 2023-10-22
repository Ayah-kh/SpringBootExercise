package com.example.Exercise.properitySource;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource("classpath:mail.properties")
@PropertySource("classpath:messages.properties")
public class AppConfig3 {

}
