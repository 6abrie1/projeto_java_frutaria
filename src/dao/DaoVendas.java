package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Venda;
import projeto_java.Cliente;

public class DaoVendas {
    private Connection conexao;

    public DaoVendas() throws ClassNotFoundException,  SQLException{
        Conexao con = new Conexao();
        conexao = con.getConexao();
    }

   public boolean AdicionarCliente(Venda venda) {
            boolean estado = false;
            String sql = "INSERT INTO `vendas` (``, `telefone`, `email`, `endereco`) VALUES (?, ?, ?, ?)";

            try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                stmt.setString(1, cliente.getNome());
                stmt.setString(2, cliente.getTelefone());
                stmt.setString(3, cliente.getEmail());
                stmt.setString(4, cliente.getEndereco());

                int linhasAfetadas = stmt.executeUpdate();

                if (linhasAfetadas > 0) {
                    System.out.println("Inserção bem-sucedida.");
                    estado = true;
                } else {
                    System.out.println("Nenhuma linha afetada.");
                }
            } catch (SQLException ex) {
                Logger.getLogger(DaoLogin.class.getName()).log(Level.SEVERE, null, ex);
            }

            return estado;
        

    
    
}
