/**
 * 
 */
package br.com.Arthas.dao;

import br.com.Arthas.dao.generic.IGenericDAO;
import br.com.Arthas.domain.Venda;
import br.com.Arthas.exceptions.DAOException;
import br.com.Arthas.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, Long>{

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public Venda consultarComCollection(Long id);

}
