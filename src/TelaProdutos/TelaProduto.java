/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TelaProdutos;

import TelaCliente.CadastrarUsuario;
import TelaProdutos.CadastrarProduto;
import TelaProdutos.EditarProduto;
import TelaProdutos.ModificadordeTabelaProdutos;
import dao.DaoProduto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import projeto_java.Produto;
import telas.Login;
import telas.TelaCliente;
import TelaVendas.TelaVendas;
import TelaPedidos.TelaPedidos;
import teste.TelaClientes;

/**
 *
 * @author jhene
 */
public class TelaProduto extends javax.swing.JFrame {

     private  String linhaClicada;
     private ArrayList<Produto> listaDeProdutos; // Preencha esta lista com os produtos do banco de dados
     
    public TelaProduto() {
        initComponents();
        carregarProdutos();
    }

     private void carregarProdutos() {
       
        try {
            DaoProduto dao = new DaoProduto();
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

        jPanel2 = new javax.swing.JPanel();
        Produtos = new javax.swing.JButton();
        Pedidos = new javax.swing.JButton();
        Clientes = new javax.swing.JButton();
        Vendas = new javax.swing.JButton();
        CDTFuncionario = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Adcionar = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        Remover = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(178, 218, 250));

        Produtos.setBackground(new java.awt.Color(106, 158, 218));
        Produtos.setFont(new java.awt.Font("Tw Cen MT", 0, 28)); // NOI18N
        Produtos.setForeground(new java.awt.Color(255, 255, 255));
        Produtos.setText("Produtos");
        Produtos.setBorder(null);
        Produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdutosActionPerformed(evt);
            }
        });

        Pedidos.setBackground(new java.awt.Color(106, 158, 218));
        Pedidos.setFont(new java.awt.Font("Tw Cen MT", 0, 28)); // NOI18N
        Pedidos.setForeground(new java.awt.Color(255, 255, 255));
        Pedidos.setText("Pedidos");
        Pedidos.setBorder(null);
        Pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PedidosActionPerformed(evt);
            }
        });

        Clientes.setBackground(new java.awt.Color(106, 158, 218));
        Clientes.setFont(new java.awt.Font("Tw Cen MT", 0, 28)); // NOI18N
        Clientes.setForeground(new java.awt.Color(255, 255, 255));
        Clientes.setText("Clientes");
        Clientes.setBorder(null);
        Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesActionPerformed(evt);
            }
        });

        Vendas.setBackground(new java.awt.Color(106, 158, 218));
        Vendas.setFont(new java.awt.Font("Tw Cen MT", 0, 28)); // NOI18N
        Vendas.setForeground(new java.awt.Color(255, 255, 255));
        Vendas.setText("Vendas");
        Vendas.setBorder(null);
        Vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendasActionPerformed(evt);
            }
        });

        CDTFuncionario.setBackground(new java.awt.Color(106, 158, 218));
        CDTFuncionario.setFont(new java.awt.Font("Tw Cen MT", 0, 28)); // NOI18N
        CDTFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        CDTFuncionario.setText("Cadastrar Funcionario");
        CDTFuncionario.setBorder(null);
        CDTFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CDTFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Clientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Vendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Produtos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CDTFuncionario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Produtos, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(Pedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(Vendas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(CDTFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(766, 635));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Quantidade", "Categoria", "Id", "Preco"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
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

        Adcionar.setBackground(new java.awt.Color(106, 158, 218));
        Adcionar.setFont(new java.awt.Font("Tw Cen MT", 0, 28)); // NOI18N
        Adcionar.setForeground(new java.awt.Color(255, 255, 255));
        Adcionar.setText("Adicionar");
        Adcionar.setBorder(null);
        Adcionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdcionarActionPerformed(evt);
            }
        });

        Editar.setBackground(new java.awt.Color(106, 158, 218));
        Editar.setFont(new java.awt.Font("Tw Cen MT", 0, 28)); // NOI18N
        Editar.setForeground(new java.awt.Color(255, 255, 255));
        Editar.setText("Editar");
        Editar.setBorder(null);
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        Remover.setBackground(new java.awt.Color(106, 158, 218));
        Remover.setFont(new java.awt.Font("Tw Cen MT", 0, 28)); // NOI18N
        Remover.setForeground(new java.awt.Color(255, 255, 255));
        Remover.setText("Remover");
        Remover.setBorder(null);
        Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/agorasim.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Adcionar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120)
                                .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Remover, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel1)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Adcionar)
                    .addComponent(Editar)
                    .addComponent(Remover))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProdutosActionPerformed

    private void AdcionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdcionarActionPerformed
            
        setVisible(false);
        dispose();
        
        CadastrarProduto cp = new CadastrarProduto();
        cp.setVisible(true);             
    }//GEN-LAST:event_AdcionarActionPerformed

    private void RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverActionPerformed
             if (linhaClicada != null) {

  
             try {
                 String[] linhaClicadaSplit = linhaClicada.split("\n"); // Dividir a linha em partes com base nas quebras de linha
             
                 Produto produto = new Produto(0);
                 produto.setId(Integer.parseInt(linhaClicadaSplit[0].split(": ")[1]));// Obter o ID da linha selecionada
                 
                DaoProduto produtoDao = new DaoProduto();
                produtoDao.RemoverProdutos(produto);
                produtoDao.fecharConexao();
                
                TelaProduto telaproduto = new TelaProduto();
                telaproduto.setVisible(false);
                dispose();
                telaproduto.setVisible(true);
                
                
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(TelaClientes.class.getName()).log(Level.SEVERE, null, ex);
             } catch (SQLException ex) {
                 Logger.getLogger(TelaClientes.class.getName()).log(Level.SEVERE, null, ex);
             }
    
    }
    }//GEN-LAST:event_RemoverActionPerformed

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

    private void CDTFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CDTFuncionarioActionPerformed

    Login l = new Login();
   if( l.getCargo().equals("Admistrador")){
      
    CDTFuncionario.setEnabled(true);
    
     setVisible(false);
     dispose();
     
    CadastrarUsuario CDTTela = new CadastrarUsuario();
        CDTTela.setVisible(true);
   }else{
   
   CDTFuncionario.setEnabled(false);
       
   }
    }//GEN-LAST:event_CDTFuncionarioActionPerformed

    private void VendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendasActionPerformed
     
     TelaProduto telaproduto = new TelaProduto();
     telaproduto.setVisible(false);
     dispose();
     
     TelaVendas telavendas = new TelaVendas();
     telavendas.setVisible(true);
     
    }//GEN-LAST:event_VendasActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        if (linhaClicada != null) {
    try {
        String[] linhaClicadaSplit = linhaClicada.split("\n");
        Produto produto = new Produto(0);
        produto.setId(Integer.parseInt(linhaClicadaSplit[0].split(": ")[1]));

        // Recupere os detalhes do produto do banco de dados com base no ID
        DaoProduto produtoDao = new DaoProduto();
        produto = produtoDao.obterProdutoPorId(produto.getId());
        produtoDao.fecharConexao();

        // Abre a tela de edição com os detalhes do produto
        System.out.println("Antes de chamar setProduto: " + produto);
        EditarProduto editarProduto = new EditarProduto(produto);
        editarProduto.setVisible(true);
        System.out.println("Depois de chamar setProduto: " + produto);

        // Fecha a tela atual 
        TelaProduto telaproduto = new TelaProduto();
        telaproduto.setVisible(false);
        dispose();

    } catch (ClassNotFoundException | SQLException ex) {
        Logger.getLogger(TelaClientes.class.getName()).log(Level.SEVERE, null, ex);
    }
}

    }//GEN-LAST:event_EditarActionPerformed

    private void ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesActionPerformed
        setVisible(false);
        dispose();
        TelaCliente tc = new TelaCliente();
        tc.setVisible(true);
    }//GEN-LAST:event_ClientesActionPerformed

    private void PedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PedidosActionPerformed
        setVisible(false);
        dispose();
        TelaPedidos tp = new TelaPedidos();
        tp.setVisible(true);
    }//GEN-LAST:event_PedidosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adcionar;
    private javax.swing.JButton CDTFuncionario;
    private javax.swing.JButton Clientes;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Pedidos;
    private javax.swing.JButton Produtos;
    private javax.swing.JButton Remover;
    private javax.swing.JButton Vendas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
