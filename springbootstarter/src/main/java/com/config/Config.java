package com.config;

import com.pojo.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    public Config() {
        System.out.println("TestConfig容器初始化...");
    }

    @Bean(name = "getMyCar")
    public Car getCar() {
        Car c = new Car();
        c.setName("dankun");
        return c;
    }
}