package com.catalogo.m.service.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.catalogo.m.service.modelos.RedesSociales;

@FeignClient(name="redes-m-service")
@RequestMapping("/redes")
public interface RedesSocialesFeignClient {
	@PostMapping
	public RedesSociales save(@RequestBody RedesSociales redesSociales);
}
