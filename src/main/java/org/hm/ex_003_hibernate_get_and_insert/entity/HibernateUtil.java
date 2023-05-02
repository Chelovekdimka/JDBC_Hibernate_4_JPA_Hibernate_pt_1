package org.hm.ex_003_hibernate_get_and_insert.entity;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory factory;

    public HibernateUtil() {
    }

    public static SessionFactory getSessionFactory() {
        return factory;
    }

    static {
        try {
            factory = (new Configuration()).configure("hibernate.cfg.xml").buildSessionFactory();
        } catch (HibernateException exception){
            System.out.println("Problem creating session factory");
            exception.printStackTrace();
        }

    }
}
