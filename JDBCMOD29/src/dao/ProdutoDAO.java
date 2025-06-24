package dao;

import JDBC.ConnectionSingleton;
import domain.Cliente;
import domain.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO implements IProdutoDAO{

    Connection connection;
    PreparedStatement stm;
    ResultSet rs;
    Produto produto;

    @Override
    public Integer cadastrar(Produto produto) throws SQLException {
        try{
            connection = ConnectionSingleton.getConnection();
            String sql = getSqlInsert();
            stm = connection.prepareStatement(sql);
            adicionarParametrosInsert(stm, produto);
            return stm.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Integer atualizar(Produto produto) throws SQLException {
        try{
            connection = ConnectionSingleton.getConnection();
            String sql = getSqlUpdate();
            stm = connection.prepareStatement(sql);
            adicionarParametrosUpdate(stm, produto);
            return stm.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Produto buscar(String codigo) throws SQLException {
        try {
            connection = ConnectionSingleton.getConnection();
            String sql = getSqlSelect();
            stm = connection.prepareStatement(sql);
            adicionarParametrosSelect(stm, codigo);
            rs = stm.executeQuery();

            if (rs.next()) {
                produto = new Produto();
                Long id = rs.getLong("ID_PRODUTO");
                String nome = rs.getString("PRODUTO_NOME");
                String cd = rs.getString("CODIGO_PRODUTO");
                produto.setIdProd(id);
                produto.setNomeProd(nome);
                produto.setCod(cd);
            }

        }catch(Exception e) {
            throw e;
        } finally {
            closeConnection(connection, stm, rs);
        }
        return produto;
    }


    @Override
    public List<Produto> buscarTodos() throws SQLException {
        List<Produto> lista = new ArrayList<>();

        try{
            connection = ConnectionSingleton.getConnection();
            String sql = getSqlSelectAll();
            stm = connection.prepareStatement(sql);
            rs =  stm.executeQuery();

            while (rs.next()) {
                produto = new Produto();
                Long id = rs.getLong("ID_PRODUTO");
                String nome = rs.getString("PRODUTO_NOME");
                String cd = rs.getString("CODIGO_PRODUTO");
                produto.setIdProd(id);
                produto.setNomeProd(nome);
                produto.setCod(cd);
                lista.add(produto);
            }

        } catch(Exception e) {
            throw e;
        } finally {
            closeConnection(connection, stm, rs);
        }
        return lista;

    }

    @Override
    public Integer excluir(Produto produto) throws SQLException {
        try{
            connection = ConnectionSingleton.getConnection();
            String sql = getSqlDelete();
            stm = connection.prepareStatement(sql);
            adicionarParametrosDelete(stm, produto);
            return stm.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private String getSqlInsert() {
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO TB_PRODUTO (ID_PRODUTO, CODIGO_PRODUTO, PRODUTO_NOME) ");
        sb.append("VALUES (nextval('produto_count'),?,?)");
        return sb.toString();
    }

    private void adicionarParametrosInsert(PreparedStatement stm, Produto produto) throws SQLException {
        stm.setString(1, produto.getCod());
        stm.setString(2, produto.getNomeProd());
    }

    private String getSqlUpdate() {
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE TB_PRODUTO ");
        sb.append("SET PRODUTO_NOME=?, CODIGO_PRODUTO=? ");
        sb.append("WHERE ID_PRODUTO = ?");
        return sb.toString();
    }

    private void adicionarParametrosUpdate(PreparedStatement stm, Produto produto) throws SQLException {

        stm.setString(1, produto.getNomeProd());
        stm.setString(2, produto.getCod());
        stm.setLong(3, produto.getIdProd());

    }

    private String getSqlSelect() {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM TB_PRODUTO ");
        sb.append("WHERE CODIGO_PRODUTO = ?");
        return sb.toString();
    }

    private void adicionarParametrosSelect(PreparedStatement stm, String codigo) throws SQLException {

        stm.setString(1, codigo);
    }

    private String getSqlDelete() {
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM TB_PRODUTO ");
        sb.append("WHERE CODIGO_PRODUTO = ?");
        return sb.toString();
    }

    private void adicionarParametrosDelete(PreparedStatement stm, Produto produto) throws SQLException {

        stm.setString(1, produto.getCod());
    }

    private String getSqlSelectAll() {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM TB_PRODUTO ");
        return sb.toString();
    }










    private void closeConnection(Connection connection, PreparedStatement stm, ResultSet rs) {
        try {
            if (rs != null && !rs.isClosed()) {
                rs.close();
            }
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }

}

