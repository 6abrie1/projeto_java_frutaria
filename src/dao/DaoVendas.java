package dao;

import java.sql.Connection;
import java.sql.SQLException;

import model.Venda;

public class DaoVendas {
    private Connection conexao;

    public DaoVendas() throws ClassNotFoundException,  SQLException{
        Conexao con = new Conexao();
        conexao = con.getConexao();
    }

    // public boolean AdicionarVenda(Venda Venda){
    //     boolean estado = false;
    //     String sql_code = "INSERT INDO `vendas` (``)";



    // }

    
    
}
