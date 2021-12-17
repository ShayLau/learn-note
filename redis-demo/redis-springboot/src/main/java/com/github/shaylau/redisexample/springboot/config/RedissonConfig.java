package com.github.shaylau.redisexample.springboot.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author <a href="mailto:work_xq@163.com">Xuq</a>
 * @version V 0, RedissonConfig.java
 * @since 2021/8/18 13:40
 */
@Configuration
public class RedissonConfig {

    @Resource
    private RedissonProperties redissonProperties;

    @Bean
    public RedissonClient redissonClient() {
        String nodes = redissonProperties.getCluster().getNodes();
        List<String> list = Arrays.stream(nodes.split(","))
                .map(nodeString -> "redis://" + nodeString).collect(Collectors.toList());
        Config config = new Config();
        config.useClusterServers().setNodeAddresses(list);
        return Redisson.create(config);
    }
}
