package com.uce.edu.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1LoApplication implements CommandLineRunner{
	

	@Autowired
	private ProfesorGeneral general;
	

	@Autowired
	private ProfesorGeneral general1;
	@Autowired
	private ProfesorMateria materia;

	@Autowired
	private ProfesorMateria materia1;
	
	@Autowired
	private IMatriculaService matriculaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1LoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("EJEMPLO SINGLETON");
		this.general.setNombre("LUIS");
		this.general.setApellido("ORTIZ");
		System.out.println(this.general);
		System.out.println("------------");
		System.out.println(this.general1);
		this.general1.setNombre("Pepito");
		System.out.println("---------");
		System.out.println(this.general);
		System.out.println("---------");
		System.out.println(this.general1);
		System.out.println("EJEMPLO PROTOTYPE");
		this.materia.setNombre("DANIEL");
		this.materia.setApellido("TERAN");
		System.out.println(this.materia);
		System.out.println("---------");
		System.out.println(this.materia1);
		Matricula m = new Matricula();
		m.setEstudiante(new Estudiante());
		m.setNumero("5642");
		List<Materia> materia = new ArrayList<>();
		m.setMateria(materia);
		this.matriculaService.ingresarMatricula(m);
	}

}
