package com.example.boot.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @author Richard Xue
 * @version 1.0
 * @date 2019-12-01 15:18
 */
@Builder
@Data
public class TOrder {
    private Integer userId;
    private Integer orderId;
    private String no;
    private Date createTime;
}
