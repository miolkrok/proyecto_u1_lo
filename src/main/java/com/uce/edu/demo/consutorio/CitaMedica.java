package com.uce.edu.demo.consutorio;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class CitaMedica {

	private LocalDateTime fechaCita;

	private Doctor doctor;
	private Paciente paciente;

	//2) DI  por constructor
	public CitaMedica(Doctor doctor, Paciente paciente) {
		// TODO Auto-generated constructor stub
		this.doctor = doctor;
		this.paciente = paciente;
	}

	public String agendar(LocalDateTime fechaCita, String nombre, String apellido, int edad, String ciudad,
			String nombrePaciente, int edadPaciente) {

		////////////////////////////////
//		this.doctor = new Doctor();
//		this.paciente = new Paciente();
		////////////////////////////////
		this.doctor.setNombre(nombrePaciente);
		this.doctor.setApellido(apellido);
		this.doctor.setEdad(edad);
		this.doctor.setCiudad(ciudad);

		this.paciente.setEdad(edadPaciente);
		this.paciente.setNombre(nombrePaciente);

		// seteamos los atributos de la cita medica
		this.fechaCita = fechaCita;

		// se inserta la cita en la base de datos
		return "Cita agendada";
	}
	// SET Y GET

	public LocalDateTime getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

}
