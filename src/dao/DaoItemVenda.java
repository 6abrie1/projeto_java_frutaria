package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import java.util.ArrayList;




import model.ItemVenda;



public class DaoItemVenda {
    private Connection conexao;

    public void DaoCliente() throws ClassNotFoundException, SQLException{
        Conexao com = new Conexao();
        conexao = com.getConexao();
    }

    public boolean AdicionarItemVenda(ItemVenda itemVenda){
        boolean estado = false;
        String sql = "INSERT INTO `item_venda` (`quantidade`, `valor_unitario`, `produto_id`, `venda_id`) VALUES (?,?,?,?)";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, String.valueOf(itemVenda.getQuantidade()));
            stmt.setString(2, String.valueOf(itemVenda.getValorUnitario()));
            stmt.setString(3, String.valueOf(itemVenda.getIdProduto()));
            stmt.setString(4, String.valueOf(itemVenda.getIdVenda()));
           
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

        // public List<ItemVenda> listarItensDeVenda(int idVenda){
        //     List<ItemVenda> lsitaItemVendas = new ArrayList();
        //     String sql = "SELECT * FROM t";
        // }


    }
    

