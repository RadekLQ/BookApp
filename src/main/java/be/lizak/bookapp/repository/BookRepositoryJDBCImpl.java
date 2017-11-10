package be.lizak.bookapp.repository;

import be.lizak.bookapp.model.Book;
import be.lizak.bookapp.model.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepositoryJDBCImpl implements BookRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public BookRepositoryJDBCImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

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
        return jdbcTemplate.queryForList("SELECT * FROM Book", Book.class);
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
