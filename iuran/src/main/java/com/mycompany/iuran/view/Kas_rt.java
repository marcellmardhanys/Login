package com.mycompany.iuran.view;

import com.mycompany.iuran.controller.IuranController;
import com.mycompany.iuran.model.Transaksi;
import com.mycompany.iuran.model.Warga;
import java.awt.CardLayout;
import java.util.List;
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

        DefaultTableModel modelTrans = (DefaultTableModel) tblTransparansi.getModel();
        modelTrans.setRowCount(0);
        int totalMasuk = 0;
        int totalKeluar = 0;

        List<Transaksi> listT = controller.getListTransaksi();
        for (Transaksi t : listT) {
            modelTrans.addRow(new Object[]{t.getId(), t.getJenis(), t.getKeterangan(), t.getBulan(), t.getNominal()});
            if ("Iuran".equalsIgnoreCase(t.getJenis())) {
                totalMasuk += t.getNominal();
            } else {
                totalKeluar += t.getNominal();
            }
        }

        int saldo = totalMasuk - totalKeluar;
        lblRingkasan.setText("Total Iuran Masuk: Rp " + totalMasuk + "   |   Total Kegiatan Keluar: Rp " + totalKeluar + "   |   SALDO KAS: Rp " + saldo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSidebar = new javax.swing.JPanel();
        btnMenuWarga = new javax.swing.JButton();
        btnMenuIuran = new javax.swing.JButton();
        btnMenuKegiatan = new javax.swing.JButton();
        btnMenuTransparansi = new javax.swing.JButton();
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
        cardKegiatan = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNamaKegiatan = new javax.swing.JTextField();
        txtBulanKegiatan = new javax.swing.JTextField();
        txtBiayaKegiatan = new javax.swing.JTextField();
        btnSimpanKegiatan = new javax.swing.JButton();
        cardTransparansi = new javax.swing.JPanel();
        lblRingkasan = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTransparansi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Utama - Pengelolaan Kas & Iuran RT");

        panelSidebar.setLayout(new java.awt.GridLayout(5, 1, 5, 10));

        btnMenuWarga.setText("1. Data Warga");
        btnMenuWarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuWargaActionPerformed(evt);
            }
        });
        panelSidebar.add(btnMenuWarga);

        btnMenuIuran.setText("2. Iuran");
        btnMenuIuran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuIuranActionPerformed(evt);
            }
        });
        panelSidebar.add(btnMenuIuran);

        btnMenuKegiatan.setText("3. Kegiatan");
        btnMenuKegiatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuKegiatanActionPerformed(evt);
            }
        });
        panelSidebar.add(btnMenuKegiatan);

        btnMenuTransparansi.setText("4. Transparansi");
        btnMenuTransparansi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuTransparansiActionPerformed(evt);
            }
        });
        panelSidebar.add(btnMenuTransparansi);

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
        jLabel5.setText("Bulan Tagihan:");
        jLabel6.setText("Nominal Iuran (Rp):");

        btnSimpanIuran.setText("Simpan Iuran Masuk");
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

        jLabel7.setText("Nama Kegiatan RT:");
        jLabel8.setText("Bulan Pelaksanaan:");
        jLabel9.setText("Biaya Keluar (Rp):");

        btnSimpanKegiatan.setText("Simpan Pengeluaran Kegiatan");
        btnSimpanKegiatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanKegiatanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cardKegiatanLayout = new javax.swing.GroupLayout(cardKegiatan);
        cardKegiatan.setLayout(cardKegiatanLayout);
        cardKegiatanLayout.setHorizontalGroup(
            cardKegiatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardKegiatanLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(cardKegiatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(30, 30, 30)
                .addGroup(cardKegiatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSimpanKegiatan)
                    .addComponent(txtNamaKegiatan, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(txtBulanKegiatan)
                    .addComponent(txtBiayaKegiatan))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        cardKegiatanLayout.setVerticalGroup(
            cardKegiatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardKegiatanLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(cardKegiatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNamaKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(cardKegiatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtBulanKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(cardKegiatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtBiayaKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(btnSimpanKegiatan)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        panelUtama.add(cardKegiatan, "cardKegiatan");

        lblRingkasan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRingkasan.setText("Total Iuran Masuk: Rp 0 | Total Kegiatan Keluar: Rp 0 | SALDO KAS: Rp 0");

        tblTransparansi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"ID", "Jenis", "Keterangan (Warga / Kegiatan)", "Bulan", "Nominal (Rp)"}
        ));
        jScrollPane2.setViewportView(tblTransparansi);

        javax.swing.GroupLayout cardTransparansiLayout = new javax.swing.GroupLayout(cardTransparansi);
        cardTransparansi.setLayout(cardTransparansiLayout);
        cardTransparansiLayout.setHorizontalGroup(
            cardTransparansiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardTransparansiLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(cardTransparansiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRingkasan)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        cardTransparansiLayout.setVerticalGroup(
            cardTransparansiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardTransparansiLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblRingkasan)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelUtama.add(cardTransparansi, "cardTransparansi");

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

    private void btnMenuKegiatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuKegiatanActionPerformed
        CardLayout cl = (CardLayout) panelUtama.getLayout();
        cl.show(panelUtama, "cardKegiatan");
    }//GEN-LAST:event_btnMenuKegiatanActionPerformed

    private void btnMenuTransparansiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuTransparansiActionPerformed
        CardLayout cl = (CardLayout) panelUtama.getLayout();
        cl.show(panelUtama, "cardTransparansi");
        segarkanData();
    }//GEN-LAST:event_btnMenuTransparansiActionPerformed

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
            controller.simpanTransaksi(new Transaksi("Iuran", txtNamaWargaIuran.getText(), txtBulanIuran.getText(), nom));
            JOptionPane.showMessageDialog(this, "Iuran Masuk Berhasil Dicatat!");
            txtNamaWargaIuran.setText(""); txtBulanIuran.setText(""); txtNominalIuran.setText("");
            segarkanData();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Nominal harus berupa angka!");
        }
    }//GEN-LAST:event_btnSimpanIuranActionPerformed

    private void btnSimpanKegiatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanKegiatanActionPerformed
        try {
            int biaya = Integer.parseInt(txtBiayaKegiatan.getText().trim());
            controller.simpanTransaksi(new Transaksi("Kegiatan", txtNamaKegiatan.getText(), txtBulanKegiatan.getText(), biaya));
            JOptionPane.showMessageDialog(this, "Pengeluaran Kegiatan Berhasil Dicatat!");
            txtNamaKegiatan.setText(""); txtBulanKegiatan.setText(""); txtBiayaKegiatan.setText("");
            segarkanData();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Biaya harus berupa angka!");
        }
    }//GEN-LAST:event_btnSimpanKegiatanActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMenuIuran;
    private javax.swing.JButton btnMenuKegiatan;
    private javax.swing.JButton btnMenuTransparansi;
    private javax.swing.JButton btnMenuWarga;
    private javax.swing.JButton btnSimpanIuran;
    private javax.swing.JButton btnSimpanKegiatan;
    private javax.swing.JButton btnSimpanWarga;
    private javax.swing.JPanel cardIuran;
    private javax.swing.JPanel cardKegiatan;
    private javax.swing.JPanel cardTransparansi;
    private javax.swing.JPanel cardWarga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblRingkasan;
    private javax.swing.JPanel panelSidebar;
    private javax.swing.JPanel panelUtama;
    private javax.swing.JTable tblTransparansi;
    private javax.swing.JTable tblWarga;
    private javax.swing.JTextField txtBiayaKegiatan;
    private javax.swing.JTextField txtBulanIuran;
    private javax.swing.JTextField txtBulanKegiatan;
    private javax.swing.JTextField txtNamaKegiatan;
    private javax.swing.JTextField txtNamaKk;
    private javax.swing.JTextField txtNamaWargaIuran;
    private javax.swing.JTextField txtNoKk;
    private javax.swing.JTextField txtNoRumah;
    private javax.swing.JTextField txtNominalIuran;
    // End of variables declaration//GEN-END:variables
}
