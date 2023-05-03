package org.hm.ex_003_hibernate_get_and_insert.entity;

//Задание 6
//
//        Создать Maven-проект и настроить его под Hibernate. Взять пример ex_003_hibernate_get_and_insert.
//        Получить объект Book и коллекцию объектов. Получить конкретный Book по id. Добавить Новый Book.
//        И это все реализовать в классе BookHelper.

import org.hm.ex_003_hibernate_get_and_insert.entity.entity.Author;
import org.hm.ex_003_hibernate_get_and_insert.entity.entity.Book;

import java.util.Iterator;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
//        AuthorHelper ah = new AuthorHelper();
//        Author author1 = new Author();
//        Author author2 = new Author();
//        Author author3 = new Author();
//        author1.setName("George Orwell");
//        author2.setName("F. Scott Fitzgerald");
//        author3.setName("J.R.R. Tolkien");
//        ah.addAuthor(author1);
//        ah.addAuthor(author2);
//        ah.addAuthor(author3);
//        List<Author> authors = ah.getAuthorList();
//        Iterator var4 = authors.iterator();
//
//        while(var4.hasNext()) {
//            Author a = (Author)var4.next();
//            System.out.println(a.getId() + " " + a.getName());
//        }
        BookHelper bh = new BookHelper();
//        Book book1 = new Book();
//        Book book2 = new Book();
//        Book book3 = new Book();
//        book1.setName("1984");
//        book2.setName("The Great Gatsby");
//        book3.setName("The Lord of the Rings");
//        bh.addBook(book1);
//        bh.addBook(book2);
//        bh.addBook(book3);
//        List<Book> books = bh.getBookList();
//        Iterator bookIterator = books.iterator();
//        while(bookIterator.hasNext()) {
//            Book b = (Book)bookIterator.next();
//            System.out.println(b.getId() + " " + b.getName());
//        }
        Book bookById = bh.getBookById(2);
        System.out.println(bookById.getId() + " " + bookById.getName() + " " + bookById.getAuthor_id());
    }
}
