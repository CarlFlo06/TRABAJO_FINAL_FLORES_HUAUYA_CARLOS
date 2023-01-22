package com.paquetes.m.service.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paquetes.m.service.entidades.PaquetesInternet;
import com.paquetes.m.service.repositorio.PaquetesRepository;

@Service
public class PaquetesService {
	@Autowired
	PaquetesRepository paquetesRepository;
	
	public List<PaquetesInternet> getAll(){
		return (List<PaquetesInternet>)paquetesRepository.findAll();
	}
	
	public PaquetesInternet getPaquetesById(Long id){
		return paquetesRepository.findById(id).orElse(null);
	}
	
	public PaquetesInternet save(PaquetesInternet paquetesInternet) {
		PaquetesInternet nuevoPaqueteInternet = paquetesRepository.save(paquetesInternet);
		return nuevoPaqueteInternet;
	}
}
