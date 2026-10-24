package com.ariel.banking_api.controller;

import com.ariel.banking_api.service.SaludoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    private final SaludoService saludoService;

    public SaludoController(SaludoService saludoService) {
        this.saludoService = saludoService;
    }

    @GetMapping("/api/saludo")
    public String saludar(){
        return saludoService.saludar();
    }
}