package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import com.prueba.tecnica.datos.PersonaPersistencia;
import com.prueba.tecnica.entidades.Persona;

@SpringBootTest
class BackendPruebaTecnicaApplicationTests {

	@Autowired
	private PersonaPersistencia repo;
	
	@Test
	void contextLoads() {
		
		Persona p = new Persona();
		
		p.setApellidos("carranza");
		p.setNombres("yesid");
		p.setCorreo("algo@algo.com");
		p.setDireccion("carrera 5b");
		p.setIdTipoIdentificacion(1);
		p.setNumeroIdentificacion("1234567890");
		p.setTelefono("3220147850");
		
		repo.save(p);
		
	}

}

