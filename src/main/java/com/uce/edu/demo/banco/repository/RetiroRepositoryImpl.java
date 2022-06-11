package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<Retiro> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Retiro> listaRetiros = new ArrayList<>();
		Retiro reti1 = new Retiro();
		reti1.setFechaRetiro(LocalDateTime.of(2022, 12, 20, 13, 34, 10));
		reti1.setMonto(new BigDecimal(25));
		reti1.setNumeroCuentaOrigen("6523");
		listaRetiros.add(reti1);
		
		return listaRetiros;
	}

}
