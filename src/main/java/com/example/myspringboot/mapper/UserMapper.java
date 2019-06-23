package com.example.myspringboot.mapper;

import com.example.myspringboot.common.BaseMapper;
import com.example.myspringboot.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
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
