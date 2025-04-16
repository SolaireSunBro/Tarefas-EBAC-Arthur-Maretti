package DAO.generics;

import Exceptions.KeyNotFound;

public interface IGenericDAO<T,E>{

     Boolean cadastrar(T entity) throws KeyNotFound;

     void alterar(T entity) throws KeyNotFound;

     T pesquisar (E codigo);

     void excluir(E codigo);
}
