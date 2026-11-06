package com.mycompany.iuran.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_warga")
public class Warga {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "no_kk", unique = true, nullable = false)
    private String noKk;

    @Column(name = "nama_kk", nullable = false)
    private String namaKk;

    @Column(name = "no_rumah", nullable = false)
    private String noRumah;

    public Warga() {}

    public Warga(String noKk, String namaKk, String noRumah) {
        this.noKk = noKk;
        this.namaKk = namaKk;
        this.noRumah = noRumah;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNoKk() { return noKk; }
    public void setNoKk(String noKk) { this.noKk = noKk; }
    public String getNamaKk() { return namaKk; }
    public void setNamaKk(String namaKk) { this.namaKk = namaKk; }
    public String getNoRumah() { return noRumah; }
    public void setNoRumah(String noRumah) { this.noRumah = noRumah; }
}
