/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package teste;

import dao.DaoProdutos;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import projeto_java.Produto;
import static sun.jvm.hotspot.HelloWorld.e;

/**
 *
 * @author gabri
 */
public class Telateste extends javax.swing.JFrame {
   private  String linhaClicada;
   private ArrayList<Produto> listaDeProdutos; // Preencha esta lista com os produtos do banco de dados
   
    public Telateste() {
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

        ModificadordeTabela modelo = new ModificadordeTabela(listaDeProdutos);
        jTable1.setModel(modelo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(704, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(277, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
        );

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

        this.linhaClicada = linhaClicada.toString(); // Inicialização da variável
        System.out.println(this.linhaClicada); // Impressão
        
        
    }
    }//GEN-LAST:event_jTable1MouseClicked

    
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
            java.util.logging.Logger.getLogger(Telateste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Telateste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Telateste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Telateste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Telateste().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
