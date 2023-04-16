package com.prueba.tecnica.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.prueba.tecnica.entidades.Tramite;
import com.prueba.tecnica.servicios.EmpleadoServicio;
import com.prueba.tecnica.servicios.TramitesServicio;

public class TramiteConsumo implements TramitesServicio {

	@Autowired
	TramitesServicio servicio;
	
	@Override
	public List<Tramite> obtenerTodo() {
		// TODO Auto-generated method stub
		return servicio.obtenerTodo();
	}

	@Override
	public Tramite agregar(Tramite p) {
		// TODO Auto-generated method stub
		return servicio.agregar(p);
	}

}
