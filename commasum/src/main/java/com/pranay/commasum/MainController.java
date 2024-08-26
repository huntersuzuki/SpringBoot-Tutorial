package com.pranay.commasum;

import org.springframework.web.bind.annotation.RestController;

import com.pranay.commasum.services.CommaSum;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MainController {
    @GetMapping("/sum")
    public String DisplaySum(@RequestParam String numbers) {
        CommaSum cs = new CommaSum();
        return "The sum is"+cs.CalculateSum(numbers);
    }
    
}
