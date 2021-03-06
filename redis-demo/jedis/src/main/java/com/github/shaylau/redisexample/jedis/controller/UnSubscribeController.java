package com.github.shaylau.redisexample.jedis.controller;

import com.github.shaylau.redisexample.jedis.service.PubSubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @date 2020/9/8 1:42 下午
 */
@RequestMapping("/unsubscribe")
@RestController()
public class UnSubscribeController {

    @Autowired
    private PubSubService pubSubService;


    /**
     * 订阅频道
     *
     * @param channels 频道名称
     */
    @PostMapping("/channel")
    public void unSubscribeChannel(String channels) {
        pubSubService.unSubscribeChannel(channels.split(","));
    }


}
