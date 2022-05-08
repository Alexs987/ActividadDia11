package acjm.test;

import acjm.model.Categoria;
import acjm.services.CategoriasService;
import acjm.services.impl.CategoriasServiceImpl;

public class Test {

	public static void main(String[] args) {
		CategoriasService serv = new CategoriasServiceImpl();
		Categoria categoria = new Categoria();
		categoria.setCategoria("ELECTRONICA");
		categoria.setCodigo("ELCT");
		
		Categoria resp = null;
		
		resp = serv.save(categoria);
		System.out.println("CATEGORIA: "+resp.toString());
	}
}
