package TelaVendas;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModificadordeTabelaVenda extends AbstractTableModel {
    private String[] colunas = {"ID", "NOME", "CATEGORIA"};
    private ArrayList<String[]> dados;

    public ModificadordeTabelaVenda(ArrayList<String[]> dados) {
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
        String[] linha = dados.get(rowIndex);
        return linha[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    // Método personalizado para adicionar uma nova linha à tabela
    public void addRow(String[] row) {
        dados.add(row);
        fireTableRowsInserted(getRowCount() - 1, getRowCount() - 1);
    }
}
