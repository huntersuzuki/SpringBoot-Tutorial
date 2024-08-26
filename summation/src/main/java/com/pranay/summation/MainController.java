package com.pranay.summation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.pranay.summation.services.*;
@RestController
public class MainController {
    @GetMapping("/summation")
    public String DoSummationOfDigits(@RequestParam int num){
        Summation sm = new Summation();
        return "The Summation is " +Integer.toString(sm.SummationOfDigits(num));
    }
}
