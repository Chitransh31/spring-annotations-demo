package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After Properties Set!");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy!");
    }

    @PostConstruct
    public void customInit() {
        System.out.println("Custom Init!");
    }

    @PreDestroy
    public void customDestroy() {
        System.out.println("Custom Destroy");
    }

}
