
package dao;

import TelaVendas.ModificadordeTabelaVenda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cliente;
import model.Produto;


public class DaoIntePv {
   
    private Connection conexao;

    public DaoIntePv() throws ClassNotFoundException, SQLException {
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
    
    public ModificadordeTabelaVenda ListaIntePvParaTabela() {
    ArrayList<Produto> resultadoLista = ListaIntePv();

    // Crie uma instância de ModificadordeTabelaVenda e passe a lista para o construtor
    ModificadordeTabelaVenda modificador = new ModificadordeTabelaVenda(resultadoLista);
    return modificador;
}

public ArrayList<Produto> ListaIntePv() {
    ArrayList<Produto> resultadoLista = new ArrayList<>();
    
    String sql = "select i.Id, v.id, c.nome, p.nome, v.data_venda, p.preco  from intePV i \n" +
"INNER JOIN vendas v on v.id = i.id_vendas\n" +
"INNER JOIN produtos p on p.id = i.id_produtos\n" +
"INNER JOIN clientes c on c.id = v.fk_cliente;";

    try (PreparedStatement stmt = conexao.prepareStatement(sql);
         ResultSet resultado = stmt.executeQuery()) {

        while (resultado.next()) {
            int id = resultado.getInt("i.Id");
            String nomeProduto = resultado.getString("p.nome");
            double preco = resultado.getDouble("p.preco");
            int quantidade = resultado.getInt("i.id");
            String nomeCliente = resultado.getString("c.nome");
            
            Produto produto = new Produto(id, nomeProduto, preco, quantidade, nomeCliente);
            resultadoLista.add(produto);
        }
    } catch (SQLException ex) {
        Logger.getLogger(DaoLogin.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    return resultadoLista;
}

     
     public ArrayList<Produto> PesquisarProdutos(Produto produto) throws SQLException {
    ArrayList<Produto> resultadoPesquisa = new ArrayList<>();

    String sql = "SELECT * FROM produtos WHERE `nome` = ? OR `categoria` = ?;";

    try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
        stmt.setString(1, produto.getNome());
        stmt.setString(2, produto.getCategoria());

        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                // Criar um novo objeto Produto com os dados do banco de dados
               
              int id =  rs.getInt("id");
              String  nome = rs.getString("nome");
              String categoria = rs.getString("categoria");
              Produto produtoEncontrado = new Produto(nome, 0, 0, categoria);
                // Adicionar o produto encontrado à lista de resultados
                resultadoPesquisa.add(produtoEncontrado);
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
    
    public String PesquisarID(String nome) throws ClassNotFoundException, SQLException {
    String sql = "SELECT id FROM produtos WHERE nome = ?";

    try(PreparedStatement stmt = conexao.prepareStatement(sql)){ 
    stmt.setString(1, nome);
    
    ResultSet rs = stmt.executeQuery();
    rs.next();
    
        String id =  rs.getString("id");

   return id;
   
   }}
    
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
