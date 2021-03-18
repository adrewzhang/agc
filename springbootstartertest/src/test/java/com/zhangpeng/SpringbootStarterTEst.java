package com.zhangpeng;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringbootStarterTEst {

    @Autowired
    private Jedis jedis;

    @Test
    public void testStarter() {

        System.out.println(jedis.toString());
    }
}
