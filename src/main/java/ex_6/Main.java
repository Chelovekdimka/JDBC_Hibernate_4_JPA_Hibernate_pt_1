package ex_6;
//создать класс Animal(int age, String name,
//        boolean tail) с методами get и set, как сущность к нашей таблице.
//        И с помощью jpa сделать crud в классе AnimalHelper.
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setAge(8);
        animal.setName("fox");
        animal.setTail(true);


        SessionFactory factory = new Configuration()
                .configure()
                .buildSessionFactory();

        Session session = factory.openSession();

        session.beginTransaction();
        session.save(animal);
        session.getTransaction().commit();
        session.close();

        AnimalHelper ah = new AnimalHelper();
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        Animal animal3 = new Animal();

        animal1.setName("fox");
        animal2.setName("bear");
        animal3.setName("cat");
        animal1.setAge(8);
        animal2.setAge(4);
        animal3.setAge(1);
        animal1.setTail(true);
        animal2.setTail(true);
        animal3.setTail(true);

        ah.addAnimal(animal1);
        ah.addAnimal(animal2);
        ah.addAnimal(animal3);

        List<Animal> animals = ah.getAnimalList();
        Iterator var4 = animals.iterator();

        while(var4.hasNext()) {
            Animal a = (Animal)var4.next();
            System.out.println(a.getId() + " " + a.getName() + " " + a.isTail());
        }
    }



}
