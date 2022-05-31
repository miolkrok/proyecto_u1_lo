package com.uce.edu.demo.deber;

import org.springframework.stereotype.Component;

@Component
public class Conductor {
	
	private String nombre;
	private String apellido;
	private String tipoLicencia;
	
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
	public String getTipoLicencia() {
		return tipoLicencia;
	}
	public void setTipoLicencia(String tipoLicencia) {
		this.tipoLicencia = tipoLicencia;
	}
	@Override
	public String toString() {
		return "Conductor [nombre=" + nombre + ", apellido=" + apellido + ", tipoLicencia=" + tipoLicencia + "]";
	}

}
