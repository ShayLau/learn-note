package org.example.controller;

import org.example.service.DemoService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RequestMapping("/service")
@RestController
public class ServiceDemoController {

    @Resource
    private DemoService demoService;

    /**
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<String> list() {
        return demoService.getList();
    }

    /**
     * @return
     */
    @RequestMapping(value = "/list/{id}", method = RequestMethod.GET)
    public String getInfoById(@PathVariable Long id) {
        return demoService.getInfoById(id);
    }
}
