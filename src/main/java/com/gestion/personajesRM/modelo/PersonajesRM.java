package com.gestion.personajesRM.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="personajesrm")
public class PersonajesRM {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String status;
	private String gender;
	private String image;

	public PersonajesRM(Integer id, String name, String status, String gender, String image) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.gender = gender;
		this.image = image;
	}

	public PersonajesRM( String name, String status, String gender, String image) {
		super();
		
		this.name = name;
		this.status = status;
		this.gender = gender;
		this.image = image;
	}
	
	public PersonajesRM() {
		super();
	
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	
	}
    
	
	
