package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean
    public Actor getActorBean() {
        return new Actor("Keanu Reeves","Male",22);
    }

    @Bean
    public Movie getMovieBean() {
        return new Movie(getActorBean());
    }

}
