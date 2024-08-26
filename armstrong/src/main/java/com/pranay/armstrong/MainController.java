package com.pranay.armstrong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.pranay.armstrong.services.*;

@RestController
public class MainController {
    @GetMapping("/armstrong/{num}")
    public String ArmstrongController(@PathVariable("num") int num) {
        Armstrong as = new Armstrong();
        return as.CheckArmstrong(num);
    }
}
