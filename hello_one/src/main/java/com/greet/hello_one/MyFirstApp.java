package com.greet.hello_one;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import com.greet.hello_one.service.*;

@RestController
public class MyFirstApp {
    @RequestMapping("/contact")
    public String DisplayMessage() {
        return "Hii this is my first Spring boot app";
    }

    @RequestMapping("/values")
    public String DisplayValues() {
        int x = 100, y = 100;
        int z = x + y;
        System.out.println("Value of Z " + z);
        return "Addition is: "+Integer.toString(z);
    }

    @GetMapping("/product/{id}")
    public String getProducts(@PathVariable("id") int pid) {
        System.out.println("ID fetched is: "+pid );
        return "ID fetched is: "+Integer.toString(pid);
    }

    @GetMapping("/addition")
    public String addValues(@RequestParam int a, @RequestParam int b){
        int c = a+b;
        System.out.println("The value of a is: "+a);
        System.out.println("The value of b is: "+b);
        System.out.println("The Addition is: "+c);
        return "The Addition is: "+Integer.toString(c);
    }
    @GetMapping("/searchProd")
    public String searchProd(@RequestParam(name="query") String q, @RequestParam(name = "limit") String l){
        System.out.println("value of query: "+q);
        System.out.println("value of limit: "+l);
        return "Data is Fetched";
    }

    @GetMapping("/fact")
    public String getFactorial(@RequestParam int num) {
        int result;
        firstService fs = new firstService();
        result=fs.factorial(num);
        return "The factorial is: "+Integer.toString(result);
    }
    
    
}
