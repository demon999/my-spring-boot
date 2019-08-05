package com.example.myspringboot.minos;

import lombok.Data;

import java.util.List;

/**
 * @author Richard Xue
 * @version 1.0
 * @description
 * @date 2019-06-25 18:41
 */
@Data
public class ProductModel {
    private String productNo;
    private List<Model> modelList;
}
