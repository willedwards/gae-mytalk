package com.lumiin.mytalk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Author: wge
 * Date: 01/05/2015
 * Time: 09:09
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application
{

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
