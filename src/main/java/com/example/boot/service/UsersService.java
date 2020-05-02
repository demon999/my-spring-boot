package com.example.boot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.boot.entity.Users;

import java.util.List;

/**
 * @author Richard Xue
 * @version 1.0
 * @date 2019-11-30 22:25
 */
public interface UsersService extends IService<Users> {
  List<Users> search();
}
