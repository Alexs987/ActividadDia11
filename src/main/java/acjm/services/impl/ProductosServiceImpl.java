package acjm.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acjm.model.Producto;
import acjm.repository.ProductosRepository;
import acjm.services.ProductosService;

@Service
public class ProductosServiceImpl implements ProductosService{

	@Autowired
	private ProductosRepository repository;
	
	/*@Override
	public List<Producto> getAllProductos() {
		return (List<Producto>) repository.findAll();
	}*/

	@Override
	public Optional<Producto> getProductosId(Long id) {
		return repository.findById(id);
	}

	@Override
	public Producto save(Producto producto) {
		return repository.save(producto);
	}

	@Override
	public String delete(Long id) {
		repository.deleteById(id);
		return "SUCCESS";
	}

}
