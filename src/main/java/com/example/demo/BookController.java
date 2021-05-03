package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Collection;

@RestController
@RequestMapping("/api/book")
public class BookController{
    @GetMapping("/{id}")
    public Book findById(@PathVariable long id) {
        Book b = new Book();
        b.setAuthor("a");
        b.setId(23);
       return b;
    }

    public Collection<Book> findBooks() {
        Book b = new Book();
        b.setAuthor("a");
        b.setId(23);
        return Arrays.asList(b);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Book updateBook(
            @PathVariable("id") final String id, @RequestBody final Book book) {
        Book b = new Book();
        b.setAuthor("a");
        b.setId(23);
        return b;
    }
}