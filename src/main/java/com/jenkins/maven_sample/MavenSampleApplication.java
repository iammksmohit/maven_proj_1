package com.jenkins.maven_sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/test")
public class MavenSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MavenSampleApplication.class, args);
    }

    @GetMapping
    public String jenkinsWorking(){
        return "Sample Maven running on Jenkins";
    }

}
