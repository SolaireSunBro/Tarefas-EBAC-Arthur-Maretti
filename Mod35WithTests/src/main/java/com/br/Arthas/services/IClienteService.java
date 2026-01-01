/**
 * 
 */
package com.br.Arthas.services;

import com.br.Arthas.services.generic.IGenericJpaService;

import br.com.Arthas.domain.Cliente;
import br.com.Arthas.exceptions.DAOException;


public interface IClienteService extends IGenericJpaService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;


}
