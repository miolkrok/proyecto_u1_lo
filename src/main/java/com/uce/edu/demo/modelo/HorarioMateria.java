package com.uce.edu.demo.modelo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class HorarioMateria {
	
	private String nombreMateria;
	private String horasSemanales;
	private String horaDiarias;
	
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
	public String getHoraDiarias() {
		return horaDiarias;
	}
	public void setHoraDiarias(String horaDiarias) {
		this.horaDiarias = horaDiarias;
	}
	@Override
	public String toString() {
		return "HorarioMateria [nombreMateria=" + nombreMateria + ", horasSemanales=" + horasSemanales
				+ ", horaDiarias=" + horaDiarias + "]";
	}

	
}
