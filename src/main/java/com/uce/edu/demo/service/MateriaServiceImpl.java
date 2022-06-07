package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.repository.IMateriaRepo;

@Service
public class MateriaServiceImpl implements IMateriaService {

	@Autowired
	private IMateriaRepo materiaRepo;
	@Override
	public void ingresarMateria(Materia e) {
		// TODO Auto-generated method stub
		this.materiaRepo.insertar(e);
	}

	@Override
	public Materia buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.materiaRepo.buscar(nombre);
	}

	@Override
	public void actualizarMateria(Materia e) {
		// TODO Auto-generated method stub
		this.materiaRepo.actualizar(e);
	}

	@Override
	public void borrarMateria(String nombre) {
		// TODO Auto-generated method stub
		this.materiaRepo.eliminar(nombre);
	}

}
