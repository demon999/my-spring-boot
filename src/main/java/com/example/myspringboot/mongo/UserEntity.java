package com.example.bootdemo.mongo;

import lombok.Data;
import java.io.Serializable;

@Data
public class UserEntity implements Serializable {
    private Long id;
    private String userName;
    private String passWord;

}
