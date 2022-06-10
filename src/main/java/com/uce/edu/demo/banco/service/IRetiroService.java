package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroService {

	public void realizarRetiro(String numeroCtaOrigen, BigDecimal monto);
	public Retiro buscar(String numeroCuentaOrigen);
	public void actualizar(Retiro r);
	public void eliminar(String numeroCuentaOrigen);
}
