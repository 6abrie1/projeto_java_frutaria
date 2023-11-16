package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Venda;
import model.Cliente;

public class DaoVendas {
    private Connection conexao;

    public DaoVendas() throws ClassNotFoundException,  SQLException{
        Conexao con = new Conexao();
        conexao = con.getConexao();
    }

}
