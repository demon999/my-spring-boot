package com.example.boot.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author Richard Xue
 * @version 1.0
 * @date 2019-11-24 20:53
 */
@TableName(value = "orders")
@Data
@Accessors(chain = true)
public class Orders {
    private int id;
    private int userId;
    private String number;
    @TableField(exist = false)
    private Date createTime;

}
