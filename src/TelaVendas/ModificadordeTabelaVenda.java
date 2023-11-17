package TelaVendas;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import model.IntePv;
import model.Produto;

public class ModificadordeTabelaVenda extends AbstractTableModel {
    private String[] colunas = {"ID", "CLIENTE", "NOME", "DATA DA VENDA", "PRECO", "QUANTIDADE"};
    private ArrayList<IntePv> dados;

    public ModificadordeTabelaVenda(ArrayList<IntePv> dado) {
        this.dados = dado;
    }

    ModificadordeTabelaVenda(ArrayList<Produto> listaDeProdutos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        IntePv linha = dados.get(rowIndex);
        return linha;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    // Método personalizado para adicionar uma nova linha à tabela
//    public void addRow(String[] row) {
//        dados.add(row);
//        fireTableRowsInserted(getRowCount() - 1, getRowCount() - 1);
//    }
}
