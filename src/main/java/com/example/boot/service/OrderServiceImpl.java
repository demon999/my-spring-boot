package com.example.boot.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.boot.entity.TOrder;
import com.example.boot.mapper.OrderMapper;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

/**
 * @author Richard Xue
 * @version 1.0
 * @date 2019-12-01 15:27
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, TOrder> implements OrderService {
    @Override
    public void test() {
        getBaseMapper().selectById(1);
        for (int i = 0; i < 10; i++) {
            TOrder order = TOrder.builder().userId(i).orderId(i)
                    .no(UUID.randomUUID().toString()).createTime(new Date()).build();
            getBaseMapper().insert(order);
        }
    }
}
