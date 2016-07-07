package com.ding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ding on 16-7-6.
 */
@SpringBootApplication
public class App   extends SpringBootServletInitializer {

    @RequestMapping("/")
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
