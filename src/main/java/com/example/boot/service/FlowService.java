package com.example.boot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.boot.entity.Flow;

import java.util.List;

/**
 * @author Richard Xue
 * @version 1.0
 * @date 2019-12-01 15:46
 */
public interface FlowService extends IService<Flow> {
    List<Flow> test();
}
