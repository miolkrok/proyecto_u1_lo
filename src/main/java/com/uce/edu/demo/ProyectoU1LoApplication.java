package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.consutorio.CitaMedica;
import com.uce.edu.demo.consutorio.CitaMedica2;
import com.uce.edu.demo.deber.InscripcionCarrera;
import com.uce.edu.demo.deber.Matricula;
import com.uce.edu.demo.deber.Viaje;

@SpringBootApplication
public class ProyectoU1LoApplication implements CommandLineRunner{
	
	//1) DI por atributo
//	@Autowired
//	private CitaMedica cita;
	@Autowired
	private CitaMedica2 cita;
	@Autowired
	private Matricula matricula;
	@Autowired
	private Viaje viaje;
	@Autowired
	private InscripcionCarrera inscripcion;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1LoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Mi primer proyecto con Spring Framework");
		
		String r = this.cita.agendar(LocalDateTime.now(), "Xavier", "Cardozo", 32, "Quito", "pepito", 19);
		System.out.println(r);
		//1) Di por atribbuto
		String m = this.matricula.matricular(LocalDateTime.now(), "Luis", "Oritz", LocalDateTime.of(1997, 5, 19, 12, 00), "programacion", 36);
		System.out.println(m);
		//2)Di por constructor
		String v = this.viaje.viajar(new BigDecimal(0.25), "Miguel", "Tapia", "Licencia tipo E", "Maria Jose", "Reina", "1896158495");
		System.out.println(v);
		//3)Di por metodos SET
		String i = this.inscripcion.inscripcion("5k", "LUIS", "ORTIZ", 25, "QUITO", "MICHELLE BENALCAZAR", 24);
		System.out.println(i);
		
		
	}

}
