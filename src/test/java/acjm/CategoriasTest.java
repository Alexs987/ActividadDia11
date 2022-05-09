package acjm;

import static org.hamcrest.CoreMatchers.containsString;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import acjm.model.Categoria;
import acjm.services.CategoriasService;


@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class CategoriasTest {
	
	@Mock
	private CategoriasService service;

	@InjectMocks
	private CategoriasTest test = new CategoriasTest();
	
	Categoria categoria;
	
	@Test
	public void save() {
		categoria = new Categoria();
		categoria.setCategoria("ELECTRONICA");
		categoria.setCodigo("ELCT");
		
		Categoria resp = null;
		
		resp = service.save(categoria);
	
		Assert.assertEquals(resp, containsString(resp.getId().toString()));
		//System.out.println("CATEGORIA: "+resp.toString());
	}
	
	
	@Test
	public void allCategorias() {
		List<Categoria> list = new ArrayList<Categoria>();
		list = service.getAllCategorias();
		Assert.assertNotNull(list);
		
	}
	
	
	
	
}
