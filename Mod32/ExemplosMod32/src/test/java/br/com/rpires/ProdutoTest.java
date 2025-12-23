/**
 * 
 */
package br.com.rpires;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;


import br.com.arthas.dao.IProdutoDao;
import br.com.arthas.dao.ProdutoDao;
import br.com.rpires.domain.Produto;

/**
 * @author rodrigo.pires
 *
 */
public class ProdutoTest {

	private IProdutoDao produtoDao;
	
	public ProdutoTest() {
		produtoDao = new ProdutoDao();
	}

	@Test
	public void cadastrar() {
		Produto produto = new Produto();
		produto.setCodigo("A1");
		produto.setDescricao("CURSO TESTE");
		produto.setNome("Curso de Java Backend");
		produto = produtoDao.cadastrar(produto);
		
		assertNotNull(produto);
		assertNotNull(produto.getId());
	}
}
