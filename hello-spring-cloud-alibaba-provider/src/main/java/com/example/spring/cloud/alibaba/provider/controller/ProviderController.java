package com.example.spring.cloud.alibaba.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huwj
 * @date 2019-09-16 10:53
 */
@RestController
public class ProviderController {

    @GetMapping("/echo/{str}")
    public String providerString(@PathVariable String str){
        return "Hello:" + str;
    }
}
