package com.pranay.htmlrendering;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ContactController {
    @GetMapping("/index")
    public String IndexDisplay() {
        return "contact/index";
    }

    @GetMapping("/contact")
    public String DisplayContactForm(Model m) {
        m.addAttribute("contact", new Contact());
        return "contact/contact";
    }

    @PostMapping("/contact")
    public String getDetails(@ModelAttribute Contact contact,Model m) {
        // System.out.println("In POST mapping handler method");
        System.out.println("Name is: "+contact.getName());
        System.out.println("Email is: "+contact.getEmail());
        System.out.println("Mobile is: "+contact.getMobile());
        m.addAttribute("contact", contact);
        return "contact/index";
    }

}
