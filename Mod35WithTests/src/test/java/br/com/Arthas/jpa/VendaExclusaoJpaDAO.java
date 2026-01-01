/**
 * 
 */
package br.com.Arthas.jpa;

import br.com.Arthas.dao.IVendaDAO;
import br.com.Arthas.dao.generic.GenericJpaDAO;
import br.com.Arthas.domain.Venda;
import br.com.Arthas.exceptions.DAOException;
import br.com.Arthas.exceptions.TipoChaveNaoEncontradaException;

public class VendaExclusaoJpaDAO extends GenericJpaDAO<Venda, Long> implements IVendaDAO {

	public VendaExclusaoJpaDAO() {
		super(Venda.class);
	}

	@Override
	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public Venda consultarComCollection(Long id) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

}
