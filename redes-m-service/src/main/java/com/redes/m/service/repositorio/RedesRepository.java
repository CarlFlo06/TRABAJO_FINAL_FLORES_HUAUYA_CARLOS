package com.redes.m.service.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.redes.m.service.entidades.RedesSociales;
@Repository
public interface RedesRepository extends JpaRepository<RedesSociales, Long> {
	//List<RedesSociales> findByUsuarioId(Long usuarioId);
	public List<RedesSociales>findAll();
}
