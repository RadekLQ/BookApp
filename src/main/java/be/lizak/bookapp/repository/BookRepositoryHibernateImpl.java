package be.lizak.bookapp.repository;

import be.lizak.bookapp.model.Book;
import be.lizak.bookapp.model.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("hibernate")
public class BookRepositoryHibernateImpl implements BookRepository {

    private final BookJPARepository repository;

    @Autowired
    public BookRepositoryHibernateImpl(BookJPARepository repository) {
        this.repository = repository;
    }

    @Override
    public int addBook(Book book) {
        Book b = repository.saveAndFlush(book);
        return b != null ? 1 : 0;
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
        return repository.findAll();
    }

    @Override
    @Query
    public List<Book> findByAuthor(String author) {
        return repository.findByAuthor(author);
    }

    @Override
    public List<Book> findByGenre(Genre genre) {
        return repository.findAll();
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
