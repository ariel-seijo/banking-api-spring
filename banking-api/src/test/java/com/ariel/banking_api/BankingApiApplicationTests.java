package com.ariel.banking_api;

import com.ariel.banking_api.service.BienvenidaService;
import com.ariel.banking_api.service.SaludoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class BankingApiApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private SaludoService saludoService;

	@Test
	void saludoServiceExisteEnElContexto(){
		assertNotNull(saludoService);
	}

	@Autowired
	private BienvenidaService bienvenidaService;

	@Test
	void bienvenidaServiceExisteEnElContexto() {
		assertNotNull(bienvenidaService);
	}

	@Test
	void bienvenidaServiceDarBienvenidaImprimeMensajeCorrecto() {
		assertEquals("Hola, papus! bienvenidos.", bienvenidaService.darBienvenida());
	}

}
