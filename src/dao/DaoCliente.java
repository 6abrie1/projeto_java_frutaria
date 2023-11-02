
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import projeto_java.Cliente;
import projeto_java.Produto;


public class DaoCliente {
     private Connection conexao;

    public DaoCliente() throws ClassNotFoundException, SQLException {
        Conexao com = new Conexao();
        conexao = com.getConexao();
    }
    
     public boolean AdiconarCliente(String nome,String telefone,String email){
 
            boolean estado = false;
        String sql = "INSERT INTO `clientes` (`nome`, `telefone`, `email`) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, telefone);
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
     
     
     
     public boolean RemoverCliente(String nome,String email){
 
            boolean estado = false;
        String sql = "DELETE FROM clientes WHERE `email` = ? AND `nome` = ?;";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            
            stmt.setString(1, email);
            stmt.setString(2, nome);
            
            int linhasAfetadas = stmt.executeUpdate();
    
    if (linhasAfetadas > 0) {
        System.out.println("Removido com bem-sucedida.");
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
     
     
     public ArrayList<Cliente> ListaClientes() {
         ArrayList<Cliente> resultadoLista = new ArrayList<>();
         String sql = "SELECT * FROM clientes ;";

     try (PreparedStatement stmt = conexao.prepareStatement(sql);
         ResultSet resultado = stmt.executeQuery()) {

        while (resultado.next()) {
            int id = resultado.getInt("id");
            String nome = resultado.getString("nome");
            String telefone = resultado.getString("telefone");
            String email = resultado.getString("email");
       
            
            // Recupere os valores restantes das colunas que você precisa da tabela.

            Cliente cliente = new Cliente(nome, email, telefone);//precisar pegar os valores do endereco no tabela de endereco.
            
            resultadoLista.add(cliente);
        }
    } catch (SQLException ex) {
        Logger.getLogger(DaoLogin.class.getName()).log(Level.SEVERE, null, ex);
    }
            return resultadoLista;
}
     
     
     
     
     
     public ArrayList<String> PesquisarClientes(String nome, String email) throws SQLException {
        ArrayList<String> resultadoPesquisa = new ArrayList<>();

        String sql = "SELECT `nome`, `email` FROM clientes WHERE `nome` = ? AND `email` = ?;";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, email);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    // Obtenha os resultados da pesquisa e adicione-os à lista
                    String nomeCliente = rs.getString("nome");
                    String emailClinte = rs.getString("email");
                    resultadoPesquisa.add("Nome: " + nomeCliente + ", Email: " + emailClinte);
                }
            }
        }

        conexao.close();
        return resultadoPesquisa;
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
