package com.lagou.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller

public class HelloController {
@GetMapping("/hello/{name}")
    public String hello(@PathVariable String name, Model model){
    model.addAttribute("name",name);
    System.out.println("hello");
    return "hello";
}
}
