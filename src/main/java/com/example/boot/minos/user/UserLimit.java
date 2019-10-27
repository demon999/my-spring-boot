package com.example.boot.minos.user;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Richard Xue
 * @version 1.0
 * @description
 * @date 2019-06-25 17:57
 */
@Data
public class UserLimit {
    private int userId;
    private String productNo;
    private BigDecimal amt;
}
