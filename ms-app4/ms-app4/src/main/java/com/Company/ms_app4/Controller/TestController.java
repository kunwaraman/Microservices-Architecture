package com.Company.ms_app4.Controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("test1")
    public String test1(){
        Logger logger = LoggerFactory.getLogger(getClass());
        logger.info("{}","logger message from app4.test1");

        System.out.println("from app4.test1");
        return "from app4 -test1";
    }

}
