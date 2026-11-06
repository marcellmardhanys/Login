package com.mycompany.iuran.controller;

import com.mycompany.iuran.model.User;
import com.mycompany.iuran.model.Warga;
import com.mycompany.iuran.util.HibernateUtil;
import java.util.Collections;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class IuranController {

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
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.persist(w);
            tx.commit();
            return true;
        } catch (Exception e) {
            if (tx != null) tx.rollback();
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
}
