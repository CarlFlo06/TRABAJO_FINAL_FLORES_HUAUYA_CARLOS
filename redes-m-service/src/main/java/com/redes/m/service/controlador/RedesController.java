package com.redes.m.service.controlador;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redes.m.service.entidades.RedesSociales;
import com.redes.m.service.servicio.RedesService;

@RestController
//@RequestMapping
public class RedesController {
	@Autowired
	private RedesService redesService;
	
	@GetMapping("/listar")
	public List<RedesSociales>listar(){
		return redesService.getAll().stream().map(redesSociales->{
			return redesSociales;
		}).collect(Collectors.toList());
	}
	/*public ResponseEntity<List<RedesSociales>> listarRedesSociales(){
		List<RedesSociales> redesSociales = redesService.getAll();
		if(redesSociales.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(redesSociales);
	}*/
	
	
}
