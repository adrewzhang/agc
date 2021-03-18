package com.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

@Configuration
@EnableConfigurationProperties(JedisProperties.class)
@ConditionalOnClass(Jedis.class)
public class JedisConfig {

    @Bean
    @ConditionalOnMissingBean(Jedis.class)
    public Jedis jedis(JedisProperties jedisProperties) {
        System.out.println(jedisProperties.getUrl() + " : " + jedisProperties.getPort());
        return new Jedis(jedisProperties.getUrl(), jedisProperties.getPort());
    }
}
