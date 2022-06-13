package com.uce.edu.demo.mercado.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface IGestorInventario {

	
	public void ingresarProducto(String codigoProducto, String nombreProducto, BigDecimal precioCompra);
	public void reporte(LocalDateTime fechaIngreso);
	
}
