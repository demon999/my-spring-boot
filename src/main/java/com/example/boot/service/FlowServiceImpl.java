package com.example.boot.service;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.boot.entity.Flow;
import com.example.boot.mapper.FlowMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Richard Xue
 * @version 1.0
 * @date 2019-12-01 15:46
 */
@Service
public class FlowServiceImpl extends ServiceImpl<FlowMapper, Flow> implements FlowService {
    @Override
    public List<Flow> test() {
//        for (int i = 0; i < 10; i++) {
//            Flow flow = Flow.builder().userId(i).no(UUID.randomUUID().toString()).createTime(new Date()).build();
//            getBaseMapper().insert(flow);
//        }
        return getBaseMapper().selectList(Wrappers.<Flow>query().eq("user_id", 2));
    }
}
