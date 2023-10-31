package projeto_java;

import dao.Conexao;
import dao.DaoAdicionarProdutos;
import dao.DaoCadastro;
import dao.DaoListadeProdutos;
import dao.DaoLogin;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import telas.NewClass;


import telas.TeladeLogin;

public class Principal {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

         TeladeLogin tela1 = new TeladeLogin();
         tela1.dispose();
         tela1.setVisible(true);
         
         
         DaoAdicionarProdutos insert = new DaoAdicionarProdutos();
         insert.AdiconarProdutos("vinho", "bebidas", 1100, 150.5);
         
         
         
         DaoListadeProdutos lista = new DaoListadeProdutos();
         System.out.println(lista.ListaProdutos());
         
     
     }
 }


