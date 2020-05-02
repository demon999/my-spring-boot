package com.example.boot.config;

import com.baomidou.mybatisplus.extension.parsers.DynamicTableNameParser;
import com.baomidou.mybatisplus.extension.parsers.ITableNameHandler;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.example.boot.entity.Flow;
import org.apache.ibatis.executor.statement.RoutingStatementHandler;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;
import java.util.HashMap;

/**
 * @author Richard Xue
 * @version 1.0
 * @date 2019-12-01 15:39
 */
@MapperScan("com.example.boot.mapper")
@Configuration
public class DbConfig {
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        DynamicTableNameParser dynamicTableNameParser = new DynamicTableNameParser();
        HashMap<String, ITableNameHandler> tableNameHandlerHashMap = new HashMap<>(2);

        tableNameHandlerHashMap.put("flow", (metaObject, sql, tableName) -> {
            // metaObject 可以获取传入参数，这里实现你自己的动态规则
            Object originalObject = metaObject.getOriginalObject();
            if (originalObject instanceof RoutingStatementHandler) {
                RoutingStatementHandler routingStatementHandler = (RoutingStatementHandler) originalObject;
                Object parameterObject = routingStatementHandler.getParameterHandler().getParameterObject();
                // 插入时
                if (parameterObject instanceof Flow) {
                    Flow flow = (Flow) parameterObject;
                    Integer userId = flow.getUserId();
                    return tableName + "_" + userId % 2;
                }
                // TODO
            }
            return tableName;
        });
        dynamicTableNameParser.setTableNameHandlerMap(tableNameHandlerHashMap);
        paginationInterceptor.setSqlParserList(Collections.singletonList(dynamicTableNameParser));
        return paginationInterceptor;
    }
}
