package com.example.demo;

import com.example.demo.async.AsynTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Resource
   private AsynTest test;

    @Test
    public void contextLoads() throws InterruptedException {
        test.run();
    }

}
