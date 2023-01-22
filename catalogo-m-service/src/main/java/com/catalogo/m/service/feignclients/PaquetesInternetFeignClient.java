package com.catalogo.m.service.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.catalogo.m.service.modelos.PaquetesInternet;

@FeignClient(name="paquetes-service")
public interface PaquetesInternetFeignClient {
	@PostMapping
	public PaquetesInternet save(@RequestBody PaquetesInternet paquetesInternet);
}
