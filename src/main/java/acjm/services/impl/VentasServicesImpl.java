package acjm.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acjm.model.Producto;
import acjm.repository.VentasRepository;
import acjm.services.VentasService;

@Service
public class VentasServicesImpl implements VentasService{

	@Autowired
	private VentasRepository repository;
	
	@Override
	public List<Producto> getAllProductos() {
		return (List<Producto>) repository.findAll();
	}

}
