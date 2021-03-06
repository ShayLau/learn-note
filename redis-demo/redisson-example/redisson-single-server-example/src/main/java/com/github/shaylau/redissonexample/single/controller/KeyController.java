package com.github.shaylau.redissonexample.single.controller;

import com.github.shaylau.redissonexample.single.service.BaseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 
 */
@RestController
@RequestMapping("/key")
public class KeyController {

    @Resource
    private BaseService baseService;

    /**
     * 获取 key
     *
     * @param key
     */
    @GetMapping("/{key}")
    public void getKey(@PathVariable String key) {
        baseService.get(key);
    }


}
