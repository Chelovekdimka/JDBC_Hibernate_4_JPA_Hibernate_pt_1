package org.hm.ex_003_hibernate_get_and_insert.entity;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hm.ex_003_hibernate_get_and_insert.entity.entity.Author;

public class AuthorHelper {
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public AuthorHelper() {
    }

    public List<Author> getAuthorList() {
        Session session = this.sessionFactory.openSession();
        Criteria cb = session.createCriteria(Author.class);
        List<Author> authorList = cb.list();
        session.close();
        return authorList;
    }

    public Author getAuthorById(long id) {
        Session session = this.sessionFactory.openSession();
        Author author = (Author)session.get(Author.class, id);
        session.close();
        return author;
    }

    public Author addAuthor(Author author) {
        Session session = this.sessionFactory.openSession();
        session.beginTransaction();
        session.save(author);
        session.getTransaction().commit();
        session.close();
        return author;
    }
}
