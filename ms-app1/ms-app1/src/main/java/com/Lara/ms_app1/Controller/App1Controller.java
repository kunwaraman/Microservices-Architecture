package com.Lara.ms_app1.Controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class App1Controller {
    @RequestMapping("app1Service")
    public String app1Service(){
        System.out.println("App1Controller - service");


        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://localhost:9091/app2Service",
                String.class);

        String response = responseEntity.getBody();
        return "sucess from app 1 - service ===>" + response;

    }

}
