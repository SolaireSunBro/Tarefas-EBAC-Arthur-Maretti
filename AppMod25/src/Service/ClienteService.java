package Service;

import DAO.IClienteDAO;
import Domain.Cliente;
import Service.generics.GenercisService;

public class ClienteService extends GenercisService<Cliente, Long> implements IClienteService{


    public ClienteService(IClienteDAO dao) {
       super(dao);
    }


    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return this.dao.pesquisar(cpf);
    }
}
