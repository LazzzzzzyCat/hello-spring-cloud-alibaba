package com.example.spring.cloud.alibaba.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务提供者demo
 * @author huwj
 * @date 2019-09-16 10:53
 */
@RestController
public class ProviderController {

    @Value(value = "${server.port}")
    private String port;

    @GetMapping("/echo/{str}")
    public String providerString(@PathVariable String str){
        StringBuilder sb = new StringBuilder();
        sb.append("Hello,");
        sb.append(str);
        sb.append(".I from port:");
        sb.append(port);
        return  sb.toString();
    }


}
