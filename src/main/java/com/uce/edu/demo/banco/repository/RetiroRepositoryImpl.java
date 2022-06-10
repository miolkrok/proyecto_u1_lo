package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Retiro;

@Repository
public class RetiroRepositoryImpl implements IRetiroRepository {

	@Override
	public void insertarRetiro(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("aqui se inserta el retiro: " + r);
	}

	@Override
	public Retiro buscar(String numeroCuentaOrigen) {
		// TODO Auto-generated method stub
		System.out.println(" el retiro buscado es: " + numeroCuentaOrigen);
		Retiro ret = new Retiro();
		ret.setNumeroCuentaOrigen(numeroCuentaOrigen);
		return ret;
	}

	@Override
	public void actualizar(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("aqui se actualiza el retiro: " + r);
	}

	@Override
	public void eliminar(String numeroCuentaOrigen) {
		// TODO Auto-generated method stub
		System.out.println("aqui se elimina el retiro: " + numeroCuentaOrigen);
	}

}
