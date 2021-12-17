package org.demo.client.service.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "server")
public interface FeignDemoService {

    /**
     * 获取列表
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "/service/list")
    List<String> getList();

    /**
     * 获取信息 根据 id
     *
     * @param id
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "/service/list/{id}")
    String getInfoById(@PathVariable("id") Long id);
}
