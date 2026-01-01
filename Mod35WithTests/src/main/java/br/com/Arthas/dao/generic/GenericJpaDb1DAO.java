package br.com.Arthas.dao.generic;

import java.io.Serializable;

import br.com.Arthas.dao.Persistente;

public abstract class GenericJpaDb1DAO <T extends Persistente, E extends Serializable> extends GenericJpaDAO{

	public GenericJpaDb1DAO(Class<T> persistenteClass) {
		super(persistenteClass, "ExemploJPA");
		// TODO Auto-generated constructor stub
	}

	
}
