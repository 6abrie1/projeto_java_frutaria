package projeto_java;


import dao.DaoCliente;
import dao.DaoProduto;
import java.sql.SQLException;
import telas.TeladeLogin;
import teste.Telateste;



public class Principal {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

       /*
        DaoProdutos p = new DaoProdutos();
        System.out.println(p.ListaProdutos());
        System.out.println(p.PesquisarProdutos("vinho", "bebidas"));
        p.fecharConexao(); */
        
        DaoCliente c = new DaoCliente();
       
        //c.AdiconarCliente("gabriel", "4002-8922", "JV9@GMAIL.COM");
       // c.RemoverCliente("GABRIEL", "JV@GMAIL.COM");
        //c.fecharConexao();
        //  p.AdiconarProdutos("uva", "fruta", 10000, 0.80);
        //  p.RemoverProdutos("biscoito", 9);
        
      Telateste t = new Telateste();
      t.setVisible(true);
      if(t.getLinhaClicada()!= null){
        System.out.println(t.getLinhaClicada());
     
     }
     }
}
 


