package com.prueba.tecnica.servicios;

import java.util.List;

import com.prueba.tecnica.entidades.Persona;

public interface PersonaServicio {

	List<Persona> obtenerTodo();
	
	Persona buscarPorId(int id);
	
	Persona agregar(Persona p);
	
	Persona editar(Persona p);
	
}
