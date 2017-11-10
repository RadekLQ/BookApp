package be.lizak.bookapp.repository;

import be.lizak.bookapp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookJPARepository extends JpaRepository <Book, Integer> {


}
