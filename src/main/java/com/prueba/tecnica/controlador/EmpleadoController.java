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

import com.prueba.tecnica.entidades.Empleado;
import com.prueba.tecnica.servicios.EmpleadoServicio;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/empleado"})
public class EmpleadoController {

	@Autowired
	EmpleadoServicio servicio;
	
	@GetMapping
	public List<Empleado>listar(){
		return servicio.obtenerTodo();
	}
	
	@PostMapping
	public Empleado agregar(@RequestBody Empleado p) {
		return servicio.agregar(p);
	}
	
	@GetMapping(path = {"/{id}"})
	public Empleado listarId(@PathVariable("id")int id) {
		return servicio.buscarPorId(id);
	}
	
	@PutMapping(path = {"/{id}"})
	public Empleado editar (@RequestBody Empleado p, @PathVariable("id")int id) {	
		p.setId(id);
		return servicio.editar(p);
	}
}
