package com.example.demo.listener;


import org.springframework.boot.web.servlet.ServletComponentScan;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class TestListener  implements ServletContextListener{
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        System.err.println("启动了");
        System.err.println("缓存了");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.err.println("关闭了");
    }
}
