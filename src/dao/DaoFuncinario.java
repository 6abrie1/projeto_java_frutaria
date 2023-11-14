/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DaoFuncinario {
 
     private Connection conexao;
    
    public DaoFuncinario() throws ClassNotFoundException, SQLException {
        Conexao com = new Conexao();
        conexao = com.getConexao();
    }
    
    
    public boolean fazercadstro(String email,String usuario,String senha){
 
            boolean estado = false;
        String sql = "INSERT INTO `credencial` (`usuario`, `senha`, `email`) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, usuario);
            stmt.setString(2, senha);
            stmt.setString(3, email);
            
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

