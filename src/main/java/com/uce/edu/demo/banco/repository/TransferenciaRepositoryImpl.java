package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		//aqui va el SQL a la base
		List<Transferencia> listaConsultada = new ArrayList<>();
		Transferencia trans1 = new Transferencia();
		trans1.setFechaTransferencia(LocalDateTime.now());
		trans1.setMontoTransferir(new BigDecimal(100));
		trans1.setNumeroCuentaOrigen("12567");
		trans1.setNumeroCuentaDestino("12234");
		listaConsultada.add(trans1);
		return listaConsultada;
	}

}
