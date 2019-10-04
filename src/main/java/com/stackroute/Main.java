package com.stackroute;

import com.stackroute.config.SpringConfiguration;
import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.Movie;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main( String[] args ) {

        ConfigurableApplicationContext applicationContext= new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Movie movieA = applicationContext.getBean(Movie.class);
        System.out.println("Actor Details: " + movieA.getActor());

        BeanLifecycleDemoBean beanLifecycleDemoBean = applicationContext.getBean(BeanLifecycleDemoBean.class);
        beanLifecycleDemoBean.customInit();
        beanLifecycleDemoBean.customDestroy();

        applicationContext.close();

    }
}
