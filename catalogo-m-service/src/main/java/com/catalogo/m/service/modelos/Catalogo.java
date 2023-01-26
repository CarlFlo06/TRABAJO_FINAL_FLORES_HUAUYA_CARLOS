package com.catalogo.m.service.modelos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Catalogo {
	private PaquetesInternet paquetesInternet;
	//private Recargas recargas;
	private RedesSociales redesSociales;
	
	public Catalogo() {
		super();
	}

	public Catalogo(PaquetesInternet paquetesInternet, RedesSociales redesSociales) {
		super();
		this.paquetesInternet = paquetesInternet;
		//this.recargas = recargas;
		this.redesSociales = redesSociales;
	}
	
}
