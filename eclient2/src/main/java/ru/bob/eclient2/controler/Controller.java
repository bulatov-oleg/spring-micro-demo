package ru.bob.eclient2.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/new")
public class Controller {
    @GetMapping("/name")
    public String test(){
        return "second client";
    }
}
