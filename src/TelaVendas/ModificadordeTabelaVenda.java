package TelaVendas;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import model.Produto;

public class ModificadordeTabelaVenda extends AbstractTableModel {
    private String[] colunas = {"ID", "Nome Produto", "Preço", "Quantidade", "Nome Cliente"};
    private ArrayList<Produto> dados;

    public ModificadordeTabelaVenda(ArrayList<Produto> dados) {
        this.dados = dados;
    }

    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto produto = dados.get(rowIndex);

        switch (columnIndex) {
            case 0: // ID
                return produto.getId();
            case 1: // Nome Produto
                return produto.getNome();
            case 2: // Preço
                return produto.getPreco();
            case 3: // Quantidade
                return produto.getQuantidade();
            case 4: // Nome Cliente
                return produto.getCategoria(); // Acessando o nome do cliente associado ao produto
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
}
