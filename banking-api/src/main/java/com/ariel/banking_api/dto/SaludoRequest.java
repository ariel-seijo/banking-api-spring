package com.ariel.banking_api.dto;

import jakarta.validation.constraints.NotBlank;

public class SaludoRequest {

    @NotBlank
    private String nombre;

    public SaludoRequest() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
