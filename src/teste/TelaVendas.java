/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package teste;

import dao.DaoProdutos;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import projeto_java.Produto;

/**
 *
 * @author gabri
 */
public class TelaVendas extends javax.swing.JFrame {

    /**
     * Creates new form TelaVendas
     */
    public TelaVendas() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Dinheiro = new javax.swing.JRadioButton();
        Debito = new javax.swing.JRadioButton();
        Credito = new javax.swing.JRadioButton();
        Pix = new javax.swing.JRadioButton();
        Pedidos = new javax.swing.JButton();
        Produtos = new javax.swing.JButton();
        Clientes = new javax.swing.JButton();
        Vendas = new javax.swing.JButton();
        CadrFuncionario = new javax.swing.JButton();
        PesquisaP = new javax.swing.JTextField();
        Adcnota = new javax.swing.JButton();
        AdcClientes = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        PesquisaC = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Total = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(Dinheiro);
        Dinheiro.setText("DINHEIRO");
        Dinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DinheiroActionPerformed(evt);
            }
        });
        getContentPane().add(Dinheiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 690, -1, 20));

        buttonGroup1.add(Debito);
        Debito.setText("DEBITO");
        getContentPane().add(Debito, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 720, -1, 20));

        buttonGroup1.add(Credito);
        Credito.setText("CREDITO");
        getContentPane().add(Credito, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 750, -1, 20));

        buttonGroup1.add(Pix);
        Pix.setText("PIX");
        getContentPane().add(Pix, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 780, -1, 20));

        Pedidos.setText("Pedidos");
        Pedidos.setBorder(null);
        Pedidos.setContentAreaFilled(false);
        Pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PedidosActionPerformed(evt);
            }
        });
        getContentPane().add(Pedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 160, 90));

        Produtos.setText("Produtos");
        Produtos.setBorder(null);
        Produtos.setContentAreaFilled(false);
        Produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdutosActionPerformed(evt);
            }
        });
        getContentPane().add(Produtos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 190, 100));

        Clientes.setText("Clientes");
        Clientes.setBorder(null);
        Clientes.setContentAreaFilled(false);
        Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesActionPerformed(evt);
            }
        });
        getContentPane().add(Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 170, 80));

        Vendas.setText("Vendas");
        Vendas.setBorder(null);
        Vendas.setContentAreaFilled(false);
        Vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendasActionPerformed(evt);
            }
        });
        getContentPane().add(Vendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 180, 80));

        CadrFuncionario.setText("Cadastro de Funcionario");
        CadrFuncionario.setBorder(null);
        CadrFuncionario.setContentAreaFilled(false);
        CadrFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadrFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(CadrFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 190, 80));

        PesquisaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisaPActionPerformed(evt);
            }
        });
        getContentPane().add(PesquisaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 350, 50));

        Adcnota.setBackground(new java.awt.Color(51, 51, 255));
        Adcnota.setText("Adicionar a Nota");
        Adcnota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));
        Adcnota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdcnotaActionPerformed(evt);
            }
        });
        getContentPane().add(Adcnota, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 210, 40));

        AdcClientes.setBackground(new java.awt.Color(0, 51, 255));
        AdcClientes.setText("Adicionar Clientes");
        getContentPane().add(AdcClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 110, 230, 40));

        Editar.setBackground(new java.awt.Color(51, 51, 255));
        Editar.setText("Editar Nota");
        getContentPane().add(Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 220, 40));

        PesquisaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisaCActionPerformed(evt);
            }
        });
        getContentPane().add(PesquisaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 20, 350, 60));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Preco"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 770, 820));

        Total.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        getContentPane().add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(1157, 350, 740, 240));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/Vendas.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DinheiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DinheiroActionPerformed

    private void PedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PedidosActionPerformed

    private void CadrFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadrFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CadrFuncionarioActionPerformed

    private void PesquisaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisaPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PesquisaPActionPerformed

    private void PesquisaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisaCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PesquisaCActionPerformed

    private void ProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdutosActionPerformed
TelaVendas telaV =  new TelaVendas();

telaV.setVisible(false);
dispose();

TelaProdutos telaP = new TelaProdutos();

telaP.setVisible(true);
    }//GEN-LAST:event_ProdutosActionPerformed

    private void ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesActionPerformed
      TelaClientes tela = new TelaClientes();

      TelaVendas telaV =  new TelaVendas();
tela.setVisible(true);

telaV.setVisible(       false);
dispose(); 
    }//GEN-LAST:event_ClientesActionPerformed

    private void VendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendasActionPerformed
      TelaVendas telaV =  new TelaVendas();

      telaV.setVisible(       false);
      dispose(); 
      
      telaV.setVisible(true);


    }//GEN-LAST:event_VendasActionPerformed

    private void AdcnotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdcnotaActionPerformed
String nome = PesquisaP.getText();
String categoria = PesquisaP.getText(); 

try {
    Produto produto = new Produto(nome, 0, 0, categoria);

    DaoProdutos produtodao = new DaoProdutos();
    ArrayList<String> resultadosStr = produtodao.PesquisarProdutos(produto);

    ArrayList<Produto> resultados = new ArrayList<>(); // Lista para armazenar os objetos Produto

    for (String linha : resultadosStr) {
        String[] partes = linha.split(","); //  as informações estejam separadas por vírgulas

        if (partes.length >= 2) {
            String nomeProduto = partes[0];
            double preco = Double.parseDouble(partes[1]);

            Produto produtoResultado = new Produto(nome, preco, 0, "");
            resultados.add(produtoResultado);
            produtodao.fecharConexao();
        }
    }

    ModificadordeTabelaVendas modelo = new  ModificadordeTabelaVendas(resultados);
    jTable1.setModel(modelo);
} catch (ClassNotFoundException ex) {
    Logger.getLogger(TelaVendas.class.getName()).log(Level.SEVERE, null, ex);
} catch (SQLException ex) {
    Logger.getLogger(TelaVendas.class.getName()).log(Level.SEVERE, null, ex);
}
     
    }//GEN-LAST:event_AdcnotaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdcClientes;
    private javax.swing.JButton Adcnota;
    private javax.swing.JButton CadrFuncionario;
    private javax.swing.JButton Clientes;
    private javax.swing.JRadioButton Credito;
    private javax.swing.JRadioButton Debito;
    private javax.swing.JRadioButton Dinheiro;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Pedidos;
    private javax.swing.JTextField PesquisaC;
    private javax.swing.JTextField PesquisaP;
    private javax.swing.JRadioButton Pix;
    private javax.swing.JButton Produtos;
    private javax.swing.JLabel Total;
    private javax.swing.JButton Vendas;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
