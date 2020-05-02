package com.example.boot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @author Richard Xue
 * @version 1.0
 * @date 2019-12-01 15:44
 */
@Builder
@Data
public class Flow {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer userId;
    private String no;
    private Date createTime;
}
