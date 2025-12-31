/**
 * 
 */
package com.br.Arthas.services;

import com.br.Arthas.services.generic.GenericJpaService;

import br.com.Arthas.dao.IClienteDAO;
import br.com.Arthas.domain.Cliente;
import br.com.Arthas.exceptions.DAOException;
import br.com.Arthas.exceptions.MaisDeUmRegistroException;
import br.com.Arthas.exceptions.TableException;

/**
 * @author rodrigo.pires
 *
 */
public class ClienteService extends GenericJpaService<Cliente, Long> implements IClienteService {
	
	//private IClienteDAO clienteDAO;
	
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
		//this.clienteDAO = clienteDAO;
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	

}
