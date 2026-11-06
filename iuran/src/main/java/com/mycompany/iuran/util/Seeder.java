package com.mycompany.iuran.util;

import com.mycompany.iuran.model.Transaksi;
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
                session.persist(new User("bendahara", "123", "Bendahara RT 01"));

                // 2. Buat contoh data warga
                session.persist(new Warga("317401001", "Budi Santoso", "Blok A-01"));
                session.persist(new Warga("317401002", "Andi Wijaya", "Blok A-02"));

                // 3. Buat contoh transaksi Iuran (Kas Masuk) & Kegiatan (Kas Keluar)
                session.persist(new Transaksi("Iuran", "Budi Santoso (Blok A-01)", "Oktober", 50000));
                session.persist(new Transaksi("Iuran", "Andi Wijaya (Blok A-02)", "Oktober", 50000));
                session.persist(new Transaksi("Kegiatan", "Kerja Bakti Lingkungan", "Oktober", 35000));

                tx.commit();
                System.out.println("Seeder berhasil dijalankan! Akun default: bendahara / 123");
            }
        } catch (Exception e) {
            System.err.println("Error Seeder: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        jalankanSeeder();
    }
}
