import DAO.CLienteDAO;
import DAO.IClienteDAO;
import Domain.Cliente;
import Exceptions.KeyNotFound;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ClienteDaoTest {

    private IClienteDAO clienteDao;

    private Cliente cliente;

    public ClienteDaoTest() {
        clienteDao = new CLienteDAO();
    }

    @Before
    public void init() throws KeyNotFound {
        cliente = new Cliente();

        cliente.setNome("Nome");
        cliente.setCpf(12312312312L);
        cliente.setEstado("Bahia");
        cliente.setCidade("Xique-Xique");
        cliente.setEnd("Rua X");
        cliente.setTel(1199999999L);

        clienteDao.cadastrar(cliente);
    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteDao.pesquisar(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws KeyNotFound {
        cliente.setCpf(56565656565L);
        Boolean retorno = clienteDao.cadastrar(cliente);
        assertTrue(retorno);
    }


    @Test
    public void excluirCliente() {
        clienteDao.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws KeyNotFound {
        cliente.setNome("Rodrigo Pires");
        clienteDao.alterar(cliente);
        Assert.assertEquals("Rodrigo Pires", cliente.getNome());
    }

}