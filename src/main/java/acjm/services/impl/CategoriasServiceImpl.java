package acjm.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acjm.model.Categoria;
import acjm.repository.CategoriasRespository;
import acjm.services.CategoriasService;

@Service
public class CategoriasServiceImpl implements CategoriasService{

	@Autowired
	private CategoriasRespository repository;
	
	
	@Override
	public List<Categoria> getAllCategorias() {
		return (List<Categoria>) repository.findAll();
	}

	@Override
	public Optional<Categoria> getCategoriaId(Long id) {
		return repository.findById(id);
	}

	@Override
	public Categoria save(Categoria categoria) {
		return repository.save(categoria);
	}

	@Override
	public String delete(Long id) {
		repository.deleteById(id);
		return "SUCCESS";
	}

}
