package br.com.Arthas.dao.generic;

import java.io.Serializable;

import br.com.Arthas.dao.Persistente;

public abstract class GenericJpaDb2DAO <T extends Persistente, E extends Serializable> extends GenericJpaDAO{

	public GenericJpaDb2DAO(Class<T> persistenteClass) {
		super(persistenteClass, "Banco2");
		// TODO Auto-generated constructor stub
	}

	
}
