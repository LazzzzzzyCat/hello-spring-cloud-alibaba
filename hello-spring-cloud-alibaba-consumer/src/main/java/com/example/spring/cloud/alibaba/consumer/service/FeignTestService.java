package com.example.spring.cloud.alibaba.consumer.service;

import com.example.spring.cloud.alibaba.consumer.service.impl.FeignTestServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * feign调用
 * 熔断机制测试
 * @author huwj
 * @date 2019-09-16 21:23
 */
@FeignClient(name = "service-provider", fallback = FeignTestServiceImpl.class)
public interface FeignTestService {

    @RequestMapping(value = "/echo/{str}", method = RequestMethod.GET)
    String feign(@PathVariable("str") String str);
}
