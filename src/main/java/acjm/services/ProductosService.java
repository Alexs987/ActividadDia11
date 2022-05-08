package acjm.services;

import java.util.List;
import java.util.Optional;

import acjm.model.Producto;

public interface ProductosService {

	/*public List<Producto> getAllProductos();*/
	public Optional<Producto> getProductosId(Long id);
	public Producto save(Producto producto);
	public void delete(Long id);
}
