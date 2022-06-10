package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository{

	@Override
	public void insertar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("aqui se inserta la transferencia en la base de datos " +t);
	}

	@Override
	public Transferencia buscar(String numeroCuentaOrigen) {
		// TODO Auto-generated method stub
		System.out.println("la transferencia buscada es: " +numeroCuentaOrigen);
		Transferencia tran =new Transferencia();
		tran.setNumeroCuentaOrigen(numeroCuentaOrigen);
		return tran;
	}

	@Override
	public void actualizar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("aqui se actualiza la transferencia en la base de datos " +t);
	}

	@Override
	public void eliminar(String numeroCuentaOrigen) {
		// TODO Auto-generated method stub
		System.out.println("la transferencia se elimina: " + numeroCuentaOrigen);
	}

}
