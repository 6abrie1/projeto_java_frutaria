package projeto_java;



import dao.DaoCliente;
import dao.DaoProdutos;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import telas.TeladeLogin;
import teste.TelaProdutos;



public class Principal {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

       
    TeladeLogin tela1 = new TeladeLogin();
    tela1.setVisible(true);


    DaoProdutos daoProdutos = new DaoProdutos();
    DaoCliente daoCliente = new DaoCliente();

    List<Produto> listaProdutos = daoProdutos.ListaProdutos();
    // System.out.println(listaProdutos);

    System.out.println(daoProdutos.PesquisarProdutos("vinho", null));
    daoCliente.AdiconarCliente("JOAO", "40028922", "jabdfadfha@kjfgjsaj.com");
    System.out.println(daoCliente.PesquisarClientes("JOAO", null));
    }
    
    }

    

 


