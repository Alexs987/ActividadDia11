package acjm.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import acjm.model.Producto;
import acjm.services.ProductosService;

@RestController
//@RequestMapping("/cat-estatus")
public class ProductosController {

	@Autowired
	private ProductosService service;
	
	/*@GetMapping("/productos")
	private List<Producto> getAllProductos(){
		return service.getAllProductos();
	}*/
	
	@GetMapping("/productos/{id}")
	private Optional<Producto> getProductosId(@PathVariable Long id){
		return service.getProductosId(id);
	}
	
	@PostMapping("/productos")
	private Producto save(@RequestBody Producto producto) {
		return service.save(producto);
	}
	
	@DeleteMapping("/productos/{id}")
	private void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
