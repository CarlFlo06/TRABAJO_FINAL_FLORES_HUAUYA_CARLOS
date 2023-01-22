package com.paquetes.m.service.repositorio;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.paquetes.m.service.entidades.PaquetesInternet;

public interface PaquetesRepository extends MongoRepository<PaquetesInternet, Long> {
	//public List<PaquetesInternet>getAll();
}
