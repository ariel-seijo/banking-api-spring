package com.ariel.banking_api.service;

import org.springframework.stereotype.Service;

@Service
public class SaludoService {
    public String saludar() {
        return "Hola, papus!";
    }
}
