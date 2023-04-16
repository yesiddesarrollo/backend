package com.prueba.tecnica.servicios;

import java.util.List;

import com.prueba.tecnica.entidades.Tramite;

public interface TramitesServicio {

	List<Tramite> obtenerTodo();
	
	Tramite agregar(Tramite p);
}
