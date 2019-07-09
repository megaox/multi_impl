package com.geek.mutiImpl;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * service路由策略
 */
@Component
public class ServiceStrategy implements ApplicationContextAware {
    private static final Map<Integer, TestService> testServiceMap = new HashMap<>();

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        applicationContext.getBeansOfType(TestService.class).forEach((key, value) -> testServiceMap.put(value.getType(), value));
    }

    /**
     * 根据type动态获取TestService的实现类
     * @param type 类型
     * @return TestService的实现类
     */
    public TestService getTestService(Integer type) {
        return testServiceMap.get(type);
    }

}
