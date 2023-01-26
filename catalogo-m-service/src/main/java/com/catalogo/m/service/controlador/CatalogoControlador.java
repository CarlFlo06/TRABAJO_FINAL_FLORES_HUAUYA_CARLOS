package com.catalogo.m.service.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.catalogo.m.service.modelos.PaquetesInternet;
import com.catalogo.m.service.modelos.RedesSociales;
import com.catalogo.m.service.servicio.CatalogoService;

@Controller
@RequestMapping("/catalogo")
public class CatalogoControlador {
	@Autowired
	private CatalogoService catalogoService;
	
	@GetMapping("/inicio")
	private String inicio() {
		return "inicio";
	}	
	
	@GetMapping("/productos")
	private String listar() {
		return "productos";
	}
	
	@GetMapping("/listarredes")
	private String listarReds() {
		return "redes";
	}
	@GetMapping("/listarpaquetes")
	private String listarPaquetes(Model model) {
		List<PaquetesInternet> tpaquetes = new ArrayList<PaquetesInternet>(); 
		tpaquetes=catalogoService.findPaquetesAll();
		model.addAttribute("tpaquetes",tpaquetes);
		return "paquetes";
	}
	/*@GetMapping("/listarpaquetes")
	private String listarPaquetes(Model model) {
		List<PaquetesInternet> paquetes = new ArrayList<PaquetesInternet>(); 
		paquetes=catalogoService.findPaquetesAll();
		model.addAttribute("tpaquetes",paquetes);
		return "paquetes";
	}*/
	@GetMapping("/redes1")
	private String redes1(Model model) {
		List<RedesSociales> redes = new ArrayList<RedesSociales>(); 
		redes=catalogoService.findRedesAll();
		model.addAttribute("redes",redes);
		return "redes1";
	}
	
	@GetMapping("/redes2")
	private String redes2(Model model) {
		List<RedesSociales> redes = new ArrayList<RedesSociales>(); 
		redes=catalogoService.findRedesAll();
		model.addAttribute("redes",redes);
		return "redes2";
	}
	
	@GetMapping("/redes3")
	private String redes3(Model model) {
		List<RedesSociales> redes = new ArrayList<RedesSociales>(); 
		redes=catalogoService.findRedesAll();
		model.addAttribute("redes",redes);
		return "redes3";
	}
	
}
