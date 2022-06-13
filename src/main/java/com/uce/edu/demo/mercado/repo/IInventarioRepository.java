package com.uce.edu.demo.mercado.repo;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.mercado.modelo.Inventario;
import com.uce.edu.demo.mercado.modelo.Producto;

public interface IInventarioRepository {
	public void insertar(Inventario inventario);
	
	public Inventario consultar(LocalDateTime fechaIngreso,List<Producto> producto);

}
