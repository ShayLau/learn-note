package com.github.shaylau.redisexample.springboot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author <a href="mailto:work_xq@163.com">Xuq</a>
 * @version V 0, RedissonProperties.java
 * @since 2021/8/18 13:39
 */
@Data
@Component
@ConfigurationProperties("spring.redis")
public class RedissonProperties {

    private String password;

    private cluster cluster;

    @Data
    public static class cluster {
        private String nodes;
    }
}
