package com.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by gl on 2019/4/1.
 */
@Configuration
@EnableAutoConfiguration
@EnableWebMvc
@EnableJpaAuditing
@ComponentScan( basePackageClasses = {BootApplication.class})
public class BootApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }


}