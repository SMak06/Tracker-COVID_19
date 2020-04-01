package io.Sahil.TrackerCOVID_19.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/") //for returning the home template [uses thymeleaf dependency]
    public String home() {
        return "home";
    }
}
