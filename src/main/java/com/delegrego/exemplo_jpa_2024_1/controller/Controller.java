package com.delegrego.exemplo_jpa_2024_1.controller;

import java.net.FileNameMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.delegrego.exemplo_jpa_2024_1.dto.DepartamentoDto;
import com.delegrego.exemplo_jpa_2024_1.dto.FuncionarioDto;
import com.delegrego.exemplo_jpa_2024_1.service.DepartamentoService;
import com.delegrego.exemplo_jpa_2024_1.service.FuncionarioService;

@Component
public class Controller implements CommandLineRunner {

	@Autowired
	private DepartamentoService departamentoService;

	@Autowired
	private FuncionarioService funcionarioService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		FuncionarioDto funcionario = new FuncionarioDto();
		funcionario.setIdFuncionario(3);
		funcionario.setNome("João");
		funcionario.setEmail("henrique@email.com");
		funcionario.setSenha("senha");
		funcionario.setSalario(5000);
		funcionario.setIdDepartamento(1);
		
		funcionarioService.atualizarFuncionario(funcionario);
		
		

	}

}
