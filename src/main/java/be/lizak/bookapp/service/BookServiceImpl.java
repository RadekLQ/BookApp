package be.lizak.bookapp.service;

import be.lizak.bookapp.model.Book;
import be.lizak.bookapp.model.Genre;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Override
    public int addBook(Book book) {
        return 0;
    }

    @Override
    public int updateBook(Book book) {
        return 0;
    }

    @Override
    public void deleteBook(Book book) {

    }

    @Override
    public List<Book> findAll() {
        return null;
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return null;
    }

    @Override
    public List<Book> findByGenre(Genre genre) {
        return null;
    }

    @Override
    public List<Book> findByKeyword(String keyword) {
        return null;
    }

    @Override
    public Book findByISBN(String isbn) {
        return null;
    }

    @Override
    public Book findByTitelAndAuthor(String titel, String author) {
        return null;
    }
}
