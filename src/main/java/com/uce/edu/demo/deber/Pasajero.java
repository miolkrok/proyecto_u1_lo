package com.uce.edu.demo.deber;

import org.springframework.stereotype.Component;

@Component
public class Pasajero {
	
	private String nombre;
	private String apellido;
	private String cedula;
	//SET Y GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	@Override
	public String toString() {
		return "Pasajero [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + "]";
	}
	

}
