package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.repository.IRetiroRepository;

@Service
public class RetiroServiceImpl implements IRetiroService{

	@Autowired
	private IRetiroRepository retiroRepository;
	
	@Autowired
	private ICuentaBancariaService cuentaBancariaService;
	
	//insertar o crear
	@Override
	public void realizarRetiro(String numeroCtaOrigen, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria ctaOrigen = this.cuentaBancariaService.buscar(numeroCtaOrigen);
		BigDecimal saldoCtaOrigen = ctaOrigen.getSaldo();
		BigDecimal saldoFinal = saldoCtaOrigen.subtract(monto);
		ctaOrigen.setSaldo(saldoFinal);
		this.cuentaBancariaService.actualizar(ctaOrigen);
		
		Retiro ret = new Retiro();
		ret.setFechaRetiro(LocalDateTime.now());
		ret.setNumeroCuentaOrigen(numeroCtaOrigen);
		ret.setMonto(monto);
		this.retiroRepository.insertarRetiro(ret);
	}

	@Override
	public Retiro buscar(String numeroCuentaOrigen) {
		// TODO Auto-generated method stub
		return this.retiroRepository.buscar(numeroCuentaOrigen);
	}

	@Override
	public void actualizar(Retiro r) {
		// TODO Auto-generated method stub
		this.retiroRepository.actualizar(r);
	}

	@Override
	public void eliminar(String numeroCuentaOrigen) {
		// TODO Auto-generated method stub
		this.retiroRepository.eliminar(numeroCuentaOrigen);
	}
	
	

}
