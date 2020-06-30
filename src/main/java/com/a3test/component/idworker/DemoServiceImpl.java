package com.a3test.component.idworker;

import org.springframework.stereotype.Component;

@Component
public class DemoServiceImpl implements DemoService {

    @Override
    public String hello(String name) {
        return "Hello, " + name + ".";
    }
}
