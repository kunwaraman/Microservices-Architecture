package com.COmpany.feign_Client_App.Controller;


import com.COmpany.feign_Client_App.Proxy.ProxyForServerApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private ProxyForServerApp proxyForServerApp;

    @GetMapping(path = "/hello1")  // we are developing client application as of now it is not calling to the server
    public String hello1(){
        System.out.println(" from hello1");
        String res= proxyForServerApp.callTest1();
        return " from Hello 1 =====>" + res;
    }
    /*
     through proxy we are making a call to another microservices through call test1()
     */
}
