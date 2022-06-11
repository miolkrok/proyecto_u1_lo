package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Deposito;

public interface IDepositoRepository {
	
	
	public void insertarDeposito(Deposito d);
	public Deposito buscar(String numeroCuentaDestino);
	public void actualizar(Deposito d);
	public void eliminar(String numeroCuentaDestino);
	public List<Deposito> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin);
	

}
