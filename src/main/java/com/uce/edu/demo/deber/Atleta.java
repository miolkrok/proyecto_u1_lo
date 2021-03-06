package com.uce.edu.demo.deber;

import org.springframework.stereotype.Component;

@Component
public class Atleta {
	
	private String nombre;
	private String apellido;
	private int edad;
	private String ciudad;
	
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	@Override
	public String toString() {
		return "Atleta [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", ciudad=" + ciudad + "]";
	}
	
	

}
