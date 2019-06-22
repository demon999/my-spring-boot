package com.example.myspringboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "my")
public class MyCustomConfig {

    public String aaa;

}
