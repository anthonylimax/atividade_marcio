package com.example.atividade_marcio.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.atividade_marcio.models.Curriculo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RequestMapping("/curriculo")
@RestController
public class CurriculoController {
    @PostMapping()
    public String insert(@RequestBody Curriculo entity) {
        return "TESTE DE ADICIONAR ALGO";
    }
    @GetMapping()
    public String select(@RequestBody Curriculo entity) {
        return "TESTE DE PEGAR ALGO";
    }

    
}