package com.ding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ding on 16-7-6.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
public class App   extends SpringBootServletInitializer {

    @RequestMapping("/home")
    @ResponseBody
    public String home(){
        System.out.println("Spring boot demo");
        return "Spring boot demo";
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(App.class);
    }

    public static void main(String[] args){
        SpringApplication.run(App.class,args);
    }
}
