package com.uce.edu.demo.mercado.service;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.mercado.modelo.Inventario;
import com.uce.edu.demo.mercado.modelo.Producto;

public interface IInventarioService {
	
	public Inventario consultar(LocalDateTime fechaIngreso,List<Producto> producto);

}
