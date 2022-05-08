package acjm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import acjm.model.Producto;


@Repository
public interface ProductosRepository 
extends CrudRepository<Producto, Long>{
}
