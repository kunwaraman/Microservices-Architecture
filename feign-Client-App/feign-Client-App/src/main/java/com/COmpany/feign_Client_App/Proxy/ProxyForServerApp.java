package com.COmpany.feign_Client_App.Proxy;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "server-App" ,url = "http://localhost:8081")
public interface ProxyForServerApp {

    // now you an declare any no of functions
    @GetMapping(path = "/test1")
    public String callTest1();
    /*
    in this proxy you can develop any number of method declarations to give a call to different Api's from the same application
     */

}
