package com.prueba.tecnica.datos;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.prueba.tecnica.entidades.Persona;

public interface PersonaPersistencia extends Repository<Persona, Integer> {

	List<Persona> findAll();
	
	Persona findById(int id);
	
	Persona save(Persona p);
	
	void deleteById(Persona p);
	
}
