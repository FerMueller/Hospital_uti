/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import javax.swing.JOptionPane;

/**
 *
 * @author 88178
 */
public class ListaVisitante extends javax.swing.JFrame {

    /**
     * Creates new form ListaVisitante
     */
    public ListaVisitante() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnEspera = new javax.swing.JButton();
        btnEntrada = new javax.swing.JButton();
        btnSaida = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout());

        btnEspera.setText("Espera");
        btnEspera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsperaActionPerformed(evt);
            }
        });
        jPanel1.add(btnEspera);

        btnEntrada.setText("Entrada");
        btnEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrada);

        btnSaida.setText("Saída");
        btnSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaidaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSaida);

        btnMenu.setText("Voltar ao menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenu);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEsperaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsperaActionPerformed
        JOptionPane.showMessageDialog(this, "Ainda não implementado");
    }//GEN-LAST:event_btnEsperaActionPerformed

    private void btnEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaActionPerformed
        JOptionPane.showMessageDialog(this, "Ainda não implementado");
    }//GEN-LAST:event_btnEntradaActionPerformed

    private void btnSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaidaActionPerformed
        JOptionPane.showMessageDialog(this, "Ainda não implementado");
    }//GEN-LAST:event_btnSaidaActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrada;
    private javax.swing.JButton btnEspera;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnSaida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
