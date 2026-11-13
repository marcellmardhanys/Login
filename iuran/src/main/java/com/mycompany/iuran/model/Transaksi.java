/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iuran.model;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_transaksi")
/**
 *
 * @author ASUS
 */
public class Transaksi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String jenis; // "Iuran" (Kas Masuk) atau "Kegiatan" (Kas Keluar)

    @Column(nullable = false)
    private String keterangan; // Nama Warga atau Nama Kegiatan

    @Column(nullable = false)
    private String bulan;

    @Column(nullable = false)
    private int nominal;

    public Transaksi() {}

    public Transaksi(String jenis, String keterangan, String bulan, int nominal) {
        this.jenis = jenis;
        this.keterangan = keterangan;
        this.bulan = bulan;
        this.nominal = nominal;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getJenis() { return jenis; }
    public void setJenis(String jenis) { this.jenis = jenis; }
    public String getKeterangan() { return keterangan; }
    public void setKeterangan(String keterangan) { this.keterangan = keterangan; }
    public String getBulan() { return bulan; }
    public void setBulan(String bulan) { this.bulan = bulan; }
    public int getNominal() { return nominal; }
    public void setNominal(int nominal) { this.nominal = nominal; }
}
