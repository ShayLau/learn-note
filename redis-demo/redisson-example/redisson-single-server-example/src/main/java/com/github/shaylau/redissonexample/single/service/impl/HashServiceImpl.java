package com.github.shaylau.redissonexample.single.service.impl;

import com.github.shaylau.redissonexample.single.service.HashService;
import org.redisson.api.RMap;
import org.redisson.api.RedissonClient;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author <a href="mailto:work_xq@163.com">Xuq</a>
 * @version V 0, HashServiceImpl.java
 * @since 2021/6/18 15:59
 */
@Service
public class HashServiceImpl implements HashService {


    @Resource
    private RedissonClient redissonClient;

    /**
     * put hash
     * <description>
     * redisson在初始化 redisson connectionManager如果没有设置 Codec编码规则
     * 默认为 new MarshallingCodec()
     * Spring在生成 bean 时（RedissionConfig.java）的我们手动设置了编码规则
     * config.setCodec(StringCodec.INSTANCE);一下程序会报错
     * 或者改为以下形式运行 RMap<String, Object> rMap = redissonClient.getMap(key, StringCodec.INSTANCE);
     * 否则会报错
     *
     * </description>
     *
     * @param key hash key
     */
    @Override
    public void keyInfo(String key) {
        RMap<String, Object> rMap = redissonClient.getMap(key);
        rMap.forEach((mapKey, mapValue) -> System.out.println("key:" + mapKey + "value:" + mapValue));

    }
}
