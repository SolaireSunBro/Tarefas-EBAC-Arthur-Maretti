package dao;

import JDBC.ConnectionSingleton;
import domain.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements IClienteDAO {

    Connection connection;
    PreparedStatement stm;
    ResultSet rs;
    Cliente cliente;

    @Override
    public Integer cadastrar(Cliente cliente) {

        try{
            connection = ConnectionSingleton.getConnection();
            String sql = getSqlInsert();
            stm = connection.prepareStatement(sql);
            adicionarParametrosInsert(stm, cliente);
            return stm.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Integer atualizar(Cliente cliente) {
        try{
            connection = ConnectionSingleton.getConnection();
            String sql = getSqlUpdate();
            stm = connection.prepareStatement(sql);
            adicionarParametrosUpdate(stm, cliente);
            return stm.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public Cliente buscar(String codigo) throws SQLException {
        try{
            connection = ConnectionSingleton.getConnection();
            String sql = getSqlSelect();
            stm = connection.prepareStatement(sql);
            adicionarParametrosSelect(stm, codigo);
            rs =  stm.executeQuery();

            if (rs.next()) {
                cliente = new Cliente();
                Long id = rs.getLong("ID_CLIENTE");
                String nome = rs.getString("CLIENTE_NOME");
                String cd = rs.getString("CODIGO_CLIENTE");
                cliente.setId(id);
                cliente.setNome(nome);
                cliente.setCod(cd);
            }

        } catch(Exception e) {
            throw e;
        } finally {
            closeConnection(connection, stm, rs);
        }
        return cliente;
    }



    @Override
    public List<Cliente> buscarTodos() throws SQLException {
        List<Cliente> lista = new ArrayList<>();

        try{
            connection = ConnectionSingleton.getConnection();
            String sql = getSqlSelectAll();
            stm = connection.prepareStatement(sql);
            rs =  stm.executeQuery();

            while (rs.next()) {
                cliente = new Cliente();
                Long id = rs.getLong("ID_CLIENTE");
                String nome = rs.getString("CLIENTE_NOME");
                String cd = rs.getString("CODIGO_CLIENTE");
                cliente.setId(id);
                cliente.setNome(nome);
                cliente.setCod(cd);
                lista.add(cliente);
            }

        } catch(Exception e) {
            throw e;
        } finally {
            closeConnection(connection, stm, rs);
        }
        return lista;
    }


    @Override
    public Integer excluir(Cliente cliente) {

        try{
            connection = ConnectionSingleton.getConnection();
            String sql = getSqlDelete();
            stm = connection.prepareStatement(sql);
            adicionarParametrosDelete(stm, cliente);
            return stm.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private String getSqlInsert() {
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO TB_CLIENTE (ID_CLIENTE, CODIGO_CLIENTE, CLIENTE_NOME) ");
        sb.append("VALUES (nextval('cliente_count'),?,?)");
        return sb.toString();
    }

    private void adicionarParametrosInsert(PreparedStatement stm, Cliente cliente) throws SQLException {
        stm.setString(1, cliente.getCod());
        stm.setString(2, cliente.getNome());
    }

    private String getSqlUpdate() {
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE TB_CLIENTE ");
        sb.append("SET CLIENTE_NOME=?, CODIGO_CLIENTE=? ");
        sb.append("WHERE ID_CLIENTE = ?");
        return sb.toString();
    }

    private void adicionarParametrosUpdate(PreparedStatement stm, Cliente cliente) throws SQLException {

        stm.setString(1, cliente.getNome());
        stm.setString(2, cliente.getCod());
        stm.setLong(3, cliente.getId());

    }

    private String getSqlSelect() {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM TB_CLIENTE ");
        sb.append("WHERE CODIGO_CLIENTE = ?");
        return sb.toString();
    }

    private void adicionarParametrosSelect(PreparedStatement stm, String codigo) throws SQLException {

        stm.setString(1, codigo);
    }

    private String getSqlDelete() {
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM TB_CLIENTE ");
        sb.append("WHERE CODIGO_CLIENTE = ?");
        return sb.toString();
    }

    private void adicionarParametrosDelete(PreparedStatement stm, Cliente cliente) throws SQLException {

        stm.setString(1, cliente.getCod());
    }

    private String getSqlSelectAll() {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM TB_CLIENTE ");
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







