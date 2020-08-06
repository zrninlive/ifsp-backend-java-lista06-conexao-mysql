package util;

import java.sql.Connection;
import java.sql.SQLException;
import com.mysql.cj.jdbc.MysqlDataSource;

public class ConexaoBanco {

    private Connection conexao = null;
    private final String BANCO = "dbteste";   //troque pelo nome do seu database
    private final String LOGIN = "usuario";   //use o usuário do banco (default: root)
    private final String SENHA = "1234";      //se estiver sem senha deixe vazio: ""
    private final String HOST = "172.17.0.2"; //se o mysql estiver rodando localmente, use "localhost"

    public Connection getConnection() {

        try {
            MysqlDataSource ds = new MysqlDataSource();
            ds.setServerName(HOST);
            ds.setDatabaseName(BANCO);
            ds.setUser(LOGIN);
            ds.setPassword(SENHA);

            ds.setConnectTimeout(2000);

            conexao = ds.getConnection();
            System.out.println("CONECTADO AO BANCO DE DADOS.");
        }
        catch (SQLException sqlerror) {
            System.out.println("FALHA NA CONEXÃO: " + sqlerror.getMessage());
        }       

        return conexao;
    }
    
}