package com.uce.edu.demo.deber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InscripcionCarrera {
	
	private String categoria;
	
	//DI por metodos SET
	private Atleta atleta;//3)a su metodo SET le pongo @Autowired
	private Manager manager;//3)a su metodo SET le pongo @Autowired
	
	public String inscripcion(String categoria,String nombreAtleta, String apellidoAtleta,
			int edadAtleta,String ciudadAtleta,String nombreManager,int edadManager) {
		
		this.categoria = categoria;
		this.atleta.setNombre(nombreAtleta);
		this.atleta.setApellido(apellidoAtleta);
		this.atleta.setEdad(edadManager);
		this.atleta.setCiudad(ciudadAtleta);
		this.manager.setNombre(nombreManager);
		this.manager.setEdad(edadManager);
		
		return "Inscripcion realizada";
	}
	
	//set y get
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Atleta getAtleta() {
		return atleta;
	}
	@Autowired
	public void setAtleta(Atleta atleta) {
		this.atleta = atleta;
	}
	public Manager getManager() {
		return manager;
	}
	@Autowired
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	

}
