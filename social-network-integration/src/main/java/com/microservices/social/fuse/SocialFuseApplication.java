package com.microservices.social.fuse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SocialFuseApplication {

    private static Logger logger = LoggerFactory.getLogger(SocialFuseApplication.class);

    @Value("${camel.component.servlet.mapping.contextPath}")
    private String contextPath;

    public static void main(String[] args) {
        SpringApplication.run(SocialFuseApplication.class, args);
    }

}
