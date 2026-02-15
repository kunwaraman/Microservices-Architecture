package com.Company.ms_app3.Controller;


import com.Company.ms_app3.Proxy.ProxyForApp4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private ProxyForApp4 proxyForApp4;
    @GetMapping("hello1")
    public String hello1(){
        Logger logger = LoggerFactory.getLogger(getClass());
        logger.info("{}","logger message from app3.hello1");

        String app4res=proxyForApp4.callTest1();

        System.out.println("from app3 hello1");
        return "from app3- hello1" + app4res;
    }
}
