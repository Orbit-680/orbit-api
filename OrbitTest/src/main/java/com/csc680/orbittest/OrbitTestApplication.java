package com.csc680.orbittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.csc680.orbit.controller.StudentController;

@SpringBootApplication
public class OrbitTestApplication extends SpringBootServletInitializer
{
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
    {
        return application.sources(OrbitTestApplication.class);
    }
    public static void main(String[] args) 
    {
        SpringApplication.run(OrbitTestApplication.class, args);
    }    
}