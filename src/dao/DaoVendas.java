package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Venda;
import model.Cliente;
import model.Produto;

public class DaoVendas {
    private Connection conexao;

    public DaoVendas() throws ClassNotFoundException,  SQLException{
        Conexao con = new Conexao();
        conexao = con.getConexao();
    }
public boolean AdiconarProdutos(Venda venda){
 
        boolean estado = false;
        String sql = "INSERT INTO `produtos` (`nome`, `categoria`, `quantidade`,`preco`) VALUES (?, ?, ?,?)";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, venda.getId_cliente());
            stmt.setString(2, venda.getDataVenda());
            stmt.setInt(3, venda.getId_intePv());
            stmt.setInt(4, venda.getId_vendas());
            
            int linhasAfetadas = stmt.executeUpdate();
    
    if (linhasAfetadas > 0) {
        System.out.println("Inserção bem-sucedida.");
        estado = true ;
        stmt.close();
    } else {
        System.out.println("Nenhuma linha afetada.");
    }
        } catch (SQLException ex) {
            Logger.getLogger(DaoLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return estado;
    }
}
