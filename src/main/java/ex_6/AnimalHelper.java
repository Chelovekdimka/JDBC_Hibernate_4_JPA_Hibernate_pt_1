package ex_6;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hm.ex_003_hibernate_get_and_insert.entity.HibernateUtil;

import java.util.List;

public class AnimalHelper {
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public AnimalHelper() {
    }
    public List<Animal> getAnimalList() {
        Session session = this.sessionFactory.openSession();
        Criteria cb = session.createCriteria(Animal.class);
        List<Animal> animalList = cb.list();
        session.close();
        return animalList;
    }

    public Animal getAuthorById(long id) {
        Session session = this.sessionFactory.openSession();
        Animal animal = (Animal)session.get(Animal.class, id);
        session.close();
        return animal;
    }

    public Animal addAnimal(Animal animal) {
        Session session = this.sessionFactory.openSession();
        session.beginTransaction();
        session.save(animal);
        session.getTransaction().commit();
        session.close();
        return animal;
    }
}
