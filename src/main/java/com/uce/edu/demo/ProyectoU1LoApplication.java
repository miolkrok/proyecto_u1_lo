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
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IMateriaService;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1LoApplication implements CommandLineRunner{
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private IMateriaService materiaService;
	
	@Autowired
	private IMatriculaService matriculaService;
	

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
		
		//consumir los metodos CRUD de materia
		
		Materia mate = new Materia();
		List<Materia> m1 = new ArrayList<>();
		mate.setNombre("Programacion");
		mate.setSemestre("sexto semestre");
		
		m1.add(mate);
		this.materiaService.ingresarMateria(mate);
		
		mate.setNombre("Programacion Avanzada II");
		this.materiaService.actualizarMateria(mate);
		
		this.materiaService.buscarPorNombre("Programacion Avanzada II");
		
		this.materiaService.borrarMateria("Programacion Avanzada II");
		
		//consumir los metodos CRUD de matricula
		
		Matricula matri = new Matricula();
		matri.setNumero("51598563215");
		matri.setEstudiante(e);
		matri.setMateria(m1);
		this.matriculaService.ingresarMatricula(matri);
		
		matri.setNumero("51598563218");
		this.matriculaService.actualizarMatricula(matri);
		
		this.matriculaService.buscarPorNumero("51598563218");
		
		this.matriculaService.borrarMatricula("51598563218");
		
	}

}
