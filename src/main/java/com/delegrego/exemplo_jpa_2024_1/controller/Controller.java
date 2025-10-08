package com.delegrego.exemplo_jpa_2024_1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.delegrego.exemplo_jpa_2024_1.dto.DepartamentoDto;
import com.delegrego.exemplo_jpa_2024_1.service.DepartamentoService;

@Component
public class Controller implements CommandLineRunner {

	@Autowired
	private DepartamentoService departamentoService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	
		System.out.println(departamentoService.listarDepartamentos());
		

	}

}
