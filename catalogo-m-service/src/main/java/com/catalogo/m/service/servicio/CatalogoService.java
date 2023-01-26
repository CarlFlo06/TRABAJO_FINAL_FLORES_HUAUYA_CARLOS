package com.catalogo.m.service.servicio;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.catalogo.m.service.feignclients.RedesSocialesFeignClient;
import com.catalogo.m.service.modelos.Catalogo;
import com.catalogo.m.service.modelos.PaquetesInternet;
import com.catalogo.m.service.modelos.RedesSociales;

//("serviceFeign")
@Service
public class CatalogoService {
	@Autowired
	private RestTemplate restTemplate;
	
	//@Autowired
	//private RedesSocialesFeignClient redesSocialesFeignClient;
	
	public List<RedesSociales>findRedesAll() {
		List<RedesSociales> rs=Arrays.asList(restTemplate.getForObject("http://redes-m-service/redes/listar",RedesSociales[].class));
		return rs; 
	}
	
	public List<PaquetesInternet>findPaquetesAll() {
		List<PaquetesInternet> pi=Arrays.asList(restTemplate.getForObject("http://paquetes-m-service/paquetes/listar",PaquetesInternet[].class));
		return pi;
	}
	
	/*public List<Catalogo> findAll() {
		List<Catalogo> catalogo;
		List<PaquetesInternet>paquetes=Arrays.asList(restTemplate.getForObject("http://producto-service/producto",PaquetesInternet[].class));
		List<RedesSociales> redes=Arrays.asList(restTemplate.getForObject("http://redes-m-service/redes/listar",RedesSociales[].class));
		return catalogo.stream().map(p->new Catalogo(paquetes,redes)).collect(Collectors.toList());
	}*/
	/*public List<Catalogo>findPaquetesAll() {
		List<PaquetesInternet> paquetesInternet=Arrays.asList(restTemplate.getForObject("http://paquetes-service/listar",PaquetesInternet[].class));
		return paquetesInternet.stream().map(pi->new Catalogo(pi)).collect(Collectors.toList());
	}*/
}
