/**
 * 
 */
package br.com.Arthas.dao;

import java.util.List;

import br.com.Arthas.dao.generic.GenericDAO;
import br.com.Arthas.domain.Cliente;

/**
 * @author rodrigo.pires
 *
 */
public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

	public ClienteDAO() {
		super(Cliente.class);
	}

	@Override
	public List<Cliente> filtrarClientes(String query) {
		// TODO Auto-generated method stub
		return null;
	}

}
