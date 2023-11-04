package teste;

import dao.DaoProdutos;
import java.sql.SQLException;
import projeto_java.Produto;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModificadordeTabelaProdutos extends AbstractTableModel {
    
    private String[] colunas = {"ID", "NOME", "PREÇO", "QUANTIDADE", "CATEGORIA"};
    private ArrayList<Produto> produtos;

    public ModificadordeTabelaProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public int getRowCount() {
        return produtos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto produto = produtos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return produto.getId();
            case 1:
                return produto.getNome();
            case 2:
                return produto.getPreco();
            case 3:
                return produto.getQuantidade();
            case 4:
                return produto.getCategoria();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
}



