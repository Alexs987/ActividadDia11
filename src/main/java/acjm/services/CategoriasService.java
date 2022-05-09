package acjm.services;

import java.util.List;
import java.util.Optional;

import acjm.model.Categoria;

public interface CategoriasService {
	
	public List<Categoria> getAllCategorias();
	public Optional<Categoria> getCategoriaId(Long id);
	public Categoria save(Categoria categoria);
	public String delete(Long id);
}
