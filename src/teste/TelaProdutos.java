/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package teste;

import dao.DaoCliente;
import dao.DaoProdutos;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import projeto_java.Produto;


/**
 *
 * @author gabri
 */
public class TelaProdutos extends javax.swing.JFrame {
   private  String linhaClicada;
   private ArrayList<Produto> listaDeProdutos; // Preencha esta lista com os produtos do banco de dados
   
    public TelaProdutos() {
        initComponents();
        carregarProdutos();
        setExtendedState(JFrame.MAXIMIZED_BOTH);

    }

   private void carregarProdutos() {
        try {
            DaoProdutos dao = new DaoProdutos();
            listaDeProdutos = dao.ListaProdutos();
            dao.fecharConexao();
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }

        ModificadordeTabelaProdutos modelo = new ModificadordeTabelaProdutos(listaDeProdutos);
        jTable1.setModel(modelo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Pedidos = new javax.swing.JButton();
        Produtos = new javax.swing.JButton();
        Clientes = new javax.swing.JButton();
        CDTFuncianario = new javax.swing.JButton();
        Vendas = new javax.swing.JButton();
        AdicionarProdutos = new javax.swing.JButton();
        RemoverProdutos = new javax.swing.JButton();
        AtualizarProduto = new javax.swing.JButton();
        Foto = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(0, 0, 255));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"GABRIEL", null, "GABRIELJV@GMAIL.COM", null},
                {"", null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NOME", "QUANTIDADE", "CATEGORIA", "PRECO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 1050, 900));

        Pedidos.setText("Pedidos");
        Pedidos.setBorder(null);
        Pedidos.setContentAreaFilled(false);
        getContentPane().add(Pedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 170, 80));

        Produtos.setText("Produtos");
        Produtos.setBorder(null);
        Produtos.setContentAreaFilled(false);
        Produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdutosActionPerformed(evt);
            }
        });
        getContentPane().add(Produtos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 180, 70));

        Clientes.setText("Clientes");
        Clientes.setBorder(null);
        Clientes.setContentAreaFilled(false);
        Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesActionPerformed(evt);
            }
        });
        getContentPane().add(Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 333, 160, 80));

        CDTFuncianario.setText("Cadastro de Funcionario");
        CDTFuncianario.setBorder(null);
        CDTFuncianario.setContentAreaFilled(false);
        getContentPane().add(CDTFuncianario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 593, 180, 70));

        Vendas.setText("Vendas");
        Vendas.setContentAreaFilled(false);
        Vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendasActionPerformed(evt);
            }
        });
        getContentPane().add(Vendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 463, 180, 80));

        AdicionarProdutos.setBackground(new java.awt.Color(0, 51, 255));
        AdicionarProdutos.setText("Adicionar");
        AdicionarProdutos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AdicionarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarProdutosActionPerformed(evt);
            }
        });
        getContentPane().add(AdicionarProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 130, 60));

        RemoverProdutos.setBackground(new java.awt.Color(0, 0, 255));
        RemoverProdutos.setText("Remover");
        RemoverProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverProdutosActionPerformed(evt);
            }
        });
        getContentPane().add(RemoverProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 130, 60));

        AtualizarProduto.setBackground(new java.awt.Color(0, 51, 255));
        AtualizarProduto.setText("Atualizar");
        AtualizarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(AtualizarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 130, 60));

        Foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/Produtos.png"))); // NOI18N
        getContentPane().add(Foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 1960, -1));

        jMenu5.setText("jMenu5");

        jMenuItem10.setText("jMenuItem10");
        jMenu5.add(jMenuItem10);

        jMenuItem11.setText("jMenuItem11");
        jMenu5.add(jMenuItem11);

        jMenuItem12.setText("jMenuItem12");
        jMenu5.add(jMenuItem12);

        jMenuBar1.add(jMenu5);

        jMenu3.setText("jMenu3");

        jMenuItem7.setText("jMenuItem7");
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("jMenuItem8");
        jMenu3.add(jMenuItem8);

        jMenuItem9.setText("jMenuItem9");
        jMenu3.add(jMenuItem9);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount() == 1) { // Clique simples
            int row = jTable1.getSelectedRow();
            int numColumns = jTable1.getColumnCount();
            StringBuilder linhaClicada = new StringBuilder();

            for (int col = 0; col < numColumns; col++) {
                Object valorColuna = jTable1.getValueAt(row, col);
                if (valorColuna != null) {
                    linhaClicada.append(jTable1.getColumnName(col)).append(": ").append(valorColuna).append("\n");
                }
            }

            this.linhaClicada = linhaClicada.toString(); 
            System.out.println(this.linhaClicada);

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void AdicionarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarProdutosActionPerformed
CadastroProdutos  telap = new CadastroProdutos();
TelaProdutos tela = new TelaProdutos();


telap.setVisible(true);

tela.setVisible(false);
dispose();
    }//GEN-LAST:event_AdicionarProdutosActionPerformed

    private void RemoverProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverProdutosActionPerformed
        if (linhaClicada != null) {

  
             try {
                 String[] linhaClicadaSplit = linhaClicada.split("\n"); // Dividir a linha em partes com base nas quebras de linha
             
                 Produto produto = new Produto(0);
                 produto.setId(Integer.parseInt(linhaClicadaSplit[0].split(": ")[1]));// Obter o ID da linha selecionada
                 
                DaoProdutos produtoDao = new DaoProdutos();
                produtoDao.RemoverProdutos(produto);
                produtoDao.fecharConexao();
                
                
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(TelaClientes.class.getName()).log(Level.SEVERE, null, ex);
             } catch (SQLException ex) {
                 Logger.getLogger(TelaClientes.class.getName()).log(Level.SEVERE, null, ex);
             }
    
    }
    }//GEN-LAST:event_RemoverProdutosActionPerformed

    private void ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesActionPerformed
       TelaProdutos tela = new TelaProdutos();
       
       tela.setVisible(false);
       
       
       TelaClientes telac = new TelaClientes();
       telac.setVisible(true);
       dispose();
    }//GEN-LAST:event_ClientesActionPerformed

    private void AtualizarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarProdutoActionPerformed
        TelaProdutos tela = new TelaProdutos();
       
       tela.setVisible(false);
       dispose();
       tela.setVisible(true);
    }//GEN-LAST:event_AtualizarProdutoActionPerformed

    private void ProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdutosActionPerformed
       TelaProdutos tela = new TelaProdutos();
       
       tela.setVisible(false);
       dispose();
       tela.setVisible(true);
    }//GEN-LAST:event_ProdutosActionPerformed

    private void VendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendasActionPerformed
        TelaProdutos tela = new TelaProdutos();
       
       tela.setVisible(false);
       dispose();
       
       TelaVendas telaV = new TelaVendas();
       telaV.setVisible(true);
    }//GEN-LAST:event_VendasActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProdutos().setVisible(true);
            }
        });
    }

    public String getLinhaClicada() {
        return linhaClicada;
    }

    public void setLinhaClicada(String linhaClicada) {
        this.linhaClicada = linhaClicada;
    }

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarProdutos;
    private javax.swing.JButton AtualizarProduto;
    private javax.swing.JButton CDTFuncianario;
    private javax.swing.JButton Clientes;
    private javax.swing.JLabel Foto;
    private javax.swing.JButton Pedidos;
    private javax.swing.JButton Produtos;
    private javax.swing.JButton RemoverProdutos;
    private javax.swing.JButton Vendas;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
