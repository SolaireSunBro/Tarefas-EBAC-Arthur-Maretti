package Ebac.TDD.dao;

import java.nio.file.AccessDeniedException;

public class ContratoDao implements IContratoDao {

    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }

    @Override
    public void buscar() { throw new RuntimeException("Tempo excedido");

    }

    @Override
    public void excluir() { throw  new UnsupportedOperationException("Acesso negado");

    }

    @Override
    public void atualizar() { throw  new UnsupportedOperationException("Sem conexão com o servidor");

    }
}
