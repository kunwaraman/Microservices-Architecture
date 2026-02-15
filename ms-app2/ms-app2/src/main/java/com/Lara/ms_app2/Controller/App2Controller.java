package com.Lara.ms_app2.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App2Controller {

    @RequestMapping("app2Service")
    public String app2Service(){
        System.out.println("App2 Controller - service");
        return "sucess from app2 - service";
    }

}
