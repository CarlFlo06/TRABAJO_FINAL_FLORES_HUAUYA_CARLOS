package com.redes.m.service.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redes.m.service.entidades.RedesSociales;
import com.redes.m.service.repositorio.RedesRepository;

@Service
public class RedesService {
	@Autowired
	private RedesRepository redesRepository;
	
	public List<RedesSociales> getAll(){
		return (List<RedesSociales>)redesRepository.findAll();
	}
	
	public RedesSociales getRedesById(Long id){
		return redesRepository.findById(id).orElse(null);
	}
	
	public RedesSociales save(RedesSociales redesSociales) {
		RedesSociales nuevaRedSocial = redesRepository.save(redesSociales);
		return nuevaRedSocial;
	}
	
	/*public List<RedesSociales> byUsuarioId(Long usuarioId){
		return redesRepository.findByCatalogoId(usuarioId);
	}*/
}
