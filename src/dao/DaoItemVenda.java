package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import java.util.ArrayList;


import model.IntePv;



public class DaoItemVenda {
    private Connection conexao;

    public void DaoCliente() throws ClassNotFoundException, SQLException{
        Conexao com = new Conexao();
        conexao = com.getConexao();
    }

  
}
    

