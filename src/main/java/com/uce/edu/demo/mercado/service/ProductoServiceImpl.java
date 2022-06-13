package com.uce.edu.demo.mercado.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.mercado.modelo.Producto;
import com.uce.edu.demo.mercado.repo.IProductoRepository;

@Service
public class ProductoServiceImpl implements IProductoService{
	
	@Autowired
	private IProductoRepository productoRepository;

	@Override
	public Producto buscar(String codigoProducto, BigDecimal precioCompra) {
		// TODO Auto-generated method stub

		return this.productoRepository.buscar(codigoProducto,precioCompra);
	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		this.productoRepository.actualizar(producto);
	}

	@Override
	public void eliminar(String codigoProducto) {
		// TODO Auto-generated method stub
		this.productoRepository.eliminar(codigoProducto);
	}

}
