
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


public class DaoProduto {
   
    private Connection conexao;

    public DaoProduto() throws ClassNotFoundException, SQLException {
        Conexao com = new Conexao();
        conexao = com.getConexao();
    }
    
    public boolean AdiconarProdutos(Produto produto){
 
        boolean estado = false;
        String sql = "INSERT INTO `produtos` (`nome`, `categoria`, `quantidade`,`preco`) VALUES (?, ?, ?,?)";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getCategoria());
            stmt.setInt(3, produto.getQuantidade());
            stmt.setDouble(4, produto.getPreco());
            
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
     
    public boolean RemoverProdutos(Produto produto){
 
        boolean estado = false;
        String sql = "DELETE FROM produtos WHERE `id` = ? ;";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            
                    stmt.setInt(1,produto.getId() );
            
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
    
    public ArrayList<Produto> ListaProdutos() {
         ArrayList<Produto> resultadoLista = new ArrayList<>();
         String sql = "SELECT * FROM produtos;";

     try (PreparedStatement stmt = conexao.prepareStatement(sql);
         ResultSet resultado = stmt.executeQuery()) {

        while (resultado.next()) {
            int id = resultado.getInt("id");
            String nome = resultado.getString("nome");
            double preco = resultado.getDouble("preco");
            int quantidade = resultado.getInt("quantidade");
            String categoria = resultado.getString("categoria");
            
            // Recupere os valores restantes das colunas que você precisa da tabela.

    
            Produto produto = new Produto(id, nome, preco, quantidade, categoria);
            resultadoLista.add(produto);
        }
    } catch (SQLException ex) {
        Logger.getLogger(DaoLogin.class.getName()).log(Level.SEVERE, null, ex);
    }
            return resultadoLista;
}
     
     public ArrayList<String> PesquisarProdutos(Produto produto) throws SQLException {
        ArrayList<String> resultadoPesquisa = new ArrayList<>();

        String sql = "SELECT * FROM produtos WHERE `nome` = ? OR `categoria` = ?;";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getCategoria());

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    // Obtenha os resultados da pesquisa e adicione-os à lista
                    String idProdutoString = rs.getString("id");
                    String nomeProduto = rs.getString("nome");
                    String categoriaProduto = rs.getString("categoria");
                    resultadoPesquisa.add("\nID: "+ idProdutoString +"\nNome: " + nomeProduto + "\nCategoria: " + categoriaProduto);
                }
            }
        }

        conexao.close();
        return resultadoPesquisa;
    }
     
    public void AtualizarProduto(Produto produto) throws ClassNotFoundException, SQLException {
    String sql = "UPDATE produtos SET nome = ?, categoria = ?, quantidade = ?, preco = ? WHERE id = ?";

    try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
        stmt.setString(1, produto.getNome());
        stmt.setString(2, produto.getCategoria());
        stmt.setInt(3, produto.getQuantidade());
        stmt.setDouble(4, produto.getPreco());
        stmt.setInt(5, produto.getId());

      int linhasAfetadas = stmt.executeUpdate();
      System.out.println("Linhas afetadas: " + linhasAfetadas);

    }
}
    
    public Produto obterProdutoPorId(int id) throws ClassNotFoundException, SQLException {
        Produto produto = null;
        String sql = "SELECT * FROM produtos WHERE id = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);

            try (ResultSet resultado = stmt.executeQuery()) {
                if (resultado.next()) {
                  
                    String nome = resultado.getString("nome"); 
                    double preco = resultado.getDouble("preco"); 
                    int quantidade = resultado.getInt("quantidade"); 
                    String categoria = resultado.getString("categoria"); 

                   
                    produto = new Produto(nome, preco, quantidade, categoria);
                    produto.setId(id); // Defina o ID do produto com o ID fornecido
                }
            }
        }

        return produto;
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
