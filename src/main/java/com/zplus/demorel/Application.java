package com.zplus.demorel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "com.zplus.demorel")
public class Application {

    public static void main(String args[])
    {

        SpringApplication.run(Application.class,args);

    }
}
