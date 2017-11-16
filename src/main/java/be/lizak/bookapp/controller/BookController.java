package be.lizak.bookapp.controller;

import be.lizak.bookapp.model.Book;
import be.lizak.bookapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        return ResponseEntity.ok(service.addBook(book));
    }

    @RequestMapping(value = "/author/{author}",method = RequestMethod.GET)
    public ResponseEntity findByAuthor(@PathVariable String author) {
        return ResponseEntity.ok(service.findByAuthor(author));
    }

    @RequestMapping(value = "/isbn/{isbn}", method = RequestMethod.GET)
    public ResponseEntity findByIsbn(@PathVariable String isbn) {
        return ResponseEntity.ok(service.findByISBN(isbn));
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResponseEntity updateBook(@RequestBody Book book) {
        return ResponseEntity.ok(service.updateBook(book));
    }
}
