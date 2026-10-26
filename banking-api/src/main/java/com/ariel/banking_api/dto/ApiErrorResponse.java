package com.ariel.banking_api.dto;

public class ApiErrorResponse {
    private String mensaje;

    public ApiErrorResponse(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
