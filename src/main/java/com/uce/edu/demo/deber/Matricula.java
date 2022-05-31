package com.uce.edu.demo.deber;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Matricula {

	
	private LocalDateTime fechaMatricula;
	@Autowired
	private Estudiante estudiante;
	@Autowired
	private Materia materia;
	
	public String matricular(LocalDateTime fechaMatricula, String nombreEstudiante,
			String apellidoEstudiante,LocalDateTime fechaNacimiento,  String nombreMateria, Integer numeroHoras) {
		//seteamos los atributos de Matricula
		this.fechaMatricula = fechaMatricula;
		
		this.estudiante.setNombre(nombreEstudiante);
		this.estudiante.setApellido(apellidoEstudiante);
		this.estudiante.setFechaNacimiento(fechaNacimiento);
		this.materia.setNombreMateria(nombreMateria);
		this.materia.setNumeroHoras(numeroHoras);
		
		return"Matricula realizada";
	}
	
	//SET Y GET
	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}
	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}
	public Estudiante getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	@Override
	public String toString() {
		return "Matricula [fechaMatricula=" + fechaMatricula + ", estudiante=" + estudiante + ", materia=" + materia
				+ "]";
	}
}
