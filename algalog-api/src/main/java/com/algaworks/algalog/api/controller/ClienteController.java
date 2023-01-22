package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping(value = "/clientes")
	public List<Cliente> listar() {
		
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Pedro Lucas");
		cliente1.setEmail("pedro@gmail.com");
		cliente1.setTelefone("83 9 99645517");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Pietra");
		cliente2.setEmail("piedra@gmail.com");
		cliente2.setTelefone("83 8 45645517");


		return Arrays.asList(cliente1, cliente2);
	}

}
