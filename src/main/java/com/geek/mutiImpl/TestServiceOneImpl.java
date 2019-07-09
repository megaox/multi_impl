package com.geek.mutiImpl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 实现一
 */
@Slf4j
@Service
public class TestServiceOneImpl implements TestService {
    @Override
    public Integer getType() {
        return Constant.ONE;
    }

    @Override
    public String testOne() {
        return getResult();
    }

    @Override
    public String testTwo() {
        return getResult();
    }

    private String getResult() {
        String className = getClass().getName();
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        log.info(className);
        log.info(methodName);
        return className + " ;  " + methodName;
    }
}
