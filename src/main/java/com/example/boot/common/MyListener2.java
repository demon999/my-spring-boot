package com.example.boot.common;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author Richard Xue
 * @version 1.0
 * @description 注解方式实现Listener
 * @date 2019-06-23 11:42
 */
@WebListener
//@WebFilter
//@WebServlet
public class MyListener2 implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
