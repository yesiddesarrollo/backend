package com.prueba.tecnica.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.prueba.tecnica.datos.EmpleadoPersistencia;
import com.prueba.tecnica.entidades.Empleado;
import com.prueba.tecnica.servicios.EmpleadoServicio;

public class EmpleadoConsumoServicio implements EmpleadoServicio {

	@Autowired
	private EmpleadoPersistencia persistencia;
	
	@Override
	public List<Empleado> obtenerTodo() {
		return persistencia.findAll();
	}

	@Override
	public Empleado buscarPorId(int id) {
		return persistencia.findById(id);
	}

	@Override
	public Empleado agregar(Empleado p) {
		return persistencia.save(p);
	}

	@Override
	public Empleado editar(Empleado p) {
		return persistencia.save(p);
	}

}
