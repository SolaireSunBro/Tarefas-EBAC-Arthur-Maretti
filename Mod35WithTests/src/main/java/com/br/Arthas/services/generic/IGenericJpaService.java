/**
 * 
 */
package com.br.Arthas.services.generic;

import java.io.Serializable;
import java.util.Collection;

import br.com.Arthas.dao.Persistente;
import br.com.Arthas.exceptions.DAOException;
import br.com.Arthas.exceptions.MaisDeUmRegistroException;
import br.com.Arthas.exceptions.TableException;
import br.com.Arthas.exceptions.TipoChaveNaoEncontradaException;


public interface IGenericJpaService <T extends Persistente, E extends Serializable> {
	
    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public void excluir(T entity) throws DAOException;

    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException;

    public Collection<T> buscarTodos() throws DAOException;

}
