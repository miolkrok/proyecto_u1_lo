package com.uce.edu.demo.modelo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class HorarioGeneral {
	
	private String nombreMateria;
	private String horasSemanales;
	
	//set y get
	public String getNombreMateria() {
		return nombreMateria;
	}
	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}
	public String getHorasSemanales() {
		return horasSemanales;
	}
	public void setHorasSemanales(String horasSemanales) {
		this.horasSemanales = horasSemanales;
	}
	@Override
	public String toString() {
		return "HorarioGeneral [nombreMateria=" + nombreMateria + ", horasSemanales=" + horasSemanales + "]";
	}
	
	

}
