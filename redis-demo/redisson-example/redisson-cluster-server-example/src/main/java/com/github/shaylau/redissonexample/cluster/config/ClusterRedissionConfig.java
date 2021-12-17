package com.github.shaylau.redissonexample.cluster.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.client.codec.StringCodec;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * cluster Redission config
 *
 * @author <a href="mailto:work_xq@163.com">Xuq</a>
 * @version V 0, RedissionConfig.java
 * @since 2021/6/18 15:49
 */
@Configuration
public class ClusterRedissionConfig {


    /**
     * 指定字符串加载方式
     *
     * @return
     */
    public Config clusterRedissionConfigByStr() {
        Config config = new Config();
        config.setCodec(StringCodec.INSTANCE);
        String redisConfig = "redis://localhost:6379";
        config.useSingleServer().setAddress(redisConfig);
        return config;
    }


    public Config clusterConfigByYML() {
        Resource resource = new ClassPathResource("redisson/ClusterRedissonConfig.yml");
        Config config = null;
        try {
            config = Config.fromYAML(resource.getFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        config.useClusterServers();
        return config;
    }

    @Bean
    public RedissonClient redissonClient() {
        return Redisson.create(clusterConfigByYML());
    }

}
