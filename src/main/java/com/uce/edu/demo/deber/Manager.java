package com.uce.edu.demo.deber;

import org.springframework.stereotype.Component;

@Component
public class Manager {
	
	private String nombre;
	private int edad;
	
	//set y get
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Manager [nombre=" + nombre + ", edad=" + edad + "]";
	}
	

}
