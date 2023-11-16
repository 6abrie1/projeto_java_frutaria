package projeto_java;

import TelaCliente.CadastroCliente;
import TelaCliente.EditarCliente;
import TelaProdutos.CadastrarProduto;
import TelaProdutos.CadastrarProduto;
import telas.Login;
import telas.TelaCliente;
import TelaProdutos.TelaProduto;
import dao.DaoCliente;
import java.sql.SQLException;


public class Principal {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    
        Login tela1 = new Login();
        tela1.setVisible(true);
        
        Cliente c = new Cliente(10, "", "", "", "");
        DaoCliente cd = new DaoCliente();
        cd.AtualizarProduto(c);
        
     
    }
       
       
        
       
        
}

