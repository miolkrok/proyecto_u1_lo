package com.uce.edu.demo.mercado.repo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.mercado.modelo.Inventario;
import com.uce.edu.demo.mercado.modelo.Producto;

@Repository
public class InventarioRepositoryImpl implements IInventarioRepository{

	@Override
	public void insertar(Inventario inventario) {
		// TODO Auto-generated method stub
		System.out.println("ingreso a la bodega"+inventario);
	}

	@Override
	public Inventario consultar(LocalDateTime fechaIngreso, List<Producto> producto) {
		// TODO Auto-generated method stub
		System.out.println(" el inventario buscado es: " + fechaIngreso + producto);
		Inventario inv = new Inventario();
		inv.setCantidad(100);
		inv.setFechaIngreso(fechaIngreso);
		inv.setProducto(producto);
		return inv;
	}




}
