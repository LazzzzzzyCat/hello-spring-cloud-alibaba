package com.example.spring.cloud.alibaba.consumer.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author huwj
 * @date 2019-09-16 10:58
 */
@RestController
public class ConsumerController {

    @Resource
    RestTemplate restTemplate;

    @RequestMapping(value = "/echo/{str}", method = RequestMethod.GET)
    public String consumer(@PathVariable String str){
        return restTemplate.getForObject("http://service-provider/echo/" + str, String.class);
    }
}
