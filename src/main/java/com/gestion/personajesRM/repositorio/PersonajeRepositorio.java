package com.gestion.personajesRM.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.personajesRM.modelo.PersonajesRM;

public interface PersonajeRepositorio extends JpaRepository<PersonajesRM, Integer> {

}
