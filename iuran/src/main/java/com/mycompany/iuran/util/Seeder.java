package com.mycompany.iuran.util;

import com.mycompany.iuran.model.User;
import com.mycompany.iuran.model.Warga;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Seeder {

    public static void jalankanSeeder() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Long jumlahUser = session.createQuery("SELECT COUNT(u) FROM User u", Long.class).uniqueResult();
            if (jumlahUser == null || jumlahUser == 0) {
                Transaction tx = session.beginTransaction();

                // 1. Buat akun login default Bendahara
                session.persist(new User("bendahara", "123", "Bendahara RT 01"));[cite: 39]

                // 2. Buat contoh data warga awal
                session.persist(new Warga("317401001", "Budi Santoso", "Blok A-01"));[cite: 39]
                session.persist(new Warga("317401002", "Andi Wijaya", "Blok A-02"));[cite: 39]

                tx.commit();
                System.out.println("Seeder berhasil dijalankan! Akun default: bendahara / 123");[cite: 39]
            }
        } catch (Exception e) {
            System.err.println("Error Seeder: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        jalankanSeeder();
    }
}
