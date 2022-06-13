package com.uce.edu.demo.mercado.modelo;


import java.time.LocalDateTime;
import java.util.List;

public class Inventario {
 
	private LocalDateTime fechaIngreso;
	private List<Producto> producto;
	private int cantidad;

	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public List<Producto> getProducto() {
		return producto;
	}
	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "Inventario [fechaIngreso=" + fechaIngreso + ", producto=" + producto + "]";
		
	}





	
	
	
}
