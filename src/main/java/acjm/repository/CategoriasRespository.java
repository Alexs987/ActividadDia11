package acjm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import acjm.model.Categoria;

@Repository
public interface CategoriasRespository 
extends CrudRepository<Categoria, Long>{

}
