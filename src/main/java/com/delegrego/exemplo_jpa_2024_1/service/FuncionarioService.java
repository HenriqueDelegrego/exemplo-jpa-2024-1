package com.delegrego.exemplo_jpa_2024_1.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delegrego.exemplo_jpa_2024_1.dto.FuncionarioDto;
import com.delegrego.exemplo_jpa_2024_1.entity.DepartamentoEntity;
import com.delegrego.exemplo_jpa_2024_1.entity.FuncionarioEntity;
import com.delegrego.exemplo_jpa_2024_1.repo.DepartamentoRepository;
import com.delegrego.exemplo_jpa_2024_1.repo.FuncionarioRepository;

@Service
public class FuncionarioService {

	@Autowired
	private FuncionarioRepository funcionarioRepository;

	@Autowired
	private DepartamentoRepository departamentoRepository;

	// Create
	public void cadastrarFuncionario(FuncionarioDto funcionarioDto) {

		Optional<DepartamentoEntity> departamentoEntity = departamentoRepository
				.findById(funcionarioDto.getIdDepartamento());

		FuncionarioEntity funcionarioEntity = new FuncionarioEntity();
		funcionarioEntity.setNome(funcionarioDto.getNome());
		funcionarioEntity.setEmail(funcionarioDto.getEmail());
		funcionarioEntity.setSenha(funcionarioDto.getSenha());
		funcionarioEntity.setSalario(funcionarioDto.getSalario());
		funcionarioEntity.setDepartamento(departamentoEntity.get());

		funcionarioRepository.save(funcionarioEntity);

	}

	// Read

	// Update

	// Delete

}
