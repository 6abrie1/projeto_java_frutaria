package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoLogin {
    private Connection conexao;

    public DaoLogin() throws ClassNotFoundException, SQLException {
        Conexao com = new Conexao();
        conexao = com.getConexao();
    }

    public boolean verificarLogin(String usuario, String senha) {
        boolean estado = false;
        String sql = "SELECT id FROM credencial WHERE usuario = ? AND senha = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, usuario);
            stmt.setString(2, senha);
            
            try (ResultSet resultado = stmt.executeQuery()) {
                if (resultado.next()) {
                    estado = true; // Encontrou correspondência de login.
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return estado;
    }
    
    public Integer obterIdUsuario(String usuario, String senha) {
    Integer idUsuario = null;
    String sql = "SELECT id FROM credencial WHERE usuario = ? AND senha = ?";

    try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
        stmt.setString(1, usuario);
        stmt.setString(2, senha);

        try (ResultSet resultado = stmt.executeQuery()) {
            if (resultado.next()) {
                idUsuario = resultado.getInt("id");
            }
        }
    } catch (SQLException ex) {
        Logger.getLogger(DaoLogin.class.getName()).log(Level.SEVERE, null, ex);
    }

    return idUsuario;
}
    
    public String obterCargoUsuario(String usuario, String senha) {
    String cargo = null;
    String sql = "SELECT cargo FROM credencial WHERE usuario = ? AND senha = ?";

    try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
        stmt.setString(1, usuario);
        stmt.setString(2, senha);

        try (ResultSet resultado = stmt.executeQuery()) {
            if (resultado.next()) {
                cargo = resultado.getString("cargo");
            }
        }
    } catch (SQLException ex) {
        Logger.getLogger(DaoLogin.class.getName()).log(Level.SEVERE, null, ex);
    }

    return cargo;
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
