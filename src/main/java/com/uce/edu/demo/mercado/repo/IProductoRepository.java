package com.uce.edu.demo.mercado.repo;

import java.math.BigDecimal;

import com.uce.edu.demo.mercado.modelo.Producto;

public interface IProductoRepository {

	public void ingresarProducto(Producto producto);
	public Producto buscar(String codigoProducto,BigDecimal precioCompra);
	public void actualizar(Producto producto);
	public void eliminar(String codigoProducto);
	
}
