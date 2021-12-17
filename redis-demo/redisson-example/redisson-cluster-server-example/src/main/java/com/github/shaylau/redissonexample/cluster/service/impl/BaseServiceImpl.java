package com.github.shaylau.redissonexample.cluster.service.impl;

import com.github.shaylau.redissonexample.cluster.service.BaseService;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RAtomicLong;
import org.redisson.api.RedissonClient;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ShayLau
 * @date 2020/9/7 2:57 下午
 */
@Service
@Slf4j
public class BaseServiceImpl implements BaseService {

    @Resource
    private RedissonClient redissonClient;

    /**
     * 获取一个key
     *
     * @param key key Name
     * @return value
     */
    @Override
    public Long get(String key) {
        RAtomicLong rAtomicLong = redissonClient.getAtomicLong(key);
        Long result = rAtomicLong.getAndIncrement();
        log.info("atomic long result:" + result);
        return result;
    }
}
