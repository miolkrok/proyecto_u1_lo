package com.uce.edu.demo.deber;

import org.springframework.stereotype.Component;

@Component
public class Materia {
	
	private String nombreMateria;
	private Integer numeroHoras;
	
	//SET Y GET
	public String getNombreMateria() {
		return nombreMateria;
	}
	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}
	public Integer getNumeroHoras() {
		return numeroHoras;
	}
	public void setNumeroHoras(Integer numeroHoras) {
		this.numeroHoras = numeroHoras;
	}
	@Override
	public String toString() {
		return "Materia [nombreMateria=" + nombreMateria + ", numeroHoras=" + numeroHoras + "]";
	}

}
