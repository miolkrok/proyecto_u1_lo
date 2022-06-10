package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Deposito;

public interface IDepositoService {

	public void realizarDeposito(String numeroCtaDestino, BigDecimal monto);
	public Deposito buscar(String numeroCuentaDestino);
	public void actualizar(Deposito d);
	public void eliminar(String numeroCuentaDestino);
	

}
