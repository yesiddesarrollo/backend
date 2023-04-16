package com.prueba.tecnica.servicios;

import java.util.List;

import com.prueba.tecnica.entidades.Empleado;

public interface EmpleadoServicio {

	List<Empleado> obtenerTodo();
	
	Empleado buscarPorId(int id);
	
	Empleado agregar(Empleado p);
	
	Empleado editar(Empleado p);
	
}
