/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iuran.dao;
import com.mycompany.iuran.model.Transaksi;
import java.util.Collections;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
/**
 *
 * @author ASUS
 */
public class TransaksiDAO {
   private SessionFactory sessionFactory;

    // Setter Injection yang dipanggil oleh Spring dari applicationContext.xml
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void simpan(Transaksi transaksi) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(transaksi);
    }

    public List<Transaksi> tampilkanSemua() {
        try {
            Session session = sessionFactory.getCurrentSession();
            return session.createQuery("FROM Transaksi ORDER BY id DESC", Transaksi.class).list();
        } catch (Exception e) {
            return Collections.emptyList();
        }
    }
}
