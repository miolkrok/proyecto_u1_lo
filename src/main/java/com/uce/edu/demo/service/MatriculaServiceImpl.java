package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.HorarioGeneral;
import com.uce.edu.demo.modelo.HorarioMateria;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.repository.IMatriculaRepository;


@Service
public class MatriculaServiceImpl implements IMatriculaService{
	
	@Autowired
	private IMatriculaRepository matriculaRepository;
	
	@Autowired
	private ProfesorGeneral profesorGeneral;
	
	@Autowired
	private ProfesorMateria profesorMateria;
	
	@Autowired
	private HorarioGeneral horarioGeneral;
	
	@Autowired
	private HorarioMateria horarioMateria;

	@Override
	public void ingresarMatricula(Matricula e) {
		// TODO Auto-generated method stub
		System.out.println("DI desde Service SINGLETON "+this.profesorGeneral);
		System.out.println("DI desde Service PROTOTYPE "+this.profesorMateria);
		this.matriculaRepository.insertar(e);
	}

	@Override
	public Matricula buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.matriculaRepository.buscar(numero);
	}

	@Override
	public void actualizarMatricula(Matricula e) {
		// TODO Auto-generated method stub
		System.out.println("DI desde Service SINGLETON "+this.horarioGeneral);
		this.horarioMateria.setNombreMateria("MACHINE LEARNING");
		this.horarioMateria.setHorasSemanales("6 horas semanales");
		this.horarioMateria.setHoraDiarias("3 dias con 2 horas diarias");
		System.out.println("DI desde Service PROTOTYPE "+this.horarioMateria);
		this.matriculaRepository.actualizar(e);
		
	}

	@Override
	public void borrarMatricula(String numero) {
		// TODO Auto-generated method stub
		this.matriculaRepository.eliminar(numero);
	}

}
