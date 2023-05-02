package org.hm.ex_003_hibernate_get_and_insert.entity;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hm.ex_003_hibernate_get_and_insert.entity.entity.Book;

import java.util.List;

public class BookHelper {
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public BookHelper() {
    }
    public List<Book> getBookList() {
        Session session = this.sessionFactory.openSession();
        Criteria cb = session.createCriteria(Book.class);
        List<Book> bookList = cb.list();
        session.close();
        return bookList;
    }

    public Book getBookById(long id) {
        Session session = this.sessionFactory.openSession();
        Book book = (Book)session.get(Book.class, id);
        session.close();
        return book;
    }

    public Book addBook(Book book) {
        Session session = this.sessionFactory.openSession();
        session.beginTransaction();
        session.save(book);
        session.getTransaction().commit();
        session.close();
        return book;
    }
}
