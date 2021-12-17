package com.shaylau.github.arthas.example.contorller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;


/**
 * <p>Description: 例子 </p>
 * <p>@author：http://www.github.com/shaylau</p>
 *
 * @author ShayLau
 * @since 2021/4/9
 */
@RestController
@RequestMapping("/example")
public class Example1Controller {


    /**
     * 查询用户姓名
     */
    @GetMapping("/search/name")
    public ModelMap searchUserName() {
        String name = "小李";
        if (true) {
            throw new RuntimeException("运行时发生错误了！！！");
        }
        System.out.println("Hello World：" + name);
        return new ModelMap("name", name);
    }


    /**
     * 运行一个Lambda任务
     */
    @GetMapping("/test2")
    public void runLambdaTask() {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("test");
        String testKey = "hello";
        list.stream().forEach(str -> {
            if (testKey.equals(str.toLowerCase())) {
                System.out.println("你好！");
            } else {
                System.out.println("Hello World!");
            }
        });
    }

}
