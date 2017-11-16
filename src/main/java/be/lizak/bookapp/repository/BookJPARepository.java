package be.lizak.bookapp.repository;

import be.lizak.bookapp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookJPARepository extends JpaRepository <Book, Integer> {
List<Book> findByAuthor(String author);

Book findByIsbn(String isbn);

}
