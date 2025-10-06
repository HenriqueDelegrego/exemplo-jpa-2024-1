package com.delegrego.exemplo_jpa_2024_1.entity;

public class DepartamentoEntity {

	private int idDepartamento;

	private String nmDepartamento;

	public DepartamentoEntity() {

	}

	public DepartamentoEntity(int idDepartamento, String nmDepartamento) {
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

}
