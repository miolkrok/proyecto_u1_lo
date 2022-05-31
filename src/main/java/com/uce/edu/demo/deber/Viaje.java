package com.uce.edu.demo.deber;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service
public class Viaje {
	
	private BigDecimal precio;
	private Conductor conductor;
	private Pasajero pasajero;
	
	public Viaje(Conductor conductor,Pasajero pasajero) {
		// TODO Auto-generated constructor stub
		this.conductor=conductor;
		this.pasajero=pasajero;
	}
	
	public String viajar(BigDecimal precio,String nombreConductor,String apellidoConductor,String tipoLicencia,String nombrePasajero,String apellidoPasajero,String cedula) {
		
		this.precio = precio;
		this.conductor.setNombre(nombrePasajero);
		this.conductor.setApellido(apellidoPasajero);
		this.conductor.setTipoLicencia(tipoLicencia);
		this.pasajero.setNombre(nombrePasajero);
		this.pasajero.setApellido(apellidoPasajero);
		this.pasajero.setCedula(cedula);
		
		return "viaje cobrado";
	}
	
	//SET Y GET
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	public Conductor getConductor() {
		return conductor;
	}
	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}
	public Pasajero getPasajero() {
		return pasajero;
	}
	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}
	

}
