package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.repository.IMatriculaRepository;


@Service
public class MatriculaServiceImpl implements IMatriculaService{
	
	@Autowired
	private IMatriculaRepository matriculaRepository;

	@Override
	public void ingresarMatricula(Matricula e) {
		// TODO Auto-generated method stub
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
		this.matriculaRepository.actualizar(e);
	}

	@Override
	public void borrarMatricula(String numero) {
		// TODO Auto-generated method stub
		this.matriculaRepository.eliminar(numero);
	}

}
