package com.gestion.personajesRM.Controlador;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.personajesRM.modelo.PersonajesRM;
import com.gestion.personajesRM.servicio.ProductoServicio;

@RestController
public class PersonajesControlador {

	@Autowired
	private ProductoServicio servicio;
	
	@GetMapping("/Personajes")
	public List<PersonajesRM> listarPersonaje(){
		return servicio.listarPersonajes();
			
	}
	
	@GetMapping("/Personajes/{id}")
	public PersonajesRM obtenerProductos(@PathVariable Integer id) {
	return servicio.obtenerPersonajePorId(id);

	}

	
}
