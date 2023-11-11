
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import projeto_java.Produto;


public class DaoProduto {
   
        private Connection conexao;

    public DaoProduto() throws ClassNotFoundException, SQLException {
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
     
     
     
     public boolean RemoverProdutos(String nome,int id){
 
            boolean estado = false;
        String sql = "DELETE FROM produtos WHERE `id` = ? AND `nome` = ?;";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            
            stmt.setInt(1, id);
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
     
     
     
     
     
     public ArrayList<String> PesquisarProdutos(String nome, String categoria) throws SQLException {
        ArrayList<String> resultadoPesquisa = new ArrayList<>();

        String sql = "SELECT `nome`, `categoria` FROM produtos WHERE `nome` = ? AND `categoria` = ?;";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, categoria);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    // Obtenha os resultados da pesquisa e adicione-os à lista
                    String nomeProduto = rs.getString("nome");
                    String categoriaProduto = rs.getString("categoria");
                    resultadoPesquisa.add("Nome: " + nomeProduto + ", Categoria: " + categoriaProduto);
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
