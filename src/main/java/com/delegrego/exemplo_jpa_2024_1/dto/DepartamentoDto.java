package com.delegrego.exemplo_jpa_2024_1.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class DepartamentoDto {

	private int idDepartamento;

	@NotBlank
	@Size(max = 50)
	private String nmDepartamento;

	public DepartamentoDto() {

	}

	public DepartamentoDto(int idDepartamento, String nmDepartamento) {
		super();
		this.idDepartamento = idDepartamento;
		this.nmDepartamento = nmDepartamento;
	}

	public int getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getNmDepartamento() {
		return nmDepartamento;
	}

	public void setNmDepartamento(String nmDepartamento) {
		this.nmDepartamento = nmDepartamento;
	}

	@Override
	public String toString() {
		return "DepartamentoDto [idDepartamento=" + idDepartamento + ", nmDepartamento=" + nmDepartamento + "]";
	}
	
	
	

}
