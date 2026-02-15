package com.Company.ms_app4;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MsApp4Application {

	public static void main(String[] args) {
		SpringApplication.run(MsApp4Application.class, args);
        System.out.println("this is not calling any app");
	}


    @Bean
    public Sampler defaultSampler(){
        return Sampler.ALWAYS_SAMPLE;
    }

}
