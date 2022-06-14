package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.repository.ITransferenciaRepository;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService{

	//Como la logica de CuentaBancariaService no hace nada
	//Si puedo inyectar el CuentaBancariaRepository
	@Autowired
	private ITransferenciaRepository transferenciaRepository;
	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService cuentaBancariaService;
	
	//insertar o crear
	@Override
	public void realizarTransferencia(String ctaOrigen, String ctaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria cOrig = this.cuentaBancariaService.buscar(ctaOrigen);
		BigDecimal saldoOrigen = cOrig.getSaldo();
		BigDecimal nuevoSaldoOrigen = saldoOrigen.subtract(monto);
		cOrig.setSaldo(nuevoSaldoOrigen);
		this.cuentaBancariaService.actualizar(cOrig);
		
		CuentaBancaria cDestino = this.cuentaBancariaService.buscar(ctaDestino);
		BigDecimal saldoDestino = cDestino.getSaldo();
		BigDecimal nuevoSaldoDestino = saldoDestino.add(monto);
		cDestino.setSaldo(nuevoSaldoDestino);
		this.cuentaBancariaService.actualizar(cDestino);
		
		Transferencia t = new Transferencia();
		t.setNumeroCuentaOrigen(ctaOrigen);
		t.setNumeroCuentaDestino(ctaDestino);
		t.setMontoTransferir(monto);
		t.setFechaTransferencia(LocalDateTime.now());
		this.transferenciaRepository.insertar(t);
		
		
	}


	@Override
	public Transferencia buscar(String numeroCuentaOrigen) {
		// TODO Auto-generated method stub
		return this.transferenciaRepository.buscar(numeroCuentaOrigen);
	}


	@Override
	public void actualizar(Transferencia t) {
		// TODO Auto-generated method stub
		this.transferenciaRepository.actualizar(t);
	}


	@Override
	public void eliminar(String numeroCuentaOrigen) {
		// TODO Auto-generated method stub
		this.transferenciaRepository.eliminar(numeroCuentaOrigen);
	}


	@Override
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		return this.transferenciaRepository.consultar(cuenta, fechaInicio, fechaFin);
	}

}
