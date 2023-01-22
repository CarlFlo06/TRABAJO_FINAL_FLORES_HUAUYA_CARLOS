package com.paquetes.m.service.entidades;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document (collection="paquetes")
public class PaquetesInternet {
	@Id
	private Long id;
	private String paquete;
	
	public PaquetesInternet() {
		super();
	}
	
}
