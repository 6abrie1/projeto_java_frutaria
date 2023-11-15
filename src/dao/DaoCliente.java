
package dao;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import projeto_java.Cliente;
import projeto_java.Endereco;


public class DaoCliente {
     private Connection conexao;

    public DaoCliente() throws ClassNotFoundException, SQLException {
        Conexao com = new Conexao();
        conexao = com.getConexao();
    }
    
     public byte[] converterParaBytes(Endereco endereco) {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(endereco);
            return bos.toByteArray();
        } catch (IOException ex) {
            Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean AdicionarCliente(Cliente cliente) {
        boolean estado = false;
        String sql = "INSERT INTO `clientes` (`nome`, `telefone`, `email`, `endereco`) VALUES (?, ?, ?, ?)";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getTelefone());
            stmt.setString(3, cliente.getEmail());
            // Serializa o objeto Endereco antes de armazená-lo no banco de dados
            byte[] enderecoSerializado = converterParaBytes(cliente.getEndereco());
            stmt.setBytes(4, enderecoSerializado);

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
     
     
     
     public boolean RemoverCliente(Cliente clientes){
 
            boolean estado = false;
        String sql = "DELETE FROM clientes WHERE `id` = ? ;";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            
            stmt.setInt(1, clientes.getId());
            
            
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

            Cliente cliente = new Cliente(id, nome, email, telefone);//precisar pegar os valores do endereco no tabela de endereco.
            
            resultadoLista.add(cliente);
        }
    } catch (SQLException ex) {
        Logger.getLogger(DaoLogin.class.getName()).log(Level.SEVERE, null, ex);
    }
            return resultadoLista;
}
     
     
     
     
     
     public ArrayList<String> PesquisarClientes(Cliente clientes) throws SQLException {
        ArrayList<String> resultadoPesquisa = new ArrayList<>();

        String sql = "SELECT * FROM clientes WHERE `nome` = ? OR `email` = ?;";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, clientes.getNome());
            stmt.setString(2, clientes.getEmail());
            
            

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    // Obtenha os resultados da pesquisa e adicione-os à lista
                    String idClieString = rs.getString("id");
                    String nomeCliente = rs.getString("nome");
                    String emailClinte = rs.getString("email");
                    resultadoPesquisa.add("ID"+"Nome: " + nomeCliente + ", Email: " + emailClinte);
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
