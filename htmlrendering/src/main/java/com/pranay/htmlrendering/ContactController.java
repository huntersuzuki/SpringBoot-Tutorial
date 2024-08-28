package com.pranay.htmlrendering;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.pranay.htmlrendering.*;
@Controller
public class ContactController {
    @GetMapping("/index")
    public String IndexDisplay(){
        return "contact/index";
    }

    @GetMapping("/contact")
    public String DisplayContactForm(Model m) {
        m.addAttribute("contact", new Contact());
        return "contact/contact";
    }
    
}
