/**
 * 
 */
package br.com.Arthas.dao;

import java.util.List;



import br.com.Arthas.dao.generic.IGenericDAO;
import br.com.Arthas.domain.Cliente;

/**
 * @author rodrigo.pires
 *
 */
public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);
}
