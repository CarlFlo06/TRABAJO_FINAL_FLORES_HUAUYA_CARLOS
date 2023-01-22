package com.catalogo.m.service.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.catalogo.m.service.modelos.Catalogo;
import com.catalogo.m.service.modelos.PaquetesInternet;
import com.catalogo.m.service.modelos.RedesSociales;
import com.catalogo.m.service.servicio.CatalogoService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/catalogo")
public class CatalogoController {
	@Autowired
	//@Qualifier("serviceFeign")
	private CatalogoService catalogoService;
	
	@CircuitBreaker(name = "paquetesCB", fallbackMethod = "fallBackGetPaquetes")
	@GetMapping("/listar/paquetes")
	public ResponseEntity<List<PaquetesInternet>> listarPaquetes(){
		List<PaquetesInternet> paquetes = catalogoService.findPaquetesAll();
		return ResponseEntity.ok(paquetes);
	}
	
	@CircuitBreaker(name = "redesCB", fallbackMethod = "fallBackGetRedes")
	@GetMapping("/listar/redes")
	public ResponseEntity<List<RedesSociales>> listarRedes(){
		List<RedesSociales> redes = catalogoService.findRedesAll();
		return ResponseEntity.ok(redes);
	}
	
	private ResponseEntity<List<PaquetesInternet>> fallBackGetPaquetes(RuntimeException excepcion) {
		return new ResponseEntity("OOPS! Parece que hay un problema con los paquetes de internet, ya estamos trabajando para solucionarlo", HttpStatus.OK);
	}
	
	private ResponseEntity<List<RedesSociales>> fallBackGetRedes(RuntimeException excepcion) {
		return new ResponseEntity("OOPS! Parece que hay un problema con las redes sociales, ya estamos trabajando para solucionarlo", HttpStatus.OK);
	}
	/*@GetMapping("/listar/paquetes")
	public List<Catalogo>listarPaquetes(){
		return catalogoService.findPaquetesAll();
	}*/
}
