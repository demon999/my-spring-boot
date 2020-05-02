package com.example.boot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.boot.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Richard Xue
 * @version 1.0
 * @date 2019-11-24 20:54
 */
@Mapper
public interface OrdersMapper extends BaseMapper<Orders> {
}
