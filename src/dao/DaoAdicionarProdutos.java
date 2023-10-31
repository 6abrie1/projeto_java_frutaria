/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DaoAdicionarProdutos {
        private Connection conexao;
    
    public DaoAdicionarProdutos () throws ClassNotFoundException, SQLException {
        Conexao com = new Conexao();
        conexao = com.getConexao();
    }
    
    
    public boolean AdiconarProdutos(String nome,String categoria,int quantidade,double preco){
 
            boolean estado = false;
        String sql = "INSERT INTO `produtos` (`nome`, `categoria`, `quantidade`,`preco`) VALUES (?, ?, ?,?)";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, categoria);
            stmt.setInt(3, quantidade);
            stmt.setDouble(4, preco);
            
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
    
     public void fecharConexao() {
        try {
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
     } 
}
