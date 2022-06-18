package com.uce.edu.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.HorarioGeneral;
import com.uce.edu.demo.modelo.HorarioMateria;
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
	
	@Autowired
	private HorarioGeneral horarioG1;
	
	@Autowired
	private HorarioMateria horarioM1;
	
	@Autowired
	private HorarioGeneral horarioG2;
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1LoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
//		System.out.println("EJEMPLO SINGLETON");
//		this.horarioG1.setNombreMateria("programacion");
//		this.horarioG1.setHorasSemanales("6 horas semanales");
//		System.out.println(this.horarioG1);
//		this.horarioG2.setNombreMateria("PROGRAMACION AVANZADA");
//		this.horarioG2.setHorasSemanales("8 horas semanales");
//		System.out.println(this.horarioG2);
//		Matricula mat = new Matricula();
//		mat.setEstudiante(new Estudiante());
//		mat.setNumero("5642");
//		List<Materia> materiaH = new ArrayList<>();
//		mat.setMateria(materiaH);		
//		this.matriculaService.actualizarMatricula(mat);
//		
//		System.out.println("----------------------------------------------------------------------------------------------------------");
//		//NO ACTUALIZA EL HORARIO AL NO RECIBIR EL MISMO ESPACIO DE MEMORIA DE LA CLASE MATRICULA A EL CREADO EN LA CLASE MAIN, POR LO CUAL SON DIFERENTES
//		System.out.println("EJEMPLO PROTOTYPE");
//		this.horarioM1.setNombreMateria("REDES Y PROTOCOLOS DE COMUNICACION");
//		this.horarioM1.setHorasSemanales("6 horas semanales");
//		this.horarioM1.setHoraDiarias("2 horas diarias");
//		System.out.println(this.horarioM1);
//		Matricula matM = new Matricula();
//		matM.setEstudiante(new Estudiante());
//		matM.setNumero("2235");
//		List<Materia> materiaH2 = new ArrayList<>();
//		matM.setMateria(materiaH2);		
//		this.matriculaService.actualizarMatricula(matM);	
		
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
