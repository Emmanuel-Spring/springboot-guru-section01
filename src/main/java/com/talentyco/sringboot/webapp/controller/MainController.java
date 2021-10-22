package com.talentyco.sringboot.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String goHome(Model modelo) {
        modelo.addAttribute("titulo", "Bienvenidos a Spring boot");

        return "index";
    }
    
}
