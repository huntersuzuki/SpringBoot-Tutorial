package com.pranay.posneg;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.pranay.posneg.services.*;

@RestController
public class PosNegController {
    @GetMapping("/posneg/{num}")

    public String PosNeg(@PathVariable("num") int num) {
        String res;
        PosNeg pn = new PosNeg();
        res = pn.PosOrNeg(num);
        return num+" is "+res;
    }
}
