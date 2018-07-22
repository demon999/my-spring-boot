package com.example.myspringboot.repository;

import com.example.myspringboot.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    @Insert("insert into users (name) values (#{name})")
    @Options(useGeneratedKeys = true, keyColumn = "id")
    void insert(User user);

    @Select("SELECT * FROM users")
    List<User> list();
}
