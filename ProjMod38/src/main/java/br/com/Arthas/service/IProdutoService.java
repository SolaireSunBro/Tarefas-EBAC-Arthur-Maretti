package br.com.Arthas.service;

import java.util.List;

import br.com.Arthas.domain.Produto;
import br.com.Arthas.exceptions.DAOException;
import br.com.Arthas.services.generic.IGenericService;

public interface IProdutoService extends IGenericService<Produto, Long>{

	Produto buscarPorCodigo(Long codigo) throws DAOException;

	List<Produto> filtrarProdutos(String query);
}
