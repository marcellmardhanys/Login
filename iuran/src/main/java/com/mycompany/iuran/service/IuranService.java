/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iuran.service;
import com.mycompany.iuran.dao.TransaksiDAO;
import com.mycompany.iuran.model.Transaksi;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author ASUS
 */
public class IuranService {
    private TransaksiDAO iuranDAO;

    // Setter Injection yang disuntikkan oleh Spring dari applicationContext.xml
    public void setIuranDAO(TransaksiDAO iuranDAO) {
        this.iuranDAO = iuranDAO;
    }

    @Transactional
    public void simpanTransaksi(Transaksi transaksi) {
        iuranDAO.simpan(transaksi);
    }

    @Transactional(readOnly = true)
    public List<Transaksi> getSemuaTransaksi() {
        return iuranDAO.tampilkanSemua();
    }
}
