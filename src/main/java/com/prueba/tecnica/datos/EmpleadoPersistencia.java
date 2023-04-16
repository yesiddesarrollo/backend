package com.prueba.tecnica.datos;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.prueba.tecnica.entidades.Empleado;
import com.prueba.tecnica.entidades.Persona;

public interface EmpleadoPersistencia extends Repository<Empleado, Integer> {

	List<Empleado> findAll();
	
	Empleado findById(int id);
	
	Empleado save(Empleado p);
	
	void deleteById(Empleado p);
	
}
