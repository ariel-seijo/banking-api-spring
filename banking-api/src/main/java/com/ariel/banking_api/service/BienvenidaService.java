package com.ariel.banking_api.service;

import org.springframework.stereotype.Service;

@Service
public class BienvenidaService {
    private final SaludoService saludoService;

    public BienvenidaService(SaludoService saludoService) {
        this.saludoService = saludoService;
    }

    public String darBienvenida() {
        return saludoService.saludar() + " bienvenidos.";
    }

    public int incrementarContador() {
        return saludoService.incrementarYObtenerVContador();
    }
}
