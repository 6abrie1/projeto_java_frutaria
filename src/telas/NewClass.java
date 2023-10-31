/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telas;

import dao.DaoListadeProdutos;
import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import projeto_java.Produto;

/**
 *
 * @author gabri
 */
public class NewClass {



 public void iniciar (){
        SwingUtilities.invokeLater(() -> {
            try {
                JFrame frame = new JFrame("Lista de Produtos");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(400, 300);
                
                JPanel panel = new JPanel();
                panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
                
                
                DaoListadeProdutos listaDeProdutos = new DaoListadeProdutos();
                
                for (Produto produto : listaDeProdutos.ListaProdutos()) {
                    JLabel label = new JLabel(produto.getNome() + ": R$" + produto.getPreco()+"  Quantidade:  "+produto.getQuantidade()+"  Categoria:  "+produto.getCategoria());
                    panel.add(label);
                }
                
                
                
                JScrollPane scrollPane = new JScrollPane(panel);
                frame.add(scrollPane, BorderLayout.CENTER);
                
                frame.setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

}
