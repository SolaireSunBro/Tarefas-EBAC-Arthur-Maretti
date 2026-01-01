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
public class ClienteDAO2 extends GenericJpaDAO<Cliente, Long> implements IClienteDAO<Cliente> {

	public ClienteDAO2() {
		super(Cliente.class);
	}

}
