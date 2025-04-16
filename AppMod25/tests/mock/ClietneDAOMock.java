package mock;

import DAO.IClienteDAO;
import Domain.Cliente;

public class ClietneDAOMock implements IClienteDAO {
    @Override
    public Boolean cadastrar(Cliente cliente) {
        return true;
    }

    @Override
    public void alterar(Cliente cliente) {

    }

    @Override
    public Cliente pesquisar(Long codigo) {
        Cliente cliente = new Cliente();
        cliente.setCpf(codigo);
        return cliente;
    }

    @Override
    public void excluir(Long codigo) {

    }

}
