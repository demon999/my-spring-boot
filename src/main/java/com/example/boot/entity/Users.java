package com.example.boot.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author Richard Xue
 * @version 1.0
 * @date 2019-11-30 22:23
 */
@Data
@TableName(value = "users")
public class Users {
  private Integer id;
  private String name;
  private Integer age;
  private String address;
  private Date birthday;
}
