package com.github.shaylau.redissonexample.single.controller;

import com.github.shaylau.redissonexample.single.service.HashService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author <a href="mailto:work_xq@163.com">Xuq</a>
 * @version V 0, HashContorller.java
 * @since 2021/6/18 16:25
 */
@RestController
@RequestMapping("/hash")
public class HashController {


    @Resource
    private HashService hashService;


    /**
     * @param key
     */
    @GetMapping("/{key}")
    public void keyInfo(@PathVariable String key) {
        hashService.keyInfo(key);
    }


}
