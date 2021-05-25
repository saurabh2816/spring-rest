package com.saurabh;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.apache.log4j.Logger;

@Configuration
@ComponentScan
@EnableWebMvc
public class Application {

    static Logger log = Logger.getLogger(Application.class.getName());
}
