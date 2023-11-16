
package dao;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cliente;
import model.Endereco;
import model.Produto;


public class DaoCliente {
    
    private Connection conexao;

    public DaoCliente() throws ClassNotFoundException, SQLException {
            Conexao com = new Conexao();
            conexao = com.getConexao();
        }


    public boolean AdicionarCliente(Cliente cliente) {
            boolean estado = false;
            String sql = "INSERT INTO `clientes` (`nome`, `telefone`, `email`, `endereco`) VALUES (?, ?, ?, ?)";

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
        String sql = "SELECT * FROM clientes;";

        try (PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet resultado = stmt.executeQuery()) {

            while (resultado.next()) {
                int id = resultado.getInt("id");
                String nome = resultado.getString("nome");
                String telefone = resultado.getString("telefone");
                String email = resultado.getString("email");
                String endereco = resultado.getString("endereco");



                Cliente cliente = new Cliente(id, nome, email, telefone, endereco);
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

    public Cliente obterClientePorId(int idCliente) throws ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM clientes WHERE id = ?;";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, idCliente);

            try (ResultSet resultado = stmt.executeQuery()) {
                if (resultado.next()) {
                    // Extrair os dados do cliente do resultado
                    String nome = resultado.getString("nome");
                    String email = resultado.getString("email");
                    String telefone = resultado.getString("telefone");
                    String endereco = resultado.getString("endereco");

                    // Criar e retornar um objeto Cliente
                    return new Cliente(idCliente, nome, email, telefone, endereco);
                }
            }
        } catch (SQLException ex) {
            // Log da exceção 
            ex.printStackTrace();
            throw ex; // Re-lança a exceção para sinalizar o erro ao chamador
        }

        return null;
    }
    public void AtualizarClinte(Cliente cliente) throws ClassNotFoundException, SQLException {
    String sql = "UPDATE clientes SET nome = ?, email = ?, telefone = ?, endereco = ? WHERE id = ?";

    try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
        stmt.setString(1, cliente.getNome());
        stmt.setString(2, cliente.getEmail());
        stmt.setString(3, cliente.getTelefone());
        stmt.setString(4, cliente.getEndereco());
        stmt.setInt(5, cliente.getId());

      int linhasAfetadas = stmt.executeUpdate();
      System.out.println("Linhas afetadas: " + linhasAfetadas);

    }
    }
   public String PesquisarID(String nome) throws ClassNotFoundException, SQLException {
    String sql = "SELECT id FROM clientes WHERE nome = ?";

    try(PreparedStatement stmt = conexao.prepareStatement(sql)){ 
    stmt.setString(1, nome);
    
    ResultSet rs = stmt.executeQuery();
    rs.next();
    
        String id =  rs.getString("id");

   return id;
   
   }
    
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
