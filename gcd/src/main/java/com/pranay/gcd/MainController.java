package com.pranay.gcd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.pranay.gcd.services.*;

@RestController
public class MainController {
    @GetMapping("/gcd")
    public String gcd(@RequestParam int a, @RequestParam int b) {
        int res;
        GCD gcd = new GCD();
        res = gcd.greatestCommonFactor(a,b);
        return "The GCD is "+Integer.toString(res);
    }
}
