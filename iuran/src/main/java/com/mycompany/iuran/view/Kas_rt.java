package com.mycompany.iuran.view;

import com.mycompany.iuran.controller.IuranController;
import com.mycompany.iuran.model.Warga;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Kas_rt extends javax.swing.JFrame {

    private final IuranController controller = new IuranController();

    public Kas_rt() {
        initComponents();
        setLocationRelativeTo(null);
        segarkanData();
    }

    private void segarkanData() {
        DefaultTableModel modelWarga = (DefaultTableModel) tblWarga.getModel();
        modelWarga.setRowCount(0);
        for (Warga w : controller.getListWarga()) {
            modelWarga.addRow(new Object[]{w.getId(), w.getNoKk(), w.getNamaKk(), w.getNoRumah()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSidebar = new javax.swing.JPanel();
        btnMenuWarga = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        panelUtama = new javax.swing.JPanel();
        cardWarga = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNoKk = new javax.swing.JTextField();
        txtNamaKk = new javax.swing.JTextField();
        txtNoRumah = new javax.swing.JTextField();
        btnSimpanWarga = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWarga = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Utama - Pengelolaan Data Warga RT");

        panelSidebar.setLayout(new java.awt.GridLayout(2, 1, 5, 10));

        btnMenuWarga.setText("1. Data Warga");
        btnMenuWarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuWargaActionPerformed(evt);
            }
        });
        panelSidebar.add(btnMenuWarga);

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        panelSidebar.add(btnLogout);

        getContentPane().add(panelSidebar, java.awt.BorderLayout.LINE_START);

        panelUtama.setLayout(new java.awt.CardLayout());

        jLabel1.setText("No. KK:");
        jLabel2.setText("Nama Kepala Keluarga:");
        jLabel3.setText("No. Rumah:");

        btnSimpanWarga.setText("Simpan Data Warga");
        btnSimpanWarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanWargaActionPerformed(evt);
            }
        });

        tblWarga.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"ID", "No. KK", "Nama KK", "No. Rumah"}
        ));
        jScrollPane1.setViewportView(tblWarga);

        javax.swing.GroupLayout cardWargaLayout = new javax.swing.GroupLayout(cardWarga);
        cardWarga.setLayout(cardWargaLayout);
        cardWargaLayout.setHorizontalGroup(
            cardWargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardWargaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(cardWargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cardWargaLayout.createSequentialGroup()
                        .addGroup(cardWargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(25, 25, 25)
                        .addGroup(cardWargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSimpanWarga)
                            .addComponent(txtNoKk, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtNamaKk)
                            .addComponent(txtNoRumah))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        cardWargaLayout.setVerticalGroup(
            cardWargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardWargaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(cardWargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNoKk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(cardWargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNamaKk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(cardWargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNoRumah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(btnSimpanWarga)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelUtama.add(cardWarga, "cardWarga");

        getContentPane().add(panelUtama, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuWargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuWargaActionPerformed
        CardLayout cl = (CardLayout) panelUtama.getLayout();
        cl.show(panelUtama, "cardWarga");
        segarkanData();
    }//GEN-LAST:event_btnMenuWargaActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnSimpanWargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanWargaActionPerformed
        if (controller.simpanWarga(new Warga(txtNoKk.getText(), txtNamaKk.getText(), txtNoRumah.getText()))) {
            JOptionPane.showMessageDialog(this, "Data Warga Tersimpan!");
            txtNoKk.setText(""); txtNamaKk.setText(""); txtNoRumah.setText("");
            segarkanData();
        } else {
            JOptionPane.showMessageDialog(this, "Gagal menyimpan warga!");
        }
    }//GEN-LAST:event_btnSimpanWargaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Kas_rt().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMenuWarga;
    private javax.swing.JButton btnSimpanWarga;
    private javax.swing.JPanel cardWarga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelSidebar;
    private javax.swing.JPanel panelUtama;
    private javax.swing.JTable tblWarga;
    private javax.swing.JTextField txtNamaKk;
    private javax.swing.JTextField txtNoKk;
    private javax.swing.JTextField txtNoRumah;
    // End of variables declaration//GEN-END:variables
}
