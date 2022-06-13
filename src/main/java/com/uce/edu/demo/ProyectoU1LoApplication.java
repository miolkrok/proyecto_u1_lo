package com.uce.edu.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.service.IDepositoService;
import com.uce.edu.demo.banco.service.IRetiroService;
import com.uce.edu.demo.banco.service.ITransferenciaService;
import com.uce.edu.demo.mercado.service.IGestorInventario;
import com.uce.edu.demo.mercado.service.IProductoService;

@SpringBootApplication
public class ProyectoU1LoApplication implements CommandLineRunner{
	
	@Autowired
	private ITransferenciaService transferenciaService;
	
	@Autowired
	private IDepositoService depositoService;
	
	@Autowired
	private IRetiroService retiroService;
	
	@Autowired
	private IGestorInventario gestorInventario;
	

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1LoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

//		this.transferenciaService.realizarTransferencia("12", "13", new BigDecimal(20));
//		this.depositoService.realizarDeposito("14", new BigDecimal(50));
//		this.retiroService.realizarRetiro("15", new BigDecimal(10));

		
		this.gestorInventario.ingresarProducto("5841", "sprite", new BigDecimal(5.00));
		this.gestorInventario.ingresarProducto("54165", "leche", new BigDecimal(1.50));
		this.gestorInventario.ingresarProducto("21454", "manzanas", new BigDecimal(0.50));
		this.gestorInventario.ingresarProducto("5163", "huevos", new BigDecimal(5.50));
		this.gestorInventario.ingresarProducto("1158", "carne", new BigDecimal(3.50));
		
//		this.gestorInventario.reporte(null, null);
		
	}

}
