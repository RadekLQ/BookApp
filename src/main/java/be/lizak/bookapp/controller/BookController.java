package be.lizak.bookapp.controller;

import be.lizak.bookapp.model.Book;
import be.lizak.bookapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService service;

    @Autowired
    public BookController(BookService service) {
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity addBook (@RequestBody Book book) {
        return ResponseEntity.ok(service.addBook(book));
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity deleteBook(@RequestBody Book book) {
        return
    }

}
