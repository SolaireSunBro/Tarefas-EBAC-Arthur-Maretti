/**
 * 
 */
package br.com.Arthas.dao;

import br.com.Arthas.dao.generic.GenericJpaDAO;
import br.com.Arthas.domain.Cliente;

/**
 * @author rodrigo.pires
 *
 */
public class ClienteDAO extends GenericJpaDAO<Cliente, Long> implements IClienteDAO {

	public ClienteDAO() {
		super(Cliente.class);
	}

}
