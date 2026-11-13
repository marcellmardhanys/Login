package com.mycompany.iuran.view;

import com.mycompany.iuran.controller.IuranController;
import com.mycompany.iuran.model.Transaksi;
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
        btnMenuIuran = new javax.swing.JButton();
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
        cardIuran = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNamaWargaIuran = new javax.swing.JTextField();
        txtBulanIuran = new javax.swing.JTextField();
        txtNominalIuran = new javax.swing.JTextField();
        btnSimpanIuran = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Utama - Pengelolaan Data Warga & Iuran RT (Spring Framework)");

        panelSidebar.setLayout(new java.awt.GridLayout(3, 1, 5, 10));

        btnMenuWarga.setText("1. Data Warga");
        btnMenuWarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuWargaActionPerformed(evt);
            }
        });
        panelSidebar.add(btnMenuWarga);

        btnMenuIuran.setText("2. Pencatatan Iuran");
        btnMenuIuran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuIuranActionPerformed(evt);
            }
        });
        panelSidebar.add(btnMenuIuran);

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

        jLabel4.setText("Nama Warga / Blok:");
        jLabel5.setText("Bulan Iuran:");
        jLabel6.setText("Nominal (Rp):");

        btnSimpanIuran.setText("Simpan Iuran (Spring)");
        btnSimpanIuran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanIuranActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cardIuranLayout = new javax.swing.GroupLayout(cardIuran);
        cardIuran.setLayout(cardIuranLayout);
        cardIuranLayout.setHorizontalGroup(
            cardIuranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardIuranLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(cardIuranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(30, 30, 30)
                .addGroup(cardIuranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSimpanIuran)
                    .addComponent(txtNamaWargaIuran, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(txtBulanIuran)
                    .addComponent(txtNominalIuran))
                .addContainerGap(220, Short.MAX_VALUE))
        );
        cardIuranLayout.setVerticalGroup(
            cardIuranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardIuranLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(cardIuranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNamaWargaIuran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(cardIuranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtBulanIuran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(cardIuranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNominalIuran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(btnSimpanIuran)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        panelUtama.add(cardIuran, "cardIuran");

        getContentPane().add(panelUtama, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuWargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuWargaActionPerformed
        CardLayout cl = (CardLayout) panelUtama.getLayout();
        cl.show(panelUtama, "cardWarga");
        segarkanData();
    }//GEN-LAST:event_btnMenuWargaActionPerformed

    private void btnMenuIuranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuIuranActionPerformed
        CardLayout cl = (CardLayout) panelUtama.getLayout();
        cl.show(panelUtama, "cardIuran");
    }//GEN-LAST:event_btnMenuIuranActionPerformed

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

    private void btnSimpanIuranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanIuranActionPerformed
        try {
            int nom = Integer.parseInt(txtNominalIuran.getText().trim());
            controller.simpanTransaksiIuran(new Transaksi("Iuran", txtNamaWargaIuran.getText(), txtBulanIuran.getText(), nom));
            JOptionPane.showMessageDialog(this, "Iuran Berhasil Disimpan via Spring Service!");
            txtNamaWargaIuran.setText(""); txtBulanIuran.setText(""); txtNominalIuran.setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Nominal harus berupa angka!");
        }
    }//GEN-LAST:event_btnSimpanIuranActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Kas_rt().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMenuIuran;
    private javax.swing.JButton btnMenuWarga;
    private javax.swing.JButton btnSimpanIuran;
    private javax.swing.JButton btnSimpanWarga;
    private javax.swing.JPanel cardIuran;
    private javax.swing.JPanel cardWarga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelSidebar;
    private javax.swing.JPanel panelUtama;
    private javax.swing.JTable tblWarga;
    private javax.swing.JTextField txtBulanIuran;
    private javax.swing.JTextField txtNamaKk;
    private javax.swing.JTextField txtNamaWargaIuran;
    private javax.swing.JTextField txtNoKk;
    private javax.swing.JTextField txtNoRumah;
    private javax.swing.JTextField txtNominalIuran;
    // End of variables declaration//GEN-END:variables
}
