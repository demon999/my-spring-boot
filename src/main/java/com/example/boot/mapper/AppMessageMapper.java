package com.example.boot.mapper;

import com.example.boot.entity.AppMessage;
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
