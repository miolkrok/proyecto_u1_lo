package com.uce.edu.demo.consutorio;

public class Paciente {
	
	private String nombre;
	private int edad;
	
	//Set Y Get
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
		return "Paciente [nombre=" + nombre + ", edad=" + edad + "]";
	}

}
