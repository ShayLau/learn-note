package com.github.shaylau.redissonexample.single.service;

/**
 * 
 * @date 2020/9/7 3:02 下午
 */
public interface BaseService {

    /**
     * 获取key
     *
     * @param key key name
     * @return value
     */
    Long get(String key);
}
