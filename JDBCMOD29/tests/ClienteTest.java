import dao.ClienteDAO;
import dao.IClienteDAO;
import domain.Cliente;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ClienteTest {

    private IClienteDAO clientedao;

    private Cliente cliente;

    private Cliente clientebd;

    @Test
    public void cadastroTest() throws Exception {

        clientedao = new ClienteDAO();

        cliente = new Cliente();
        cliente.setNome("NomeTeste");
        cliente.setCod("234");

        Integer count = clientedao.cadastrar(cliente);
        assertTrue(count == 1);

        clientebd = clientedao.buscar(cliente.getCod());
        assertNotNull(clientebd);
        assertNotNull(clientebd.getId());
        assertEquals(cliente.getCod(), clientebd.getCod());
        assertEquals(cliente.getNome(), clientebd.getNome());

        Integer qtdDel = clientedao.excluir(clientebd);
        assertNotNull(qtdDel);


    }

    @Test
    public void updateTest() throws Exception{
        clientedao = new ClienteDAO();

        cliente = new Cliente();
        cliente.setNome("NomeTeste");
        cliente.setCod("234");
        cliente.setId(1L);

        Integer count = clientedao.cadastrar(cliente);
        assertTrue(count == 1);

        clientebd = clientedao.buscar(cliente.getCod());
        assertNotNull(clientebd);

        clientebd.setCod("123");
        clientebd.setNome("Atualizado");
        Integer countAtt = clientedao.atualizar(clientebd);
        assertTrue(countAtt == 1);

        Integer qtdDel = clientedao.excluir(clientebd);
        assertNotNull(qtdDel);
    }
    @Test
    public void buscarTest() throws Exception {
        clientedao = new ClienteDAO();

        cliente = new Cliente();
        cliente.setNome("NomeTeste");
        cliente.setCod("234");

        Integer count = clientedao.cadastrar(cliente);
        assertTrue(count == 1);

        clientebd = clientedao.buscar(cliente.getCod());
        assertNotNull(clientebd);
        assertNotNull(clientebd.getId());
        assertEquals(cliente.getCod(), clientebd.getCod());
        assertEquals(cliente.getNome(), clientebd.getNome());

        Integer qtdDel = clientedao.excluir(clientebd);
        assertNotNull(qtdDel);

    }

    @Test
    public void excluirTest() throws Exception {
        clientedao = new ClienteDAO();

        cliente = new Cliente();
        cliente.setNome("NomeTeste");
        cliente.setCod("234");

        Integer count = clientedao.cadastrar(cliente);
        assertTrue(count == 1);

        clientebd = clientedao.buscar(cliente.getCod());
        assertNotNull(clientebd);
        assertNotNull(clientebd.getId());
        assertEquals(cliente.getCod(), clientebd.getCod());
        assertEquals(cliente.getNome(), clientebd.getNome());

        Integer qtdDel = clientedao.excluir(clientebd);
        assertNotNull(qtdDel);

    }

    @Test
    public void buscarTdsTeste() throws Exception {

        clientedao = new ClienteDAO();

        cliente = new Cliente();
        cliente.setNome("NomeTeste1");
        cliente.setCod("234");
        Integer count1 = clientedao.cadastrar(cliente);
        assertTrue(count1 == 1);

        cliente = new Cliente();
        cliente.setNome("NomeTeste2");
        cliente.setCod("456");
        Integer count2 = clientedao.cadastrar(cliente);
        assertTrue(count2 == 1);

        List<Cliente> lista = clientedao.buscarTodos();
        assertNotNull(lista);
        assertEquals(2,lista.size());

        int qtdDel=0;
        for(Cliente cliente : lista){
            clientedao.excluir(cliente);
            qtdDel++;
        }
        assertEquals(lista.size(), qtdDel);

        lista=clientedao.buscarTodos();
        assertEquals(lista.size(),0);
    }
}
