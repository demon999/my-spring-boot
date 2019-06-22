package com.example.myspringboot.utils;

import com.ql.util.express.DefaultContext;
import com.ql.util.express.ExpressRunner;

public class QLExpressTest {
    public static void main(String[] args) throws Exception {
        ExpressRunner runner = new ExpressRunner();
        DefaultContext<String, Object> context = new DefaultContext<String, Object>();
        context.put("a", 1);
        context.put("b", 2);
        context.put("c", 3);
        String express = "a == 1";
        Object r = runner.execute(express, context, null, true, true);
        System.out.println(r);
    }
}
