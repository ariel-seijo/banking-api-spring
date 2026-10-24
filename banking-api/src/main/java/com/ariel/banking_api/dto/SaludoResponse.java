package com.ariel.banking_api.dto;

public class SaludoResponse {
    private String mensaje;

    public SaludoResponse(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
