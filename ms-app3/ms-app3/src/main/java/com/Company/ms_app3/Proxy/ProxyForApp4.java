package com.Company.ms_app3.Proxy;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "ms-app4",url = "http://localhost:9092")
public interface ProxyForApp4 {

    @GetMapping("/test1")
    public String callTest1();
}
