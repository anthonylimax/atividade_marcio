package com.example.atividade_marcio.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ConvertController {

    @GetMapping("/celsiusParaFahrenheit")
    public float celsiusToFahrenheit(@RequestParam float grau) {
        return (grau * 9)/5 + 32;
    }
    
    @GetMapping("/fahrenheitParacelsius")
    public float fahrenheitToCelsius(@RequestParam float grau) {
        return (grau - 32) * 5/9;
    }
    
    

}
