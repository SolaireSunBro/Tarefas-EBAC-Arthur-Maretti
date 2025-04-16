package Service.generics;

import Domain.Cliente;
import Exceptions.KeyNotFound;

public interface IGenericService<T, E> {

    Boolean cadastrar(T entity)throws KeyNotFound;

    void alterar(T entity)throws KeyNotFound;

    T pesquisar(E codigo)throws KeyNotFound;

    void excluir(E codigo);

}
