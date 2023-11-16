/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package teste;

import TelaCliente.ModificadordeTabelaClientes;
import dao.DaoCliente;
import dao.DaoProduto;
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
import model.Cliente;
import model.Produto;

/**
 *
 * @author gabri
 */
public class TelaClientes extends javax.swing.JFrame {
   private  String linhaClicada;
   private ArrayList<Cliente> listaDeClientes; // Preencha esta lista com os produtos do banco de dados
   
    public TelaClientes() {
        initComponents();
        carregarProdutos();
        setExtendedState(JFrame.MAXIMIZED_BOTH);

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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Pedidos = new javax.swing.JButton();
        Produtos = new javax.swing.JButton();
        Clientes = new javax.swing.JButton();
        CDTFuncionario = new javax.swing.JButton();
        Vendas = new javax.swing.JButton();
        AdicionarClientes = new javax.swing.JButton();
        RemoverClientes = new javax.swing.JButton();
        AtualizarClientes = new javax.swing.JButton();
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
                {null, "", null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "ENDERECO", "TELEFONE", "EMAIL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 1050, 890));

        Pedidos.setText("Pedidos");
        Pedidos.setBorder(null);
        Pedidos.setContentAreaFilled(false);
        Pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PedidosActionPerformed(evt);
            }
        });
        getContentPane().add(Pedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 170, 80));

        Produtos.setText("Produtos");
        Produtos.setBorder(null);
        Produtos.setContentAreaFilled(false);
        Produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdutosActionPerformed(evt);
            }
        });
        getContentPane().add(Produtos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 180, 80));

        Clientes.setText("Clientes");
        Clientes.setBorder(null);
        Clientes.setContentAreaFilled(false);
        Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesActionPerformed(evt);
            }
        });
        getContentPane().add(Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 160, 80));

        CDTFuncionario.setText("Cadastro de Funcionario");
        CDTFuncionario.setBorder(null);
        CDTFuncionario.setContentAreaFilled(false);
        getContentPane().add(CDTFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 593, 180, 70));

        Vendas.setText("Vendas");
        Vendas.setContentAreaFilled(false);
        Vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendasActionPerformed(evt);
            }
        });
        getContentPane().add(Vendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 180, 80));

        AdicionarClientes.setBackground(new java.awt.Color(0, 51, 255));
        AdicionarClientes.setText("Adicionar");
        AdicionarClientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AdicionarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarClientesActionPerformed(evt);
            }
        });
        getContentPane().add(AdicionarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 130, 60));

        RemoverClientes.setBackground(new java.awt.Color(0, 0, 255));
        RemoverClientes.setText("Remover");
        RemoverClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverClientesActionPerformed(evt);
            }
        });
        getContentPane().add(RemoverClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 130, 60));

        AtualizarClientes.setBackground(new java.awt.Color(0, 0, 255));
        AtualizarClientes.setText("Atualizar");
        AtualizarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarClientesActionPerformed(evt);
            }
        });
        getContentPane().add(AtualizarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 130, 60));

        Foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/clientes.png"))); // NOI18N
        getContentPane().add(Foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1960, -1));

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

    private void AdicionarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarClientesActionPerformed
CadastroClientes  telaC = new CadastroClientes();
TelaClientes tela = new TelaClientes();


telaC.setVisible(true);

tela.setVisible(false);
dispose();
    }//GEN-LAST:event_AdicionarClientesActionPerformed

    private void RemoverClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverClientesActionPerformed

         if (linhaClicada != null) {

  
             try {
                 String[] linhaClicadaSplit = linhaClicada.split("\n"); // Dividir a linha em partes com base nas quebras de linha
                 
               
                 Cliente cliente = new Cliente(0);
                 cliente.setId(Integer.parseInt(linhaClicadaSplit[0].split(": ")[1]));// Obter o ID da linha selecionada
                 
                 
                 DaoCliente clienteDao = new DaoCliente();
                 clienteDao.RemoverCliente(cliente);
                 clienteDao.fecharConexao();
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(TelaClientes.class.getName()).log(Level.SEVERE, null, ex);
             } catch (SQLException ex) {
                 Logger.getLogger(TelaClientes.class.getName()).log(Level.SEVERE, null, ex);
             }
    
    }
    }//GEN-LAST:event_RemoverClientesActionPerformed

    private void AtualizarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarClientesActionPerformed
     
TelaClientes tela = new TelaClientes();

tela.setVisible(false);
dispose(); 
tela.setVisible(true);
    }//GEN-LAST:event_AtualizarClientesActionPerformed

    private void ProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdutosActionPerformed
      
TelaClientes tela = new TelaClientes();

        tela.setVisible(false);
        dispose(); 

        TelaProdutos telaP = new TelaProdutos();
        telaP.setVisible(true);
    }//GEN-LAST:event_ProdutosActionPerformed

    private void PedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PedidosActionPerformed

    private void ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesActionPerformed
    TelaClientes tela = new TelaClientes();
    tela.setVisible(false);
    dispose();
    tela.setVisible(true);
    }//GEN-LAST:event_ClientesActionPerformed

    private void VendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendasActionPerformed
      TelaClientes tela = new TelaClientes();
     tela.setVisible(false);
     dispose();
     
     TelaVendas telav = new TelaVendas();
     telav.setVisible(true);
     
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
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaClientes().setVisible(true);
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
    private javax.swing.JButton AdicionarClientes;
    private javax.swing.JButton AtualizarClientes;
    private javax.swing.JButton CDTFuncionario;
    private javax.swing.JButton Clientes;
    private javax.swing.JLabel Foto;
    private javax.swing.JButton Pedidos;
    private javax.swing.JButton Produtos;
    private javax.swing.JButton RemoverClientes;
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
