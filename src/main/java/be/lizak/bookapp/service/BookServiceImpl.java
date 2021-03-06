package be.lizak.bookapp.service;

import be.lizak.bookapp.model.Book;
import be.lizak.bookapp.model.Genre;
import be.lizak.bookapp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final MessageSource ms;

    private final BookRepository repository;

    @Autowired
    public BookServiceImpl(@Qualifier("bookRepositoryHibernateImpl")BookRepository repository, MessageSource ms) {
        this.repository = repository;
        this.ms = ms;
    }

    @Override
    public int addBook(Book book) {
        return repository.addBook(book);
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
        //Extra business logic to be added
        return repository.findAll();
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
