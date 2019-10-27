package com.example.boot.service;

import com.example.boot.entity.AppMessage;
import com.example.boot.mapper.AppMessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppMessageService {

    @Autowired
    private AppMessageMapper appMessageMapper;

    public List<AppMessage> getMessage(){
        List<AppMessage> list = new ArrayList<AppMessage>();
        list.add(appMessageMapper.selectByPrimaryKey("xtt"));
        //list = mapper.selectAll();
        return list;
    }

    public List<AppMessage> getAllMessage(){
        List<AppMessage> list = new ArrayList<AppMessage>();
        list = appMessageMapper.selectAll();
        return list;
    }

    public int addMessage(AppMessage appMessage) {
        return appMessageMapper.insert(appMessage);
    }

    public List<AppMessage> getMessageById(String id) {
        return appMessageMapper.getMessById(id);
    }

    public int delMessage(String id) {
        return appMessageMapper.deleteByPrimaryKey(id);
    }



}
