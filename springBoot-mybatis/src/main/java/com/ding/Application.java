package com.ding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ding on 16-7-29.
 */
@Configuration
@ServletComponentScan
@SpringBootApplication
public class Application  {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
