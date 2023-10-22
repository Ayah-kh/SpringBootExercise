package com.example.Exercise.controller;

import com.example.Exercise.beans.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/api")
public class BookController {

    @RequestMapping("/hello-world")
//    @ResponseBody
    public String sayHelloWorld(){
        return "Hello World";
    }

//    @RequestMapping(value = {"/book","/core-java","/java"},
//    method = RequestMethod.GET)
//    @ResponseBody
    @GetMapping(value = {"/book","/core-java","/java"})
    public Book getBook(){
        Book book= new Book(1,"Core Java","Learn Core JAva");
        return book;
    }

//    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(value = "/books/create")
    public ResponseEntity<Book> createBook(@RequestBody Book book){
        System.out.println(book.getId());
        System.out.println(book.getBookTitle());
        System.out.println(book.getDescription());
        return new ResponseEntity<>(book,HttpStatus.CREATED);
    }

    @PutMapping ("/books/update/{id}")
    public ResponseEntity<Book> update(int id,Book updatedBook){
        System.out.println(id);
        System.out.println(updatedBook.getBookTitle());
        System.out.println(updatedBook.getDescription());
        return new ResponseEntity<>(updatedBook,HttpStatus.OK);
    }

}
