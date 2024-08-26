package com.wepost.wepost;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/Home")
    public String Hello(){
        return"Hello World";
    }
}
