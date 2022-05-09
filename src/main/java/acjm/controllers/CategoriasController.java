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

import acjm.model.Categoria;
import acjm.services.CategoriasService;

@RestController
//@RequestMapping("/cat-estatus")
public class CategoriasController {

	@Autowired
	private CategoriasService service;

	@GetMapping("/categorias")
	private List<Categoria> getAllCategorias(){
		return service.getAllCategorias();
	}
	
	@GetMapping("/categorias/{id}")
	private Optional<Categoria> getCategoriaId(@PathVariable Long id){
		return service.getCategoriaId(id);
	}
	
	@PostMapping("/categorias")
	private Categoria save(@RequestBody Categoria categoria) {
		return service.save(categoria);
	}
	
	@DeleteMapping("/categorias/{id}")
	private String delete(@PathVariable Long id) {
		service.delete(id);
		return "SUCCESS";
	}
	
}
