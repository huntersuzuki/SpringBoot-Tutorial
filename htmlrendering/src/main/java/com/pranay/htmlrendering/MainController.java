package com.pranay.htmlrendering;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.*;

@Controller
public class MainController {
    int n = 15;

    @GetMapping("/home")
    public String home(Model m) {
        m.addAttribute("Name", "Pranay");
        // if (n > 200) {
        //     m.addAttribute("result", true);
        // } else {
        //     m.addAttribute("result", false);
        // }

        if (n%2==0) {
            m.addAttribute("res", true);
        }
        else{
            m.addAttribute("resfalse", true);
        }
        List<String> l = new ArrayList<String>();
        l.add("One");
        l.add("Two");
        l.add("Three");
        l.add("Four");
        m.addAttribute("list", l);
        return "index";
    }

    @GetMapping("/register")
    public String register() {
        return "userauth/register";
    }
    @GetMapping("/check")
    public String CheckNumber(@RequestParam int num,Model m) {
        if (num==0) {
            m.addAttribute("result", "Neither positive Nor negative");
        }
        else if(num>0){
            m.addAttribute("result", "Positive number");
        }
        else{
            m.addAttribute("result", "Negtive number");
        }

      
        System.out.println("number is "+num);
        return "checknumber";
    }

    
}