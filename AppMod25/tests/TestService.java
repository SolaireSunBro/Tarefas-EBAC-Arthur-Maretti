import DAO.IClienteDAO;
import Domain.Cliente;
import Exceptions.KeyNotFound;
import Service.ClienteService;
import Service.IClienteService;
import mock.ClietneDAOMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestService {

    private IClienteService clienteService;

    private Cliente cliente;

    public TestService() {
        IClienteDAO dao = new ClietneDAOMock();
        clienteService = new ClienteService(dao);
    }

    @Before
    public void init(){
        cliente = new Cliente();

        cliente.setNome("Nome");
        cliente.setCpf(12345678901L);
        cliente.setTel(11999999L);
        cliente.setEstado("Bahia");
        cliente.setCidade("Xique-Xique");
        cliente.setEnd("Rua X");
    }

    @Test
    public void cadastrar() throws KeyNotFound {
        boolean cad = clienteService.cadastrar(cliente);
        Assert.assertTrue(cad);

    }

    @Test
    public void alterar() throws KeyNotFound {
        cliente.setNome("Nome");
        clienteService.alterar(cliente);
        Assert.assertEquals("Nome", cliente.getNome());
    }

    @Test
    public void pesquisar(){
        Cliente cad = clienteService.buscarPorCPF((cliente.getCpf()));
        Assert.assertNotNull(cad);

    }

    @Test
    public void excluir(){
        clienteService.excluir(cliente.getCpf());

    }
}
