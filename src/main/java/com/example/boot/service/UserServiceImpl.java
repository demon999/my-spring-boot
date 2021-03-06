package com.example.boot.service;

import com.example.boot.entity.User;
import com.example.boot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public User saveUser(String name) {
        User user = new User();
        user.setName(name);
        userMapper.insert(user);
        return user;
    }
}
