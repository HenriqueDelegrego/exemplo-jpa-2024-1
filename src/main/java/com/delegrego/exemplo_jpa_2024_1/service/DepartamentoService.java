package com.delegrego.exemplo_jpa_2024_1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delegrego.exemplo_jpa_2024_1.dto.DepartamentoDto;
import com.delegrego.exemplo_jpa_2024_1.entity.DepartamentoEntity;
import com.delegrego.exemplo_jpa_2024_1.repo.DepartamentoRepository;

@Service
public class DepartamentoService {

	@Autowired
	private DepartamentoRepository departamentoRepository;

	// CRUD

	// Create
	public void cadastrarDepartamento(DepartamentoDto departamentoDto) {

		DepartamentoEntity departamentoEntity = new DepartamentoEntity();
		departamentoEntity.setIdDepartamento(departamentoDto.getIdDepartamento());
		departamentoEntity.setNmDepartamento(departamentoDto.getNmDepartamento());

		departamentoRepository.save(departamentoEntity);

	}

	// Read

	// Update

	// Delete

}
