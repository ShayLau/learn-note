package com.github.shaylau.redissonexample.single.controller;

import com.github.shaylau.redissonexample.single.service.LockService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ShayLau
 * @date 2020/9/7 4:34 下午
 */
@RestController
@RequestMapping("/lock")
public class LockController {

    @Resource
    private LockService lockService;


    @PostMapping("")
    public void lock(String key) {
        lockService.getLock(key);
    }


}
