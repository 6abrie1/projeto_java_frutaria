package telas;

import dao.DaoPesquisaProdutos;
import javax.swing.DefaultListModel;
import javax.swing.SwingUtilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TeladePesquisa extends javax.swing.JFrame {

    private String nome;
    private String categoria;
    private DefaultListModel<String> modeloLista;

    public TeladePesquisa() {
        initComponents();
        modeloLista = new DefaultListModel<>();
        jList1.setModel(modeloLista);
    }

    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jButtonPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Pesquisa");
        setSize(600, 400);

        jLabel1.setText("Pesquisar Produtos");
        jTextField1.setColumns(20);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Bebidas");
        jRadioButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                categoria = "bebida";
                try {
                    atualizarLista();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TeladePesquisa.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Frutas");
        jRadioButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                categoria = "fruta";
                try {
                    atualizarLista();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TeladePesquisa.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Alimentos");
        jRadioButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                categoria = "alimento";
                try {
                    atualizarLista();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TeladePesquisa.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Outros");
        jRadioButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                categoria = "outros";
                try {
                    atualizarLista();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TeladePesquisa.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        jScrollPane1.setViewportView(jList1);

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nome = jTextField1.getText();
                try {
                    atualizarLista();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TeladePesquisa.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        // Defina a disposição dos componentes usando GroupLayout
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addComponent(jTextField1)
                .addComponent(jScrollPane1)
                .addComponent(jButtonPesquisar)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                )
            ));
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addComponent(jTextField1)
                .addComponent(jScrollPane1)
                .addComponent(jButtonPesquisar)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                )
            ));
    
        pack();
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TeladePesquisa().setVisible(true);
            }
        });
    }

    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jButtonPesquisar;

    private void atualizarLista() throws ClassNotFoundException {
        // Limpe o modelo da lista
        modeloLista.clear();

        try {
            DaoPesquisaProdutos pesquisaProdutos = new DaoPesquisaProdutos();
            ArrayList<String> resultados = pesquisaProdutos.PesquisarProdutos(nome, categoria);

            for (String resultado : resultados) {
                modeloLista.addElement(resultado);
            }
        } catch (SQLException ex) {
            // Trate exceções apropriadamente
            ex.printStackTrace();
        }
    }
}
