package com.example.spring.cloud.alibaba.consumer.controller;

import com.example.spring.cloud.alibaba.consumer.service.FeignTestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 1.feign调用provider
 * 2.测试nacos外部动态配置。@RefreshScope
 * @author huwj
 * @date 2019-09-16 21:21
 */
@RestController
@RefreshScope
public class FeignController {

    @Resource
    private FeignTestService feignTestService;
    @Value(value = "${user.name}")
    private String name;
    @Value(value = "${server.port}")
    private String port;

    @RequestMapping(value = "/feign/echo", method = RequestMethod.GET)
    public String feignController(){
        return "consumer port:"+ port + ";" + feignTestService.feign(name);
    }
}
