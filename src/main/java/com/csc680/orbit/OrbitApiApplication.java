package com.csc680.orbit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.csc680.orbit.controller.StudentController;

@SpringBootApplication
public class OrbitApiApplication extends SpringBootServletInitializer
{
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
    {
        return application.sources(OrbitApiApplication.class);
    }
    public static void main(String[] args) 
    {
        SpringApplication.run(OrbitApiApplication.class, args);
    }    
}