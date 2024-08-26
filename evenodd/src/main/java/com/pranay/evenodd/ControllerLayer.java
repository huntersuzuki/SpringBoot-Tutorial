package com.pranay.evenodd;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.pranay.evenodd.services.*;

@RestController
public class ControllerLayer {
    @GetMapping("/evenodd/{num}")
    public String EvenOdd(@PathVariable("num") int num) {
        String res;
        EvenOdd eo = new EvenOdd();
        res = eo.EvenOrOdd(num);
        return num+" is " + res;
    }
}
