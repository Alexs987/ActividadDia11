package acjm;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import acjm.model.Producto;
import acjm.repository.ProductosRepository;
import acjm.services.ProductosService;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
class ProductosServiceImplTest {

	@Mock
	private ProductosRepository repository;
	
	@InjectMocks
	private ProductosService service;
	
	private Producto producto;
	
	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		
		producto = new Producto();
		
		producto.setProducto("");
		producto.setPrecio(new BigDecimal(25.0));
		producto.setCantidad(3);
		producto.setId(1L);
		
		
	}

	@Test
	void testGetProductosId() {
		Optional<Producto> prod = null; ;
		when(repository.findById(1L)).thenReturn(prod);
		assertNotNull(service.getProductosId(1L));
	}

	@Test
	void testSave() {
		when(repository.save(any(Producto.class))).thenReturn(producto);
		assertNotNull(service.save(producto));
	}

	@Test
	void testDelete() {
		Mockito.when(service.delete(1L)).thenReturn("SUCCESS");
		assertNotNull(service.delete(1L));
	}

}
