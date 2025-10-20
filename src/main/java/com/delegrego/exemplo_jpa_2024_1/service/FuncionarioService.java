package com.delegrego.exemplo_jpa_2024_1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.delegrego.exemplo_jpa_2024_1.dto.FuncionarioDto;
import com.delegrego.exemplo_jpa_2024_1.entity.DepartamentoEntity;
import com.delegrego.exemplo_jpa_2024_1.entity.FuncionarioEntity;
import com.delegrego.exemplo_jpa_2024_1.repo.DepartamentoRepository;
import com.delegrego.exemplo_jpa_2024_1.repo.FuncionarioRepository;

import jakarta.validation.Valid;

@Service
@Validated
public class FuncionarioService {

	@Autowired
	private FuncionarioRepository funcionarioRepository;

	@Autowired
	private DepartamentoRepository departamentoRepository;

	// Create
	public void cadastrarFuncionario(@Valid FuncionarioDto funcionarioDto) {

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
	public List<FuncionarioDto> listarFuncionarios() {
		List<FuncionarioEntity> listaFuncionarioEntity = funcionarioRepository.findAll();

		List<FuncionarioDto> listaFuncionarioDto = new ArrayList<FuncionarioDto>();

		for (FuncionarioEntity f : listaFuncionarioEntity) {
			FuncionarioDto funcionarioDto = new FuncionarioDto();
			funcionarioDto.setIdFuncionario(f.getIdFuncionario());
			funcionarioDto.setNome(f.getNome());
			funcionarioDto.setEmail(f.getEmail());
			funcionarioDto.setSenha(f.getSenha());
			funcionarioDto.setSalario(f.getSalario());
			funcionarioDto.setIdDepartamento(f.getDepartamento().getIdDepartamento());

			listaFuncionarioDto.add(funcionarioDto);

		}

		return listaFuncionarioDto;
	}

	// Update
	public void atualizarFuncionario(@Valid FuncionarioDto funcionarioDto) {

		Optional<DepartamentoEntity> departamentoEntity = departamentoRepository
				.findById(funcionarioDto.getIdDepartamento());

		FuncionarioEntity funcionarioEntity = new FuncionarioEntity();
		funcionarioEntity.setIdFuncionario(funcionarioDto.getIdFuncionario());
		funcionarioEntity.setNome(funcionarioDto.getNome());
		funcionarioEntity.setEmail(funcionarioDto.getEmail());
		funcionarioEntity.setSenha(funcionarioDto.getSenha());
		funcionarioEntity.setSalario(funcionarioDto.getSalario());
		funcionarioEntity.setDepartamento(departamentoEntity.get());

		funcionarioRepository.save(funcionarioEntity);

	}

	// Delete

	public void deletarFuncionario(int id) {
		funcionarioRepository.deleteById(id);
	}

}
