package com.example.myspringboot.mapper;

import com.example.myspringboot.common.BaseMapper;
import com.example.myspringboot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper extends BaseMapper<User> {

//    @Select("select * from users where name = #{name}")
    User findByName(@Param("name") String name);

    @Select("select count(*) from users")
    Integer countAll();


}
