package acjm.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.repository.CrudRepository;

import acjm.model.Producto;

@FeignClient(name = "Listado-Productos", 
url = "http://localhost:8080/productos")
public interface VentasRepository extends CrudRepository<Producto, Long>{

}
