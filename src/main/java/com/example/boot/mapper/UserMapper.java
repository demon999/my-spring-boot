package com.example.boot.mapper;

import com.example.boot.common.BaseMapper;
import com.example.boot.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper extends BaseMapper<User> {

    @Select("select * from users where name = #{name}")
    User findByName(@Param("name") String name);

    @Select("select count(*) from users")
    Integer countAll();

    @Insert("insert into users (name) values (#{name})")
    @Options(useGeneratedKeys = true, keyColumn = "id")
    void insertA(User user);

    @Select("SELECT * FROM users")
    List<User> list();


}
