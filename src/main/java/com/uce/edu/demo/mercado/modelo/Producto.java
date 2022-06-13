package com.uce.edu.demo.mercado.modelo;

import java.math.BigDecimal;

public class Producto {
	
	private String codigoProducto;
	private String nombreProducto;
//	private BigDecimal precioVenta;
	private BigDecimal precioCompra;
	
	//SET Y GET
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
//	public BigDecimal getPrecioVenta() {
//		return precioVenta;
//	}
//	public void setPrecioVenta(BigDecimal precioVenta) {
//		this.precioVenta = precioVenta;
//	}

	public BigDecimal getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(BigDecimal precioCompra) {
		this.precioCompra = precioCompra;
	}
	public String getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	@Override
	public String toString() {
		return "Producto [codigoProducto=" + codigoProducto + ", nombreProducto=" + nombreProducto + ", precioCompra="
				+ precioCompra + "]";
	}



}
