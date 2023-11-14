/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

/**
 *
 * @author gabri
 */

 

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import projeto_java.Produto;

public class ModificadordeTabelaVendas extends AbstractTableModel {

    private String[] colunas = {"Nome", "Preço"};
    private ArrayList<Produto> produtos;

    public ModificadordeTabelaVendas(ArrayList<Produto> produtos) {
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
                return produto.getNome();
            case 1:
                return produto.getPreco();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
}




