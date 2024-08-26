package com.pranay.simpleinterest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.pranay.simpleinterest.services.*;
@RestController
public class MainController {
    @GetMapping("/simpleinterest")
    public String DisplaySimpleInterest(@RequestParam int n,@RequestParam int p,@RequestParam int r){
        SimpleInterest si = new SimpleInterest();
        return "The total Amount is "+Integer.toString(si.FindSimpleInterest(n, p, r));
    }
}
