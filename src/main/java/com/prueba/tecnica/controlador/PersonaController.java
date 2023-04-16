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
import com.prueba.tecnica.servicios.PersonaServicio;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/persona"})
public class PersonaController {

	@Autowired
	PersonaServicio servicioPersona;
	
	@GetMapping
	public List<Persona>listar(){

		return servicioPersona.obtenerTodo();
	}
	
	@PostMapping
	public Persona agregar(@RequestBody Persona p) {
		
		return servicioPersona.agregar(p);
	}
	
	@GetMapping(path = {"/{id}"})
	public Persona listarId(@PathVariable("id")int id) {
		
		return servicioPersona.buscarPorId(id);
	}
	
	@PutMapping(path = {"/{id}"})
	public Persona editar (@RequestBody Persona p, @PathVariable("id")int id) {	
		
		p.setId(id);
		return servicioPersona.editar(p);
	}
	
}
