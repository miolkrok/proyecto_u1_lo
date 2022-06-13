package com.uce.edu.demo.mercado.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.mercado.modelo.Producto;
import com.uce.edu.demo.mercado.repo.IInventarioRepository;
import com.uce.edu.demo.mercado.repo.IProductoRepository;
@Service
public class GestorInventarioImpl implements IGestorInventario{
	
	@Autowired
	private IProductoRepository productoRepository;
	
	@Autowired
	private IInventarioRepository inventarioRepository;
	
	@Override
	public void ingresarProducto(String codigoProducto, String nombreProducto, BigDecimal precioCompra) {
		// TODO Auto-generated method stub
		
		Producto pro = this.productoRepository.buscar(codigoProducto,precioCompra);
		pro.setCodigoProducto(codigoProducto);
		pro.setNombreProducto(nombreProducto);
		BigDecimal pc = pro.getPrecioCompra().add(precioCompra.multiply(new BigDecimal(0.10))).add(precioCompra.multiply(new BigDecimal(0.15)));
		pro.setPrecioCompra(pc);
		this.productoRepository.ingresarProducto(pro);
		
	}

	@Override
	public void reporte(LocalDateTime fechaIngreso) {
		// TODO Auto-generated method stub
	
	}

}
