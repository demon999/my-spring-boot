package com.example.myspringboot.minos.product;

import lombok.Data;

/**
 * @author Richard Xue
 * @version 1.0
 * @description
 * @date 2019-06-25 17:42
 */
@Data
public class Product {
    private String no;
    private String name;
    private int status;
    private String secretKey;
    private String callbackUrl;
    private Company company;
}
