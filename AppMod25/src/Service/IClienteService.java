package Service;

import Domain.Cliente;
import Exceptions.KeyNotFound;

public interface IClienteService {
    Boolean cadastrar(Cliente cliente) throws KeyNotFound;

    void alterar(Cliente cliente)throws KeyNotFound;

    void excluir(Long cpf);

    Cliente buscarPorCPF(Long cpf);
}
