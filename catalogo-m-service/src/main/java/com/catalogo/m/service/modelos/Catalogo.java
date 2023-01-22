package com.catalogo.m.service.modelos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Catalogo {
	private PaquetesInternet paquetesInternet;
	private Recargas recargas;
	private RedesSociales redesSociales;
	
	public Catalogo() {
		super();
	}
	
	public Catalogo(RedesSociales rs) {
		super();
		this.redesSociales=rs;
	}
	
	public Catalogo(PaquetesInternet pi) {
		super();
		this.paquetesInternet=pi;
	}
	
}
