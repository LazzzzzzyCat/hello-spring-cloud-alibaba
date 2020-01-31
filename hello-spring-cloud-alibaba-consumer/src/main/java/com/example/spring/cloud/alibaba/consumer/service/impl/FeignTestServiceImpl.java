package com.example.spring.cloud.alibaba.consumer.service.impl;

import com.example.spring.cloud.alibaba.consumer.service.FeignTestService;
import org.springframework.stereotype.Component;

/**
 * 熔断服务后接口实现返回
 * @author huwj
 * @date 2019-09-17 10:21
 */
@Component
public class FeignTestServiceImpl implements FeignTestService {

    @Override
    public String feign(String str) {
        return "服务不可用，请稍后重试";
    }
}
