package com.delegrego.exemplo_jpa_2024_1.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delegrego.exemplo_jpa_2024_1.entity.FuncionarioEntity;

public interface FuncionarioRepository extends JpaRepository<FuncionarioEntity, Integer> {

	Optional<FuncionarioEntity> findByEmail(String email);
	
	boolean existsByEmailAndIdFuncionarioNot(String email, int id);

}
