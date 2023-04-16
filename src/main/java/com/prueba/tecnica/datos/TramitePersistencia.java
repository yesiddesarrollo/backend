package com.prueba.tecnica.datos;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.prueba.tecnica.entidades.Tramite;

public interface TramitePersistencia extends Repository<Tramite, Integer> {

	List<Tramite> findAll();
	
	Tramite findById(int id);
	
	Tramite save(Tramite p);
	
	void deleteById(Tramite p);
}
