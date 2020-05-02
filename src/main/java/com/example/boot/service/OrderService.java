package com.example.boot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.boot.entity.TOrder;

/**
 * @author Richard Xue
 * @version 1.0
 * @date 2019-12-01 15:26
 */
public interface OrderService extends IService<TOrder> {
    void test();
}
