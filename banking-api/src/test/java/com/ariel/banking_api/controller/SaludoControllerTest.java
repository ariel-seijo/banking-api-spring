package com.ariel.banking_api.controller;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class SaludoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void deberiaDevolverSaludo() throws Exception {
        mockMvc.perform(get("/api/saludo"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.mensaje").value("Hola, papus!"));
    }

}
