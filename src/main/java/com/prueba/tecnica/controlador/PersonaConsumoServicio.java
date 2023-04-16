package com.prueba.tecnica.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.tecnica.datos.PersonaPersistencia;
import com.prueba.tecnica.entidades.Persona;
import com.prueba.tecnica.servicios.PersonaServicio;

@Service
public class PersonaConsumoServicio implements PersonaServicio {

	@Autowired
	private PersonaPersistencia persistencia;
	
	@Override
	public List<Persona> obtenerTodo() {
		return persistencia.findAll();
	}

	@Override
	public Persona buscarPorId(int id) {
		return persistencia.findById(id);
	}

	@Override
	public Persona agregar(Persona p) {
		return persistencia.save(p);
	}

	@Override
	public Persona editar(Persona p) {
		return persistencia.save(p);
	}
	
}
