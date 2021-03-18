package com.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "demo")
public class JedisProperties {
    private String url;
    private Integer port;
}
