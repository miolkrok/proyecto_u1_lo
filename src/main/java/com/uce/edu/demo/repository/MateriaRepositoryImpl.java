package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Materia;

@Repository
public class MateriaRepositoryImpl implements IMateriaRepo {

	@Override
	public void insertar(Materia e) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base la materia " + e);
	}

	@Override
	public Materia buscar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base la materia " +nombre);
		Materia e = new Materia();
		e.setNombre(nombre);
		return e;
	}

	@Override
	public void actualizar(Materia e) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base la materia " + e);
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base la materia " + nombre);
	}

}
