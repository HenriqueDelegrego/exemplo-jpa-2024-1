package com.delegrego.exemplo_jpa_2024_1.service;

import java.util.ArrayList;
import java.util.List;

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
	public List<DepartamentoDto> listarDepartamentos() {

		List<DepartamentoEntity> listaDepartamentoEntity = departamentoRepository.findAll();

		List<DepartamentoDto> listaDepartamentoDto = new ArrayList<DepartamentoDto>();

		for (DepartamentoEntity d : listaDepartamentoEntity) {
			DepartamentoDto departamentoDto = new DepartamentoDto();
			departamentoDto.setIdDepartamento(d.getIdDepartamento());
			departamentoDto.setNmDepartamento(d.getNmDepartamento());

			listaDepartamentoDto.add(departamentoDto);
		}

		return listaDepartamentoDto;

	}

	// Update

	public void atualizarDepartamento(DepartamentoDto departamentoDto) {

		DepartamentoEntity departamentoEntity = new DepartamentoEntity();
		departamentoEntity.setIdDepartamento(departamentoDto.getIdDepartamento());
		departamentoEntity.setNmDepartamento(departamentoDto.getNmDepartamento());

		departamentoRepository.save(departamentoEntity);

	}

	// Delete

	public void deletarDepartamento(int id) {
		departamentoRepository.deleteById(id);
	}

}
