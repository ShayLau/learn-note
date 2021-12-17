package com.github.shaylau.redisexample.jedis.service.impl;

import com.github.shaylau.redisexample.jedis.model.SimplePubsub;
import com.github.shaylau.redisexample.jedis.service.PubSubService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

/**
 * 
 * @date 2020/9/8 1:21 下午
 */
@Service
@Slf4j
public class PubsubServiceImpl implements PubSubService {

    @Autowired
    private Jedis jedis;

    /**
     * 频道订阅
     *
     * @param channels 频道名称
     */
    @Override
    public void subscribeChannel(String... channels) {
        SimplePubsub pubsub = new SimplePubsub();
        jedis.subscribe(pubsub, channels);
    }

    @Override
    public void unSubscribeChannel(String... channels) {
        SimplePubsub pubsub = new SimplePubsub();
        pubsub.unsubscribe(channels);
    }

}
