package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.repository.IDepositoRepository;

@Service
public class DepositoServiceImpl implements IDepositoService {

	@Autowired
	private ICuentaBancariaService cuentaBancariaService;
	@Autowired
	private IDepositoRepository depositoRepository;
	
	@Override
	public void realizarDeposito(String numeroCtaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria ctaDestino = this.cuentaBancariaService.buscar(numeroCtaDestino);
		BigDecimal saldoCtaDestino = ctaDestino.getSaldo();
		BigDecimal saldoFinal = saldoCtaDestino.add(monto);
		ctaDestino.setSaldo(saldoFinal);
		this.cuentaBancariaService.actualizar(ctaDestino);
		
		Deposito dep = new Deposito();
		dep.setFechaDeposito(LocalDateTime.now());
		dep.setNumeroCuentaDestino(numeroCtaDestino);
		dep.setMonto(monto);
		this.depositoRepository.insertarDeposito(dep);
	}

}
