/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import TelaCliente.CadastrarUsuario;
import TelaCliente.CadastroCliente;
import TelaCliente.EditarCliente;
import TelaCliente.ModificadordeTabelaClientes;
import TelaPedidos.TelaPedidos;
import TelaProdutos.EditarProduto;
import TelaProdutos.TelaProduto;
import TelaVendas.TelaVendas;
import dao.DaoCliente;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cliente;


/**
 *
 * @author Filipe
 */
public class TelaCliente extends javax.swing.JFrame {
 
 private  String linhaClicada;
 private ArrayList<Cliente> listaDeClientes; // Preencha esta lista com os produtos do banco de dados
 
    public TelaCliente() {
        initComponents();
        carregarProdutos();
    }

   private void carregarProdutos() {
        try {
            DaoCliente dao = new DaoCliente();
            listaDeClientes = dao.ListaClientes();
            dao.fecharConexao();
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }

        ModificadordeTabelaClientes modelo = new ModificadordeTabelaClientes(listaDeClientes);
        jTable1.setModel(modelo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        Produtos = new javax.swing.JButton();
        Pedidos = new javax.swing.JButton();
        Clientes = new javax.swing.JButton();
        Vendas = new javax.swing.JButton();
        CDTFuncionario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 60)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("CLIENTES");

        jButton6.setBackground(new java.awt.Color(106, 158, 218));
        jButton6.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("ADICIONAR CLIENTE");
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(106, 158, 218));
        jButton7.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("EDITAR CLIENTE");
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(106, 158, 218));
        jButton8.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("EXCLUIR CLIENTE");
        jButton8.setBorder(null);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Preco ", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(231, 231, 231))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 780, 660));

        jPanel4.setBackground(new java.awt.Color(178, 218, 250));

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Clientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Vendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Produtos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CDTFuncionario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
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

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 670));

        pack();
        setLocationRelativeTo(null);
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

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
if (linhaClicada != null) {

  
             try {
                 String[] linhaClicadaSplit = linhaClicada.split("\n"); // Dividir a linha em partes com base nas quebras de linha
                 
               
                 Cliente cliente = new Cliente(0);
                 cliente.setId(Integer.parseInt(linhaClicadaSplit[0].split(": ")[1]));// Obter o ID da linha selecionada
                 
                 
                 DaoCliente clienteDao = new DaoCliente();
                 clienteDao.RemoverCliente(cliente);
                 clienteDao.fecharConexao();
                 setVisible(false);
                 
                TelaCliente tc = new TelaCliente();
                tc.setVisible(true);
                 
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
             } catch (SQLException ex) {
                 Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
             }}      
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    
        setVisible(false);
        dispose();
        CadastroCliente cc = new CadastroCliente();
        cc.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       if (linhaClicada != null) {
            try {
                String[] linhaClicadaSplit = linhaClicada.split("\n");
                Cliente cliente = new Cliente(0);
                cliente.setId(Integer.parseInt(linhaClicadaSplit[0].split(": ")[1]));
//
                // Recupere os detalhes do cliente do banco de dados com base no ID
                DaoCliente clienteDao = new DaoCliente();
                cliente = clienteDao.obterClientePorId(cliente.getId());
                System.out.println(cliente.getId());
                clienteDao.fecharConexao();

                // Abre a tela de edição com os detalhes do cliente
                
                EditarCliente editarCliente = new EditarCliente(cliente);
                editarCliente.setVisible(true);
          

                // Fecha a tela atual
                setVisible(false);
                dispose();

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
}

    }//GEN-LAST:event_jButton7ActionPerformed

    private void ProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdutosActionPerformed
        setVisible(false);
         dispose();
         TelaProduto tc = new TelaProduto();
         tc.setVisible(true);
    }//GEN-LAST:event_ProdutosActionPerformed

    private void PedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PedidosActionPerformed
        setVisible(false);
         dispose();
         TelaPedidos tc = new TelaPedidos();
         tc.setVisible(true);
    }//GEN-LAST:event_PedidosActionPerformed

    private void ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesActionPerformed
        setVisible(false);
        dispose();
        TelaCliente tc = new TelaCliente();
        tc.setVisible(true);
    }//GEN-LAST:event_ClientesActionPerformed

    private void VendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendasActionPerformed
        setVisible(false);
        dispose();
        TelaVendas telavendas = new TelaVendas();
        telavendas.setVisible(true);
    }//GEN-LAST:event_VendasActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CDTFuncionario;
    private javax.swing.JButton Clientes;
    private javax.swing.JButton Pedidos;
    private javax.swing.JButton Produtos;
    private javax.swing.JButton Vendas;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
