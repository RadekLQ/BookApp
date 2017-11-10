package be.lizak.bookapp.service;

import be.lizak.bookapp.model.Book;
import be.lizak.bookapp.model.Genre;

import java.util.List;

//BUSINESS LOGIC
public interface BookService {

    int addBook(Book book);
    int updateBook(Book book);
    void deleteBook(Book book);

    List<Book> findAll();
    List<Book> findByAuthor(String author);
    List<Book> findByGenre(Genre genre);
    List<Book> findByKeyword(String keyword);
    //List<Book> findByFormat(String format);

    Book findByISBN(String isbn);
    Book findByTitelAndAuthor(String titel, String author);

}
