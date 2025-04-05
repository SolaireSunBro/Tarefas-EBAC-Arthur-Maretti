package TDDTests;

import Ebac.TDD.dao.ContratoDao;
import Ebac.TDD.dao.IContratoDao;
import Ebac.TDD.dao.mock.ContratoDaoMock;
import Ebac.TDD.service.ContratoService;
import Ebac.TDD.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;


public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    //TODO
    //Fazer métodos de buscar, excluir e atualizar

    @Test
    public void buscarTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService serv = new ContratoService(dao);
        String busca = serv.buscar();
        Assert.assertEquals("Busca Concluída",busca);

    }
    @Test(expected = RuntimeException.class)
    public void ExceptionBuscar(){
        IContratoDao dao = new ContratoDao();
        IContratoService serv = new ContratoService(dao);
        String busca = serv.buscar();
        Assert.assertEquals("Busca Concluída",busca);

    }

    @Test
    public void excluirTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService serv = new ContratoService(dao);
        String ex = serv.excluir();
        Assert.assertEquals("Excluído com sucesso",ex);

    }
    @Test(expected = UnsupportedOperationException.class)
    public void ExceptionExcluir(){
        IContratoDao dao = new ContratoDao();
        IContratoService serv = new ContratoService(dao);
        String ex = serv.excluir();
        Assert.assertEquals("Excluído com sucesso",ex);

    }

    @Test
    public void atualizarTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService serv = new ContratoService(dao);
        String ex = serv.atualizar();
        Assert.assertEquals("Atualizado com sucesso",ex);

    }
    @Test(expected = UnsupportedOperationException.class)
    public void ExceptionAtualizar(){
        IContratoDao dao = new ContratoDao();
        IContratoService serv = new ContratoService(dao);
        String ex = serv.atualizar();
        Assert.assertEquals("Atualizado com sucesso",ex);

    }
}
