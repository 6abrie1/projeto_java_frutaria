package teste;


import java.sql.SQLException;
import projeto_java.Cliente;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModificadordeTabelaClientes extends AbstractTableModel {
    
    private String[] colunas = {"ID","NOME", "Endereço", "Telefone", "E-mail"};
    private ArrayList<Cliente> clientes;

    public ModificadordeTabelaClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public int getRowCount() {
        return clientes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente cliente = clientes.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return cliente.getId();
            case 1:
                return cliente.getNome();
            case 2:
                return cliente.getEndereco();
            case 3:
                return cliente.getTelefone();
            case 4:
                return cliente.getEmail();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
}
