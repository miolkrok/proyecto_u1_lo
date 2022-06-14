package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.repository.IDepositoRepository;

@Service
public class DepositoServiceImpl implements IDepositoService {

	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService cuentaBancariaService;
	@Autowired
	private IDepositoRepository depositoRepository;
	
	//insertar o crear
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

	@Override
	public Deposito buscar(String numeroCuentaDestino) {
		// TODO Auto-generated method stub
		return this.depositoRepository.buscar(numeroCuentaDestino);
	}

	@Override
	public void actualizar(Deposito d) {
		// TODO Auto-generated method stub
		this.depositoRepository.actualizar(d);
	}

	@Override
	public void eliminar(String numeroCuentaDestino) {
		// TODO Auto-generated method stub
		this.depositoRepository.eliminar(numeroCuentaDestino);
	}

}
