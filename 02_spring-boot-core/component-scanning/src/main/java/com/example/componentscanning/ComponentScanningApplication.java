package com.example.componentscanning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(scanBasePackages = {
//        "com.example.constructorinjection",
//        "com.example.setterinjection"
//})
@SpringBootApplication
public class ComponentScanningApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComponentScanningApplication.class, args);
    }

}
