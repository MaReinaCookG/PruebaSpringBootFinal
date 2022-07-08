package com.gestion.personajesRM.servicio;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.personajesRM.modelo.PersonajesRM;
import com.gestion.personajesRM.repositorio.PersonajeRepositorio;

@Service

public class PersonajeServicio {

	@Autowired
	private PersonajeRepositorio repositorio;
	
	public List<PersonajesRM> listarPersonajes(){
		return repositorio.findAll();
		
	}
	
	public void guardarPersonajes(PersonajesRM personajes) {
		repositorio.save(personajes);
		
	}
	
	public PersonajesRM obtenerPersonajePorId(Integer id) {
		return repositorio.findById(id).get();
	}
	
	public void eliminarPersonaje(Integer id) {
		repositorio.deleteById(id);
	}
}
