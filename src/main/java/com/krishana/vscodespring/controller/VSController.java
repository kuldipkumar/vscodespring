package com.krishana.vscodespring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VSController {


    @RequestMapping("/")
    public String entry(){
        return "This SpringBoot is running on VSCode";
    }
    
}
