package acjm;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.notNull;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Optional;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import acjm.model.Categoria;
import acjm.repository.CategoriasRespository;
import acjm.services.CategoriasService;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class CategoriasServiceImplTest {

	
	@Mock
	private CategoriasRespository repository;
	
	@InjectMocks
	private CategoriasService service;
	
	private Categoria categoria;
	
	
	@SuppressWarnings("deprecation")
	@BeforeEach
	void setup() {
		MockitoAnnotations.initMocks(this);
		
		categoria = new Categoria();
		categoria.setCategoria("FRUTAS Y VERDURAS");
		categoria.setCodigo("FYV");
		categoria.setId(4L);
	}
	

	@Test
	public void testGetAllCategorias() {
		when(repository.findAll()).thenReturn(Arrays.asList(categoria));
		assertNotNull(service.getAllCategorias());
		
	}

	@Test
	public void testGetCategoriaId() {
		Optional<Categoria> cat = null; ;
		when(repository.findById(1L)).thenReturn(cat);
		assertNotNull(service.getCategoriaId(1L));
	}

	@Test
	public void testSave() {
		when(repository.save(any(Categoria.class))).thenReturn(categoria);
		assertNotNull(service.save(categoria));
	}

	@Test
	public void testDelete() {
		Mockito.when(service.delete(3L)).thenReturn("SUCCESS");
		assertNotNull(service.delete(3L));
	}


}
