package com.uce.edu.demo.mercado.repo;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.mercado.modelo.Producto;

@Repository
public class ProductoRepositoryImpl implements IProductoRepository{

	@Override
	public void ingresarProducto(Producto producto) {
		// TODO Auto-generated method stub
		System.out.println("se ha ingresado el producto a la base de datos: " + producto);
	}

	@Override
	public Producto buscar(String codigoProducto, BigDecimal precioCompra) {
		// TODO Auto-generated method stub
		System.out.println(" el producto buscado es: " + codigoProducto);
		Producto pro = new Producto();
		pro.setCodigoProducto(codigoProducto);
		pro.setPrecioCompra(precioCompra);
		return pro;
	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		System.out.println("se ha actualizado el producto a la base de datos: " + producto);
	}

	@Override
	public void eliminar(String codigoProducto) {
		// TODO Auto-generated method stub
		System.out.println("se ha eliminado el producto de la base de datos: " + codigoProducto);
	}

}
