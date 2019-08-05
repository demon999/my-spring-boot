package com.example.myspringboot.minos;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Richard Xue
 * @version 1.0
 * @description
 * @date 2019-06-25 17:45
 */
@Data
public class Order {
    private String no;
    private int userId;
    /** base info */
    private String name;
    private String mobile;

    private String applyTime;
    private BigDecimal amt;
    private int term;

    private String contact;
    private int customerType;

    private BigDecimal latitude;
    private BigDecimal longitude;
    private String ip;


    private String device;

    private String productNo;
    private String channelNo;

    private int score;
    private String decision;
    private BigDecimal userLimit;
    private Date auditTime;

    private int random;
    private String token;
}
