package com.paquetes.m.service.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paquetes.m.service.entidades.PaquetesInternet;
import com.paquetes.m.service.repositorio.PaquetesRepository;

@RestController
@RequestMapping("/paquetes")
public class PaquetesController {
	//@Autowired
	//private PaquetesService paquetesService;
	@Autowired
	PaquetesRepository paquetesRepository;
	
	
	/*public List<PaquetesInternet>listar(){
		/*return paquetesRepository.getAll().stream().map(paquetesInternet->{
			return paquetesInternet;
		}).collect(Collectors.toList());
		return (List<PaquetesInternet>)paquetesRepository.findAll();
	}*/
	@PostMapping("/guardar")
	public ResponseEntity<?>guardarPaquete(@RequestBody PaquetesInternet paquetesInternet){
		try {
			PaquetesInternet paquetessave=paquetesRepository.save(paquetesInternet);
			return new ResponseEntity<PaquetesInternet>(paquetessave,HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getCause().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/listar")
	public ResponseEntity<?>listarPaquetes(){
		try {
			List<PaquetesInternet>paquetesInternet=paquetesRepository.findAll();
			return new ResponseEntity<List<PaquetesInternet>>(paquetesInternet,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getCause().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/actualizar")
	public ResponseEntity<?>actualizarPaquete(@RequestBody PaquetesInternet paquetesInternet){
		try {
			PaquetesInternet paquetesupdate=paquetesRepository.save(paquetesInternet);
			return new ResponseEntity<PaquetesInternet>(paquetesupdate,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getCause().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<?>borrarPaquete(@PathVariable("id") Long id){
		try {
			paquetesRepository.deleteById(id);
			return new ResponseEntity<String>("Registro eliminado",HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getCause().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
