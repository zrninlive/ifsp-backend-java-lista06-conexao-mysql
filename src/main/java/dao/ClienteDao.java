package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Cliente;

import util.ConexaoBanco;

public class ClienteDao {

    private Connection con;

    public ClienteDao() {
        this.con = new ConexaoBanco().getConnection();
    }

    // Cadastro:
    public void registrar(Cliente c) throws SQLException {

        String query;
        query = "INSERT INTO tb_clientes (nome, endereco, telefone, cep) VALUES (?, ?, ?, ?);";

        PreparedStatement st = con.prepareStatement(query);

        st.setString(1, c.getNome());
        st.setString(2, c.getEndereco());
        st.setString(3, c.getTelefone());
        st.setString(4, c.getCep());

        st.execute();
        st.close();

        con.close();
    }

    public List<Cliente> list() throws SQLException, Exception {
        List<Cliente> list = new ArrayList<Cliente>();
        String query = "SELECT * FROM tb_clientes";

        PreparedStatement st = con.prepareStatement(query);

        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            Cliente client = new Cliente();

            client.setId(rs.getInt("id"));
            client.setNome(rs.getString("nome"));
            client.setEndereco(rs.getString("endereco"));
            client.setCep(rs.getString("cep"));
            client.setTelefone(rs.getString("telefone"));

            list.add(client);
        }

        return list;
    }

}