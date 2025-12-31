/**
 * 
 */
package br.com.Arthas.dao;

import br.com.Arthas.dao.generic.GenericJpaDAO;
import br.com.Arthas.domain.Produto;

public class ProdutoDAO extends GenericJpaDAO<Produto, Long> implements IProdutoDAO {

	public ProdutoDAO() {
		super(Produto.class);
	}

}
