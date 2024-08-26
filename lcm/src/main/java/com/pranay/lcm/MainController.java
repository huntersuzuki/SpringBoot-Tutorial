package com.pranay.lcm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.pranay.lcm.services.*;
@RestController
public class MainController {
    @GetMapping("/lcm")
    public String DisplayLcm(@RequestParam int num1,@RequestParam int num2){
        Lcm l = new Lcm();
        return "The LCM is "+Integer.toString(l.FindLcm(num1, num2));
    }
}
