package com.gestion.personajesRM.Controlador;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.personajesRM.modelo.PersonajesRM;
import com.gestion.personajesRM.repositorio.PersonajeRepositorio;
import com.gestion.personajesRM.servicio.PersonajeServicio;
import com.google.gson.Gson;

import org.springframework.web.client.RestTemplate;

@RestController
public class PersonajesControlador {

	@Autowired
	private PersonajeServicio servicio;
	
	@GetMapping("/Personajes")
	public List<PersonajesRM> listarPersonaje(){
		return servicio.listarPersonajes();
			
	}
	
	@GetMapping("/ObtenerPersonajes")
	public String obtenerPersonajes(){
		String uri = "https://rickandmortyapi.com/api/character";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		
		//Gson gson = new Gson();    
		//result = gson.toJson(result);
		
		return result;
	}
	
	@GetMapping("/Personajes/{id}")
	public PersonajesRM obtenerProductos(@PathVariable Integer id) {
		return servicio.obtenerPersonajePorId(id);
	}

	@PostMapping("/Personajes")
	public void guardarPersonajes(@RequestBody PersonajesRM personaje) {
		 servicio.guardarPersonajes(personaje);
	}
	
	@PutMapping("/Personajes/{id}")
	public ResponseEntity<?> actualizarPersonaje(@RequestBody PersonajesRM personaje,@PathVariable Integer id){
		try {
			PersonajesRM PersonajeExistente = servicio.obtenerPersonajePorId(id);
			PersonajeExistente.setName(personaje.getName());	
			PersonajeExistente.setStatus(personaje.getStatus());
			PersonajeExistente.setGender(personaje.getGender());
			PersonajeExistente.setImage(personaje.getImage());
			
			servicio.guardarPersonajes(PersonajeExistente);
			return new ResponseEntity<PersonajesRM> (HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<PersonajesRM>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	@DeleteMapping("/Personajes/{id}")
	public void eliminarProducto(@PathVariable Integer id) {
		servicio.eliminarPersonaje(id);
	}
	
	
}
