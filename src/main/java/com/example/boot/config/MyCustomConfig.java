package com.example.boot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "my")
@Data
public class MyCustomConfig {

    public String aaa;

}
