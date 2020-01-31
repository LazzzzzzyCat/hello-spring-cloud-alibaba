package com.example.spring.cloud.alibaba.consumer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * restTemplate调用provider
 * @author huwj
 * @date 2019-09-16 10:58
 */
@RestController
public class ConsumerController {

    @Resource
    RestTemplate restTemplate;


    @Value(value = "${spring.application.name}")
    private String appName;
    @Value(value = "${server.port}")
    private String port;

    @RequestMapping(value = "/echo/appName", method = RequestMethod.GET)
    public String consumer(){
        return "consumer port:"+ port + ";" + restTemplate.getForObject("http://service-provider/echo/" + appName, String.class);
    }
}
