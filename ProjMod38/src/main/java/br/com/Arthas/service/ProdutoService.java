package br.com.Arthas.service;

import java.util.List;

import javax.inject.Inject;

import br.com.Arthas.dao.IProdutoDAO;
import br.com.Arthas.domain.Produto;
import br.com.Arthas.exceptions.DAOException;
import br.com.Arthas.exceptions.MaisDeUmRegistroException;
import br.com.Arthas.exceptions.TableException;
import br.com.Arthas.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, Long> implements IProdutoService {
	
	@Inject
	public ProdutoService(IProdutoDAO produtoDAO) {
		super(produtoDAO);
	}

	@Override
	public Produto buscarPorCodigo(Long codigo) throws DAOException {
		try {
			return this.dao.consultar(codigo);
		} catch (MaisDeUmRegistroException | TableException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Produto> filtrarProdutos(String query) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
