package com.example.myspringboot.mapper;

import com.example.myspringboot.entity.AppMessage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppMessageMapper {
    int deleteByPrimaryKey(String id);

    int insert(AppMessage record);

    int insertSelective(AppMessage record);

    AppMessage selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AppMessage record);

    int updateByPrimaryKey(AppMessage record);

    List<AppMessage> selectAll();

    List<AppMessage> getMessById(String id);
}
