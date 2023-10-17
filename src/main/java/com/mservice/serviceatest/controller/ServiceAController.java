package com.mservice.serviceatest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceAController {

    @GetMapping("/data")
    public String getData() {
        return "Ceci est le service A";
    }
}
