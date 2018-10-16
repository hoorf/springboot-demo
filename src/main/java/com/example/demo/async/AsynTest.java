package com.example.demo.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

@Component
public class AsynTest {


    @Async
    public void run() throws InterruptedException {
        System.out.println("跑很久。。。。");
        Thread.currentThread().sleep(6000);
        System.out.println("跑完了。。。。");

    }
}
