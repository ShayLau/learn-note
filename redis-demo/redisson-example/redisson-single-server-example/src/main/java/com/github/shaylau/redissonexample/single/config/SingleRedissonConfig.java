package com.github.shaylau.redissonexample.single.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.api.RedissonReactiveClient;
import org.redisson.api.RedissonRxClient;
import org.redisson.client.codec.StringCodec;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * single Redission config
 *
 * @author <a href="mailto:work_xq@163.com">Xuq</a>
 * @version V 0, RedissionConfig.java
 * @since 2021/6/18 15:49
 */
@Configuration
public class SingleRedissonConfig {


    /**
     * 指定字符串加载方式
     *
     * @return config
     */
    public Config singleConfigByStr() {
        String redisConfig = "redis://localhost:6379";
        Config config = new Config();
        config.setCodec(StringCodec.INSTANCE);
        config.useSingleServer().setAddress(redisConfig);
        return config;
    }


    /**
     * YML 加载方式
     *
     * @return config
     */
    public Config singleConfigByYml() {
        Config config = null;
        try {
            ClassPathResource resource = new ClassPathResource("redisson/SingleRedissonConfig.yml");
            config = Config.fromYAML(resource.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return config;
    }


    @Bean
    public RedissonClient redissonClient() {
        return Redisson.create(singleConfigByYml());
    }

    @Bean
    public RedissonReactiveClient reActiveClient() {
        return Redisson.create(singleConfigByYml()).reactive();
    }

    @Bean
    public RedissonRxClient rxClient() {
        return Redisson.create(singleConfigByYml()).rxJava();
    }

}
