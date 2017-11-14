package be.lizak.bookapp.service;

import be.lizak.bookapp.BookInventoryApplication;
import be.lizak.bookapp.controller.BookController;
import be.lizak.bookapp.model.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BookInventoryApplication.class)
public class BookServiceTest {

    @Autowired
    private BookController controller;

    @Test
    public void testFindAll() {
        List<Book> books = service.findAll();

        assertThat(books).isNotNull();
        assertThat(books).hasSize(4);
   }
}
