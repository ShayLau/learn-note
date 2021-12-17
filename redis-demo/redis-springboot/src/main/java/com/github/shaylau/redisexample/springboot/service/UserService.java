package com.github.shaylau.redisexample.springboot.service;

import org.redisson.api.RedissonClient;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author <a href="mailto:work_xq@163.com">Xuq</a>
 * @version V 0, UserService.java
 * @since 2021/8/18 13:52
 */
@Service
public class UserService {

    @Resource
    private RedissonClient redissonClient;

    public void register() {


    }
}
