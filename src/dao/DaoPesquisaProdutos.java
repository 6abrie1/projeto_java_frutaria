
import dao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoPesquisaProdutos {
    private Connection conexao;

    public DaoPesquisaProdutos() throws ClassNotFoundException, SQLException {
        Conexao com = new Conexao();
        conexao = com.getConexao();
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
}
