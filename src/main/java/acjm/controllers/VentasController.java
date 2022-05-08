package acjm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import acjm.model.Producto;
import acjm.services.VentasService;


@RestController
public class VentasController {

	@Autowired
	private VentasService service;
	
	@GetMapping("/productos")
	private List<Producto> obtenerProductos(){
		return service.getAllProductos();
	}
	
}
