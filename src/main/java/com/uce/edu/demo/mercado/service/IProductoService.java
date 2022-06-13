package com.uce.edu.demo.mercado.service;

import java.math.BigDecimal;

import com.uce.edu.demo.mercado.modelo.Producto;

public interface IProductoService {
	
	
	public Producto buscar(String codigoProducto,BigDecimal precioCompra);
	public void actualizar(Producto producto);
	public void eliminar(String codigoProducto);

}
