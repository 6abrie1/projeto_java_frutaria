package projeto_java;

import dao.DaoIntePv;
import telas.Login;
import dao.DaoProduto;
import java.sql.SQLException;
import model.Produto;


public class Principal {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    
        Login tela1 = new Login();
        tela1.setVisible(true);
        
        DaoIntePv pv = new DaoIntePv();
        System.out.println( pv.ListaIntePv());
        
     
    }
       
       
        
       
        
}

