package br.com.Arthas.dao;

import br.com.Arthas.dao.generic.GenericDAO;
import br.com.Arthas.domain.Produto;

public class ProdutoDAO extends GenericDAO<Produto, Long> implements IProdutoDAO{

	public ProdutoDAO() {
		super(Produto.class);
	}

}
