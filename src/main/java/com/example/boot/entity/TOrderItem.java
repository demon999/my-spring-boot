package com.example.boot.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Richard Xue
 * @version 1.0
 * @date 2019-12-01 15:19
 */
@Data
public class TOrderItem {
    private Integer userId;
    private Integer orderId;
    private Date createTime;
}
