/**
 * 
 */
package br.com.Arthas.dao;

import br.com.Arthas.dao.generic.IGenericJpaDAO;
import br.com.Arthas.domain.Cliente;

public interface IClienteDAO<T extends Persistente> extends IGenericJpaDAO<T, Long>{

}
