import dao.IProdutoDAO;
import dao.ProdutoDAO;
import domain.Cliente;
import domain.Produto;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ProdutoTest {

    IProdutoDAO produtoDAO;

    Produto produto;

    Produto produtoBD;

    @Test
    public void cadastroProdutoTest() throws Exception {
        produtoDAO = new ProdutoDAO();

        produto = new Produto();
        produto.setCod("123");
        produto.setNomeProd("ProdTeste");

        Integer count = produtoDAO.cadastrar(produto);
        assertTrue(count == 1);

        produtoBD = produtoDAO.buscar(produto.getCod());
        assertNotNull(produtoBD);
        assertNotNull(produtoBD.getCod());
        assertEquals(produtoBD.getNomeProd(),produto.getNomeProd());
        assertEquals(produtoBD.getCod(),produto.getCod());

        Integer qtdDel = produtoDAO.excluir(produtoBD);
        assertTrue(qtdDel == 1);

    }

    @Test
    public void updateProdutoTest() throws Exception{
        produtoDAO = new ProdutoDAO();

        produto = new Produto();
        produto.setCod("123");
        produto.setNomeProd("ProdTeste");

        Integer count = produtoDAO.cadastrar(produto);
        assertTrue(count == 1);

        produtoBD = produtoDAO.buscar(produto.getCod());
        assertNotNull(produtoBD);
        assertNotNull(produtoBD.getCod());
        assertEquals(produtoBD.getNomeProd(),produto.getNomeProd());
        assertEquals(produtoBD.getCod(),produto.getCod());

        produtoBD.setNomeProd("Atualizado");
        produtoBD.setCod("234");
        produtoDAO.atualizar(produtoBD);

        Integer qtdDel = produtoDAO.excluir(produtoBD);
        assertTrue(qtdDel == 1);

    }

    @Test
    public void buscarProdutoTest() throws Exception{
        produtoDAO = new ProdutoDAO();

        produto = new Produto();
        produto.setCod("123");
        produto.setNomeProd("ProdTeste");

        Integer count = produtoDAO.cadastrar(produto);
        assertTrue(count == 1);

        produtoBD = produtoDAO.buscar(produto.getCod());
        assertNotNull(produtoBD);
        assertNotNull(produtoBD.getCod());
        assertEquals(produtoBD.getNomeProd(),produto.getNomeProd());
        assertEquals(produtoBD.getCod(),produto.getCod());

        Integer qtdDel = produtoDAO.excluir(produtoBD);
        assertTrue(qtdDel == 1);
    }

    @Test
    public void excluirProdutoTest() throws Exception{
        produtoDAO = new ProdutoDAO();

        produto = new Produto();
        produto.setCod("123");
        produto.setNomeProd("ProdTeste");

        Integer count = produtoDAO.cadastrar(produto);
        assertTrue(count == 1);

        produtoBD = produtoDAO.buscar(produto.getCod());
        assertNotNull(produtoBD);
        assertNotNull(produtoBD.getCod());
        assertEquals(produtoBD.getNomeProd(),produto.getNomeProd());
        assertEquals(produtoBD.getCod(),produto.getCod());

        Integer qtdDel = produtoDAO.excluir(produtoBD);
        assertTrue(qtdDel == 1);
    }

    @Test
    public void buscarTdsProdutoTest() throws Exception{
        produtoDAO = new ProdutoDAO();

        produto = new Produto();
        produto.setCod("123");
        produto.setNomeProd("ProdTeste");

        Integer count = produtoDAO.cadastrar(produto);
        assertTrue(count == 1);

        produto = new Produto();
        produto.setCod("234");
        produto.setNomeProd("ProdTeste2");

        Integer count1 = produtoDAO.cadastrar(produto);
        assertTrue(count1 == 1);

        List<Produto> lista = produtoDAO.buscarTodos();
        assertNotNull(lista);
        assertEquals(2,lista.size());

        int qtdDel=0;
        for(Produto produto : lista){
            produtoDAO.excluir(produto);
            qtdDel++;
        }
        assertEquals(lista.size(), qtdDel);

        lista=produtoDAO.buscarTodos();
        assertEquals(lista.size(),0);
    }
}
