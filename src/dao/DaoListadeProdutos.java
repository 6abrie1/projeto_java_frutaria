
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import projeto_java.Produto;

/**
 *
 * @author gabri
 */
public class DaoListadeProdutos {
        private Connection conexao;
        private ArrayList resultadoLista;

    public DaoListadeProdutos() throws ClassNotFoundException, SQLException {
        Conexao com = new Conexao();
        conexao = com.getConexao();
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
