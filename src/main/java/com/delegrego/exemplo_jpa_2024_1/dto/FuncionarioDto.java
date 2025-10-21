package com.delegrego.exemplo_jpa_2024_1.dto;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FuncionarioDto {

	private int idFuncionario;

	@NotBlank
	@Size(max = 100)
	private String nome;

	@NotBlank
	@Size(max = 50)
	@Email
	private String email;

	@NotBlank
	@Size(max = 50)
	private String senha;

	@Digits(integer = 10, fraction = 2)
	@PositiveOrZero
	private double salario;

	private int idDepartamento;

}
