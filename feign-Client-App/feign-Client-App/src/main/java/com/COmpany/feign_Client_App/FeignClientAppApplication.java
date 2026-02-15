package com.COmpany.feign_Client_App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.COmpany.feign_Client_App")
public class FeignClientAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(FeignClientAppApplication.class, args);
        System.out.println("this is the feign client app");
	}

}
