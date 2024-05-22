package com.example.dockerhello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DockerHelloApplication {
    @GetMapping("/hello")
    public String hello(){
        return "hello les gars!";
    }
    public static void main(String[] args) {
        SpringApplication.run(DockerHelloApplication.class, args);
    }

}
