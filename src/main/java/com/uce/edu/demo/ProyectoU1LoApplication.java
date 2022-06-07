package com.uce.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.service.IEstudianteService;

@SpringBootApplication
public class ProyectoU1LoApplication implements CommandLineRunner{
	
	@Autowired
	private IEstudianteService estudianteService;
	

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1LoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Estudiante e1 = new Estudiante();
		e1.setNombre("LUIS");
		e1.setApellido("ORTIZ");
		e1.setCedula("1718496943");
		this.estudianteService.ingresarEstudiante(e1);
		
		Estudiante e = new Estudiante();
		e.setNombre("PEPITO");
		e.setApellido("PEREZ");
		e.setCedula("1849248741");
		this.estudianteService.ingresarEstudiante(e);
		
		//Usar los 3 metodos restantes
		e.setCedula("1718496944");
		this.estudianteService.actualizarEstudiante(e);
		
		this.estudianteService.buscarPorApellido("ORTIZ");
		
		this.estudianteService.borrarEstudiante("1849248741");
		
		
	}

}
