package com.uce.edu.demo.mercado.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.mercado.modelo.Inventario;
import com.uce.edu.demo.mercado.modelo.Producto;
import com.uce.edu.demo.mercado.repo.IInventarioRepository;

@Service
public class InventarioServiceImpl implements IInventarioService{
	
	@Autowired
	private IInventarioRepository iInventarioRepository;

	@Override
	public Inventario consultar(LocalDateTime fechaIngreso, List<Producto> producto) {
		// TODO Auto-generated method stub
		return this.iInventarioRepository.consultar(fechaIngreso, producto);
	}

	
}
