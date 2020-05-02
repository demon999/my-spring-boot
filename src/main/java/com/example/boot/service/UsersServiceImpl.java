package com.example.boot.service;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.boot.entity.Users;
import com.example.boot.mapper.UsersMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Richard Xue
 * @version 1.0
 * @date 2019-11-30 22:25
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {
  @Override
  public List<Users> search() {

    getBaseMapper().selectList(Wrappers.<Users>query().select(tableFieldInfo -> {
      System.out.println(tableFieldInfo.toString());
      if (tableFieldInfo.getProperty().startsWith("addr")) {
        return false;
      }
      return true;
    }).likeRight("name", "name-100"));

    return getBaseMapper().selectList(Wrappers.<Users>query().eq("address", "address-100"));
  }
}
