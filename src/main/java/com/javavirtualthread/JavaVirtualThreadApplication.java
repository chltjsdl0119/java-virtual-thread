package com.javavirtualthread;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class JavaVirtualThreadApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaVirtualThreadApplication.class, args);
    }

}
