package com.ariel.banking_api.controller;

import com.ariel.banking_api.dto.SaludoRequest;
import com.ariel.banking_api.dto.SaludoResponse;
import com.ariel.banking_api.service.SaludoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    private final SaludoService saludoService;

    public SaludoController(SaludoService saludoService) {
        this.saludoService = saludoService;
    }

    @GetMapping("/api/saludo")
    public SaludoResponse saludar(){
        return new SaludoResponse(saludoService.saludar());
    }

    @PostMapping("/api/saludo")
    public SaludoResponse saludarPersonalizado(@RequestBody SaludoRequest request) {
        String mensaje = saludoService.saludar(request.getNombre());
        return new SaludoResponse(mensaje);
    }

}