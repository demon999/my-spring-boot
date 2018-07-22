package com.example.myspringboot.service;

import com.example.myspringboot.entity.User;
import com.example.myspringboot.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User saveUser(String name) {
        User user = new User();
        user.setName(name);
        userMapper.insert(user);
        return user;
    }
}
