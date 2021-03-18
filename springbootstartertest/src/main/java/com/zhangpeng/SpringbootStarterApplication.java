package com.zhangpeng;

import com.pojo.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootStarterApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootStarterApplication.class);
        Object jedis = context.getBean("jedis");
        if (jedis == null) {

        }
        System.out.println(jedis);
        String s = "fladksjglkad" +
                "gnmladkngml" +
                "asdkngladskgn;aldskgn";

        Car car = (Car) context.getBean("car");
        // TODO: 2021/3/7/007
        System.out.println(car.getName());
    }


    /**
     * @param a
     * @param fjaslg
     */
    public void abc(int a, String fjaslg) {

        return;
    }
}
