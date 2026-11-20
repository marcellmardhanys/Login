package com.mycompany.iuran.controller;

import com.mycompany.iuran.model.User;
import com.mycompany.iuran.model.Warga;
import com.mycompany.iuran.model.Transaksi;
import com.mycompany.iuran.service.IuranService;
import com.mycompany.iuran.util.HibernateUtil;
import java.util.Collections;
import java.util.List;
import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IuranController {

    private final IuranService iuranService;

    public IuranController() {
        // Memuat ApplicationContext Spring dari resources
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        this.iuranService = context.getBean("iuranService", IuranService.class);
    }

    public User cekLogin(String username, String password) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM User WHERE username = :u AND password = :p", User.class)
                    .setParameter("u", username)
                    .setParameter("p", password)
                    .uniqueResult();
        } catch (Exception e) {
            return null;
        }
    }

    public boolean simpanWarga(Warga w) {
        // Menggunakan service Spring untuk simpan data (bisa diperluas ke DAO Warga jika ingin full Spring)
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            org.hibernate.Transaction tx = session.beginTransaction();
            session.persist(w);
            tx.commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Warga> getListWarga() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM Warga ORDER BY id DESC", Warga.class).list();
        } catch (Exception e) {
            return Collections.emptyList();
        }
    }

    // Menggunakan Spring Service untuk Transaksi / Pencatatan Iuran
    public void simpanTransaksiIuran(Transaksi transaksi) {
        iuranService.simpanTransaksi(transaksi);
    }

    public List<Transaksi> getListTransaksi() {
        return iuranService.getSemuaTransaksi();
    }
}
