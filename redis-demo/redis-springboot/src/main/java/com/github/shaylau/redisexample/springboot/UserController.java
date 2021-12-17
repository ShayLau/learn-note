package com.github.shaylau.redisexample.springboot;

import com.github.shaylau.redisexample.springboot.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author <a href="mailto:work_xq@163.com">Xuq</a>
 * @version V 0, UserController.java
 * @since 2021/8/18 13:52
 */
@RequestMapping("/user/center")
@RestController
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 注册
     *
     * @return
     */
    @PostMapping("/register")
    public void register() {
        userService.register();
    }
}
