package org.demo.client.controller;

import org.demo.client.service.feign.FeignDemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/demo")
@RestController
public class DemoController {


    @Resource
    private FeignDemoService feignDemoService;

    /**
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<String> list() {
        return feignDemoService.getList();
    }

    /**
     * @return
     */
    @RequestMapping(value = "/getInfoById", method = RequestMethod.GET)
    public String getInfoById(Long id) {
        return feignDemoService.getInfoById(id);
    }


}
