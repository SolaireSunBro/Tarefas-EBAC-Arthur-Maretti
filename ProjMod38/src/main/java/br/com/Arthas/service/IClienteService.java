/**
 * 
 */
package br.com.Arthas.service;

import java.util.List;

import br.com.Arthas.domain.Cliente;
import br.com.Arthas.exceptions.DAOException;
import br.com.Arthas.services.generic.IGenericService;

/**
 * @author rodrigo.pires
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
