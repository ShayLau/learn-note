package com.github.shaylau.redissonexample.cluster.service.impl;

import com.github.shaylau.redissonexample.cluster.service.LockService;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * 
 * @date 2020/9/7 3:36 下午
 */
@Service
@Slf4j
public class LockServiceImpl implements LockService {

    @Resource
    private RedissonClient client;

    @Override
    public void getLock(String key) {
        RLock lock = client.getLock(key);
        lock.lock(10, TimeUnit.MINUTES);
        log.info("lock.isLocked():" + lock.isLocked());
    }
}
