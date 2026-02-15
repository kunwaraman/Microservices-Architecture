package com.Company.ms_app3;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients("com.Company.ms_app3")
public class MsApp3Application {

    public static void main(String[] args) {
        SpringApplication.run(MsApp3Application.class, args);
        System.out.println("hello from the zepkin");
    }


    @Bean
    public Sampler defaultSampler(){
        return Sampler.ALWAYS_SAMPLE;
    }

}
