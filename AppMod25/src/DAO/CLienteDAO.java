package DAO;

import DAO.generics.GenericDAO;
import Domain.Cliente;

public class CLienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

    public CLienteDAO() {
        super();
    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualizarDados(Cliente entity, Cliente entityCadastrado) {
        entityCadastrado.setNome(entity.getNome());
        entityCadastrado.setCpf(entity.getCpf());
        entityCadastrado.setTel(entity.getTel());
        entityCadastrado.setCidade(entity.getCidade());
        entityCadastrado.setEnd(entity.getEnd());
        entityCadastrado.setEstado(entity.getEstado());

    }



}
