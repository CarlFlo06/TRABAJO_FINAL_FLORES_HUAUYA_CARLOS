package com.catalogo.m.service.modelos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RedesSociales {
	private Long id;
	private String nombre;
	private String detalle;
	private double precio;
	
	public RedesSociales() {
		super();
	}
	
}
