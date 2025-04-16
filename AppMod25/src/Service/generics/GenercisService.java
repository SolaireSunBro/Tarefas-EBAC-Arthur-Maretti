package Service.generics;


import DAO.generics.IGenericDAO;
import Exceptions.KeyNotFound;

public abstract class GenercisService<T,E> implements IGenericService<T,E> {

    protected IGenericDAO<T,E> dao;

    public GenercisService (IGenericDAO<T,E> dao){
        this.dao = dao;

    }

    @Override
    public Boolean cadastrar(T entity)throws KeyNotFound{
        return dao.cadastrar(entity);
    }

    @Override
    public void excluir(E valor) {
        this.dao.excluir(valor);
    }

    @Override
    public void alterar(T entity) throws KeyNotFound {
        this.dao.alterar(entity);
    }

    @Override
    public T pesquisar(E valor) throws KeyNotFound{
        return this.dao.pesquisar(valor);
    }

}
