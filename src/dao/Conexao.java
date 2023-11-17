package dao;


import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;


public class Conexao {
    String url ="jdbc:mysql://localhost:3307/projeto_java";
    String usuario = "root";
    String senha = "";
    Connection conexao;
public Connection getConexao() throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.cj.jdbc.Driver");
    conexao = DriverManager.getConnection(url, usuario, senha); 
    return conexao;
}


}
