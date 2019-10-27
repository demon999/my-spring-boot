package com.example.boot.controller;

import com.example.boot.mapper.UserMapper;
import com.example.boot.service.UserService;
import org.mongodb.morphia.Datastore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Random;
import java.util.UUID;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private Datastore datastore;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;

    @GetMapping("/aa")
    public HashMap<String, Object> aa() {
        com.example.bootdemo.mongo.UserEntity userEntity = new com.example.bootdemo.mongo.UserEntity();
        userEntity.setId(new Random().nextLong());
        userEntity.setUserName(UUID.randomUUID().toString());
        mongoTemplate.save(userEntity);

        com.example.bootdemo.mongo.UserInfo userInfo = new com.example.bootdemo.mongo.UserInfo();
        userInfo.setName("xxx");
        userInfo.setMobile("123333333");
        datastore.save(userInfo);

        System.out.println(">>>>>" + userMapper.countAll());

//        userService.saveUser("sssss");
        return new HashMap<String, Object>(1) {{put("msg", "success");}};
    }

}
