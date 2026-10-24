package com.ariel.banking_api.service;

import org.springframework.stereotype.Service;

@Service
public class SaludoService {
    private int contador = 0;
    public int incrementarYObtenerVContador(){
        contador++;
        return contador;
    };
    public String saludar() {
        return "Hola, papus!";
    }
}
