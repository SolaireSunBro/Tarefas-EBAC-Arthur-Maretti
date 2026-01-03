/**
 * 
 */
package br.com.Arthas.service;

import br.com.Arthas.dao.generic.IGenericDAO;
import br.com.Arthas.domain.Venda;
import br.com.Arthas.exceptions.DAOException;
import br.com.Arthas.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author rodrigo.pires
 *
 */
public interface IVendaService extends IGenericDAO<Venda, Long>{

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

	public Venda consultarComCollection(Long id);

}
