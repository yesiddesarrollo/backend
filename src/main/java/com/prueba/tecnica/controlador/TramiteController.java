package com.prueba.tecnica.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.tecnica.entidades.Persona;
import com.prueba.tecnica.entidades.Tramite;
import com.prueba.tecnica.servicios.PersonaServicio;
import com.prueba.tecnica.servicios.TramitesServicio;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/tramites"})
public class TramiteController {

	@Autowired
	TramitesServicio servicio;
	
	@GetMapping
	public List<Tramite>listar(){
		
		return servicio.obtenerTodo();
	}
	
	@PostMapping
	public Tramite agregar(@RequestBody Tramite p) {
		
		return servicio.agregar(p);
	}
	
}
