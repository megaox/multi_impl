package com.geek.mutiImpl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 测试
 */
@RestController
public class TestController {
    @Resource
    private ServiceStrategy serviceStrategy;

    @GetMapping("one")
    public String testOne() {
        return serviceStrategy.getTestService(1).testOne();
    }

    @GetMapping("two")
    public String testTwo() {
        return serviceStrategy.getTestService(2).testTwo();
    }

}
